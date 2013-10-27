public class Cat implements Runnable {
    private static final Cat instance = new Cat();
 
    private Cat() {}
 
    public void run() {
        // do nothing
    }

    public static Cat getInstance() {
        return instance;
    }
}

Cat.getInstance().run()
