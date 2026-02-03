package com.collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

// Book class
class Book {
	private String title;
	private String genre;
	private int pages;

	public Book(String title, String genre, int pages) {
		this.title = title;
		this.genre = genre;
		this.pages = pages;
	}

	public String getGenre() {
		return genre;
	}

	public int getPages() {
		return pages;
	}
}

// Main class
public class LibraryBookStatistics {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book("Book A", "Fiction", 320), new Book("Book B", "Fiction", 280),
				new Book("Book C", "Science", 450), new Book("Book D", "Science", 500),
				new Book("Book E", "History", 600));

		// Group by genre and summarize pages
		Map<String, IntSummaryStatistics> statsByGenre = books.stream()
				.collect(Collectors.groupingBy(Book::getGenre, Collectors.summarizingInt(Book::getPages)));

		// Print statistics
		statsByGenre.forEach((genre, stats) -> {
			System.out.println("Genre: " + genre);
			System.out.println("Total Pages: " + stats.getSum());
			System.out.println("Average Pages: " + stats.getAverage());
			System.out.println("Max Pages: " + stats.getMax());
			System.out.println("---------------------------");
		});
	}
}
