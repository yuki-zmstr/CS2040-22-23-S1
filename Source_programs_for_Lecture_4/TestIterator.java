import java.util.*;
public class TestIterator {

	public static void main(String [] args) {
		// create a linkedlist to store integers
		LinkedList <Integer> LL = new LinkedList <Integer> ();
		// adding values to linkedlist
		LL.add(1);  
		LL.add(2);
		LL.add(3);
		LL.add(4);
		LL.add(5);
		LL.add(6);
		LL.add(7);
		// attach a ListIterator to linkedlist
		ListIterator<Integer> listIterator = LL.listIterator();

		System.out.println("pop an element " + LL.pop());
		LL.push(10);
		// at the beginning, index is at 0

//		listIterator = LL.listIterator();
		System.out.println("at the beginning, index is " + listIterator.nextIndex());
		while(listIterator.hasNext()) {
			Integer nextWithIndex = LL.get(listIterator.nextIndex());		
			Integer next = listIterator.next();
			// replace 3 with 9
			if(next == 3) {
				listIterator.set(9);
			}
		}
		// add one more element
		listIterator.add(8);
		// print in reverse order
		System.out.println("Print in reverse order");
		while(listIterator.hasPrevious()) {
			Integer previousWithIndex
				= LL.get(listIterator.previousIndex());
			Integer previous = listIterator.previous();
			System.out.println(previous);
		}
		System.out.println("Print in forward order");
		while(listIterator.hasNext()) {
			Integer previousWithIndex
				= LL.get(listIterator.nextIndex());
			Integer previous = listIterator.next();
			System.out.println(previous);
		}
	}
}
