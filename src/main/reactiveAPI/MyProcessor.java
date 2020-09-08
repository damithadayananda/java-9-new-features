package main.reactiveAPI;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

public class MyProcessor extends SubmissionPublisher<Employee> implements Flow.Processor<Employee, Employee> {
    private Flow.Subscription subscription;
    private Function<Employee, Employee> function;

    public MyProcessor(Function<Employee, Employee> function){
        this.function = function;
    }
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Employee item) {
        submit((Employee) function.apply(item));
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Done");
    }
}
