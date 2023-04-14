public class Main extends Thread {
    private static final int ITERATIONS = 1000000;
    public void run(){
        Counter counter = Counter.getCounter();

        System.out.println("["+ this +"] Hello from Main.run()");
        System.out.println("["+ this +"] Starting counter value: "+ counter.getValue());

        // Increment ITERATIONS times.
        for(int i = 0; i < ITERATIONS; i++){
            counter.increment();
        }

        System.out.println("["+ this +"] Middle counter value: "+ counter.getValue());

        // Decrement ITERATIONS times.
        for(int i = 0; i < ITERATIONS; i++){
            counter.decrement();
        }
        System.out.println("["+ this +"] Ending counter value: "+ counter.getValue());
    }

    public static void main(String[] args){
        Main thread1 = new Main();
        Main thread2 = new Main();

        thread1.start();
        thread2.start();
    }
}




        // Counter3 counter = Counter3.getCounter();
        // Counter2 counter = Counter2.getCounter();
