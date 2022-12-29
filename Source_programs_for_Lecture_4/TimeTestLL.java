import java.util.*;
public class TimeTestLL {
	public static void main(String[] args) {
		LinkedList <Integer> ll = new LinkedList <Integer> ();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			ll.addFirst(i);
		}
		long stopTime = System.currentTimeMillis();
        long front = stopTime - startTime;
		LinkedList <Integer> lll = new LinkedList <Integer> ();
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			lll.add(i);
		}
		long stopTime1 = System.currentTimeMillis();
		long elapsedTime = stopTime1 - startTime1;
		System.out.println(front + "  "  + elapsedTime);
	}
} 

