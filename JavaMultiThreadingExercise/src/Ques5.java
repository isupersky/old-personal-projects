//Ques 5: Write a program to demonstrate wait and notify methods.

import java.util.Scanner;

public class Ques5 {
    public void produce() throws InterruptedException
    {
        synchronized (this)
        {
            System.out.println("Producer thread running..");
            wait();
            System.out.println("Resumed..");
        }
    }


    public void consumer() throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this)
        {
            System.out.println("Waiting for return key...");
            sc.nextLine();
            System.out.println("Return Key pressed...");
            notify();
            Thread.sleep(5000);
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        Ques5 processor = new Ques5();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    processor.produce();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    processor.consumer();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }
}