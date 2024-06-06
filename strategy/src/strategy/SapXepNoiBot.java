package strategy;

public class SapXepNoiBot implements IStrategy{
//	public static void main(String[] args) {
//		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
//		bubbleSort(arr);
//		System.out.println("Mảng đã được sắp xếp:");
//		printArray(arr);
//	}

	// Hàm sắp xếp nổi bọt
	@Override
	public void SapXep(int[] arr) {
		// TODO Auto-generated method stub
		bubbleSort(arr);
	}
	
	public void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Hoán đổi arr[j] và arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// Hàm in mảng
//	public static void printArray(int[] arr) {
//		int n = arr.length;
//		for (int i = 0; i < n; ++i)
//			System.out.print(arr[i] + " ");
//		System.out.println();
//	}
}
