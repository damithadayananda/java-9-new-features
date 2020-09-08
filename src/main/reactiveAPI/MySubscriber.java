package main.reactiveAPI;

import java.util.concurrent.Flow;

public class MySubscriber implements Flow.Subscriber<Employee> {
    private Flow.Subscription subscription;
    int count =0;
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("Subscribed for employees");
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(Employee item) {
        System.out.println("Processing employee:"+item);
        count++;
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable e) {
        System.out.println("Error occurred");
        e.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("All processing done");
    }
    public int getCounter(){
        return count;
    }
}
