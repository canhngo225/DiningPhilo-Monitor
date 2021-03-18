package diningPhiloMonitor;

import javax.swing.JFrame;

public class DiningMonitor {
    public static void main(String[] args){
        // creates a new monitor
        Monitor monitor = new Monitor(5);
        // creates 5 philosophers
        Philosopher[] philosophers = new Philosopher[5];

        Gui frame = new Gui();
		frame.setVisible(true);
        // initializes the philosophers
        System.out.println("Phylosophers come to the table.");
        for(int i = 0; i < philosophers.length; i++){
            philosophers[i] = new Philosopher(i, monitor, frame);
        }

        // joins the thread with each of the philosopher
        for(int i = 0; i < philosophers.length; i++) {
            try {
                philosophers[i].t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           
        }
        System.out.println("Dining has completed");

    }
}