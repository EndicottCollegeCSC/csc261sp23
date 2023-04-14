public class Counter {
    private static Counter counter = new Counter();
    private int c = 0;

    private Counter(){
    }

    public static Counter getCounter(){
        return counter;
    }

    public void increment(){
        counter.c++;
    }

    public void decrement(){
        counter.c--;
    }

    public int getValue(){
        return c;
    }
}



