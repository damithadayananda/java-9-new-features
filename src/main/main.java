package main;

import _double.doubleSum;
import main.httpNewClient.NewHttpClientDemo;
import main.interfaceChanges.javaNineInterface;
import main.interfaceChanges.javaNineInterfaceImpl;
import main.reactiveAPI.ReactiveAPIDemo;
import main.streamApiImprovement.streamDemo;


public class main {
    public static void main(String args[]){
        /**
         * Modularity demo
         * I have export _double package from sum module and it's available here
         */
//        doubleSum ds = new doubleSum();
//        System.out.println(ds.doubleSum(2.2,2.3));

        /**
         * intergerSum is not available here since it's not exported
         */
        // integerSum is = new integerSum();

        /**
         * Stream API improvement demo
         */
//        new streamDemo().DropWhileDemo();
//        new streamDemo().TakeWhileDemo();
//        new streamDemo().IterateDemo();

        /**
         * New changes in interface
         */
//        new javaNineInterfaceImpl().logAuthor("damitha");
        /**
         * New Java HttpClient
         */
//        NewHttpClientDemo newHttpClientDemo = new NewHttpClientDemo();
//        newHttpClientDemo.demo();
        /**
         * Reactive API
         */
        new ReactiveAPIDemo();
    }
}
