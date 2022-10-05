class Question1 implements myInterface{
    public void mult(int a,int b){
        System.out.println(a*b);
    }
    void implement(){
        Question1 q = new Question1();
        q.mult(2,3);
        q.perform();
    }
}
@FunctionalInterface
interface myInterface{
    public void mult(int a,int b);
    public default void perform(){
        add(8,9);
        System.out.println("Private method inside interface");
    }
    private void add(int a,int b){
        System.out.println(a+b);
    }
}
class Main1{
    public static void main(String[] args) {
        Question1 ques1 = new Question1();
        ques1.implement();
    }
}