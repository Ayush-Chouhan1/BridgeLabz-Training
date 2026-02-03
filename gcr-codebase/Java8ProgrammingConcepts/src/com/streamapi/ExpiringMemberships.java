package com.streamapi;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Member {
	private String name;
	private LocalDate expiryDate;

	public Member(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return name + "  Expiry Date: " + expiryDate;
	}
}

public class ExpiringMemberships {

	public static void main(String[] args) {

		List<Member> members = Arrays.asList(new Member("Ayush", LocalDate.now().plusDays(10)),
				new Member("Rahul", LocalDate.now().plusDays(40)), new Member("Neha", LocalDate.now().plusDays(25)),
				new Member("Priya", LocalDate.now().minusDays(5)), new Member("Amit", LocalDate.now().plusDays(30)));

		LocalDate today = LocalDate.now();
		LocalDate next30Days = today.plusDays(30);

		List<Member> expiringSoon = members.stream()
				.filter(m -> m.getExpiryDate().isAfter(today) && !m.getExpiryDate().isAfter(next30Days))
				.collect(Collectors.toList());

		expiringSoon.forEach(System.out::println);
	}
}
