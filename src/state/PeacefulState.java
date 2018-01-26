package state;

public class PeacefulState implements State {
    public PeacefulState(Mammoth mammoth) {


    }

    @Override
    public void onEnterState() {
        System.out.println("calms down");
    }

    @Override
    public void observe() {
        System.out.println(" is calm and peaceful");
    }
}
