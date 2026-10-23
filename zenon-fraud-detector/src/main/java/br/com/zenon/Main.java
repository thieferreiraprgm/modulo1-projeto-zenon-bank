package br.com.zenon;

import br.com.zenon.enums.TransactionType;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
    Customer nameOrig1 = new Customer("C1231006815",new BigDecimal("170136.0"),new BigDecimal("160296.36"));
    Customer nameDest1 = new Customer("M1979787155",new BigDecimal("0.0"),new BigDecimal("0.0"));
    Customer nameOrig2 = new Customer("C1280323807",new BigDecimal( "850002.52"), new BigDecimal("0.0"));
    Customer nameDest2 = new Customer("C873221189",new BigDecimal(6510099.11),new BigDecimal(7360101.63));
    Transaction transacao1 = new Transaction(1, TransactionType.PAYMENT,new BigDecimal(9839.64),nameOrig1,nameDest1,false,false);
    Transaction transacao2 = new Transaction(743,TransactionType.CASH_OUT,new BigDecimal(850002.52),nameOrig2,nameDest2,true,false);


    System.out.println("Transação 1\n"+ transacao1);
        System.out.println("Transação 2\n"+ transacao2);
    }

}
