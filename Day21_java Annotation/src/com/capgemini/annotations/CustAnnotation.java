package com.capgemini.annotations;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface OwnCustom
{
	int accept();
}
class C
{
	@OwnCustom(accept=35)
	public void display()
	{
		System.out.println("hey, i am using Custom Annotation");
	}
}
public class CustAnnotation {

	public static void main(String[] args) {
		B b=new B();
		b.display();
		Method m=b.getClass().getMethod("display");
		OwnCustom obj=m.getAnnotation(OwnCustom.class);
		
		System.out.println(obj.accept());
		System.out.println(obj.accept());
		System.out.println(obj.accept());
	}

}
