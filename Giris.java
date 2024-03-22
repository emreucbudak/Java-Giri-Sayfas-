package test;

import java.util.Scanner;

public class Giris {

	public static void main(String[] args) {
		Scanner gir = new Scanner(System.in);
		String a,b;
		System.out.println("Lütfen Kullanıcı Adını Gir = ");
		a = gir.nextLine();
		System.out.println("Lütfen Şifreni Gir = ");
		b = gir.nextLine();
		if (a.equals("emreucbudak") && b.equals("123")) {
			System.out.println("Giris Yapildi Hoşgeldiniz");
			
		}
		else {
			System.out.println("Giriş Başarisiz");
		}

	}

}
