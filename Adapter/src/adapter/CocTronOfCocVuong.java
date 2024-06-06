package adapter;

public class CocTronOfCocVuong extends CocTron{
	private CocVuong x;
	
	public CocTronOfCocVuong(CocVuong a) {
		this.x = a;
	}

	@Override
	public double getBanKinh() {
		return x.getKíchThước() * Math.sqrt(0.5);
	}
}
