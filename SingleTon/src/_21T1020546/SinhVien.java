package _21T1020546;

import java.sql.Date;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;

    // Constructors
    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, String gioiTinh, Date ngaySinh) {
        this.maSV = maSinhVien;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    // Getters and setters
    public String getMaSinhVien() {
        return maSV;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSV = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}

