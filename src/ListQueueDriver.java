/**
 * Driver (main) for CSC 201 project 3 (generic lists and queues)
 *
 * @author Nirre Pluf {@literal <pluf@wfu.edu>}
 * @version 0.1, Mar. 28, 2021
 */

import java.util.Random;

public class ListQueueDriver {
    public static void main(String[] args) {
        int maxItems = 5;            // maximum number of items to add to a data structure
        Random rand = new Random();  // random makes things interesting  

        // generic list test  
        printTestHeader("Generic List Test (addFirst) ");  
        GLinkedList<Integer> list = new GLinkedList<Integer>();

        System.out.print("Adding: ");  
        for(int i = 0; i < maxItems; i++) {
            int randValue = rand.nextInt(10);  
            System.out.print(randValue + " "); 
            list.addFirst(randValue);
        }  
        System.out.println("\nthere are " + list.size() + " items in the list ");  
        System.out.print("Result: "); 
        for(int value: list)
            System.out.print(value + " ");  
        System.out.println(" ");  

        // queue test
        printTestHeader("Queue Test (FCFS) ");  
        Queue<Character> queue = new ListQueue<Character>();
        char[] chList = {'a', 'b', 'c', 'd'};  
        System.out.print("Adding: ");  
        for(int i = 0; i < maxItems; i++) {
            char randCh = chList[rand.nextInt(chList.length)];
            System.out.print(randCh + " ");  
            queue.enqueue(randCh);  
        }
        System.out.println("\nthere are " + queue.size() + " items in the queue ");  
        System.out.print("Result: "); 
        while(!queue.isEmpty())  
            System.out.print(queue.dequeue() + " ");  
        // System.out.println(" ");  
        System.out.println("\nafter dequeue there are " + queue.size() + " items in the queue ");  

        // priority queue test
        printTestHeader("Priority Queue Test (ordered FCFS) ");  
        PriorityQueue<Event> calendar = new PriorityListQueue<Event>();
        System.out.print("Adding: ");  
        for(int i = 0; i < maxItems; i++) {
            Event e = randomEvent();
            System.out.print(e + " ");  
            calendar.enqueue(e);  
        }
        System.out.println("\nthere are " + calendar.size() + " items in the priority queue ");  
        System.out.print("Result: "); 
        while(!calendar.isEmpty())  
            System.out.print(calendar.dequeue() + " ");  
        // System.out.println(" ");  
        System.out.println("\nafter dequeue there are " + calendar.size() + " items in the priority queue ");  
    }

    /**
     * create and return a random Event
     * @return  Event
     */
    public static Event randomEvent() {
        Random rand = new Random();
        double time = rand.nextInt(12)/10.0; 
        EventType type = EventType.ARRIVAL;
        if(rand.nextInt(2) == 0)
            type = EventType.DEPARTURE;
        int studentID = rand.nextInt(100);
        return new Event(time, type, new Ugrad(studentID, 1.0, 1.0));
    }


    /**
     * print a header message for a test
     * @param str  a message to print
     */
    public static void printTestHeader(String str) {
        String line = "================================================ ";
        System.out.println(line + "\n" + str + "\n" + line);
    }  
}


