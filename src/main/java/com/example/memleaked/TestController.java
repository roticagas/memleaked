package com.example.memleaked;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController {

    @GetMapping("/get")
    String get(String key) {
        TestClass instance = TestClass.getInstance();
        String value = instance.get(key);
        System.out.println("value = " + value);
        return value;
    }

    @GetMapping("/size")
    int size() {
        TestClass instance = TestClass.getInstance();
        int size = instance.size();
        System.out.println("size = " + size);
        return size;
    }

    @PostMapping("/put")
    void put(String key, String value) {
        TestClass instance = TestClass.getInstance();
        instance.put(key, value);
    }

    @PostMapping("/putr")
    void putr() {
        // random put value
        String key = String.valueOf(UUID.randomUUID());
        String value = String.valueOf(UUID.randomUUID());
        TestClass instance = TestClass.getInstance();
        instance.put(key, value);
    }

}
