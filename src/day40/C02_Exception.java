package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
		// Kullanicidan istedigi kadar sayi alip 
		//bu sayilari toplayan bir program yapiniz
		//sayi girisini bitermek icin Q ya basiniz
		
		int sayi=0;
		int toplam=0;
		int count=0;
		
		Scanner scan=new Scanner(System.in);
		
		try {
			
			while(count<10000) {
			System.out.println("Lutfen toplamak icin bir sayi yaziniz\nBitirmek icin q ya basiniz!");
			sayi=scan.nextInt();
			toplam+=sayi;
			count++;
		}
			
		} catch (InputMismatchException e) {
		System.out.println("girdiniz " + count + " sayinin toplami : " + toplam);
		
		}
		
		
		
		
		
		
		
		

	}

}
