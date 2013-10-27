public interface Strategy {
    int compute(int a, int b);
}

public class Add implements Strategy {
    public int compute(int a, int b) { return a + b; }
}

public class Multiply implements Strategy {
    public int compute(int a, int b) { return a * b; }
}

public class Context  {
    private final Strategy strategy;

    public Context(Strategy strategy) { this.strategy = strategy; }

    public void use(int a, int b) { strategy.compute(a, b); }
}

new Context(new Multiply()).use(2, 3);
