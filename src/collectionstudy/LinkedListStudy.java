package collectionstudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
		LinkedList<Object>lle=new LinkedList<Object>();
		lle.add("Ashu");
		lle.add(true);
		lle.add("Advi");
		lle.add(29);
		lle.add(true);
		lle.add(29.77);
		lle.add(null);
		lle.add('F');
		//add new comment
		System.out.println(lle);
		System.out.println(lle.get(5));//get
		System.out.println(lle.element());
		System.out.println(lle);
		
		System.out.println(lle.peek());//retrive head element but not remove it
		System.out.println(lle);
		System.out.println(lle.poll());//retrive head element but also remove it
		System.out.println(lle);
		System.out.println(lle.pop());//removes and returns to first element of list
		System.out.println(lle);
		
		lle.push("INDIA");//insert element at the first of the list
		System.out.println(lle);
		System.out.println(lle.size());
		System.out.println(lle);
		
		Object le=lle.clone();//clone method
		System.out.println(le);
		System.out.println(lle.contains("Advi"));
		System.out.println(lle.get(5));
		System.out.println(lle.indexOf(29.77));
		//lle.clear
		System.out.println(lle.isEmpty());
		System.out.println(lle.lastIndexOf(29));
		System.out.println(lle.remove(4));
		System.out.println(lle);
		lle.set(0, "Ashu");
		System.out.println(lle);
		
		System.out.println("=========traversing through linked-list===");
		System.out.println("===========for loop===========");
		for(int i=0;i<=lle.size()-1;i++)
		{
			System.out.println(lle.get(i));
		}
		System.out.println("========for each loop========");
		for(Object l1:lle)
		{
			System.out.println(l1);
		}
		System.out.println("========Iterator=====");
		
		Iterator<Object> it=lle.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("========list Iterator========");
		ListIterator<Object> lit=lle.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("============reverse========");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		System.out.println("====================");
		
		
		
		
		
	}

}
