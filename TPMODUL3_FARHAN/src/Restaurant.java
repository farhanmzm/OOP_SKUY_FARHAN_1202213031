public class Restaurant implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makefood();
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return foodNumber;
    }

    public void makefood() {
        synchronized(Restaurant.lock) {
            // check if waitingForPickup is true so call method lock.wait() to lock for thread
            // so process not to continue before waiter deliver Food
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting for the Waiter to deliver the Food");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            // to inform another thread that another food is ready to deliver
            waitingForPickup = true;
            System.out.println("Restaurant:  Making Food Number " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the Food\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}