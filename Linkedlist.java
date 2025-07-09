package MyPackage;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Linkedlist {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("Vidya");
		queue.offer("Aishwarya");
		queue.offer("Swathi");
		
		System.out.println("Queue peek(): " +queue.peek());
		System.out.println("Queue poll(): " +queue.poll());
		System.out.println("Final Queue: "+queue);
		
		Deque<String> deque = new LinkedList<>();
		deque.addFirst("Vidya");
		deque.addLast("Swathi");
		deque.addFirst("Aishwarya");
		
		System.out.println("Deque getLast(): "+ deque.getLast());
		deque.removeFirst();
		deque.removeLast();
		
		System.out.println("Final Deque: " +deque);
		

	}

}
