import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Demo {

    public static void main(String[] args) throws IOException {
//        String[] names = {"Sean", "Davis", "Cara", "Mike", "McTina", "David", "Marlys", "Marsi"};
//        Arrays.stream(names)
//                .filter(x -> x.startsWith("M"))
//                .sorted()
//                .forEach(System.out:: println);


        List<String> list = new ArrayList<String>();
        list.add("one"); list.add("two"); list.add("three");

        Integer x = list.indexOf("five");

        System.out.println(list.get(x));
    }


}
