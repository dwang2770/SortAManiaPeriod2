import java.util.Arrays;
public class Runner {

	public static void main(String[] args) 
	{
		TeAm4 lol = new TeAm4();
		String [] s = {"l", "s" , "a", "b", "q"};
		
		long start = System.nanoTime();
		lol.challengeTwo(s,"q");
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("challenge1 took: " + time + " nanoseconds");
		System.out.println(lol.challengeTwo(s,"q"));
		for (String x : s)
		{
			System.out.print(x);
		}
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
