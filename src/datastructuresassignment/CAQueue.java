
package datastructuresassignment;

import java.util.ArrayList;


public class CAQueue{
    static ArrayList aq;
    private static int front,back;
    CAQueue(){
        front = back =-1;
        aq = new ArrayList();
    }

    public static void main(String[] args) {
        CAQueue queue = new CAQueue();
        queue.enqueue(21);
        queue.enqueue(222);
        queue.enqueue(2);
        queue.displayQueue();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.displayQueue();
        
    }
    /* Function to create Circular queue */
    public  void enqueue(Object value){ 
    
    // Check if queue is empty, Insert First Element.
        if (front == -1){ 
            front = back = 0; 
            aq.add(back, value);  
        } 
    // if back is on the last element of queue, add new element in the first place.
    else if (back == aq.size()-1 && front != 0){ 
        back = 0; 
        aq.add(back, value);
    } 
    // Add new element in the last of the queue.
    else{ 
        back++; 
        aq.add(back, value);
    } 
} 
    // Function to delete element from Circular Queue 
    Object dequeue(){ 
    //If queue is empty, print it.
    if (front == -1){ 
        System.out.println("\nQueue is Empty"); 
        return -1; 
    } 
    // Store removable element in temporary variable to return it.
    Object data = aq.get(front); 
    // Replace deleting index with -1.
    aq.set(front, -1); 
    // If queue has only one element just remove it.
    if (front == back){ 
        front = -1; 
        back = -1; 
    } 
    // if queue's front variable is in last place , skip it and move it to 1st place.
    else if (front == aq.size()-1) 
        front = 0; 
    // Otherwise just move one index forward.
    else
        front++; 
   // Return removed element.
    return data; 
} 
    // Function displaying the elements 
// of Circular Queue 
    public void displayQueue(){ 
        // If queue is empty, print it.
        if (front == -1) { 
            System.out.println("\nQueue is Empty"); 
            return; 
        } 
        System.out.println("\nElements in Circular Queue are: "); 
        // Just print the queue with this loop if few elements are removed .
        if (back >= front){ 
            for (int i = front; i <= back; i++) 
                System.out.println(aq.get(i)); 
            
        }
        // Otherwise print whole queue.
        else{ 
            for (int i = front; i < aq.size(); i++) 
                System.out.println(aq.get(i)); 
  
        
    } 
} 
    
}
