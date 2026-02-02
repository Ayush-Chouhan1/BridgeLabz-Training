package com.interfaces.defaultmethodsinterfaces.dataexporter;

public interface ReportExporter {
	void exportToCSV();

	void exportToPDF();

	// Newly added feature (won’t break old code)
	default void exportToJSON() {
		System.out.println("Exporting report to JSON format");
	}
}