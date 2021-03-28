
/**
 * Class represents a simulation event
 *
 * @author Nirre Pluf {@literal <pluf@wfu.edu>}
 * @version 0.1, Mar. 28, 2021
 */
public class Event implements Comparable<Event> { 
    private EventType type = EventType.ARRIVAL;  // type of event
    private double time = Double.NaN;            // time the event occurs
    private Student who = null;                  // who is associated with the event

    /**
     * Event constructor
     *
     * @param time  time of the event
     * @param type  type of event
     * @param student who is assocated with the event
     */
    public Event(double time, EventType type, Student student){
        this.time = time;
        this.type = type;
        this.who = student;
    }


    /**
     * get Event type
     * @return Event type
     */
    public EventType getType() {
        return type;
    }


    /**
     * get the Student associated with the Event
     * @return  Student
     */
    public Student getWho(){
        return who;
    }


    /**
     * get the time of the Event
     * @return  time
     */
    public double getTime() {
        return time;
    }


    /**
     * return string containing the time, type, and Student
     * for the event
     * @return String containing Event information
     */
    @Override
    public String toString(){
        return "[" + time + ", " + type + ", " + who + "]";
    }


    /**
     * return result of comparing the calling Event to the parameter
     * to indicate if the call object is less than, greater than, or 
     * equal to the parameter
     *
     * compare time, tie-break on EventType (DEPARTURE before ARRIVAL)
     *
     * @return  0 if the same, negative is calling object less, 
     *          positive otherwise
     */
    @Override
    public int compareTo(Event event){
        // update this method !
        return 0;
    }

}
