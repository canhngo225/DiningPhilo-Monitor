package diningPhiloMonitor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Monitor {
    private final int numOfPhil;
    final Lock lock;
    private enum States{HUNGRY, THINKING, EATING};
    private States[] state;
    private Condition[] self;

    public Monitor(int numOfPhil) {
        this.numOfPhil = numOfPhil;
        // creates a new reentrant lock
        lock = new ReentrantLock();
        // sets the states to the number of philosophers
        state = new States[numOfPhil];
        // creates a new condition for the amount of philosophers
        self = new Condition[numOfPhil];
        // initializes the state of each philosopher
        // sets the conidion of each philosopher
        initialize();
    }

    // helper method that initializes the variables
    private void initialize(){
        for(int i = 0; i < numOfPhil; i++){
            // sets the state to thinking
            state[i] = States.THINKING;
            // locks the condition
            self[i] = lock.newCondition();
        }
    }

    public void pickup_forks(int philosopher_number) throws InterruptedException {
        // initial state of the fork is locked
        lock.lock();
        try {
            // sets the state of the philosopher number to hungry
            state[philosopher_number] = States.HUNGRY;
            test(philosopher_number);
            if (state[philosopher_number] != States.EATING) {
                self[philosopher_number].await();
            }
        }finally {
            // finally is unlocked
            lock.unlock();
        }
    }

    // helper method
    private void test(int philosopher_number){
        if ((state[(philosopher_number + 4) % 5] != States.EATING) &&
                (state[philosopher_number] == States.HUNGRY) &&
        (state[(philosopher_number + 1) % 5] != States.EATING)){
            // the philosopher is eating
            state[philosopher_number] = States.EATING;
            
            // signal
            self[philosopher_number].signal();
        }
    }

    public void return_forks(int philosopher_number){
        // starts off locked
        lock.lock();
        try{
            // checks to see if the state of the current philosopher is thinking
            state[philosopher_number] = States.THINKING;
            // tests the neighbor philosophers
            test((philosopher_number + 4) % 5);
            test((philosopher_number + 1) % 5);
        }finally {
            // finally unlocks the fork
            lock.unlock();
        }
    }
}