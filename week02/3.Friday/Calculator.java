import java.util.Stack;
import java.util.Scanner;
public class Calculator {

	private double nextNumberAfter(String s, int ix) {

		double ans = 0;
		while (ix < s.length() && !Character.isDigit(s.charAt(ix)))
			ix++;
		int endIndex = ix;

		while (endIndex < s.length() && Character.isDigit(s.charAt(endIndex)))
			endIndex++;
		ans = (double) Integer.parseInt(s.substring(ix, endIndex));
		return ans;

	}
	
	public void Calc ()
	{	
		System.out.println("Hello!");
		System.out.println();
		System.out.println("Enter expression:> ");
		Scanner sc = new Scanner (System.in);
		String inpt = sc.nextLine();
		while (!inpt.contains("exit"))
		{
			System.out.println(inpt);
			System.out.println("Output:> ");
			System.out.println(calculate(inpt));
			inpt = sc.nextLine();
			
		}
		
		System.out.println();
		System.out.println("Bye!");
		sc.close();
	}
	
	private double calculate(String s) {
		double currentNumber = 0;
		Stack<Token> tokenStack = new Stack<>();
		Stack<Operation> operationsStack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				currentNumber = nextNumberAfter(s, i);
				Number n = new Number(currentNumber);
				tokenStack.push(n);

				i += Double.toString(currentNumber).length() - 2;
				i--;
				continue;

			} else if (s.charAt(i) == ' ')
				continue;
			else {
				Operation op = null;

				switch (s.charAt(i)) {
				case '+':
					op = new Sum();
					break;
				case '-':
					op = new Subtraction();
					break;
				case '*':
					op = new Multiplication();
					break;
				case '/':
					op = new Division();
					break;
				case '^':
					op = new Power();
					break;

				case '!': {

					int factorialTimes = 0;
					while (i < s.length() && s.charAt(i) == '!') {
						factorialTimes++;
						i++;
					}

					op = new Factorial(factorialTimes);
				}
					break;
				case '(': {

					int closingIndex = i + 1, bracketCount = 1;

					while (bracketCount != 0 && closingIndex < s.length()) {
						if (s.charAt(closingIndex) == ')')
							bracketCount--;
						else if (s.charAt(closingIndex) == '(')
							bracketCount++;

						closingIndex++;
					}

					double bracketsResult = calculate(s.substring(i + 1, closingIndex - 1));
					Number n = new Number(bracketsResult);
					tokenStack.push(n);
					i = closingIndex;
					continue;

				}

				}
				while (!operationsStack.empty() && operationsStack.lastElement().getPrecedence() > op.getPrecedence()) {
					tokenStack.push(operationsStack.pop());
				}
				operationsStack.push(op);
			}

		}

		while (!operationsStack.empty())
			tokenStack.push(operationsStack.pop());

		Stack<Number> numberStack = new Stack<>();
		double left = 0, right = 0, result = 0;
		while (!tokenStack.empty()) {
			if (tokenStack.firstElement().isNumber()) {
				numberStack.push((Number) tokenStack.firstElement());
				tokenStack.remove(0);
			} else if (!tokenStack.firstElement().isNumber()) {
				Operation oper = (Operation) tokenStack.firstElement();
				right = numberStack.pop().getNumber();

				if (oper.toString() == "!") {
					Factorial cast = (Factorial) oper;
					result = cast.operate(right);
				} else {

					left = numberStack.pop().getNumber();
					result = oper.operate(left, right);
				}
				numberStack.push(new Number(result));
				tokenStack.remove(0);

			}
		}

		return numberStack.firstElement().getNumber();

	}

}
