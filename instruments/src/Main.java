public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("гитара");
        Drum drum = new Drum("барабан");
        Trumpet trumpet = new Trumpet("труба");

        Instrument[] instruments = {guitar,drum,trumpet};
        for (Instrument instrument:instruments){
            instrument.play();
        }
    }
}
