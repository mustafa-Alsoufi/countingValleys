import java.util.Scanner;

public class solution {
// CountingValleys function returns an integer that denotes the number of valleys traversed.
	static int countingValleys(int n, String s) {

        int level =0;	// Sea level
        int count=0;		// Num of valleys
        
      for (int i=0;i<n;i++)
      {
          if (s.charAt(i) == 'U')
          {
              if (level ==-1)
              {
                  count++;
              }
              level++;
          }
          else if (s.charAt(i) == 'D')
          {
              level--;
          }      
      }
      return count;
    }
    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("Please Enter number of steps: ");

		int n = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	    System.out.print("Please discribe your path: ");

	    String s = scanner.nextLine();

        int result = countingValleys(n, s);		

		System.out.print(result);

	}

}
