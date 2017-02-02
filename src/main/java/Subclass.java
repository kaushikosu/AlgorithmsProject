
public class Subclass extends SuperClass{
	
	public Subclass(String s){
		super(s);
	}
	
	public static void main(String [] args){
		Subclass sub = new Subclass("hey");
		System.out.println(sub.string);
	}
}
