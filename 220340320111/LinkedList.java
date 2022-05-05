// reverse LinkedList

class LinkedList{
	static LLNode head;
	
	static class LLNode{
		int val;
		LLNode next;
		LLNode(int no){
			val=no;
			next=null;
		
		}
	
	}
	LLNode reverse(LLNode node){
		LLNode prev=null;
		LLNode curr=node;
		LLNode next=null;
		
		while(curr != null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		
		}
		node=prev;
		return node;
		
	
	}
		void print(LLNode n){
			while(n!=null){
			System.out.println(n.val+" ");
			n=n.next;
			
			}
		
		}
		public static void main(String args[]){
		
			LinkedList lo=new LinkedList();
			
			lo.head= new LLNode(1);
			
			lo.head.next= new LLNode(2);
			
			lo.head.next.next= new LLNode(3);
			
			lo.head.next.next.next= new LLNode(4);
			
			lo.head.next.next.next.next= new LLNode(5);
			
			System.out.println("Original Linked list:");
			lo.print(head);
			head=lo.reverse(head);
			System.out.println("After list reverse:" );
			lo.print(head);
		
		}


}