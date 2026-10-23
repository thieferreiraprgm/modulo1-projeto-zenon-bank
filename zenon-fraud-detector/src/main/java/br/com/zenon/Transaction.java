package br.com.zenon;

import br.com.zenon.enums.TransactionType;

import java.math.BigDecimal;

public record Transaction(
        int step,
        TransactionType type,
        BigDecimal amount,
        Customer origin,
        Customer destination,
        boolean isFraud,
        boolean isFlaggedFraud
) {

    @Override
    public String toString() {
        return "step: " + step + "\n" +
                "type: " + type + "\n" +
                "amount: " + amount + "\n" +
                "nameOrig: " + origin.name() + "\n" +
                "oldbalanceOrg: " + origin.oldBalance() + "\n" +
                "newbalanceOrig: " + origin.newBalance() + "\n" +
                "nameDest: " + destination.name() + "\n" +
                "oldbalanceDest: " + destination.oldBalance() + "\n" +
                "newbalanceDest: " + destination.newBalance() + "\n" +
                "isFraud: " + (isFraud ? 1 : 0) + "\n" +
                "isFlaggedFraud: " + (isFlaggedFraud ? 1 : 0);
    }
}
