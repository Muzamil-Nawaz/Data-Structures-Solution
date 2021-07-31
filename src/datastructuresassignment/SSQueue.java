package datastructuresassignment;
public class SSQueue {
    // Declaring two MyStack objects for different operations
    MyStack s1,s2;
    // Constructor for initializing MyStack objects
    SSQueue(){
        s1 = new MyStack();
        s2 = new MyStack();
    }
    // Method to store new element in MyStack object 1.
    public void enqueue(Object value){
        s1.push(value);
    }
    // Method to remove element from MyStack object 2.
    public Object dequeue(){
        // Checks if both MyStack objects are empty , Queue is Empty.
        if(s2.isEmpty() && s1.isEmpty())
            return "Queue is Empty.";
        // Checks if MyStack object 2 is empty, move all elements from MyStack object 1 to object 2.
        if(s2.isEmpty() && !s1.isEmpty()){
            for (int i = 0; i < s1.size; i++){
                s2.push(s1.get(i));
                
            }
            // Making MyStack Object 1 empty.
            s1=new MyStack();
            // Removing and returning element from MyStack object 2.
            return s2.pop();
        }
            
       return -1; 
    }
    public void displayQueue(){
        System.out.println("Elements in the Queue:");
        for (int i = 0; i < s1.size; i++) {
            System.out.println(s1.get(i));
            
        }
        for (int i = 0; i < s2.size; i++) {
            System.out.println(s2.get(i));
        }
    }
    public static void main(String [] args){
        SSQueue sq = new SSQueue();
        sq.enqueue("33");
        sq.enqueue(32);
        sq.enqueue('a');
        sq.displayQueue();
        System.out.println("removed :"+sq.dequeue());
        sq.displayQueue();
        
    }
}
