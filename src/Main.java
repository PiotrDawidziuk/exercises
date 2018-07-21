import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String [] tabela = {"text1", "text2", "text3"};

        for (String text: tabela) {
            System.out.println(text);
        }

//        String s = "text";
//
//        System.out.println(s);
//
//        s = "text2";
//
//        System.out.println(s);


        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

//        myList
//                .stream()
//                .filter(s -> s.startsWith("c"))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);
//
        myList.stream().forEach(System.out::println);


    }
}
