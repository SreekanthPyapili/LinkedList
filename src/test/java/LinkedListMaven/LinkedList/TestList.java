package LinkedListMaven.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class TestList {
	public static void main(String[] args) {
		LinkedList<String>ll = new LinkedList<String>();
		ll.add("Deepthi");
		ll.add("Sudeera");
		ll.add("Vinay");
		Iterator<String>itr = ll.iterator();
		
		String ele =itr.next();
				System.out.println(ele);
		
	ele = itr.next();
	System.out.println(ele);
	
	
		ele = itr.next();
		System.out.println(ele);
	}

}
