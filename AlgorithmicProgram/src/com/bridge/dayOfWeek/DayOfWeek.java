package com.bridge.dayOfWeek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayOfWeek {
	public static void dayOfWeek(int d, int m, int y) {
		Map mapDay = new HashMap();
		Map mapMonth = new HashMap();
		int y0 = 0;
		int x = 0;
		int m0 = 0;
		int d0 = 0;
		String str[] = {"sunday", "monday", "tuesday", "thursday", "Wednesday", "friday", "saturday"}; 
		
		String str1[] = {"jan", "feb", "mar", "april", "May", "june", "july", "aug", "sep", "oct", "nov", "dec"};
		
		for (int i = 0; i < str.length; i++) {
			mapDay.put(i, str[i]);
		}
		for (int i = 0; i < str1.length; i++) {
			mapMonth.put(i+1, str1[i]);
		}
		/*
		 * System.out.println(mapDay); System.out.println(mapMonth);
		 */
		
		y0 = y - (14 - m) / 12;
		x = y0 + y0/4 - y0/100 + y0/400;
		m0 = m + 12 * ((14 - m) / 12) - 2;
		d0 = (d + x + (31*m0) / 12) % 7;
		

		System.out.print("Day :::::::::::::::::::::: "+mapDay.get(d0));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = 0;
		int month = 0;
		int year = 0;
		try {
			System.out.print("Enter a day:month:year :");
			day = sc.nextInt();
			month = sc.nextInt();
			year = sc.nextInt();
			if(day > 31 || day < 0 || month > 12 || month < 1) {
				throw new IllegalArgumentException("Input is wrong");
			}
			dayOfWeek(day, month, year);
		} catch (Exception e) {
			System.err.println("Wrong Input");
			System.exit(0);
		}
		
	}
}
