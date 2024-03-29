package com.bridge.addressbook;


import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class AdrresBookMain {
	static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		AddressBook addressBook = new AddressBook();
		Person[] personJson;
		int choice;
		choice = displayScreen();
		String i = "y";
		while(!i.equalsIgnoreCase("n")) {
			switch (choice) {
			case 1:
				addressBook.addPersons();
				System.out.println("Person is added Succesfully");
				System.out.println();
				System.out.print("Do you wont to continue : (Y / N) :: ");
				i = sc.next();
				if(i.equalsIgnoreCase("y")) 
					choice = displayScreen();
				else {
					System.out.println("============== Thank You ==============");
					i = "n";
				}
				break;
			case 2:
				addressBook.editPersons();
				System.out.print("Do you wont to continue : (Y / N) :: ");
				i = sc.next();
				if(i.equalsIgnoreCase("y")) 
					choice = displayScreen();
				else {
					System.out.println("============== Thank You ==============");
					i = "n";
				}
				break;
			case 3:
				addressBook.displayAddressBook();
				System.out.print("Do you wont to continue : (Y / N) :: ");
				i = sc.next();
				if(i.equalsIgnoreCase("y")) 
					choice = displayScreen();
				else {
					System.out.println("============== Thank You ==============");
					i = "n";
				}
				break;
			case 4:
				System.out.println("============== Thank You ==============");
				i = "n";
				break;
			default:
				  System.out.println("============== Wrong Input ============");
				  choice = displayScreen();
				break;
			}
		}
		//addressBook.zeapByPincode();
	}

	

	private static int displayScreen() {
		System.out.println("========== Choose Option =========");
		System.out.println("1 . Add  Person");
		System.out.println("2 . Edit Person");
		System.out.println("3 . Display Address Book");
		System.out.println("4 . Exit");
		int choice = sc.nextInt();
		return choice;
	}
}
