package builder;

public class ChuongTrinh {

	public static void main(String[] args) {
		var banh = new Banh.Builder(1, 2).cacao(2).build();
		System.out.println(banh.toString());
	}

}
