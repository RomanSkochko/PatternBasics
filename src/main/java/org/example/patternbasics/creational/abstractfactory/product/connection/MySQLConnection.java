package org.example.patternbasics.creational.abstractfactory.product.connection;

/**
 * Concrete Product - MySQL Connection
 */
public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        // MySQL specific connection logic
    }

    @Override
    public void disconnect() {
        // MySQL specific disconnection logic
    }

    @Override
    public boolean isConnected() {
        // MySQL specific connection check
        return false;
    }
}
