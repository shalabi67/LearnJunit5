package com.learn.junit5.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;

public class CreatingMock {
    @Test
    void createMockTest() {
        Map<String, String> map = Mockito.mock(Map.class);

        map.put("aaaa", "cccc");
        //map.put("aaaaa", 10);  will not compile

        map.size();
    }
}
