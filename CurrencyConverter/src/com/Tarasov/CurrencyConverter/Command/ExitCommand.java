package com.Tarasov.CurrencyConverter.Command;

public class ExitCommand implements AbstractCommand {
    @Override
    public void execute() {
        System.exit(0);
    }

    @Override
    public String[] getChoice() {
        return null;
    }
}
