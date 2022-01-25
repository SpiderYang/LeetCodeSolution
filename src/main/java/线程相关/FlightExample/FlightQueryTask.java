package 线程相关.FlightExample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Hikari
 * @Date: 2022/1/25 22:15
 */

public class FlightQueryTask extends Thread implements FlightQuery{

    private final String origin;
    private final String destination;
    private final List<String> flightList = new ArrayList<>();

    public FlightQueryTask(String airline, String origin, String destination){
        super("[" + airline + "]");
        this.origin = origin;
        this.destination = destination;
    }

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     *
     */
    @Override
    public void run() {
        System.out.printf("%s-query from %s to %s \n", getName(), origin, destination);
        int randomVal = ThreadLocalRandom.current().nextInt(10);
        try{
            TimeUnit.SECONDS.sleep(randomVal);
            this.flightList.add(getName() + "-" + randomVal);
            System.out.printf("The Flight: %s list query successful \n", getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> get() {
        return this.flightList;
    }
}
