package strategy;

public class SapXepNhanh implements IStrategy{
//	public static void main(String[] args) {
//		int[] arr = { 10, 7, 8, 9, 1, 5 };
//		quickSort(arr, 0, arr.length - 1);
//		System.out.println("Mảng đã được sắp xếp:");
//		printArray(arr);
//	}

	// Hàm sắp xếp nhanh
	@Override
	public void SapXep(int[] arr) {
		int low = 0; int high = 0;
		// TODO Auto-generated method stub
		quickSort(arr, low, high);
	}
	
	public void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// pi là chỉ số chia nhỏ mảng và phần tử pivot
			int pi = partition(arr, low, high);

			// Sắp xếp đệ quy các phần tử trước và sau phần tử pivot
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	// Hàm phân chia mảng và trả về chỉ số pivot
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // Chọn phần tử cuối cùng làm pivot
		int i = (low - 1); // Chỉ số của phần tử nhỏ hơn pivot

		for (int j = low; j < high; j++) {
			// Nếu phần tử hiện tại nhỏ hơn hoặc bằng pivot
			if (arr[j] <= pivot) {
				i++;

				// Hoán đổi arr[i] và arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Hoán đổi arr[i+1] và arr[high] (hoặc pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	// Hàm in mảng
//	public static void printArray(int[] arr) {
//		int n = arr.length;
//		for (int i = 0; i < n; ++i)
//			System.out.print(arr[i] + " ");
//		System.out.println();
//	}
}