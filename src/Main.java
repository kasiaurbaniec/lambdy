

public class Main {
    public static void main(String[] args) {
method("Ala","ma","kota",(s1,s2,s3)->s1.contains("a")&&s2.contains("a")&&s3.contains("a"));
method("Ala","ma","kota",(s1,s2,s3)->s1.startsWith("a")&&s2.startsWith("a")&&s3.startsWith("a"));
method("Ala","ma","kota",(s1,s2,s3)->s1.contains("b")&&s2.contains("b")&&s3.contains("sa"));



    }
    interface MyOwnInteface{
        boolean go(String s1, String s2,String s3);

    }
    static void method(String s1, String s2, String s3, MyOwnInteface myOwnInteface){
        System.out.println(myOwnInteface.go(s1,s2,s3));
    }

}
