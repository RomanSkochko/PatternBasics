package org.example.patternbasics.creational.abstractfactory.product.transaction;

/**
 * Concrete Product - PostgreSQL Transaction
 */
public class PostgresTransaction implements Transaction {
    @Override
    public void begin() {
        // PostgreSQL specific transaction start
    }

    @Override
    public void commit() {
        // PostgreSQL specific commit
    }

    @Override
    public void rollback() {
        // PostgreSQL specific rollback
    }
}
