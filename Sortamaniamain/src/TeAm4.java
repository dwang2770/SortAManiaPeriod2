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
		Arrays.sort(arr);
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
}
