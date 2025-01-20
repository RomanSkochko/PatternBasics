package org.example.PatternBasics.abstractfactory.product.connection;

/**
 * Concrete Product - PostgreSQL Connection
 */
public class PostgresConnection implements Connection{
    @Override
    public void connect() {
        // PostgreSQL specific connection logic
    }

    @Override
    public void disconnect() {
        // PostgreSQL specific disconnection logic
    }

    @Override
    public boolean isConnected() {
        // PostgreSQL specific connection check
        return false;
    }
}
