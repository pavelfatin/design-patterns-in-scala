public interface Sound {
    void play();
}

public class Music implements Sound {
    public void play() { /* ... */ }
}

public class NullSound implements Sound {
    public void play() {}
}

public class SoundSource {
    public static Sound getSound() {
    	return available ? music : new NullSound();
    }
}

SoundSource.getSound().play();
