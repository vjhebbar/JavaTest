
public class Hello {

	public static void main(String[] args) {
		System.out.println(print("Vijay"));
	}
	
	public static String print(String str) {
		return "Hello " + str;
	}
	
	public static Integer buggy(){
		return 1/0;
	}
	
}
