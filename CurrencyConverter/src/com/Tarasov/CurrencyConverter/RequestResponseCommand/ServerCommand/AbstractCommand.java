package com.Tarasov.CurrencyConverter.RequestResponseCommand.ServerCommand;

import com.Tarasov.CurrencyConverter.Phone.Phone;

interface AbstractCommand {
    void executeResponse(Phone phone);
}
