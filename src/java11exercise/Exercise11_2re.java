package java11exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_2re {
	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list);
		TreeSet tset = new TreeSet(set);
		Stack stack = new Stack();
		stack.addAll(tset);
		while(!stack.empty())
			System.out.println(stack.pop());
		//리스트에는 중복된 값이 들어가기 때문에 362227이 되고
		//해쉬 셋에 리스트를 넣으면 중복된 값이 사라져 3627이 된다
		//이후 트리셋에 넣으면 정렬되어 2367이 되고
		//스택에 넣으면 그대로2367이 들어가지만
		//스택에 경우 값을 꺼낼때에 거꾸로 7 6 3 2 가 꺼내진다
		
	}
}
