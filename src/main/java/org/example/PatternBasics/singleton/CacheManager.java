package org.example.PatternBasics.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Singleton pattern implementation for cache management
 * Pattern ensures that only one instance of the class exists
 * Thread-safe and lazy initialization variant
 */
public class CacheManager {
    // volatile ensures proper visibility of variable across all threads
    private static volatile CacheManager instance;

    // Thread-safe collection for storing cached data
    private final Map<String, Object> cache;

    /**
     * Private constructor prevents instantiation from outside the class
     * This is a crucial part of the Singleton pattern
     */
    private CacheManager() {
        cache = new ConcurrentHashMap<>();
    }

    /**
     * Double-checked locking implementation to get singleton instance
     * Thread-safe and lazy initialization (created only on first access)
     */
    public static CacheManager getInstance() {
        // First check to avoid unnecessary synchronization if the instance is already created
        if (instance == null) {
            // Synchronization only during first instance creation
            synchronized (CacheManager.class) {
                // Double-check after acquiring lock
                if (instance == null) {
                    instance = new CacheManager();
                }
            }
        }
        return instance;
    }

    /**
     * Store value in cache by key
     */
    public void put(String key, Object value) {
        cache.put(key, value);
    }

    /**
     * Retrieve value from cache by key
     */
    public Object get(String key) {
        return cache.get(key);
    }
}
