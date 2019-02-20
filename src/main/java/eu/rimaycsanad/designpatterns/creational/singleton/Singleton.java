package eu.rimaycsanad.designpatterns.creational.singleton;

/**
 * Thread safe singleton implementation
 */
public class Singleton {

    private static Singleton singleton;

    public static synchronized Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
