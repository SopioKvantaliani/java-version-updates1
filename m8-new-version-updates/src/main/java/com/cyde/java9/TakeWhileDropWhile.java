package com.cyde.java9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileDropWhile {

    public static void main(String[] args) {

        List<Stock> stocks = getStocks();
        System.out.println("Stocks sorted: \n" + stocks);

        //Using Filter
        List<String> stockBelow500Filter = getStocksBelowFiveHundredFilter(stocks);
        System.out.println("Filter output:" + stockBelow500Filter);

        //Using takeWhile
        List<String> stockBelow500 = getStocksBelowFiveHundred(stocks);
        System.out.println("Filter output:" + stockBelow500);

        //Using dropWhile
        List<String> stockAbove500 = getStocksAboveFiveHundred(stocks);
        System.out.println("Filter output:" + stockAbove500);
    }


    public static List<String> getStocksBelowFiveHundredFilter(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("Filter proccessing : " + stock))
                .filter(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getStocksBelowFiveHundred(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("takeWhile proccessing : " + stock)) // prints the elements until condition is met in takeWhile;
                .takeWhile(TakeWhileDropWhile::isStockLessThanFiveHundred) //returns elements which matches the condition
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getStocksAboveFiveHundred(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("dropWhile proccessing : " + stock))
                .dropWhile(TakeWhileDropWhile::isStockLessThanFiveHundred) //drops all the matches
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static boolean isStockLessThanFiveHundred(Stock stock){
        return stock.getValue().compareTo(BigDecimal.valueOf(500))<=0;
    }

    private static List<Stock> getStocks(){

        List<Stock> stocks =  new ArrayList<>();
        stocks.add(new Stock("Apple", BigDecimal.valueOf(1000)));
        stocks.add(new Stock("Amazon", BigDecimal.valueOf(800)));
        stocks.add(new Stock("Tesla", BigDecimal.valueOf(400)));
        stocks.add(new Stock("Netflix", BigDecimal.valueOf(2000)));
        stocks.add(new Stock("Facebook", BigDecimal.valueOf(500)));
        stocks.add(new Stock("Instagram", BigDecimal.valueOf(100)));

        return stocks.stream()
                .sorted(Comparator.comparing(Stock::getValue)) //sorts Ascending order;
                .collect(Collectors.toList());
    }
}