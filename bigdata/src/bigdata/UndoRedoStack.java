package bigdata;
import java.util.Stack;

public class UndoRedoStack<E> extends Stack<E> {
	private Stack undo;
	private Stack redo;
	public UndoRedoStack() {
		undo=new Stack();
		redo=new Stack();
	}
	public E push(E e)
	{
		super.push(e);
		undo.push("push");
		redo.clear();
		return e;
		
	}
	 
	public E pop()
	{
		E e=super.pop();
		undo.push(e);
		undo.push("pop");
		redo.clear();
		return e;
	}
	public void undo() {
		// TODO Auto-generated method stub
		if(undo.isEmpty())
		{
			throw new IllegalStateException();
		}
		else
		{
			Object action=undo.pop();
			if (action.equals("push"))
			{
				//if undo stack has push operation 
				//1.pop element from stack and push into redo stack
				//2.push the action to redo stack
				E e=super.pop();
				redo.push(e);
				redo.push("push");
				
			}
			else
			{
				//if undo stack has pop operation 
				//1.pop element from undostack and push into stack
				//2.push the action to redo stack
				E e =(E) undo.pop();
				super.push(e);
				redo.push("pop");
			}
		}
			
		
	}
	public void redo() {
		// TODO Auto-generated method stub
		if(redo.isEmpty())
		{
			throw new IllegalStateException();
		}
		else
		{
			Object action=redo.pop();
			if (action.equals("push"))
			{
				//if redo stack has push operation 
				//1.pop element from redostack and push into stack
				//2.push the action to undostack
				E e=(E) redo.pop();
				super.push(e);
				undo.push("push");
				
			}
			else
			{
				//if undo stack has pop operation 
				//1.pop element from undostack and push into stack
				//2.push the action to redo stack
				E e=super.pop();
				undo.push(e);
				undo.push("pop");
			}
			
		}
	}
	
	
	

}
