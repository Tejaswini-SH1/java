package com.xworkz.RND.Assignment;

import java.time.LocalDateTime;

public class pastDateTime {

	public static void main(String[] args) {
		LocalDateTime pastDateTime = LocalDateTime.now().minusDays(10).minusHours(5); // 10 days and 5 hours in the past
        System.out.println("Past DateTime: " + pastDateTime);

	}

}
