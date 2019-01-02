package my_custom_annottations;

import java.lang.annotation.Annotation;

public class Runme {

	public static void main(String[] args) {
		MyClass myclass=new MyClass();
		Class c=myclass.getClass();
		Annotation an=c.getAnnotation(My_custom.class);
		
		My_custom custom_annotation=(My_custom) an;
		int annotatedID=custom_annotation.id();
		String annotatedMessage=custom_annotation.message();
		
		System.out.println("annotatedID:"+annotatedID+"\nannotatedMessage:"+annotatedMessage);
		myclass=new MyClass(annotatedID, annotatedMessage);
		myclass.show();
		//myclass.setMy_id(annotatedID);
		//myclass.show();
		//System.out.println(myclass.getMy_id());
		

	}

}
