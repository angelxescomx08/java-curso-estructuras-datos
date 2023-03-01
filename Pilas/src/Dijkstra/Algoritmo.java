package Dijkstra;

import java.util.Stack;

public class Algoritmo {
	private Stack<String> operationStack;
	private Stack<Double> valuesStack;
	
	public Algoritmo() {
		this.operationStack = new Stack<>();
		this.valuesStack = new Stack<>();
	}
	
	//Evaluar expresiones con una pila O(N)
	public void interpretExpression(String expression) {
		String[] expressionArray = expression.split(" ");
		
		for(String s : expressionArray) {
			if(s.equals("(")) {
				//no hacer nada
			}else if(s.equals("+")) {
				operationStack.push(s);
			}else if(s.equals("*")) {
				operationStack.push(s);
			}else if(s.equals(")")) {
				String operation = operationStack.pop();
				
				if(operation.equals("+")) {
					valuesStack.push(valuesStack.pop() + valuesStack.pop());
				}else if(operation.equals("*")) {
					valuesStack.push(valuesStack.pop() * valuesStack.pop());
				}
			}else {
				valuesStack.push(Double.parseDouble(s));
			}
			
		}
	}
	
	public void result() {
		System.out.println(valuesStack.pop());
	}
}
