package com.bridge.CashCounter;

import java.util.Scanner;

public class CashCounTer {
	int mainBalance = 900000;
	
	public void changeBalance(int amount) {
		mainBalance = mainBalance + amount;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankTransaction bnk = new BankTransaction();
		int i=0, key=0;
		int num = 0;
		int amount = 0;
		try {
			
			
			System.out.print("Enter a Number Of Person In Queue :");
			num = sc.nextInt();
			
			Queue qu = new Queue(num);
			for (int j = 0; j < num; j++) {
				System.out.print("Enter "+(j+1)+"st Person Name :");
				Person per = new Person(sc.next(), 10000);
				qu.enqueue(per);
				System.out.println();
			}
			for(int k = 0; k < num; k++) {
				Person per = qu.dequeue();
				bnk.bankDisplay(per.name);
				key = sc.nextInt();
				i = 0;
				while(i != 1) {

					switch (key) {
					
				
						case 1:
							System.out.print("Enter deposite Amount :");
							amount = sc.nextInt();System.out.println();
							bnk.deposite(amount, per);
							System.out.print("If you wont to continue Y | N :");System.out.println();
							if(sc.next().charAt(0) == 'Y') {
								bnk.bankDisplay(per.name);
								key = sc.nextInt();
								i = 0;
							}else {
								System.out.println("*********************Thanku for Banking**************************");
								i = 1;
							}
							break;
					
				
				
						case 2:
							System.out.print("Enter withDraw Amount :");
							amount = sc.nextInt();
							bnk.withDraw(amount, per);
							System.out.print("If you wont to continue Y | N :");
							if(sc.next().charAt(0) == 'Y') {
								bnk.bankDisplay(per.name);
								key = sc.nextInt();
								i = 0;
							}else {
								System.out.println("****************Thanku for Banking***************");
								System.out.println();
								i = 1;
							}
							break;
					
					
				
						case 3:
							bnk.viewBalance(per);
							System.out.print("If you wont to continue Y | N :");
							if(sc.next().charAt(0) == 'Y') {
								bnk.bankDisplay(per.name);
								key = sc.nextInt();
								i = 0;
							}else {
								System.out.println("****************Thanku for Banking***********************");
								i = 1;
							}
							break;
					
				
				
						default:
							System.err.println("You Enter Wrong Input");
							System.out.print("Plese Enter 1|2|3 :");
							key = sc.nextInt();
							i = 0;
							break;
					}//Switch				
				}//while
			}//for
			
		} catch (Exception e) {
			System.err.println("Wrong Input ");
			System.exit(0);
		}
	}

}
