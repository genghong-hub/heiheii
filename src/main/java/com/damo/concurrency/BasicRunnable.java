package main.java.com.damo.concurrency;

public class BasicRunnable implements  Runnable{

        @Override
        public void run() {
            System.out.println("THREAD START " +Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
                Processing();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("THREAD END " +Thread.currentThread().getName());
        }

        private void Processing() throws InterruptedException {
            System.out.println("PROCESSING...");
            Thread.sleep(5000);
        }


        public static void main(String[] args) {
            Thread t1=new Thread(new BasicRunnable(),"t1");
            Thread t2=new Thread(new BasicRunnable(),"t2");

            System.out.println("sarting threads");
            t1.start();
            t2.start();
            System.out.println("runnable threads has been started");

            System.out.println("starting threads");
            Thread t3=new BasicThread();
            Thread t4=new BasicThread();
            t3.start();
            t4.start();
            System.out.println("runnable threads has been started");

        }

}
