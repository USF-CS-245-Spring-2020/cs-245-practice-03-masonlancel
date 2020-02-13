public class BubbleSort implements Practice03Sort
{
	public void sort(int [] a)
	{
		boolean sorted = false;
		int lastIndex = a.length-1;
		while(!sorted){
			sorted = true;
			for(int i = 0; i < lastIndex;i++){
				if(a[i] > a[i+1]){
					swap(a,i,i+1);
					sorted = false;
				}
			}
			lastIndex--;
		}
	}

	public void swap(int [] a, int i, int j)
	{
		int x = a[i];
		a[i]=a[j];
		a[j]=x;
	}
}