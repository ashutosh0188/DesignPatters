package factory.ex1;

import java.util.Optional;
import java.util.function.Predicate;

public class ComputerFactory {

    public static Optional<Computer> getInstance(Predicate<String> predicate, String ram, String hdd, String cpu) {
        if(predicate.test(COMPUTER_TYPE.PC.name())) {
            return Optional.of(new PC(ram, hdd, cpu));
        }
        else if(predicate.test(COMPUTER_TYPE.SERVER.name())) {
            return Optional.of(new Server(ram, hdd, cpu));
        }
        return Optional.empty();
    }
}
