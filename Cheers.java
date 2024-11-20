// Prints a crowd cheering output.


public class Cheers {
        public static void main(String[] args) {
	   String cheers = args[0];
            int numofcheers = Integer.parseInt(args[1]) ;
            int i = 0;
            String capital = cheers.toUpperCase();
            while (i < cheers.length())
        { 
                if( capital.charAt(i) == 'A' || capital.charAt(i) == 'E'|| capital.charAt(i) == 'F' || capital.charAt(i) == 'H' || capital.charAt(i) == 'I' || capital.charAt(i) == 'L' || capital.charAt(i) == 'M'|| capital.charAt(i) == 'N' || capital.charAt(i) == 'O' || capital.charAt(i) == 'R' || capital.charAt(i) == 'X' || capital.charAt(i) == 'S'){
                        System.out.println("Give me an " + capital.charAt(i) + ":" + " " + capital.charAt(i) + "!");
                }
                else {
                        System.out.println("Give me a  " + capital.charAt(i) + ":" + " " + capital.charAt(i) + "!") ;      
                }
                i++; 
           

        }
        System.out.println("What does that spell?");
        for( int j = 0; j < numofcheers; j++)
        {
                System.out.println(capital + "!!!");
             
        }
}

        }

