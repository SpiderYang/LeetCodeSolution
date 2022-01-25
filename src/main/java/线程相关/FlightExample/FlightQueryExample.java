package 线程相关.FlightExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @Author: Hikari
 * @Date: 2022/1/25 22:21
 */

public class FlightQueryExample {
    private static List<String> flightCompany = Arrays.asList("CSA", "CEA", "HNA");

    public static void main(String[] args) {
        List<String> results = search("SH", "BJ");
        System.out.println("===========result================");
        results.forEach(System.out::println);
    }

    private static List<String> search(String original, String dest){
        final List<String> result = new ArrayList<>();

        List<FlightQueryTask> tasks = flightCompany.stream().map(f -> createSearchTask(f, original, dest))
                .collect(toList());

        tasks.forEach(Thread::start);

        tasks.forEach(t -> {
            try{
                t.join();
            } catch (InterruptedException e) {

            }
        });

        tasks.stream().map(FlightQuery::get).forEach(result::addAll);

        return result;
    }

    private static FlightQueryTask createSearchTask(String f, String original, String dest) {
        return new FlightQueryTask(f, original, dest);
    }
}
