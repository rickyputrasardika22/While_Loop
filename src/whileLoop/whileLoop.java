package whileLoop;
import java.util.Scanner;
public class whileLoop 
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		int jumlahBarang, hargaBarang, total;
		char ulang = 'Y';
		
		while (ulang == 'Y' || ulang == 'y')
		{
			System.out.print("Masukkan Jumlah Barang = ");
			jumlahBarang = scan.nextInt();
			System.out.print("Masukkan Harga Barang = ");
			hargaBarang = scan.nextInt();
			
			total = jumlahBarang * hargaBarang;
			
			System.out.println("Total = " + total);
			
			System.out.print("Apakah Anda ingin mengulang? ");
			ulang = scan.next().charAt(0);
		}	
	}
	
}
