package adapter;

public class ChuongTrinh {
	public static void main(String[] args) {
		LoTron x = new LoTron(2);	
		CocTron y = new CocTron(2, 10);
	
		// Kiểm tra xem y có vừa với x hay không
		System.out.println("Cọc tròn " + y + " có chui lọt lỗ tròn " + x + " hay không: " + x.isFit(y));
		
		CocVuong z = new CocVuong(4);
		CocTronOfCocVuong z2 = new CocTronOfCocVuong(z);
		System.out.println("Cọc vuong " + z + " có chui lọt lỗ tròn " + x + " hay không: " + x.isFit(z2));
	}
}
