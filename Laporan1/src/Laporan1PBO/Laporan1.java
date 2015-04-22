package Laporan1PBO;

import java.util.Scanner;

public class Laporan1 {

private static Scanner masukan = new Scanner(System.in);

	public static void main(String[] args){
	
		float angka1;
		float angka2;
		float hasil;
		int menu;
		int kembali;
		
		System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n",
				"                 Biodata                           ",
				"Nama                  : Fachri Trinovat",
				"NIM                   : 60200112026",
				"Tempat, Tanggal Lahir : Balikpapan, 3 November 1994",
				"Alamat                : BTN Minasa Upa J6/20",
				"Hobby	              : Wandering, Main Game, Baca Komik, dll");
		
		System.out.printf("\n%s\n%s\n%s\n%s\n%s\n%s\n",
				"Menu Operasi", 
				"1. Penjumlahan", 
				"2. Pengurangan", 
				"3. Perkalian", 
				"4. Pembagian", 
				"5. Mod");
		System.out.print("\nSilahkan ketik salah satu dari"
				+ " angka 1 sampai 5 untuk memilih operasi yang digunakan: ");
		menu = masukan.nextInt();
		
		if (menu==1)
		{	
			System.out.print("masukkan angka pertama: ");
			angka1 = masukan.nextFloat();
			System.out.print("masukkan angka kedua: ");
			angka2 = masukan.nextFloat();
			hasil = angka1 + angka2;
			System.out.printf("Hasil adalah %s ", hasil);
		}
		else if (menu==2)
		{
			System.out.print("masukkan angka pertama: ");
			angka1 = masukan.nextFloat();
			System.out.print("masukkan angka kedua: ");
			angka2 = masukan.nextFloat();
			hasil = angka1 - angka2;
			System.out.printf("Hasil adalah %s ", hasil);
		}
		else if (menu==3)
		{
			System.out.print("masukkan angka pertama: ");
			angka1 = masukan.nextFloat();
			System.out.print("masukkan angka kedua: ");
			angka2 = masukan.nextFloat();
			hasil = angka1 * angka2;
			System.out.printf("Hasil adalah %s ", hasil);
		}
		else if (menu==4)
		{
			System.out.print("masukkan angka pertama: ");
			angka1 = masukan.nextFloat();
			System.out.print("masukkan angka kedua: ");
			angka2 = masukan.nextFloat();
			hasil = angka1 + angka2;
			System.out.printf("Hasil adalah %s ", hasil);
		}
		else if (menu==5)
		{
			System.out.print("masukkan angka pertama: ");
			angka1 = masukan.nextFloat();
			System.out.print("masukkan angka kedua: ");
			angka2 = masukan.nextFloat();
			hasil = angka1 % angka2;
			System.out.printf("Hasil adalah %s ", hasil);
		}
		else
		{
			System.exit(0);
		}
	}
}