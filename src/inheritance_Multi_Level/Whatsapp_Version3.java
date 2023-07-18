package inheritance_Multi_Level;

public class Whatsapp_Version3 extends Whatsapp_version2 {
	
public void payment()
{
	System.out.println("User can make payment");
}
	public static void main(String[] args) {
		
		Whatsapp_Version3 w =new Whatsapp_Version3();
		w.payment();
		w.sendmessages();
		w.saveDP();
		w.Calling();
		w.payment();
	}
}
