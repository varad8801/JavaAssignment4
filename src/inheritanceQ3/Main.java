package inheritanceQ3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Physics ph=new Physics("Vegita",53);
		Chemistry chem =new Chemistry("Goku",80);
		Mathematics math=new Mathematics("Kakashi",90);
		System.out.println(ph.toString());
		System.out.println(chem.toString());
		System.out.println(math.toString());
	}

}
