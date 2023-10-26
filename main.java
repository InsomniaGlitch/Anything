import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        Set<notebook> set = new HashSet<>();
        set.add(new notebook("First", 8, "WindowsHP", 70000, "HP"));
        set.add(new notebook("Second", 16, "Windows10", 80000, "Asus"));
        set.add(new notebook("Third", 32, "Linux", 90000, "Lenovo"));
        set.add(new notebook("Fourth", 64, "MacOS", 100000, "Apple"));

        search operation = new search(set);
        operation.start();

    }
}