import java.util.ArrayList;
import java.util.*;
import java.util.List;

class Question2{
    void implement(){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        Set<Integer> set= Set.of(10,20,30,40,50);
        System.out.println("Performing takewhile:");
        list.stream()
                .takeWhile(e-> e%2!=0)
                .forEach(System.out::println);

        System.out.println("using dropwhile:");
        set.stream()
                .dropWhile(e-> e%2!=0)
                .forEach(e-> System.out.println(e));

    }
}
class Main2{
    public static void main(String[] args) {
        Question2 ques2 = new Question2();
        ques2.implement();
    }
}