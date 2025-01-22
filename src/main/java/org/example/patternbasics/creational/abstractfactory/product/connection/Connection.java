package org.example.patternbasics.creational.abstractfactory.product.connection;

/**
 * Abstract Product - Connection interface
 */
public interface Connection {
    void connect();
    void disconnect();
    boolean isConnected();
}
