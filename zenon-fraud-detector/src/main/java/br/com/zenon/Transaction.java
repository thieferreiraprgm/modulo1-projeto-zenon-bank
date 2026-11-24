package br.com.zenon;

import br.com.zenon.enums.TransactionType;

import java.math.BigDecimal;

public record Transaction(
        int step,
        TransactionType type,
        BigDecimal amount,
        TransactionCustomer origin,
        TransactionCustomer destination,
        boolean isFraud,
        boolean isFlaggedFraud
) {

    @Override
    public String toString() {
        return "step: " + step + "," +
                "type: " + type + "," +
                "amount: " + amount + "," +
                "nameOrig: " + origin.name() + "," +
                "oldbalanceOrg: " + origin.oldBalance() + "," +
                "newbalanceOrig: " + origin.newBalance() + "," +
                "nameDest: " + destination.name() + "," +
                "oldbalanceDest: " + destination.oldBalance() + "," +
                "newbalanceDest: " + destination.newBalance() + "," +
                "isFraud: " + (isFraud ? 1 : 0) + "," +
                "isFlaggedFraud: " + (isFlaggedFraud ? 1 : 0);
    }
}
