package ThisKeyword;

public class InvokeMethod {

	
public void show()
{
	System.out.println("===Im in Show method====");
}
public void display()
{
	 this.show();
	//show();
	System.out.println("===Im in Display Method===");
}
public static void main(String[] args) {
InvokeMethod i = new InvokeMethod();
i.display();
}

}
