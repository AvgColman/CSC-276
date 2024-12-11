public interface Playable {
    void play();
}
//superclass
public abstract class Instrument {
    protected String name;
    public Instrument(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
//playable guitar
public class Guitar extends Instrument implements Playable {
    public Guitar() {
        super("Guitar");
    }
    @Override
    public void play() {
        System.out.println("Strumming the Guitar");
    }
}
//playable piano
public class Piano extends Instrument implements Playable {
    public Piano() {
        super("Piano");
    }
    @Override
    public void play() {
        System.out.println("Playing the Piano");
    }
}
//playable drums
public class Drums extends Instrument implements Playable {
    public Drums() {
        super("Drums");
    }
    @Override
    public void play() {
        System.out.println("Beating the Drums");
    }
}
//nonplayable bass
public class Bass extends Instrument {
    public Bass() {
        super("Bass");
    }
}
//musicstore
public class MusicStore {
    public void showcase(Instrument instrument) {
        System.out.println(instrument);
        if (instrument instanceof Playable) {
            ((Playable) instrument).play();
        } else {
            System.out.println("This instrument is not playable.");
        }
    }
}
//main class for testing
public class Main {
    public static void main(String[] args) {
        MusicStore store = new MusicStore();
        Instrument[] instruments = {
            new Guitar(), new Piano(), new Drums(), new Bass()
        };
        for (Instrument instrument : instruments) {
            store.showcase(instrument);
        }
    }
}
