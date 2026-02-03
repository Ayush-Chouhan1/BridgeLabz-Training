package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;

class Movie {
	String name;
	int releaseYear;
	double rating;

	public Movie(String name, int releaseYear, double rating) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}

	public int releaseYear() {
		return releaseYear;
	}

	public String toString() {
		return "Name - " + name + " Release Year - " + releaseYear + " Rating - " + rating;
	}
}

public class Top5Movies {

	public static void main(String[] args) {

		List<Movie> list = Arrays.asList(new Movie("Avenger", 2026, 9.4), new Movie("Deadpool", 2029, 7.8),
				new Movie("Captain America", 2028, 7.4), new Movie("Iron Man", 2025, 8.6),
				new Movie("Dare Devil", 2025, 6.4), new Movie("LOKI", 2020, 8.0), new Movie("Breaking Bad", 2026, 9.9),
				new Movie("Avatar", 2024, 4.4));
		int recentYear = 2023;
		
		List<Movie> top5Trending = list.stream().filter((a) -> a.releaseYear() >= recentYear).
		sorted(Comparator.comparing(Movie::getRating).reversed()).limit(5).collect(Collectors.toList());;
		
		top5Trending.forEach(System.out::println);
	}

}
