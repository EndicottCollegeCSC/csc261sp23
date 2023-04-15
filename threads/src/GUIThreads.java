

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import javax.swing.*;

/**
 * An example of using SwingWorkers in a Swing GUI. This is adapted from 
 * https://docs.oracle.com/javase/tutorial/uiswing/examples/components/FrameDemoProject/src/components/FrameDemo.java
 */
public class GUIThreads {
    private JLabel progressStatusLabel, rangeLabel, meanLabel, medianLabel;
    private JButton processButton;

    private void onProcessButtonPress(){

        SwingWorker processWorker = new SwingWorker<List<Float>, Integer>(){

            @Override
            protected List<Float> doInBackground() throws Exception {
                final int RANDOM_NUMS = 10000000;
                List<Float> numbers = new LinkedList<>();
                Random rand = new Random();

                for(int i = 0; i < RANDOM_NUMS; i++){
                    numbers.add(rand.nextFloat());
                    if(i % 100 == 0){
                        publish((int) (i*100.0/RANDOM_NUMS));
                    }
                }

                return numbers;
            }

            @Override
            protected void process(List<Integer> progressPercentage){
                progressStatusLabel.setText("Progress: "+ progressPercentage.get(
                    progressPercentage.size()-1) +"%");
            }

            @Override 
            protected void done(){
                double mean, sum = 0, min, max;

                try {
                    List<Float> numbers = get();
                    Collections.sort(numbers);
                    min = numbers.get(0);
                    max = numbers.get(0);
                    for (float number : numbers){
                        if(number > max){
                            max = number;
                        }
                        if(number < min){
                            min = number;
                        }
                        sum += number;
                    }
                    mean = sum / numbers.size();

                    rangeLabel.setText("Range: ("+ min +", "+ max +")");
                    meanLabel.setText("Mean: "+ mean);
                    medianLabel.setText("Median: "+ numbers.get(numbers.size()/2));
                    
                    
                    progressStatusLabel.setText("Progress: 100%");

                } catch (InterruptedException | ExecutionException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

        };

        processButton.setEnabled(false);
        processWorker.execute();

    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private void createAndShowGUI() {
        //Create and set up the window.
        Container container;
        JFrame frame = new JFrame("Worker Thread Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container = frame.getContentPane();
        container.setLayout(new GridLayout(5, 1));
        container.setPreferredSize(new Dimension(300, 200));

        progressStatusLabel = new JLabel("Progress: 0%");
        container.add(progressStatusLabel);

        rangeLabel = new JLabel("Range: not yet computed");
        container.add(rangeLabel);
        meanLabel = new JLabel("Mean: not yet computed");
        container.add(meanLabel);
        medianLabel = new JLabel("Median: not yet computed");
        container.add(medianLabel);

        processButton = new JButton("Start generating random numbers!");
        container.add(processButton); 

        processButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                onProcessButtonPress();
            }
        });
 


        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUIThreads guiThreads = new GUIThreads();
                guiThreads.createAndShowGUI();
            }
        });
    }
}
