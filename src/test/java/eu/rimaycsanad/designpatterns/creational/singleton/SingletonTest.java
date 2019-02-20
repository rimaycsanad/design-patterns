package eu.rimaycsanad.designpatterns.creational.singleton;

import org.junit.Test;

public class SingletonTest {
    @Test
    public void getInstanceTest() {

        Thread t1, t2;
        t1 = new Thread(){
            @Override
            public void run() {
                this.setName("t1");
                System.out.println(this.getName()+": "+ Singleton.getInstance().toString());
                System.out.println(this.getName()+": "+new NonSingleton().toString());
            }
        };

        t2 = new Thread(){
            @Override
            public void run() {
                this.setName("t2");
                System.out.println(this.getName()+": "+Singleton.getInstance().toString());
                System.out.println(this.getName()+": "+new NonSingleton().toString());
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}