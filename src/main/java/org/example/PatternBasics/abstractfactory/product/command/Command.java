package org.example.PatternBasics.abstractfactory.product.command;

/**
 * Abstract Product - Command interface
 */
public interface Command {
    void execute(String sql);
    Object getResult();
}
