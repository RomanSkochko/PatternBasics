package org.example.PatternBasics.abstractfactory.factory;


import org.example.PatternBasics.abstractfactory.product.command.Command;
import org.example.PatternBasics.abstractfactory.product.connection.Connection;
import org.example.PatternBasics.abstractfactory.product.transaction.Transaction;

/**
 * Abstract Factory - Database factory interface
 */
public interface DatabaseFactory {
    Connection createConnection();
    Command createCommand();
    Transaction createTransaction();
}
