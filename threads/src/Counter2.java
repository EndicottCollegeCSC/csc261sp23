public class Counter2 {
    private static Counter2 counter = new Counter2();
    private volatile int c = 0;

    private Counter2(){
    }

    public static Counter2 getCounter(){
        return counter;
    }

    public synchronized void increment(){
        counter.c++;
    }

    public synchronized void decrement(){
        counter.c--;
    }

    public int getValue(){
        return c;
    }
}

