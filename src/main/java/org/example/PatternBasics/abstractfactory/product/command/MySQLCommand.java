package org.example.PatternBasics.abstractfactory.product.command;

/**
 * Concrete Product - MySQL Command
 */
public class MySQLCommand implements Command {
    @Override
    public void execute(String sql) {
        // MySQL specific command execution
    }

    @Override
    public Object getResult() {
        // MySQL specific result handling
        return null;
    }
}
