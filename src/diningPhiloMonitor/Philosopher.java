package diningPhiloMonitor;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class Philosopher implements Runnable{
    private int philNumber;
    private Monitor monitor;
    private Gui frame;
    Random rand;
    Thread t;

    public Philosopher(int philNumber, Monitor monitor, Gui frame){
        this.philNumber = philNumber;
        this.monitor = monitor;
        this.frame = frame;
        rand = new Random();
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        //  10 seconds
        long end = System.currentTimeMillis() + 10000;
        while(System.currentTimeMillis() < end) {
            try{
              
            	hungry();
            	monitor.pickup_forks(philNumber);
            	frame.changeColourToRed_Chop(philNumber+1);
            	eat();
            	frame.changeColourToPink_Chop(philNumber+1);
            	monitor.return_forks(philNumber);
            	thinking();
            }catch(InterruptedException x){
                x.printStackTrace();
            }
        }
       
     
    }

  
    private void eat() throws InterruptedException {
    	frame.changeColourToRed(philNumber+1);
    	//frame.changeColourToRed_Chop(philNumber+1);
    
        System.out.println( "Philosopher " + (philNumber + 1) + ": is eating");
        int time = rand.nextInt(4) + 1;
        TimeUnit.SECONDS.sleep(time);
        
        
     
    }

    private void hungry() throws InterruptedException {
    	frame.changeColourToBlue(philNumber+1);
        System.out.println( "Philosopher " + (philNumber + 1) + ": is hungry");
        int time = rand.nextInt(4) + 1;
        TimeUnit.SECONDS.sleep(time);
    }

    private void thinking() throws InterruptedException {
    	frame.changeColourToBlack(philNumber+1);
    	//frame.changeColourToPink_Chop(philNumber+1);
        System.out.println("Philosopher " + (philNumber + 1) + ": is thinking");
        int time = rand.nextInt(4) + 1;
        TimeUnit.SECONDS.sleep(time);
        
     
    }

}