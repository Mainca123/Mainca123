package Hoa_Don;

public class Hang {
	private String tenHang;
	private double donGia;
	private int soLuong;
	private double tongTien;
	
	///Constructor
	public Hang() {}
	public Hang(String tenHang, double donGia, int soLuong) {
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.tongTien = (double)this.soLuong * this.donGia;
	}
	
	///Getter
	public String gettenHang() {
		return tenHang;
	}
	public double getdonGia() {
		return donGia;
	}
	public int getsoLuong() {
		return soLuong;	
	}
	
	public double gettongTien() {
		return tongTien;
	}
	
	///Setter
	public Hang settenHang(String tenHang) {
		this.tenHang = tenHang;
		return this;
	}
	public Hang setdonGia(double donGia) {
		this.donGia = donGia;
		return this;
	}
	public Hang setsoLuong(int soLuong) {
		this.soLuong = soLuong;
		return this;
	}
	
	///ToString
	@Override
	public String toString() {
		return "Hang [tenHang=" + tenHang + ", donGia=" + donGia + ", soLuong=" + soLuong + ", tongTien=" + tongTien+ "]";
	}
	
}
