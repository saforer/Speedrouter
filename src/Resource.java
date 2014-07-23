public class Resource {
	public String name;
	public int amount;

	public Resource(String inName, int inAmount) {
		amount = inAmount;
		name = inName;
	}
	
	public Resource(String inName) {
		amount = 0;
		name = inName;
	}
}
