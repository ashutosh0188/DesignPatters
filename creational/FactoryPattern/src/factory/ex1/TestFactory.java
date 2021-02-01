package factory.ex1;

import java.util.Optional;

public class TestFactory {
    public static void main(String[] args) {
        Optional<Computer> computer = ComputerFactory
                .getInstance(v -> v.equals(COMPUTER_TYPE.PC.name()), "2GB", "500GB", "4");
        System.out.println(computer.get());

        Optional<Computer> computer1 = ComputerFactory
                .getInstance(v -> v.equals(COMPUTER_TYPE.SERVER.name()), "8GB", "1TB", "6");
        System.out.println(computer1.get());
    }
}
