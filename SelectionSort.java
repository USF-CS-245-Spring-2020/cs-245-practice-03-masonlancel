public class SelectionSort implements Practice03Sort
{
	public void sort(int [] a){
		for(int i = 0;i<a.length-1;i++){
			int min = i;
			for(int j = i + 1;j<a.length-1;j++){
				if(a[j] < a[min]){
					min = j;
				}	
			swap(a, i, j);
			}
		}
	}

	public void swap(int [] a, int i, int j){
		int x = a[i];
		a[i] = a[j];
		a[j] = x;
	}
}