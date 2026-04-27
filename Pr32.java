import java.util.*;

public class Pr32 {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(127);
        rollNumbers.add(086);
        rollNumbers.add(177);

        LinkedList<String> names = new LinkedList<>();
        names.add("yashvi");
        names.add("krisha");
        names.add("shruti");

        System.out.println("Search 127 in rollNumbers: " + searchElement(rollNumbers, 102));
        System.out.println("Search 105 in rollNumbers: " + searchElement(rollNumbers, 105));

        System.out.println("Search yashvi in names: " + searchElement(names, "Alice"));
        System.out.println("Search Mike in names: " + searchElement(names, "Mike"));
    }
}

/*
Output:
Search 127 in rollNumbers: true
Search 105 in rollNumbers: false
Search yashvi in names: true
Search nidhi in names: false
*/
