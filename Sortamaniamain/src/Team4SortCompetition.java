public class Team4SortCompetition extends SortCompetition
{
	//Challenge One
	public int challengeOne(int[] arr)
	{
		bubbleSort(arr);
		if (arr.length%2 != 0)
		{
			int x = arr.length/2;
			return arr[x+1];
		}
		
		return (arr[arr.length/2]+arr[arr.length/2+1])/2;
	}
	
	//Challenge Two
	public int challengeTwo(String[] arr, String query)
	{
		StringQuickSort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].equals(query))
			{
				return i;
			}
		}
		return -1;
	}
	
	//Challenge Three
	public int challengeThree(int[] arr)
	{
		insertionSort(arr);
		int x = arr.length/2;
		return (arr[x]+ arr[x+1]/2);	
	}
	
	//Challenge Four
	public int challengeFour(int[][] arr)
	{
		int [] sortedVIAMedian = new int [arr.length];
		
		for(int i = 0; i < arr.length; i++) 
		{
			quickSort(arr[i],0,arr.length-1);
			sortedVIAMedian [i] = medianCalc(arr[i]);
		}
		
		quickSort(sortedVIAMedian,0,sortedVIAMedian.length-1);
		return medianCalc(sortedVIAMedian);
	}
	
	//Challenge Five
	public int challengeFive(Comparable[] arr, Comparable query)
	{
		bubbleSortComparable(arr);
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].equals(query))
			{
				return i;
			}
		}
		return -1;
	}

	//Our Greeting
	public String greeting() 
	{
		return "This is Team 4. xd";
	}
	
	
	//BubbleSort for ints Source: Stanley
	private void bubbleSort(int [] list1)
	{
		int swap = 1;										
		while(swap > 0)
		{
			swap = 0;										
			for(int x = 0;  x < list1.length - 1; x++)		
			{
				
				if(list1[x] > list1[x+1])						
				{
					swapInt(list1, x, x+1);				
					swap++;									
				}
			}
		}
	}
	
	private Comparable[] bubbleSortComparable(Comparable [] list1)
	{
		Comparable[] sortedArray = new Comparable[list1.length];
		int swap = 1;										
		while(swap > 0)
		{
			swap = 0;										
			for(int x = 0;  x < list1.length - 1; x++)		
			{
				
				if(list1[x].equals(list1[x+1]))						
				{
					swapIntComp(list1, x, x+1);				
					swap++;									
				}
			}
		}
		return sortedArray;
	}
	
	private Comparable[] swapIntComp(Comparable[] arr, int index1, int index2)
	{
		Comparable x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
		return ;
	}
	
	//Swaping Ints helper method
	private void swapInt(int[] arr, int index1, int index2)
	{
		int x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
	//Swap Strings helper method
	private void swapString(String[] arr, int index1, int index2)
	{
		String y = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = y;
	}
	
	//String Partition helper method Source:Dave
	private int stringPartition(String[] list, int front, int back)
    {
		String pivot = list[back]; 
		int i = (front - 1); 

        for (int j=front; j<back; j++)
        {
            if (list[j].compareTo(pivot) <=0)
            {
                i++;
               swapString(list,i,j);
            }
        }
 
       swapString(list,i+1,back );
 
        return i+1;
    }
	//String Quick Sort Source:Dave
	private void StringQuickSort(String[] arr, int low, int high)
	 {
	     if (low < high)
	     {
	         int pivot = stringPartition(arr, low, high);
	         
	         StringQuickSort(arr, low, pivot-1);
	         StringQuickSort(arr, pivot+1, high);
	     }
	 }

	//Int Quick Sort Source:Dave
	private void quickSort(int arr[], int low, int high)
		{
		    if (low < high)
		    {
		        int pivot = partitionInt(arr, low, high);
		         
		        quickSort(arr, low, pivot-1);
		        quickSort(arr, pivot+1, high);
		    }
		}
	//Int Partition helper method Source:Dave
	private int partitionInt(int [] list, int front, int back)
    {
		int pivot = list[back]; 
		int i = (front - 1); 

        for (int j=front; j<back; j++)
        {
            if (list[j] <= pivot)
            {
                i++;
               swapInt(list,i,j);
            }
        }
      
      swapInt(list,i+1,back );
       
        return i+1;
    }
	
	//Int insertion sort Source: Stanley
	private void insertionSort(int[] list1)
	{
		for(int x = 0;  x < list1.length - 1; x++)			
		{
			for(int y = x + 1; y > 0; y--)					
			{
				int a = list1[y];
				int b = list1[y-1];
				if(a < b)									
				{
					swapInt(list1, y, y-1);
				}
			}
		}
	}
	
	//Finding the median helper method
	private static int medianCalc(int [] arr)
	{
		int median=0;
		if(arr.length%2==0)
		{
			median = ((arr[(arr.length/2) - 1] + arr[(arr.length/2)])/2) ; 
		}
		else
			median = arr[(arr.length/2)];
		return median;
	}
	
	
}
