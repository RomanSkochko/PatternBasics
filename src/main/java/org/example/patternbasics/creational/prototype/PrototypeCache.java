package org.example.patternbasics.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Cache that stores and provides prototype documents
 */
class PrototypeCache {
    private Map<String, Document> cache = new HashMap<>();

    /**
     * Store document prototype in cache
     */
    public void put(Document doc) {
        cache.put(doc.getType(), doc);
    }

    /**
     * Get clone of document from cache
     * Cloning ensures immutability of cached prototype and prevents shared state between instances
     */
    public Document get(String type) {
        Document cachedDoc = cache.get(type);
        return cachedDoc != null ? cachedDoc.clone() : null;
    }
}
