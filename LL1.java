package linkedlist;

// Using java collection framework or predefined of LinkList :

import java.util.*;
public class LL1
{
	public static void main(String args[])
	{
		LinkedList <String> list = new LinkedList <String>();
		list.addFirst("a");
		list.addFirst("is");
		list.addFirst("This");
		 System.out.print("The list is : ");
		list.addLast("list");// list.add("list") --> this also print same ,[by default add adds the node at last]:
		list.add("of");
		list.add("today");
		System.out.println(list);
		System.out.println("the size of the list : " + list.size());

		for(int i=0;i<list.size();i++)
		{			
			System.out.print(list.get(i)+" -> ");
		}
		System.out.println("null");

		//search a element
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i) == "a")
			{
				System.out.println("'a' is at "+i+" index ");
			}
		}

		//deleteFirst and deleteLast
		 System.out.print("After deleteFirst operation : ");
		list.removeFirst();
		System.out.println(list);
		 System.out.print("After deletelast operation : ");
		list.removeLast();
		System.out.println(list);

		//remove a speciefic element "of"

		list.remove(3);
		 System.out.print(list);
	}
}
