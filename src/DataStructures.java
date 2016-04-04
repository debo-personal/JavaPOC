import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataStructures {
	public static void main( String[] args ) {
		DataStructures javaStructures = new DataStructures();
		javaStructures.testStack();
		System.out.println("==================================================");
		javaStructures.testMap();
		System.out.println("==================================================");
		javaStructures.testArrayList();
		System.out.println("==================================================");
		javaStructures.testLinkedList();
		System.out.println("==================================================");
		javaStructures.testSet();
		System.out.println("==================================================");
		javaStructures.testTreeMap();
	}
	
	private void testTreeMap() {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "val1");
		treeMap.put(4, "val4");
		treeMap.put(3, "val3");
		treeMap.put(2, "val2");
		
		print("TreeMap :" + treeMap );
		Set set = treeMap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry tMap = (Map.Entry)iterator.next();
			print(tMap.getKey() + " : " + tMap.getValue());
		}
	}

	private void testSet() {
		//HashSet: Unordered collection
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("hi");
		hashSet.add("hello");
		hashSet.add("okay");
		hashSet.add("bye");
		print("Current HashSet is: " + hashSet ); // So, this proves that there is no guarantee of the order.
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Akash");
		treeSet.add("Ali");
		treeSet.add("Debo");
		treeSet.add("Chayan");
		treeSet.add("Bob");
		print("Current TreeSet is :" + treeSet ); // Sorted List
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		print("Current LinkedHashSet is :" + lhs ); // these entries are sorted as per insertion order 
	}
	
	/* ArrayList is preferable over LinkedList for element search.
	 * Complexity : O(1) wherein O(n) in LinkedList
	 * */
	private void testArrayList() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hi");
		arrayList.add("Hello");
		arrayList.add("Bye");
		print( "Initial ArrayList: " + arrayList );
		arrayList.add(1, "added"); // it adds the value in the mentioned index and shifts the further elements. Performance O(n) here
		print( "New ArrayList: " + arrayList );
		//updating existing one
		arrayList.set(2,"updated");
		print( "New ArrayList: " + arrayList );
		arrayList.remove("Bye");
		print( "ArrayList after removal : " + arrayList );
		//Search
		print("Does arraylist conatin 'hi'? "+ arrayList.contains("Hi"));
		print("Index of 'Hi': " + arrayList.indexOf("Hi"));
		print("Value at index 2: " + arrayList.get(2) );
		
		// Looping over the list
		print("For Loop demo: ");
		for(int i = 0; i < arrayList.size();i++ ) {
			System.out.print(arrayList.get(i) + " ");
		}
		print("");
		print("Advanced For loop: ");
		for(String element: arrayList){
			System.out.print(element + " ");
		}
		print("");
		// Sorting

		arrayList.add( 1, "xyzsdkjk");
		print("Unsorted List is : " + arrayList );
		Collections.sort( arrayList );
		print("Sorted list is :" + arrayList );
	}
	
	/* LinkedList is preferable over ArrayList for element addition and deletion 
	 * Complexity: O(1) wherein O(n) in arrayList for worst case scenario
	 * */
	private void testLinkedList() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.addLast("Last Element");
		print("Current List:" + linkedList );
		linkedList.addFirst("First Element");
		print("Current List:" + linkedList );
		linkedList.add( 1, "New" );
		print("Current List:" + linkedList );
		linkedList.add("New");
		print("Current List:" + linkedList );
		linkedList.removeLastOccurrence("New");
		print("Current List:" + linkedList );
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