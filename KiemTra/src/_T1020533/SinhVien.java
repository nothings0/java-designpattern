package _T1020533;

import java.sql.Date;

public class SinhVien {
    private String MaSinhVien;
    private String HoTen;
    private byte GioiTinhNam;
    private Date NgaySinh;

    // Constructors
    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, byte gioiTinh, Date ngaySinh) {
        this.MaSinhVien = maSinhVien;
        this.HoTen = hoTen;
        this.GioiTinhNam = gioiTinh;
        this.NgaySinh = ngaySinh;
    }

    // Getters and setters
    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.MaSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

    public byte getGioiTinh() {
        return GioiTinhNam;
    }

    public void setGioiTinh(byte gioiTinh) {
        this.GioiTinhNam = gioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.NgaySinh = ngaySinh;
    }
}

