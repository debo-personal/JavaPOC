import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class DataStructures {
	public static void main( String[] args ) {
		DataStructures javaStructures = new DataStructures();
		javaStructures.testStack();
		System.out.println("==================================================");
		javaStructures.testMap();
	}
	
	private void testMap() {
		Map map = new HashMap();
		map.put("animal","tiger");
		map.put("travel", "bus");
		print("Map: " + map );
		Set keySet = map.keySet();
		Set entrySet = map.entrySet();
		print("List of Keys: " + keySet );
		print("EntrySet: " + entrySet );
		print("Size of the map: " + map.size());
		print("Does this map contain 'tiger' value: " + map.containsValue("tiger"));
		print("Value of 'travel' key : " + map.get("travel"));
	}

	private void testStack(){
		Stack stack = new Stack();
		print("This stack is empty: " + stack.empty());
		stack.add(new Integer(2)); // As stack is a subclass of vector, add() method will also work instead of push()
		stack.add(new Double(2.45));
		print("Stack is: " + stack ); //So, this proves we have different data types in a stack.
		print("The top element of the stack is :" + stack.peek());
		print("Stack is: " + stack ); // So, this will verify/ proof that peek() method only returns the element but it does not remove the element from the stack.
		stack.push("a string");
		stack.push('a');
		print("Now the latest stack is :" + stack ); // cross verifying again that it can hold different data types
		print("poped element is:" + stack.pop().toString());
		print("Current stack: " + stack );
		int searchedIndex = stack.search(2.45);
		print("Index of 2.45 is: " + searchedIndex );
		print("Index of 'a string' is :" + stack.search("a string"));
	}
	
	
	/* Utility Methods */
	public void print( String s ) {
		System.out.println( s );
	}
}