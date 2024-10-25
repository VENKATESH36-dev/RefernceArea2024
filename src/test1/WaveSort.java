package test1;

public class WaveSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
		waveSort(arr);
		System.out.println("Wave form sorted array:: ");
		for(int i:arr) {
			System.out.print(i+ " ");
		}
	}
	
	public static void waveSort(int[] arr) {
		for(int i=0; i<arr.length-1;i++) {
			if(i%2 == 0 && arr[i]<arr[i+1]) {
				swap(arr, i, i+1);
			}else if(i%2 != 0 && arr[i]>arr[i+1]) {
				swap(arr, i, i+1);
			}
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
