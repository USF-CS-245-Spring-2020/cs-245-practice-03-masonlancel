public class InsertionSort implements Practice03Sort
{
	public void sort(int [] a){
		for(int i = 1;i<a.length-1;i++){
			int key = a[i];
			int j = i - 1;
			while(j>=0 && a[j]>key){
				swap(a,i,j);
			}
		}
	}

	public void swap(int [] a, int i, int j)
	{
		int x = a[i];
		a[i]=a[j];
		a[j]=x;
	}
}