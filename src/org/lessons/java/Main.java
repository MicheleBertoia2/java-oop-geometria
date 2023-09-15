package org.lessons.java;

import java.util.Scanner;

import org.lessons.java.geometria.Rettangolo;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Base: ");
			int base = sc.nextInt();
			
			System.out.print("Altezza: ");
			int altezza = sc.nextInt();
			
			Rettangolo ret = new Rettangolo(base,altezza);
			
			ret.getInfo();
		}
		sc.close();
	}
}
