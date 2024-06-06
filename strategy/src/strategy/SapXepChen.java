package strategy;

public class SapXepChen implements IStrategy{
//	public static void main(String[] args) {
//		int[] arr = { 12, 11, 13, 5, 6 };
//		insertionSort(arr);
//		System.out.println("Mảng đã được sắp xếp:");
//		printArray(arr);
//	}

	// Hàm sắp xếp chèn
	@Override
	public void SapXep(int[] arr) {
		// TODO Auto-generated method stub
		insertionSort(arr);
	}
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			// Di chuyển các phần tử của arr[0..i-1], lớn hơn key, đến một vị trí phía sau
			// so với vị trí hiện tại của chúng
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

//	// Hàm in mảng
//	public static void printArray(int[] arr) {
//		int n = arr.length;
//		for (int i = 0; i < n; ++i)
//			System.out.print(arr[i] + " ");
//		System.out.println();
//	}
}

