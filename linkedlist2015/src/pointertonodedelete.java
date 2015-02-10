
public class pointertonodedelete {

	
	// Given a pointer to a node to be deleted
	// A simple solution is traverse the entire linked list untill you find the specified element
	// but we are not the given the head of the list so we can't traverse it
	
	//A simple solution is to copy the data from the next node and delete the next node;
	link node;
	public pointertonodedelete(link givennode)
	{
		node = givennode;
	}
	
	public static void main(String args[])
	{
		 link newlink = new link(5, null);
		//the given node
		pointertonodedelete n = new pointertonodedelete(newlink);
		link temp = n.node.next;
		n.node.element = temp.element;
		n.node.next = temp.next;
		
	}
}
