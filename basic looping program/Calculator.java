
public class Calculator {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		String operator = "Add";

		switch (operator) {
		case "Add":
			System.out.println(a + b);
			break;
		case "Sub":
			System.out.println(a - b);
			break;
		case "Mult":
			System.out.println(a * b);
			break;
		case "Div":
			System.out.println(a / b);
			break;

		default:
			System.out.println("Invalid operator");
		}
	}
}
