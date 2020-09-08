package main.streamApiImprovement;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamDemo {
    private Stream stream;
    public streamDemo(){
        stream = Stream.of(1,2,10,3,4,5,6,7,8,9);
    }

    /**
     *dropWhile drops the all the element which are comming through the stream until
     * it match the predicate condition, once it match the condition it will
     * stop evaluation and return all the elements then after
     */
    public void DropWhileDemo(){
        stream.dropWhile(x -> (Integer)x<4).forEach(a -> System.out.println(a));
    }

    /**
     * takeWhile will take all the elements which are coming through the stream
     * until it met the predicate condition, all the elements after then will be dropped
     */
    public void TakeWhileDemo(){
        stream.takeWhile(x -> (Integer)x < 4).forEach(a -> System.out.println(a));
    }

    /**
     * Iterate return a stream of elements which starts with initial value, the first
     * parameter of the iterate method, evaluate with predicate which is the second parameter
     * and generate next element with third parameter
     */
    public void IterateDemo(){
        IntStream.iterate(2, x->x<20, x->x+3).forEach(System.out::println);
    }
}
