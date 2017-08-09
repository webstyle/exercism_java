import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Signal> signals = new ArrayList<Signal>();

        signals.add(Signal.JUMP);
        signals.add(Signal.DOUBLE_BLINK);


        for (int i = 0; i < signals.size(); i++) {
            signals.set(i, Signal.WINK);
        }

        System.out.println(signals);
    }
}
