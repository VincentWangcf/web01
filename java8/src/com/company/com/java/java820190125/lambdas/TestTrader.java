package com.company.com.java.java820190125.lambdas;

import com.company.com.java.java820190125.lambdas.Bean.Trader;
import com.company.com.java.java820190125.lambdas.Bean.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;

public class TestTrader {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)

        );
        //find 2011 Transaction and sort by  value
//        List<Transaction> collect = transactions.stream().filter(transaction -> transaction.getYear() == 2011).sorted(comparing(Transaction::getValue).reversed()).collect(Collectors.toList());
//        System.out.println(collect);
//        查找所有来自于剑桥的交易员，并按姓名排序
        List<String> cambridge = transactions.stream().map(Transaction::getTrader).filter(f -> f.getCity().equals("Cambridge")).sorted(comparing(Trader::getName).reversed()).map(Trader::getCity).distinct().collect(Collectors.toList());
        Map<Integer, List<Transaction>> collect = transactions.stream().collect(groupingBy(Transaction::getYear));
        System.out.println(cambridge);

    }
}
