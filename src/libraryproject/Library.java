package libraryproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Library {

	public static List<String> kullaniciBilgileri=new ArrayList<>();
	public static List<String> kitapAdi=new ArrayList<>();
	public static List<String> alinmaTarihi=new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);

	public static String verilenKitap[][]= {};

	public static int secenek;

	public static void main(String[] args) {

		// kullanıcılara ait bilgileri, kitap detayları, alınma tarihi
		kitapAdi.addAll(Arrays.asList("suc ve ceza","beyaz dis","cocuk kalbi","kasagı","mesnevi"));
		kullaniciBilgileri.addAll(Arrays.asList("1.Kişi", "2.Kişi", "3.Kişi", "4.Kişi","5.Kişi"));   

		do {
			secenek=menu();
			//System.out.println("seçeneğimiz "+ secenek);
			switch (secenek) {
			case 1:{ System.out.println("üye kaydı yapılacak");
			uyeKaydi();
			break;
			}
			case 2:{ System.out.println("kitap verilecek");
			kitapVerme();
			break;
			}
			case 3:{System.out.println("Kitap iade");
			break;
			}
			case 4:{System.out.println("Kütüphanedeki Kitaplar");
			break;
			}
			case 5:{System.out.println("Verilen kitaplar ");
			break;
			}
			case 6:{System.out.println("Tüm Kitap hareketleri Listele");
			break;
			}
			default:System.out.println("Çıkış yapılacak...");
			break;
			}



		}while(secenek!=7);
		System.out.println("İyi günler dileriz. Hoşçakalın.");
	}

	public static void uyeKaydi() {
		String cikis;
		String uyeAdi;
		do {
			System.out.println("Lütfen Üye adını giriniz...");
			//hata vardı. devam edilecek... nextLine yerine next yazınca oldu. Sebebini soralım?
			uyeAdi=scan.next();
			kullaniciBilgileri.add(uyeAdi);

			System.out.println("Üye kaydı gerçekleşmiştir. Yeni üye için Y Tuşuna, Çıkış için X tuşuna basınız.");
			cikis=scan.next();
		}while(!cikis.equalsIgnoreCase("x"));

	}
	public static void kitapVerme() {
		System.out.println("Lutfen kitap seciminizi yapiniz");

		int kitapVerme = scan.nextInt();

		switch (kitapVerme) {
		case 1:{ System.out.println("suc ve ceza");

		break;
		}
		case 2:{ System.out.println("beyaz dis");

		break;
		}
		case 3:{System.out.println("cocuk kalbi");
		break;
		}
		case 4:{System.out.println("kasagı");
		break;
		}
		case 5:{System.out.println("mesnevi");
		break;
		}
		default:System.out.println("Girdiginiz kitap numarasi uygun degildir");

		}
	}

	public static int menu() {
		System.out.println("Lütfen işleminizi seçiniz...\n"
				+ "1- Üye Kaydı Yap \n"
				+ "2-Kitap ver\n"
				+ "3-Kitap İade\n"
				+ "4-Kütüphanedeki Kitaplar\n"
				+ "5-Verilen Kitaplar\n"
				+ "6-Tüm Kitap hareketleri Listele\n"
				+ "7-Çıkış\n"
				+ " ");
		int secim;
		do {//döngüne 1 defa giriş yapar. içindekileri çalıştırır. eğer seçim 1 ve 7 arasında ise döngüden çıkar yoksa döngü devam eder.
			secim = scan.nextInt();
			if (secim<1||secim>7) { System.out.println("Lütfen 1 ile 7 arasında bir sayı seçiniz...");
			}
		}while(secim<1||secim>7);
		return secim;
	}
	public static void kitapListele() {
		System.out.println("Kitaplar");
		System.out.println("===\t ======= ");

		for (int i = 0; i < kitapAdi.size(); i++) {
			System.out.println(i + "\t" + kitapAdi.get(i) );

		}

	}
// burda github.com da yazdigim yeni code
//	public static void kitapListele() {
//		System.out.println("Kitaplar");
//		System.out.println("===\t ======= ");
//
//		for (int i = 0; i < kitapAdi.size(); i++) {
//			System.out.println(i + "\t" + kitapAdi.get(i) );
//
//		}


	//public static void kayit() {
	//	      
	//  System.out.println("kitap no girin: " );
	//	    int kitapNo =scan.nextInt();
	//	    DateTimeFormatter tarihf = DateTimeFormatter.ofPattern("yyyy/MM/d");
	//	    LocalDate tarih = LocalDate.now();
	//   System.out.println();
	//	    System.out.println(adsoyad +"\t" + kitapAdi.get(kitapNo)+ "\t"+tarihf.format(tarih));
	//  }
	//  
}
