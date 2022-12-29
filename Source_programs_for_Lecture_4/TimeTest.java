import java.util.*;
public class TimeTest {
	public static void main(String[] args) {
		ArrayList <Integer> AlB= new ArrayList <Integer> ();
		long startTimeB = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			AlB.add(i);
		}
		long stopTimeB = System.currentTimeMillis();
        long timeB = stopTimeB - startTimeB;
		ArrayList <Integer> AlA = new ArrayList <Integer> ();
		long startTimeA = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			AlA.add(0,i);
		}
		long stopTimeA = System.currentTimeMillis();
        long timeA = stopTimeA - startTimeA;
		System.out.println(timeA + "  "  + timeB);
		/*
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
		*/
	}
} 

