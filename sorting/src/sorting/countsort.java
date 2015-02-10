package sorting;

public class countsort {

	public static void main(String[] args)
	{
	      countsort countingSort = new countsort();
	      int[] arrayToSort = new int[] { 1,3,4,4,3,6};
	      int[] sortedArray = countingSort.counting_sort(arrayToSort);

	      for (int i = 0; i < sortedArray.length; i++)
	      {
	             System.out.print(sortedArray[i] + ",");
	       }
	 }

	 public int[] counting_sort(int[] arrayToSort)
	 {
	        int maxValue = getMaxVal(arrayToSort);
	        int[] finalSortedArray = new int[arrayToSort.length];
	        int[] tempArray = new int[maxValue + 1];

	        for (int i = 0; i < arrayToSort.length; i++)
	       {
	            tempArray[arrayToSort[i]] = tempArray[arrayToSort[i]] + 1;
	       }

	       for (int i = 1; i < maxValue + 1; i++)
	       {
	             tempArray[i] = tempArray[i] + tempArray[i - 1];
	       }

	      for (int i = (arrayToSort.length - 1); i >= 0; i--)
	     {
	             finalSortedArray[tempArray[arrayToSort[i]] - 1] = arrayToSort[i];
	             tempArray[arrayToSort[i]] = tempArray[arrayToSort[i]] - 1;
	      }
	      return finalSortedArray;
	 }

	 private int getMaxVal(int[] arrayToSort)
	 {
	       int maxVal = Integer.MIN_VALUE;
	       for (int i : arrayToSort)
	       {
	            if (i > maxVal)
	            {
	                 maxVal = i;
	            }
	       }
	       return maxVal;
	  }
	}
	
	
