public interface OutputStream {
    void write(byte b);
    void write(byte[] b);
}

public class FileOutputStream implements OutputStream { /* ... */ }

public abstract class OutputStreamDecorator implements OutputStream {
    protected final OutputStream delegate;

    protected OutputStreamDecorator(OutputStream delegate) {
        this.delegate = delegate;
    }

    public void write(byte b) { delegate.write(b); }
    public void write(byte[] b) { delegate.write(b); }
}

public class BufferedOutputStream extends OutputStreamDecorator {
    public BufferedOutputStream(OutputStream delegate) {
        super(delegate);
    }

    public void write(byte b) {
        // ...
        delegate.write(buffer)
    }
}

new BufferedOutputStream(new FileOutputStream("foo.txt"))
