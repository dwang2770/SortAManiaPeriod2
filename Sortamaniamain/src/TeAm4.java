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
	
	public static void bubbleSort( int [] list1)
	{
		int i = 0;
		int swap = 0;
		
		while (i<list1.length-1)
		{
			if ( list1[i] > list1[i + 1])
			{
				swapInt(list1, i, i+1);
				//counts the amount of time you had to swap the array
				swap ++;
				// after the swap we move on to the next position
				i++;
			}
 
			else
			{
				i++; 
			}
			
		}

		if(swap != 0)
		{
		bubbleSort(list1);
		}
	
	}
	public static void StringbubbleSort( String [] list1)
	{
		int i = 0;
		int swap = 0;
		
		while (i<list1.length-1)
		{
			// if the string at position i is towards the beginning of the alphabet more than string at i+1 then switch those 2
			if ( list1[i].compareTo(list1[i + 1]) > 0)
			{
				swapString(list1, i, i+1);
				//counts the amount of time you had to swap the array
				swap ++;
				// after the swap we move on to the next position
				i++;
			}
			// if it is already in alphabetical order we go onto the next position
			else if ( list1[i].compareTo(list1[i + 1]) < 0)
			{
				i++;
			}
			
		}
		//if the amount of times swapped is 0 that means everything is in alphabetical order and we can stop
		if(swap != 0)
		{
		StringbubbleSort(list1);
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
