package JavaApnaCollege;

class Node{
	int data;
	Node next;
	
	public Node(int x)
	{
		this.data = x;
		this.next = null;
	}
}
	
public class FindMiddleNumberInLinkedList {
		static int getLength(Node head) {
			
			int length = 0;
			while(head!=null) {
				length++;
				head = head.next;
			}
			return length;
		}
		
		static int middleNode(Node head) {
			int length = getLength(head);
			
			int midIndex = length/2;
			while(midIndex > 0)
			{
				 head = head.next;
				midIndex--;
			}
			
			return head.data;
		}

	public static void main(String[] args) {
		Node node = new Node(10);
		node.next = new Node(20);
		node.next.next = new Node(30);
		node.next.next.next = new Node(40);
		node.next.next.next.next = new Node(50);
		node.next.next.next.next.next = new Node(60);
		
		Node current = node;
		System.out.println("Print list");
		while(current != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
		
		System.out.println("Middle node is: "+middleNode(node));

	}

}
