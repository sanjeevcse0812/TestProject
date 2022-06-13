
public class FinalTest {
	private static int counter=0;
	private final int value;
	public FinalTest() {
		counter++;
		this.value=counter;
	}
	public int getValue() {
		return value;
	}

}
