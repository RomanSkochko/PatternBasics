package org.example.patternbasics.creational.prototype;

/**
 * Simple document class that can be cloned
 */
class Document implements Prototype {
    private String content;
    private String type;

    public Document(String content, String type) {
        this.content = content;
        this.type = type;
    }

    /**
     * Clone method implementation for creating document copies
     */
    @Override
    public Document clone() {
        Document clone = null;
        try {
            clone = (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }
}