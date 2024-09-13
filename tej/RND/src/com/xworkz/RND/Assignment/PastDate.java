package com.xworkz.RND.Assignment;

import java.time.LocalDate;

public class PastDate {

	public static void main(String[] args) {
		LocalDate pastDate = LocalDate.now().minusDays(10); // 10 days in the past
        System.out.println("Past Date: " + pastDate);

	}

}
