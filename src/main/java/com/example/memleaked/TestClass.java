package com.example.memleaked;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

    private static TestClass instance = null;

    private final Map<String, String> map = new HashMap<>();

    public static TestClass getInstance() {
        if (instance == null) {
            instance = new TestClass();
        }
        return instance;
    }

    public String put(String key, String value) {
        return map.put(key, value);
    }

    public String get(String key) {
        return map.get(key);
    }

    public int size() {
        return map.size();
    }
}
