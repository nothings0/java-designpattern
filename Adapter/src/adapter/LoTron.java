package adapter;

public class LoTron {
	private double banKinh;
	
	public double getBanKinh() { return this.banKinh; }

	public LoTron(double banKinh) {
		super();
		this.banKinh = banKinh;
	}

	//	business logic
	public boolean isFit(CocTron x) {
		return this.getBanKinh() >= x.getBanKinh();
	}
}
