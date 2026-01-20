package com.budgetwise;

import java.util.*;
import java.time.LocalDate;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Map<String, Double> limits = new HashMap<>();
        limits.put("Food", 5000.0);
        limits.put("Travel", 3000.0);

        IAnalyzable budget = new MonthlyBudget("January", 20000, limits);

        ((MonthlyBudget) budget).addTransaction(
                new Transaction(2000, "EXPENSE", LocalDate.now(), "Food")
        );
        ((MonthlyBudget) budget).addTransaction(
                new Transaction(4000, "EXPENSE", LocalDate.now(), "Travel")
        );

        budget.generateReport();
        budget.detectOverspend();
    }
}
