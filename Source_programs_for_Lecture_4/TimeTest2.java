import java.util.*;
public class TimeTest2 {
	public static void main(String[] args) {
		LinkedList <Integer> ll = new LinkedList <Integer> ();
		for (int i = 0; i < 1000000; i++) {
			ll.addFirst(i);
		}
		long startTime = System.currentTimeMillis();
		for (long i = 0; i < 1000000000; i++) {
			ll.peek();
		}
		long stopTime = System.currentTimeMillis();
        long front = stopTime - startTime;
		LinkedList <Integer> lll = new LinkedList <Integer> ();
		long startTime1 = System.currentTimeMillis();
		for (long i = 0; i < 1000000000; i++) {
			lll.peekLast();
		}
		long stopTime1 = System.currentTimeMillis();
		long elapsedTime = stopTime1 - startTime1;
		System.out.println(front + "  "  + elapsedTime);
	}
} 

