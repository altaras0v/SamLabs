package com.Tarasov.CurrencyConverter.Command;

/**
 * Closes the client
 */
public class ExitCommand implements AbstractCommand {
    @Override
    public void execute() {
        System.exit(0);
    }
}