package org.example.PatternBasics.abstractfactory.product.transaction;

/**
 * Abstract Product - Transaction interface
 */
public interface Transaction {
    void begin();
    void commit();
    void rollback();
}
