package com.practice.lin.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单的单例的容器
 */
public class SingletonManager {

    private static Map<String, Object> objectMap = new HashMap<>();

    public static void registerService(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return objectMap.get(key);
    }
}
