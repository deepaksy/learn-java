package innerclass;
class JavaOuterClass{
    private int data=30;
    class JavaInnerClass{
        void msg(){
            System.out.println("Data is: "+data);
        }
    }
}

public class Innerclass{
    public static void main(String[] args) {
        JavaOuterClass obj= new JavaOuterClass();
        JavaOuterClass.JavaInnerClass obj1 = obj.new JavaInnerClass();
        obj1.msg();
    }
}