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
                Arrays.asList("a1", "a2", "a4", "b1", "c2", "c1", "a3");

//        myList
//                .stream()
//                .filter(s -> s.startsWith("c"))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);
//
        myList.stream().filter(s -> s.startsWith("a")).sorted().forEach(System.out::println);

        System.out.println("Lista ma "+myList.stream().count()+" pozycji");

        Arrays.stream(tabela).forEach(System.out::print);

        List <Integer> list2 = Arrays.asList(12,34,12,12,45,56,34,56,45,123,1);
        list2.stream().sorted().forEach(System.out::println );


    }
}
