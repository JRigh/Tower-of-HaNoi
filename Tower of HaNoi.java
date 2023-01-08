// 1. Implement a recursive solution to the mathematical game known as Tower of Hanoi.

public class ToH {
   // # (1.)
    public static void main(String[] args) {
	     Hanoi (1,"A","B","C");	        
	 }
	 //move n disks from position "from" to "to" via "other"

	 private static void Hanoi(int n, String left , String middle, String right) 
           {
	      if (n < 0)

             // define exception
	    	throw new IllegalArgumentException("n must be a nonnegative integer.");  
	     if (n == 0) 
	         return;  

             // base case
	     if (n > 0)
	     Hanoi(n-1, left, right, middle);  

             // moves n-1 disks from left(A) to middle (B)
	     System.out.printf("Move one disk from rod %s to rod %s \n ", left, right); 

             // display the progress
	     Hanoi(n-1, middle, left, right); 
             // moves n-1 disks from middle(B) to right(C)
           }
}
