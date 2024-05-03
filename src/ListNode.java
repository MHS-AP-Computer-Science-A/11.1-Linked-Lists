
public class ListNode {
	private Integer value;
	private ListNode next;	
	
	public ListNode(Integer value){
		this.value = value;
		this.next = null;
	}
	
	public void setValue(Integer value){
		this.value = value;
	}
	public Integer getValue(){
		return value;
	}	
	public void setNext(ListNode next){
		this.next = next;
	}	
	public ListNode getNext(){
		return next;
	}

}
