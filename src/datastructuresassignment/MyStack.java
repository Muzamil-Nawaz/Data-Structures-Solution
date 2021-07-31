
package datastructuresassignment;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack {
 	private ArrayList al;
        int size;
        // Simple Constructor to initialize instances.
	public MyStack() {
 		al = new ArrayList();
                size=0;
 	}
        // Method to insert element in arraylist object.
	public void push(Object item) {
 		al.add(item);
                // Incrementing size of list after adding new element.
                size++;
 	}
        // Method to remove element from arraylist object.
	public Object pop() {
                // Checks if stack is not empty.
 		if (!isEmpty()){
                    // Decrementing size of stack before removing element.
                    size--;
                    return al.remove(al.size()-1);
                        
                }
                // If stack is empty , throw exception.
 		else
 			throw new EmptyStackException();
 	}
        // Checks whether Stack is empty or not.
        public boolean isEmpty(){
            // Checks if size of list is empty, returns true.
            if(al.size()==0)
                return true;
            // if not empty then return false.
            return false;
        }
        // Display list elements
        public String toString(){
            return al.toString();
        }
        // Method to get specific element at any index.
        public Object get(int i){
            return al.get(i);
        }
}
