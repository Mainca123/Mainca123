package Hoa_Don;

public class Khach_hang {
	private String tenKhachHang;
	private String diaChi;
	
	///Constructor
	public Khach_hang() {}
	public Khach_hang(String tenKhachHang, String diaChi) {
		this.tenKhachHang = tenKhachHang;
		this.diaChi = diaChi;
	}
	
	///Getter
	public String gettenKhachHang() {
		return tenKhachHang;
	}
	public String getdiaChi() {
		return diaChi;
	}
	
	///Setter
	public Khach_hang settenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
		return this;
	}
	public Khach_hang setdiaChi(String diaChi) {
		this.diaChi = diaChi;
		return this;
	}
	
	///ToString
	@Override
	public String toString() {
		return "Khach_hang [tenKhachHang=" + tenKhachHang + ", diaChi=" + diaChi + "]";
	}
}
