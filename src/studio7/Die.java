package studio7;

public class Die {

	private int side; 
	
public Die(int side) {
	this.side = side; 
}

public int roll() {
	int result = (int)Math.random()*side;
	return result; 
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
