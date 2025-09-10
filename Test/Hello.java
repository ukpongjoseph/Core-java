// There can be only one public class per package/file
public class Hello{
    public static void main(String arg[]){
        System.out.println("Hello world");
        Demo sum = new Demo();
        int result = sum. add(4,5);
        System.out.println(result);
    }
}

class Demo{
    String name;
    public int add(int n1, int n2){
        return n1 + n2 ;

    }
}