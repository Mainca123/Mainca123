package Hoa_Don;

import java.util.Scanner;
public class HoaDoaDeMo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong hoa don:");
		int n = sc.nextInt();
		sc.nextLine();
		HoaDon[] hd = new HoaDon[n+5];
		for(int i=1;i<=n; i++) {
			System.out.println("Nhap thong tin hoa don[" + i +"]:");
			hd[i] = new HoaDon();
			hd[i].nhap();
			hd[i].sapxep();
			hd[i].xuat();
			System.out.println("----------------------------------------------------------------------------");
		}
		
	}

}
