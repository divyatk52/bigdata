package bigdata;

import java.util.Scanner;

import bigdata.UndoRedoStack;

public class undoredosep {
	public static void main(String[] args) {

		System.out.println("**************** Welcome to Stack Demonstration ****************");
		System.out.println("");
		System.out.println("1. Application starts(Create an empty stack at backend)");
		System.out.println("2. Add operations to stack");
		System.out.println("3. Perform undo by popping elements from stack");
		System.out.println("4. Perform redo");
		System.out.println("Type any number between 1 to 4 to perform the operation associated with each number");
		System.out.println("Type 0 to quit");

		Scanner in = new Scanner(System.in);

		int n=5;
		n = in.nextInt();
		UndoRedoStack<String> s1= new UndoRedoStack<String>();
		String undoString=null;
		while (n!=0) {

			switch(n) {
			case 1:
				s1= new UndoRedoStack<String>();
				System.out.println("Stack created");
				break;
			case 2:
				String s="";
				Scanner inline = new Scanner(System.in);
				s = inline.nextLine();
				//if(s1.push(s)==s)
				s1.push(s);
				System.out.println(s1);
				break;
			case 3:
			     s1.undo();
				System.out.println(s1);
				break;
			case 4:
				s1.redo();
				System.out.println(s1);
				break;
			default:
				System.out.println("in default");
				break;
			}

			n = in.nextInt();

		}

		if (n == 0)
			System.out.println("The file is saved successfully");
		else
			System.out.println("Error in application");

		in.close();
	}

}
