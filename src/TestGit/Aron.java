package TestGit;

public class Aron {
	
	public void getMessage(String ...value) {
		System.out.println("Get Message..."
				+ "Done "+ String.join(",", value));
	}
	
	public int multi(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		
	Aron a = new Aron();
	
	a.getMessage("Guys","Wow","nice","chii");
		
		System.out.println("Final value :"+a.multi(5, 8));
		
	}

}
