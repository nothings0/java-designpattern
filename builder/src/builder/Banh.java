package builder;

public class Banh {
	private double duong;
	private double bot;
	
	// thuộc tính tuỳ chọn
	private double vani;
	private double nuocDua;
	private double cacao;
	
	public static class Builder {
		private double duong;
		private double bot;
		// thuộc tính tuỳ chọn
		private double vani;
		private double nuocDua;
		private double cacao;
		
		public Builder(double duong, double bot) {
			this.duong = duong;
			this.bot = bot;
		}
		
		public Builder vani(double value) {
			this.vani = value;
			return this;
		}
	
		public Builder nướcDừa(double value) {
			this.nuocDua = value;
			return this;
		}
	
		public Builder cacao(double value) {
			this.cacao = value;
			return this;
		}
		public Banh build() {
			return new Banh(this);
		}
	}
	private Banh(Builder b) {
		this.duong = b.duong;
		this.bot = b.bot;
		this.vani = b.vani;
		this.nuocDua = b.nuocDua;
		this.cacao = b.cacao;
	}
	@Override
	public String toString() {
		return "Banh [duong=" + duong + ", bot=" + bot + ", vani=" + vani + ", nuocDua=" + nuocDua + ", cacao=" + cacao
				+ "]";
	}
}
