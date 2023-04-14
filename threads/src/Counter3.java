import java.util.concurrent.atomic.AtomicInteger;

public class Counter3 {
    private static Counter3 counter = new Counter3();
    private AtomicInteger c = new AtomicInteger(0);

    private Counter3(){
    }

    public static Counter3 getCounter(){
        return counter;
    }

    public void increment(){
        counter.c.getAndIncrement();
    }

    public void decrement(){
        counter.c.getAndDecrement();
    }

    public int getValue(){
        return c.get();
    }
}

