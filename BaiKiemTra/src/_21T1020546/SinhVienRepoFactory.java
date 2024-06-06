package _21T1020546;

public class SinhVienRepoFactory {
	private String cnn;
	public SinhVienRepoFactory(String cnnStr) {
		// TODO Auto-generated constructor stub
		this.cnn = cnnStr;
	}
	public SinhVienRepo createSinhVienRepo(String loai) {
		if (loai == "MS_SQLSERVER")
			return new SinhVienRepoSQL(cnn);
		else if(loai == "MS_SQLSERVER") {
			return new SinhVienRepoSQL(cnn);
		}
		return null;
	}
}
