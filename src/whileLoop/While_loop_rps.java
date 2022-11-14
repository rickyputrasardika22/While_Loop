package whileLoop;
import java.text.DecimalFormat;
import java.util.Scanner;
public class While_loop_rps 
{
	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("##");
		Scanner scan = new Scanner(System.in);
		
		
		String ulang = "Ya";
		String jenisBarang = null;
		int jumlahBarang, hargaBarang = 0;
		double pajak, totalHarga, totalBayar;
		int pilihBarang = 0;
		String namaBarang = null;
		char ukuranBarang = 0;
		
		
		while(ulang.equalsIgnoreCase("Ya"))
		{
			System.out.println("Pilih Barang");
			System.out.println("1. Madu");
			System.out.println("2. Obat Herbal");
			
			System.out.print("Masukkan Pilihan \t= ");
			pilihBarang = scan.nextInt();
			
			System.out.println("---------------------------------------------------");
			
			System.out.print("Masukkan Jenis Barang \t= ");
			jenisBarang = scan.next();
			System.out.print("Masukkan Ukuran Barang \t= ");
			ukuranBarang = scan.next().charAt(0);
			System.out.print("Masukkan Jumlah Barang \t= ");
			jumlahBarang = scan.nextInt();
			
			System.out.println("---------------------------------------------------");
		
			if(pilihBarang == 1)	
			{
				namaBarang = "Madu";
				if(jenisBarang.equalsIgnoreCase("Murni") || jenisBarang.equalsIgnoreCase("murni"))
				{
					if(ukuranBarang == 'S' || ukuranBarang == 's')
					{
						hargaBarang = 70000;
					}
					else if (ukuranBarang == 'M' || ukuranBarang == 'm')
					{
						hargaBarang = 130000;
					}	
				}	
				else if(jenisBarang.equalsIgnoreCase("Imun") || jenisBarang.equalsIgnoreCase("imun"))
				{
					if(ukuranBarang == 'S' || ukuranBarang == 's')
					{
						hargaBarang = 75000;
					}
					else if (ukuranBarang == 'M' || ukuranBarang == 'm')
					{
						hargaBarang = 145000;
					}	
				}	
				else if(jenisBarang.equalsIgnoreCase("Herbal") || jenisBarang.equalsIgnoreCase("herbal"))
				{
					if(ukuranBarang == 'S' || ukuranBarang == 's')
					{
						hargaBarang = 85000;
					}
					else if (ukuranBarang == 'M' || ukuranBarang == 'm')
					{
						hargaBarang = 165000;
					}	
				}
				else if(jenisBarang.equalsIgnoreCase("Hexabrain") || jenisBarang.equalsIgnoreCase("hexabrain"))
				{
					if(ukuranBarang == 'S' || ukuranBarang == 's')
					{
						hargaBarang = 95000;
					}
					else if (ukuranBarang == 'M' || ukuranBarang == 'm')
					{
						hargaBarang = 180000;
					}	
				}
				else if(jenisBarang.equalsIgnoreCase("Gold") || jenisBarang.equalsIgnoreCase("gold"))
				{
					if(ukuranBarang == 'S' || ukuranBarang == 's')
					{
						hargaBarang = 105000;
					}
					else if (ukuranBarang == 'M' || ukuranBarang == 'm')
					{
						hargaBarang = 200000;
					}	
				}
			}
			else if(pilihBarang == 2)
			{
				namaBarang = "Obat Herbal";			
				if(jenisBarang.equalsIgnoreCase("Saffron") || jenisBarang.equalsIgnoreCase("saffron"))
				{
					if(ukuranBarang == 'S' || ukuranBarang == 's')
					{
						hargaBarang = 150000;
					}
					else if (ukuranBarang == 'M' || ukuranBarang == 'm')
					{
						hargaBarang = 300000;
					}	
				}	
				else if(jenisBarang.equalsIgnoreCase("Propolis") || jenisBarang.equalsIgnoreCase("propolis"))
				{
					if(ukuranBarang == 'S' || ukuranBarang == 's')
					{
						hargaBarang = 85000;
					}
					else if (ukuranBarang == 'M' || ukuranBarang == 'm')
					{
						hargaBarang = 165000;
					}	
				}
				else if(jenisBarang.equalsIgnoreCase("Probiotik") || jenisBarang.equalsIgnoreCase("probiotik"))
				{
					if(ukuranBarang == 'S' || ukuranBarang == 's')
					{
						hargaBarang = 50000;
					}
					else if (ukuranBarang == 'M' || ukuranBarang == 'm')
					{
						hargaBarang = 95000;
					}	
				}
				else if(jenisBarang.equalsIgnoreCase("Bee Polen") || jenisBarang.equalsIgnoreCase("bee polen"))
				{
					if(ukuranBarang == 'S' || ukuranBarang == 's')
					{
						hargaBarang = 95000;
					}
					else if (ukuranBarang == 'M' || ukuranBarang == 'm')
					{
						hargaBarang = 180000;
					}	
				}	
			}			
			
			totalHarga = hargaBarang*jumlahBarang;
			pajak = 0.1 * totalHarga;
			totalBayar = totalHarga + pajak;
			
			
			System.out.println("Data Pembelian \t\t= " + namaBarang + " " + jenisBarang + " (" + ukuranBarang + ") " + jumlahBarang);
			System.out.println("Total Harga \t\t= Rp. " + df.format(totalHarga) + ",-");
			System.out.println("Pajak \t\t\t= Rp. " + df.format(pajak) + ",-");
			System.out.println("Total Bayar \t\t= Rp. " + df.format(totalBayar) + ",-");
			
			System.out.println("---------------------------------------------------");
			
			System.out.print("Apakah Anda ingin mengulang ? ");
			ulang = scan.next();	

		}
	}
}
