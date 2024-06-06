package prototype;

public class SinhVien {
	public String hoten;
	public String maSv;
	public SinhVien(String hoten, String maSv) {
		this.hoten = hoten;
		this.maSv = maSv;
	}
	
	public SinhVien(SinhVien x) {
		this.hoten = x.hoten;
		this.maSv = x.maSv;
	}
	
	public SinhVien taoBanSao() {
		return new SinhVien(this);
	}

	@Override
	public String toString() {
		return "SinhVien [hoten=" + hoten + ", maSv=" + maSv + "]";
	}
}
