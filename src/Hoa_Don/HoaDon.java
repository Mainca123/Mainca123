package Hoa_Don;

import java.util.Scanner;
public class HoaDon {
	
	private String maHoaDon, ngayBan;
	private Hang[] matHang;
	private Khach_hang kh = new Khach_hang();
	private int soLuongHang;
	public HoaDon() {};
	
	//Nhap thong tin hoa don
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		///Nhap tien de hoa don
		System.out.print("Nhap ma hoa don:");
		this.maHoaDon = sc.next();
		sc.nextLine();
		System.out.print("Nhap ngay ban:");
		this.ngayBan = sc.nextLine();
		//Nhap khach hang
		System.out.print("Nhap ten khach hang:"); 
		String tenkh = sc.nextLine();
		System.out.print("Nhap dia chi:");
		String dckh = sc.nextLine();
		this.kh.settenKhachHang(tenkh).setdiaChi(dckh);
		//Nhap mat hang
		System.out.print("Nhap so luong mat hang: ");
		this.soLuongHang = sc.nextInt();
		sc.nextLine();
		matHang = new Hang[soLuongHang + 5];
		for(int i=1; i<=soLuongHang; i++) {
			System.out.println("Nhap thong tin mat hang[" + i + "]:");
			System.out.print("Nhap ten Hang:");
			String ten = sc.nextLine();
			System.out.print("Nhap don gia:");
			double dg = sc.nextDouble();
			System.out.print("Nhap so luong:");
			int sl = sc.nextInt();
			sc.nextLine();
			matHang[i] = new Hang(ten, dg, sl);
		}
	}
	
	//Xuat hoa don
	public void xuat() {
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf("%-50s %s\n","Ma HD: " + maHoaDon,"Ngay ban: " + ngayBan);
		System.out.printf("%-50s %s\n","Khach hang: " + kh.gettenKhachHang(),"Dia chi: " + kh.getdiaChi());
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf("%-20s %-20s %-20s %s\n", "Ten hang", "Don gia", "So luong","Thanh tien");
		for(int i=1;i<=soLuongHang; i++) {
			System.out.printf("%-20s %-20s %-20s %s\n", matHang[i].gettenHang(),
					matHang[i].getdonGia(), matHang[i].getsoLuong(),matHang[i].gettongTien());
		}
	}
	
	//Sap xep
	public void sapxep() {
		for(int i=1; i<soLuongHang; i++)
			for(int j=i+1; j<=soLuongHang; j++) {
				String ten1 = matHang[i].gettenHang();
				String ten2 = matHang[j].gettenHang();
				if(ten1.charAt(0) > ten2.charAt(0)) {
					Hang tam = matHang[i];
					matHang[i] = matHang[j];
					matHang[j] = tam;
				}
				if(ten1.charAt(0) == ten2.charAt(0)) {
					if(matHang[i].gettongTien() > matHang[j].gettongTien()) {
						Hang tam = matHang[i];
						matHang[i] = matHang[j];
						matHang[j] = tam;
					}
				}
			}	
	}
	
}
