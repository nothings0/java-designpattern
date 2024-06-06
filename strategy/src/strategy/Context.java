package strategy;

public class Context{
	    private IStrategy strategy;
	    
	    public Context() {
			super();
		}

		public void SapXep(int arr[]) {
	    	strategy.SapXep(arr);
	    }

	    public void setStrategy(IStrategy strategy) {
	        this.strategy = strategy;
	    }
}
