package org.example.PatternBasics.abstractfactory.product.connection;

/**
 * Abstract Product - Connection interface
 */
public interface Connection {
    void connect();
    void disconnect();
    boolean isConnected();
}
