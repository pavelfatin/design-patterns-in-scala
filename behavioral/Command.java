public class PrintCommand implements Runnable {
    private final String s;

    PrintCommand(String s) { this.s = s; }

    public void run() {
        System.out.println(s);
    }
}

public class Invoker {
    private final List<Runnable> history = new ArrayList<>();

    void invoke(Runnable command) {
        command.run();
        history.add(command);
    }
}

Invoker invoker = new Invoker();
invoker.invoke(new PrintCommand("foo"));
invoker.invoke(new PrintCommand("bar"));
