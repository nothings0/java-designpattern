package strategy;
import java.util.Random;
public class ChuongTrinh {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = random.nextInt(1000);
        }
		
		Context context = new Context();
		
		var t1 = System.currentTimeMillis();
		context.setStrategy(new SapXepNoiBot());
		context.SapXep(arr);
		var t2 = System.currentTimeMillis();
		// thoi gian thuc thi (1)  = t2 - t1 (ms)

		context.setStrategy(new SapXepChen());
		context.SapXep(arr);
		var t3 = System.currentTimeMillis();
		// thoi gian thuc thi (2) = t2 - t1 (ms)

		context.setStrategy(new SapXepNhanh());
		context.SapXep(arr);
		var t4 = System.currentTimeMillis();
		
		System.out.println("Insertion Sort Time: " + (t3 - t1) + " ms");
		System.out.println("Quick Sort Time: " + (t4 - t1) + " ms");
		System.out.println("Bubble Sort Time: " + (t2 - t1) + " ms");
	}
}
