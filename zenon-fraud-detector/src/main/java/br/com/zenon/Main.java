package br.com.zenon;

import br.com.zenon.enums.TransactionType;

import java.math.BigDecimal;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        TransactionCustomer nameOrig1 = new TransactionCustomer("C1231006815", new BigDecimal("170136.0"), new BigDecimal("160296.36"));
        TransactionCustomer nameDest1 = new TransactionCustomer("M1979787155", new BigDecimal("0.0"), new BigDecimal("0.0"));
        TransactionCustomer nameOrig2 = new TransactionCustomer("C1280323807", new BigDecimal("850002.52"), new BigDecimal("0.0"));
        TransactionCustomer nameDest2 = new TransactionCustomer("C873221189", new BigDecimal(6510099.11), new BigDecimal(7360101.63));
        Transaction transacao1 = new Transaction(1, TransactionType.PAYMENT, new BigDecimal(9839.64), nameOrig1, nameDest1, false, false);
        Transaction transacao2 = new Transaction(743, TransactionType.CASH_OUT, new BigDecimal(850002.52), nameOrig2, nameDest2, true, false);


        IO.println("Transação 1\n" + transacao1);
        IO.println("Transação 2\n" + transacao2);
        IO.println("_________________________________________________");

        var transactionIngestor = new TransactionIngestor();
        List<Transaction> transactions = transactionIngestor.read("data/PS_20174392719_1491204439457_log.csv");
        transactions.stream().limit(10).forEach(IO::println);



    }

}
