package org.example.patternbasics.creational.prototype;

public class Example {
    public static void main(String[] args) {
        // Create cache
        PrototypeCache cache = new PrototypeCache();

        // Create and cache original documents
        Document pdfDoc = new Document("PDF content", "PDF");
        Document wordDoc = new Document("Word content", "WORD");

        cache.put(pdfDoc);
        cache.put(wordDoc);

        // Create copies from cache
        Document pdfCopy = cache.get("PDF");
        Document wordCopy = cache.get("WORD");
    }
}
