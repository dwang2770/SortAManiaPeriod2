public class Team4SortCompetition extends SortCompetition
{
	
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
	
	public int challengeTwo(String[] arr, String query)
	{
		StringbubbleSort(arr);
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].equals(query))
			{
				return i;
			}
		}
		return -1;
	}
	
	public int challengeThree(int[] arr)
	{
		insertionSort(arr);
			int x = arr.length/2;
			return arr[x+1];
		return (arr[arr.length/2]+ arr[arr.length/2+1])/2;
	}
	
	public int challengeFour(int[][] arr)
	{
	
	}
	
	public int challengeFive(Comparable[] arr, Comparable query)
	{
		
	}

	public String greeting() 
	{
		return "This is Team 4. xd";
	}
	
	private void bubbleSort(int [] list1)
	{
		int swap = 1;										//Swap is set to 1 to get the loop started
		while(swap > 0)
		{
			swap = 0;										//Swap is set to 0 to make sure loop stops when it should
			for(int x = 0;  x < list1.length - 1; x++)		//Goes through the array in order
			{
				
				if(list1[x] > list1[x+1])						//Compares two strings to see which one comes first alphabetically
				{
					swapInt(list1, x, x+1);				
					swap++;									//Integer swap will increase after a swap
				}
			}
		}
	}
	private void StringbubbleSort(String[] list1)
	{
		int swap = 1;										//Swap is set to 1 to get the loop started
		while(swap > 0)
		{
			swap = 0;										//Swap is set to 0 to make sure loop stops when it should
			for(int x = 0;  x < list1.length - 1; x++)		//Goes through the array in order
			{
				String a = list1[x];
				String b = list1[x+1];
				if(a.compareTo(b) > 0)						//Compares two strings to see which one comes first alphabetically
				{
					swapString(list1, x, x+1);				
					swap++;									//Integer swap will increase after a swap
				}
			}
		}
	}
	private void swapInt(int[] arr, int index1, int index2)
	{
		int x = index1;
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	private void swapString(String[] arr, int index1, int index2)
	{
		String y = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = y;
	}
	private int stringPartition(String[] list, int front, int back)
    {
        //pivot is the last number
		String pivot = list[back]; 
		// index of smaller element
		int i = (front - 1); 
        //for loop that goes through the whole array
        for (int j=front; j<back; j++)
        {
            // If list[j] is smaller than or equal to pivot swap arr[i] and arr[j]
            if (list[j].compareTo(pivot) >=0)
            {
                i++;
               swapString(list,i,j);
            }
        }
 
        // swap arr[i+1] and arr[back]
       swapString(list,i+1,back );
 
        return i+1;
    }
	private void StringQuickSort(String[] arr, int low, int high)
	 {
	     if (low < high)
	     {
	         int pivot = stringPartition(arr, low, high);
	         
	         StringQuickSort(arr, low, pivot-1);
	         StringQuickSort(arr, pivot+1, high);
	     }
	 }


	private void quickSort(int arr[], int low, int high)
		{
		    if (low < high)
		    {
		        int pivot = partitionInt(arr, low, high);
		         
		        quickSort(arr, low, pivot-1);
		        quickSort(arr, pivot+1, high);
		    }
		}
	private int partitionInt(int [] list, int front, int back)
    {
        //pivot is the last number
		int pivot = list[back]; 
		// index of smaller element
		int i = (front - 1); 
        //for loop that goes through the whole array
        for (int j=front; j<back; j++)
        {
            /* If list[j] is smaller than or equal to pivot swap arr[i] and arr[j]
               example arry nums = {1,5,2,3}
               
               in this case j will be 1 and i will be -1
               since 1 is less than 3 we will swap 1 with int at position i(0; which is int 1)
               
               after we check that 5 is greater than 3 and we do nothing
               we then check that 2 is less that 3, at this moment i is now 1(0 + 1) and we will swap 2 with position 1(int 5)
               
               after this we are at int 3 which is the last number in the array and ends the for loop
            */
            if (list[j] <= pivot)
            {
                i++;
               swapInt(list,i,j);
            }
        }
        /*
         * after all that sorting we are guaranteed that all the ints smaller than the pivot is before position i and i itself
         * so at the very end we will swap the pivot(arr[back]) with the int at position i +1
         */
      swapInt(list,i+1,back );
       //returns i+1 because i is always 1 less than the index due to front -1
        return i+1;
    }
	
	private void insertionSort(int[] list1)
	{
		for(int x = 0;  x < list1.length - 1; x++)			//Goes through the array to compare each number to all of the numbers preceding it
		{
			for(int y = x + 1; y > 0; y--)					//Will keep swapping a number until it reaches a preceding number smaller than itself
			{
				int a = list1[y];
				int b = list1[y-1];
				if(a < b)									//If value is less than value preceding it, they will swap
				{
					swapInt(list1, y, y-1);
				}
			}
		}
	}
	
}
