package com.learn.junit5.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class CreatingMockUsingAnnotationsJunitExtentions {
    @Mock
    Map<String, String> map;

    @Test
    void createMockTest() {
        map.put("aaaa", "cccc");
        //map.put("aaaaa", 10);  will not compile
        map.size();
    }
}
