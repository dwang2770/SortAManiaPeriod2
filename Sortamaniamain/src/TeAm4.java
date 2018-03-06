import java.util.Arrays;

public class TeAm4 extends SortCompetition
{
	public int compareTo(SortCompetition t)
	{
		return (int)(this.totalTime - t.totalTime); 
	}
	
	public void setNumber(int n)
	{
		number = n;
	}
	public int getNum()
	{
		return number;
	}
	
	public void addTime(double avg)
	{
		totalTime += avg;
	}
	
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
		bubbleSort(arr);
		if (arr.length%2 != 0)
		{
			int x = arr.length/2;
			return arr[x+1];
		}
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
		return "xd";
	}
	
	public static void bubbleSort(int [] list1)
	{
		int swap = 1;										//Swap is set to 1 to get the loop started
		while(swap > 0)
		{
			swap = 0;										//Swap is set to 0 to make sure loop stops when it should
			for(int x = 0;  x < list1.length - 1; x++)		//Goes through the array in order
			{
				
				if(list1[x] > list[x+1])						//Compares two strings to see which one comes first alphabetically
				{
					swapInt(list1, x, x+1);				
					swap++;									//Integer swap will increase after a swap
				}
			}
		}
	}
	public static void StringbubbleSort(String[] list1)
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
	public static void swapInt(int[] arr, int index1, int index2)
	{
		int x = index1;
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	public static void swapString(String[] arr, int index1, int index2)
	{
		String y = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = y;
	}
	public static int stringPartition(String[] list, int front, int back)
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
	public static void StringQuickSort(String[] arr, int low, int high)
	 {
	     if (low < high)
	     {
	         int pivot = stringPartition(arr, low, high);
	         
	         StringQuickSort(arr, low, pivot-1);
	         StringQuickSort(arr, pivot+1, high);
	     }
	 }
}
