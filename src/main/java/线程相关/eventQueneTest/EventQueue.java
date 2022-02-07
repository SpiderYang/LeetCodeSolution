package 线程相关.eventQueneTest;

import java.util.LinkedList;

/**
 * @Author: Hikari
 * @Date: 2022/1/28 23:30
 */

public class EventQueue {
    private final int max;

    static class Event{}

    private final LinkedList<Event> eventQueue = new LinkedList<>();

    private final static int DEFAULT_MAX_EVENT = 10;

    public EventQueue(){
        this(DEFAULT_MAX_EVENT);
    }

    public EventQueue(int max) {
        this.max = max;
    }

    public void console(String s){
        System.out.println(s);
    }

    public void offer(Event event){
        synchronized (eventQueue){
            if(eventQueue.size() >= max){
                try {
                    console("the queue is full.");
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            console(" the new event is submitted");
            eventQueue.add(event);
            eventQueue.notify();
        }
    }

    public Event take(){
        synchronized (eventQueue){
            if (eventQueue.isEmpty())
                try {
                console("The queue is empty. ");
                eventQueue.wait();
            } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
        Event event = eventQueue.removeFirst();
        this.eventQueue.notify();
        console("the event " + event + " is handled.");
        return event;
    }
}
