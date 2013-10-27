private volatile Component component;

public Component getComponent() {
    Component result = component;
    if (result == null) {
        synchronized(this) {
            result = component;
            if (result == null) {
                component = result = new Component();
            }
        }
    }
    return result;
}
