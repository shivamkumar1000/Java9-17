import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

class Question3{
    void implement() {
        IntStream list = IntStream.rangeClosed(1,90);
        list.forEach(System.out::println);
    }
}
class Main3{
    public static void main(String[] args) {
        Question3 ques3 = new Question3();
        ques3.implement();
    }
}