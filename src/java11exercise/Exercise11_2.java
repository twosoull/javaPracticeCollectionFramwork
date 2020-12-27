package java11exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		TreeSet tset = new TreeSet(list);
		Stack stack = new Stack();
		stack.addAll(tset);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
	}
}
