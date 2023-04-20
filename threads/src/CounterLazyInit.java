public class CounterLazyInit {
    private volatile static CounterLazyInit counter;
    private static Object mutex = new Object();
    private volatile int c = 0;

    private CounterLazyInit(){
    }

    public static CounterLazyInit getCounter(){
        CounterLazyInit result = counter;
        if(result == null){
            synchronized(mutex){
                result = counter;
                if(result == null){
                    counter = result = new CounterLazyInit();
                }
            };
        }
        return result;
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

