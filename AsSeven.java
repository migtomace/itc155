import java.util.Arrays;

public class AsSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int list[] = {9, 3, 4, 120, 30, 2};
		selectionSort(list);
		System.out.println(Arrays.toString(list));
		
	}
	
	public static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	public static void selectionSort(int[] a) {
		
		//decrement from the end index of array (length of array - 1)
		for(int i = a.length - 1; i >= 0; i--) {
			//find index of largest element
			int  largest = i;
			for(int j = i - 1; j >= 0; j--) {
				//if next index is larger than the current largest
				//update largest element
				if(a[j] > a[largest]) {
					largest = j;
				}
			}
			swap(a, i, largest);
		}
	}

}
