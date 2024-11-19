// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	  int n = Integer.parseInt(args[0]);
	  int s = 1;
	  String mode = args[1];
	  
	  if (mode.equals("v")){
		for (int i = 1; i <= n; i++){
			int count= 1;
			s = i ;
			System.out.print(s + " ");
			do{
				
				if( (s % 2) == 0 ){
					s = s/2;
				}
				else{ 
					s = (s * 3) + 1;
				}
				count++;
				System.out.print(s + " ");	
				
			}while (s != 1);
			System.out.println("(" + count + ")" );
		  }
		}
		
				System.out.println( "Every one of the first " + n + " hailstone sequences reached 1.");
			
			
	  }
	  
	  }

