// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   int tries = Integer.parseInt(args[0]);
	   double j = 3;
	   double sum = 1; 
	
		for (int i = 1; i < tries; i++ ) 
		{
			if(i%2 == 0){
				sum = sum + (1.0/j);
			}
			else {
				sum = sum - (1.0/j);
			}
			j = j + 2;
		}	

		sum = sum*4;
		System.out.println("Pi according to Java:    " + Math.PI);
		System.out.println("Pi, approximated:    " + sum);

	}
}
