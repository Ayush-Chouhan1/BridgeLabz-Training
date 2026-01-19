package com.budgetwise;

import java.util.*;

class MonthlyBudget extends Budget {

    private String month;

    public MonthlyBudget(String month, double income, Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
        this.month = month;
    }

    @Override
    public void generateReport() {
        System.out.println("\n Monthly Budget Report: " + month);
        System.out.println("Income: " + income);
        System.out.println("Net Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        Map<String, Double> spent = getCategoryExpenseTotals();

        for (String category : spent.keySet()) {
            if (spent.get(category) > categoryLimits.getOrDefault(category, Double.MAX_VALUE)) {
                System.out.println(" Overspent in " + category);
            }
        }
    }
}
