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
		return (arr[arr.length/2]+arr[arr.length/2+1])/2;
	}
	
	public int challengeTwo(String[] arr, String query)
	{
		
	}
	
	public int challengeThree(int[] arr)
	{
		
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
	
	public static void swapInt(int[] arr, int index1, int index2)
	{
		int x = index1;
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
}
