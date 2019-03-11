package com.learn.junit5.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Map;

public class CreatingMockUsingAnnotations {
    @Mock
    Map<String, String> map;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void createMockTest() {
        map.put("aaaa", "cccc");
        //map.put("aaaaa", 10);  will not compile
        map.size();
    }
}
