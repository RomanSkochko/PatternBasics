package org.example.PatternBasics.abstractfactory.product.transaction;

/**
 * Concrete Product - MySQL Transaction
 */
public class MySQLTransaction implements Transaction {
    @Override
    public void begin() {
        // MySQL specific transaction start
    }

    @Override
    public void commit() {
        // MySQL specific commit
    }

    @Override
    public void rollback() {
        // MySQL specific rollback
    }
}
