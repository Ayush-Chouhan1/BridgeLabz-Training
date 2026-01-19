package com.budgetwise;

import java.util.*;

abstract class Budget implements IAnalyzable {

    protected double income;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income, Map<String, Double> categoryLimits) {
        this.income = income;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public double calculateNetSavings() {
        double totalExpenses = transactions.stream()
                .filter(t -> t.getType().equalsIgnoreCase("EXPENSE"))
                .mapToDouble(Transaction::getAmount)
                .sum();

        return income - totalExpenses; 
    }

    protected Map<String, Double> getCategoryExpenseTotals() {
        Map<String, Double> totals = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                totals.put(
                    t.getCategory(),
                    totals.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
                );
            }
        }
        return totals;
    }
}
