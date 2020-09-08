package main.reactiveAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class ReactiveAPIDemo {
    public ReactiveAPIDemo() {
        SubmissionPublisher<Employee> publisher = new SubmissionPublisher<>();
        MyProcessor transformProcessor = new MyProcessor(s -> {
            s.setFullName(s.getFName()+" "+s.getSname());
            return s;
        });
        MySubscriber subs = new MySubscriber();
        publisher.subscribe(transformProcessor);
        transformProcessor.subscribe(subs);

        List<Employee> emps = new ArrayList<>(Arrays.asList(
           new Employee("D","d"),
                new Employee("A","a"),
                new Employee("B","b"),
                new Employee("C","c"),
                new Employee("E", "e")
        ));
        System.out.println("Publishing items");
        emps.stream().forEach(
                i -> publisher.submit(i));
        while (emps.size() != subs.getCounter()){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        publisher.close();
        transformProcessor.close();
        System.out.println("done");
    }
}
