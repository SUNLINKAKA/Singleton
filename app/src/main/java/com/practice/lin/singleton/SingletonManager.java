package com.practice.lin.singleton;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
