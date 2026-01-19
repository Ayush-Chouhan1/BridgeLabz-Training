package com.budgetwise;

class AnnualBudget extends Budget {

    private int year;

    public AnnualBudget(int year, double income, Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
        this.year = year;
    }

    
    public void generateReport() {
        System.out.println("\n Annual Budget Report: " + year);
        System.out.println("Total Income: " + income);
        System.out.println("Yearly Savings: " + calculateNetSavings());
    }

    
    public void detectOverspend() {
        System.out.println(" Annual Overspending Analysis");
        super.getCategoryExpenseTotals().forEach((cat, amt) -> {
            if (amt > categoryLimits.getOrDefault(cat, Double.MAX_VALUE)) {
                System.out.println(" Category exceeded: " + cat);
            }
        });
    }
}
