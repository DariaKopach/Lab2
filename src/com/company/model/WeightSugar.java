package com.company.model;

import com.company.IPrice;

/**
 *
 * Classname: WeightSugar
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

public class WeightSugar implements IPrice {

    private String name;            // name of sugar
    private double weightInKg;      // weight of sugar in kg
    private int priceForKg;         // price for one kg

    //POJO - plane old java object
    // 1. Constructor:
    // a) generate an empty constructor

    public WeightSugar() {
    }

    /**
     * Full constructor for weight sugar with parameters.
     * @param name Sugar name.
     * @param weightInKg wight of sugar in kg.
     * @param priceForKg price of sugar for kg.
     */

    public WeightSugar(String name, double weightInKg, int priceForKg) {
        this.name = name;
        this.weightInKg = weightInKg;
        this.priceForKg = priceForKg;
    }

    // generate getters and setters for the parameters above

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public int getPriceForKg() {
        return priceForKg;
    }

    public void setPriceForKg(int priceForKg) {
        this.priceForKg = priceForKg;
    }

    /**
     *
     * @return Returns info about weight sugar
     */

    @Override
    public String toString() {
        return "Weight Sugar " +
                " with name '" + name + '\'' +
                ", its weight = " + weightInKg + " kg" +
                ", price for kg = " + priceForKg + " UAH.";
    }

    /**
     * implements from IPrice
     * @return Returns calculated price
     */

    @Override
    public int getPrice() {
        return (int) (this.getPriceForKg() * this.getWeightInKg());
    }
}
