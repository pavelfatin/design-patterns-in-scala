public abstract class EventHandler {
    private EventHandler next;

    void setNext(EventHandler handler) { next = handler; }

    public void handle(Event event) {
        if (canHandle(event)) doHandle(event);
        else if (next != null) next.handle(event);
    }

    abstract protected boolean canHandle(Event event);
    abstract protected void doHandle(Event event);
}

public class KeyboardHandler extends EventHandler { // MouseHandler...
    protected boolean canHandle(Event event) {
        return "keyboard".equals(event.getSource());
    }

    protected void doHandle(Event event) { /* ... */ }
}

KeyboardHandler handler = new KeyboardHandler();
handler.setNext(new MouseHandler());
