
public class Runner {

	public static void main(String[] args) 
	{
		 
		
		long start = System.nanoTime();
		TeAm4.bubbleSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
	}
	
	public static int [] randArr(int length, int high)
	{
		int [] randoArr = new int [length];
		for ( int i = 0; i < length; i++)
		{
			int j = (int) (Math.random() * high);
			randoArr[i] = j; 
		}
		return randoArr;
	}
}
