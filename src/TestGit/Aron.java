package TestGit;

public class Aron {
	
	public void getMessage(String ...value) {
		System.out.println("Get Message..."
				+ "Done "+ String.join(",", value));
	}
	
	public static void main(String[] args) {
		
	Aron a = new Aron();
	
	a.getMessage("Guys","ok","Wow","nice","chii");
		
		
		
	}

}
