package my_custom_annottations;

@My_custom( id=7,
			message="my_messageParameter")
public class MyClass {
	
	
	private int my_id;
	private String MyMessage;
	
	public MyClass() {super();}
	
	public MyClass(int my_id, String myMessage) {
		super();
		this.my_id = my_id;
		MyMessage = myMessage;
	}
	
	
	public void show() {
		System.out.println("annottated messa="+this.MyMessage+"\nid="+this.my_id);
	}
	
	
	
	/*public int getMy_id() {
		return my_id;
	}


	public void setMy_id(int my_id) {
		this.my_id = my_id;
	}


	public void show() {
		System.out.println("Annotated Class my_id="+my_id);
	}*/
	
	
	
	

}
