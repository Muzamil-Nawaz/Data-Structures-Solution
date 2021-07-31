

package datastructuresassignment;
public class QueueEfficiencyComparator {
    static SSQueue sq;
    static CAQueue caq;
    // An array for all n numbers of elements to be added in queues one by one for testing.
    static int [] numbers ={20,50,100,1000,10000,100000,1000000};
    //  Method for testing CAQueue efficiency with Scenario 1. 
    public  void testScenario1ForCAQueue(){
        System.out.println("Efficiency for CAQueue in Scenario 1:");
        for (int j = 0; j < numbers.length; j++){
            int n = numbers[j];
            long startTime = System.nanoTime();
            for (int i= 0; i < n; i++) {
              caq.enqueue(i+n);
              caq.dequeue();
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println("\t"+n+" elements,"+totalTime+" Nano Seconds");
        }
    }
    // Method for testing SSQueue efficiency with Scenario 1.
    public  void testScenario1ForSSQueue(){
        System.out.println("Efficiency Counter for SSQueue in Scenario 1:");
        for (int j = 0; j < numbers.length; j++){
            int n = numbers[j];
            long startTime = System.nanoTime();
            for (int i= 0; i < n; i++) {
              sq.enqueue(i+n);
              sq.dequeue();
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println("\tFor "+n+" elements,"+totalTime+" Nano Seconds");
        }
    }
    // Method for testing SSQueue efficiency with Scenario 2.
    public  void testScenario2ForSSQueue(){
        System.out.println("Efficiency Counter for SSQueue in Scenario 2:");
        for (int j = 0; j < numbers.length; j++){
            int n = numbers[j];
            long startTime = System.nanoTime();
            for (int i= 0; i < n; i++) {
              if(Math.random()<0.5)
                sq.enqueue(i+n);
              else
                sq.dequeue();
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println("\tFor "+n+" elements,"+totalTime+" Nano Seconds");
        }
    }
    // Method for testing CAQueue efficiency with Scenario 2.
    public  void testScenario2ForCAQueue(){
        System.out.println("Efficiency for CAQueue in Scenario 2:");
        for (int j = 0; j < numbers.length; j++){
            int n = numbers[j];
            long startTime = System.nanoTime();
            for (int i= 0; i < n; i++) {
              if(Math.random()< 0.5)  
                caq.enqueue(i+n);
              else
                caq.dequeue();
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println("\tFor "+n+" elements,"+totalTime+" Nano Seconds");
        }
    }
   // Method for testing all methods of class.
    public static void main(String[] args){
        // Initializing class objects to test methods.
        QueueEfficiencyComparator qec = new QueueEfficiencyComparator();
        // Initializing CAQueue object for testing.
        caq = new CAQueue();
        // Initializing SSQueue for testing.
        sq = new SSQueue();
        // Testing method for getting results for CAQueue in Scenario 1.
        qec.testScenario1ForCAQueue();
        // Testing method for getting results for SSQueue in Scenario 1.
        qec.testScenario1ForSSQueue();
        // Testing method for getting results for CAQueue in Scenario 2.
        qec.testScenario2ForCAQueue();
        // Testing method for getting results for SSQueue in Scenario 2.
        qec.testScenario2ForSSQueue();
        
        
    }
}
