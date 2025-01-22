package org.example.patternbasics.creational.abstractfactory.factory;


import org.example.patternbasics.creational.abstractfactory.product.command.Command;
import org.example.patternbasics.creational.abstractfactory.product.connection.Connection;
import org.example.patternbasics.creational.abstractfactory.product.transaction.Transaction;

/**
 * Abstract Factory - Database factory interface
 */
public interface DatabaseFactory {
    Connection createConnection();
    Command createCommand();
    Transaction createTransaction();
}
