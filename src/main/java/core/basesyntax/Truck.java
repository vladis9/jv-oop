package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is started!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck is stopped!");
    }
}
