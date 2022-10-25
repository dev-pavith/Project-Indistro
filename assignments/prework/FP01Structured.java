import java.util.Arrays;
import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		printAllNumbersInListStructured(Arrays.asList(1,2));
		//123
	}
	
	public static void printAllNumbersInListStructured(List<Integer> numbers) {
		for(int n:numbers) {
			System.out.println("------------------");
			System.out.println(n);
			//sysout code
		}
	}
	
	
}

