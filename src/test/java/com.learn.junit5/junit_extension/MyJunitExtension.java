package com.learn.junit5.junit_extension;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;

public class MyJunitExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
    private static String START_TIME = "startTime";
    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        System.out.println("My before test execution extension");

        ExtensionContext.Store store = getStore(context);
        if(store == null)
            return;

        store.put(START_TIME, System.currentTimeMillis());
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("My after test execution extension");

        ExtensionContext.Store store = getStore(context);
        if(store == null)
            return;

        Method testMethod = context.getRequiredTestMethod();
        long startTime = store.remove(START_TIME, long.class);
        long duration = System.currentTimeMillis() - startTime;

        System.out.println(String.format("Method [%s] took %s ms.", testMethod.getName(), duration));
    }

    private ExtensionContext.Store getStore(ExtensionContext context) {
        return context.getStore(ExtensionContext.Namespace.create(getClass(), context.getRequiredTestMethod()));
    }
}
