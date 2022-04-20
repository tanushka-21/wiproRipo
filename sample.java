package TestPk;
import java.util.*;
public class HelloWorld {
	String name;
	int age;
	public void initialize() {
		name="Tanushka";
		age=22;
	}
	public void display() {
		System.out.println("The name is:"+name);
		System.out.println("The age is:"+age);
	}
	public static void main(String[] args) {
		HelloWorld hw=new HelloWorld();
		hw.initialize();
		hw.display();
	}
}


