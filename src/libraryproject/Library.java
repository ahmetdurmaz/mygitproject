package libraryproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

	// nextline neden olmuyor hocaya soralım

	public static List<String> kitapAdi= new ArrayList<>();
	public static List<String> yazarAdi= new ArrayList<>();
	public static List<String> yayinYili= new ArrayList<>();
	public static List<Double> fiyat= new ArrayList<>();
	public static int kitapKodu=1001;
	public static int index=0;
	public static List<Integer> kitapKoduList= new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/*1.Bu programda kitaplar, Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat
	           gibi bilgiler içerebilmelidir.
	           2. Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara
	                   vermelidir.
	          3. Kullanıcı sisteme Kitap eklemeyebimeli, silebilmeli, arama ve
	         tüm kitapları listeleme gibi işlemleri yapabilmelidir.
	          4. Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü
	         sunulmalıdır ve Kullanıcı programı bitirene kadar işlemlere devam
	          edebilmelidir.
	          ========= KİTAP PROGRAMI =============
	           1: Kitap ekle
	           2: Numara ile kitap sil
	           3: Numara ile kitap ara
	           4: Tüm kitapları listele
	           5: Bitti
		 */

		int secim;

		do {
			secim = menuGoster();
			switch ( secim ) {
			
			case 1: kitapEkle();
				    break;
			case 2: kitapSil();
			        break;
			case 3: kitapAra();
			        break;
			case 4: kitapListele();
			        break;
			default:
				   break;
				   
			}
			
		}while(secim!=6);
	}

	public static void kitapListele() {
		for (int i = 0; i < kitapAdi.size(); i++) {

			System.out.println(kitapKoduList.get(i) +" "+ kitapAdi.get(i)+" "+yazarAdi.get(i)+" "+yayinYili.get(i)+" "+fiyat.get(i));
		}

	}

	public static void kitapAra() {
		System.out.println("aramak istediginiz kitap kodunu giriniz");
		int secilenKitapKodu=scan.nextInt();
		if (kitapKoduList.size()==0) {
			System.out.println("sistemde kitap yok");
		} else {


			for (int i = 0; i < kitapKoduList.size(); i++) {
				if (kitapKoduList.get(i)==secilenKitapKodu) {

					System.out.println(kitapKoduList.get(i)+" "
							+kitapAdi.get(i)+" "
							+yazarAdi.get(i)+" "
							+yayinYili.get(i)+" "
							+fiyat.get(i));
				} else {
					System.out.println("girdiginiz kod ile kitap yok");
				}
			}
		}

	}

	public static void kitapSil() {
		kitapListele();

		System.out.println("silmek istediginiz kitap kodunu giriniz");
		int secilenKitapKodu=scan.nextInt();
		for (int i = 0; i < kitapKoduList.size(); i++) {
			if (kitapKoduList.get(i)==secilenKitapKodu) {
				kitapKoduList.remove(i);
				kitapAdi.remove(i);
				yazarAdi.remove(i);
				yayinYili.remove(i);
				fiyat.remove(i);
				System.out.println("sectiginiz kitap silindi");
			} else {
				System.out.println("girdiginiz kod ile kitap yok");
			}
		}


	}

	public static int menuGoster() {
		int secim;

		do {
			System.out.println(" ========= KİTAP PROGRAMI =============");
			System.out.println(" 1: Kitap ekle\n 2: Numara ile kitap sil \n 3: Numara ile kitap ara \n 4: Tüm kitapları listele \n 5: Bitti");
			System.out.println("Lutfen 1-5 arasi secim yapınız");
			secim = scan.nextInt();
			if (secim<1 || secim>5) {
				System.out.println("Yanlıs giris  yaptınız Lutfen 1-5 arası deger giriniz");
			}
		} while (secim<1 || secim>6);
		if (secim==5) {
			System.out.println("Isleminiz Bitmistir");
		}
		return secim; 
	}


	public static void kitapEkle() {
		char secim2;
		String girilenKitapAdi;
		String girilenYazarAdi;
		String girilenYayinYili;
		Double girilenFiyat;

		do {

			System.out.println("Kitap adını giriniz");
			girilenKitapAdi=scan.next();
			kitapAdi.add(girilenKitapAdi);

			System.out.println("Yazar adi giriniz");
			girilenYazarAdi=scan.next();
			yazarAdi.add(girilenYazarAdi);

			System.out.println("yayin yili giriniz");
			girilenYayinYili=scan.next();
			yayinYili.add(girilenYayinYili);

			System.out.println("Fiyat giriniz");
			girilenFiyat=scan.nextDouble();
			fiyat.add(girilenFiyat);

			System.out.println((kitapKodu-1)+"\n"+girilenKitapAdi+"\n"+girilenYazarAdi+"\n"+girilenYayinYili+" "+girilenFiyat);
			System.out.println("yeni kitap eklemek istiyor musunuz : e/h");
			secim2=scan.next().toLowerCase().charAt(0);

		}while(secim2=='e');

		// bu kodu yeni ekledim
	}

}