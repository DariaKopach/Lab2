package com.company.model;

import com.company.IPrice;

/**
 *
 * Classname: PackedSugar
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

public class PackedSugar implements IPrice {

    private String name;            // name of packed sugar
    private int priceForPacked;     // price for packed

    //POJO - plane old java object
    // 1. Constructor:
    // a) generate an empty constructor

    public PackedSugar() {
    }

    /**
     * Full constructor for packed sugar with parameters.
     * @param name name of packed sugar.
     * @param priceForPacked price for one packed sugar.
     *
     */

    public PackedSugar(String name, int priceForPacked) {
        this.name = name;
        this.priceForPacked = priceForPacked;
    }

    // generate getters and setters for the parameters above

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceForPacked() {
        return priceForPacked;
    }

    public void setPriceForPacked(int priceForPacked) {
        this.priceForPacked = priceForPacked;
    }

    /**
     *
     * @return Returns info about packed sugar
     */

    @Override
    public String toString() {
        return "Packed Sugar " +
                " with name = '" + name + '\'' +
                ", its price = " + priceForPacked + " UAH";
    }

    /**
     * implements from IPrice
     * @return Return price
     */

    @Override
    public int getPrice() {
        return priceForPacked;
    }
}
