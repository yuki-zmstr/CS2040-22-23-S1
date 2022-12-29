import java.util.*;

public class Tower {
	public static void main (String [] args) {

        System.out.println("Recursive solution");
		Towers (4, 'A', 'B', 'C');
        System.out.println("Iterative solution");
		TowersIterative (4, 'A', 'B', 'C');

	}



	public static void Towers(int numDisks, char src, char dest, char temp) {

		if (numDisks == 1) {
			System.out.println ("Move top disk from pole " + src + " to pole " + dest);
		} else {

			Towers(numDisks -1, src, temp, dest);	// first recursive call
			Towers(1, src, dest, temp);
			Towers(numDisks -1, temp, dest, src); 	// second recursive call
		}			
	} 

	public static void TowersIterative (int orig_numDisks, char orig_src, char orig_dest, char orig_temp) {
		int numDisksStack[] =  new int[100];  // Maintain the stacks manually!
		char srcStack[] = new char[100];
		char destStack[] = new char[100];
		char tempStack[] = new char[100];
		int stacktop = 0;
		numDisksStack[0] = orig_numDisks;  // Init the stack with the 1st call
		srcStack[0] = orig_src;
		destStack[0] = orig_dest;
		tempStack[0] = orig_temp;
		stacktop++;

		while (stacktop>0) { 
			stacktop--;    // pop current off stack
			int numDisks = numDisksStack[stacktop];
			char src = srcStack[stacktop]; 
			char dest  = destStack[stacktop];
			char temp = tempStack[stacktop];
			if (numDisks == 1) {
				System.out.println("Move top disk from pole "+src+" to pole "+dest);
			} else {
				/* Towers(numDisks-1,temp,dest,src); */ // second recursive call
				numDisksStack[stacktop] = numDisks -1;
				srcStack[stacktop] = temp;
				destStack[stacktop] = dest;
				tempStack[stacktop++] = src;
				/* Towers(1,src,dest,temp); */
				numDisksStack[stacktop] =1;
				srcStack[stacktop] = src; destStack[stacktop] = dest;
				tempStack[stacktop++] = temp;
				/* Towers(numDisks-1,src,temp,dest); */ // first recursive call
				numDisksStack[stacktop] = numDisks -1;
				srcStack[stacktop] = src; destStack[stacktop] = temp;
				tempStack[stacktop++] = dest;
			}
		} 

	}
}
