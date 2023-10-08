package min_max_bulma;

import java.util.Scanner;

public class min_max_bulma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Kaç tane sayı gireceksiniz: ");
		int nsayi = scan.nextInt();
		int sayi;
		int enkucuk = 0;
		int enbuyuk = 0;

		for (int i = 1; i <= nsayi; i++) {
			System.out.print(i + ". Sayıyı giriniz: ");
			sayi = scan.nextInt();
			
			if(i==1) {
				enbuyuk=sayi;
				enkucuk=sayi;
			}

			if (sayi > enbuyuk) {
				enbuyuk = sayi;
			}

			if (sayi < enkucuk) {
				enkucuk = sayi;
			}
		}

		System.out.println("En büyük sayı: " + enbuyuk);
		System.out.println("En küçük sayı: " + enkucuk);

	}

}
