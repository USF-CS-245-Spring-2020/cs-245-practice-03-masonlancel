public class BinaryRecursiveSearch implements Practice03Search
{
	public int search(int [] arr, int target)
	{
		int left = 0;
		int right = arr.length-1;
		return(binaryRecursiveSearch(arr,target,left,right));
	}

	public int binaryRecursiveSearch(int [] arr, int target, int left, int right)
	{
		int mid = left + ((right - left)/2);
		if(left > right)
			return mid;
		if(arr[mid]==target)
			return mid;
		else if(target < mid)
			return binaryRecursiveSearch(arr,target,left,mid-1);
		return binaryRecursiveSearch(arr,target,mid+1,right);
	}
}