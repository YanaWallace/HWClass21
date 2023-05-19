package HWClass21;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers = new Computer[4];
        computers[0] = new Apple("MacBook Pro", 1299);
        computers[1] = new Lenovo("ThinkPad X1 Carbon", 1499);
        computers[2] = new HP("EliteBook x360", 1799);
        computers[3] = new Dell("XPS 13", 1199);

        for (Computer computer : computers) {
            computer.turnOn();
            computer.printSpecs();
            computer.turnOff();
            if (computer instanceof Apple) {
                ((Apple) computer).runXcode();
            }
            System.out.println();
        }
    }
}
