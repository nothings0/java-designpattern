package prototype;

public class SinhVienNuocNgoai extends SinhVien{
	public String quocGia;
	
	public SinhVienNuocNgoai(String hoten, String maSv, String quocGia) {
		super(hoten, maSv);
		this.quocGia = quocGia;
	}

	public SinhVienNuocNgoai(SinhVienNuocNgoai x) {
		super(x);
		this.quocGia = x.quocGia;
	}
	
	@Override
	public SinhVien taoBanSao() {
		return new SinhVienNuocNgoai(this);
	}
	@Override
	public String toString() {
		return "SinhVienNuocNgoai [hoten=" + hoten + ", maSv=" + maSv + ", quocGia=" + quocGia + "]";
	}
}
