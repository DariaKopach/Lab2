package com.company;

import com.company.model.PackedSugar;
import com.company.model.WeightSugar;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * Classname: Main
 *
 * @version 22.06.2020
 * @author Kopach Daria

 * Module 3 task 2
 *
 * Topic: Object-oriented programming, JavaCollectionFramework
 *
 * Choose a subject according to your number.
 * Develop a service using all your best in OOP and Java collections.
 *
 * Six methods must be written like in the following example.
 * A point for each one.
 *
 * Creative approaches are welcome.
 *
 * EXAMPLE
 *
 * A company contains two types of employees: full-time and part-time ones.
 *
 * 1. Create two appropriate classes and 5 objects of each one.
 * 2. Calculate the total salary of a month.
 * 3. Find the highest salary employee.
 * 4. Find he lowest salary employee
 * 5. The average salary.
 * 6. Who get more salary, part-time or full-time employees?
 *
 * /---------------- Subjects according to your number ------------------
 *
 * 1. Employees.
 * 2. Candies in boxes and by weight.
 * 3. Beer draft and bottled.
 * 4. Sugar packed and by weight.
 * 5. Cafe : standard lunch and ordering.
 * 6. Air fly : low-cost and business-class.
 * 7. Trip by train: social sitting places and business-class.
 * 8. Hotel: only bed and lux.
 * 9. Taxi: payment for km and for time.
 * 10. Fitness centre: minimal month subscription and free choice.
 *
 * Variant 4
 *
 */

public class Main {

    /**
     * Method that is default entry point of a program.
     *
     * @param args String argument for main method.
     */

    public static void main(String[] args) {

        //1. Create two appropriate classes and 5 objects of each one.
        // from all receipts

        PackedSugar sugarBeet = new PackedSugar("Star", 30);
        PackedSugar sugarTree = new PackedSugar("sugarTree", 70);
        PackedSugar sugarEco = new PackedSugar("sugarEco", 20);
        PackedSugar sugarPl = new PackedSugar("sugarPl", 36);
        PackedSugar sugarUa = new PackedSugar("sugarUa", 41);

        WeightSugar sugar1 = new WeightSugar("Sugar1",1,21);
        WeightSugar sugar2 = new WeightSugar("Sugar2",2,20);
        WeightSugar sugar3 = new WeightSugar("Sugar3",3,19);
        WeightSugar sugar4 = new WeightSugar("Sugar4",4,18);
        WeightSugar sugar5 = new WeightSugar("Sugar5",5,16);

        //Creation a list which consist 10 elements indicated above

        List<IPrice> sugar = new ArrayList<>();

        sugar.add(sugarBeet);
        sugar.add(sugarTree);
        sugar.add(sugarEco);
        sugar.add(sugarPl);
        sugar.add(sugarUa);
        sugar.add(sugar1);
        sugar.add(sugar2);
        sugar.add(sugar3);
        sugar.add(sugar4);
        sugar.add(sugar5);

        // 2. Calculate the total price of bought sugar.

        int totalPrice = sugar.stream().mapToInt(IPrice::getPrice).sum();

        // 3. Find the most expensive sugar in the receipt.

        IPrice theMostExpensiveSugar = sugar.stream()
                .max(Comparator.comparingInt(IPrice::getPrice))
                .orElse(null);

        // 4. Find the cheapest sugar in the receipt.

        IPrice theCheapestSugar = sugar.stream()
                .min(Comparator.comparingInt(IPrice::getPrice))
                .orElse(null);

        // 5.  The average price of all bought sugar.

        double averagePrice = sugar.stream().mapToInt(IPrice::getPrice)
                .average().orElse(0);

        //6. Comparison of two type of sugar eg. which price are higher

        // get the total price of bought packed sugar

        int packedSugar = sugar.stream().filter(item ->
                item instanceof PackedSugar)
                .mapToInt(IPrice::getPrice).sum();

        // get the total price of bought weight sugar

        int weightSugar = sugar.stream().filter(item ->
                item instanceof WeightSugar)
                .mapToInt(IPrice::getPrice).sum();

        if (packedSugar > weightSugar){
            System.out.println(" Packed sugar are more expensive" +
                    " than weight sugar.");
        }else{
            System.out.println(" Packed sugar are less expensive" +
                    " than weight sugar.");
        }

        // Final Conclusion

        System.out.println(" In a store exist " + sugar.size() + " sugar types."
                +  " \n Total price in all receipts is " + totalPrice + " UAH. "
                + " \n The cheapest sugar in receipt is " + theCheapestSugar
                + ". \n The most expensive sugar in receipt is " + theMostExpensiveSugar
                + ". \n The average price of sugar in receipt is " + averagePrice + " UAH");



    }
}
