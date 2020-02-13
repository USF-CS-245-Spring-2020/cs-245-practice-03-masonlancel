public class BinaryIterativeSearch implements Practice03Search
{
	public int search(int [] arr, int target)
	{
		int left = 0;
		int right = arr.length-1;

		while(left < right)
		{
			int mid = (left + right)/2;
			if(target == mid)
				return mid;
			else if(target < mid)
				right = mid-1;
			else
				left = mid + 1;
		}
		return 0;
	}
}