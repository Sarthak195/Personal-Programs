interface Sum{
    int sum(int a, int b);
    }
interface Concat{
    String concat(String s1, String s2);
    }
class Lambda{
    public static void main(String[] args){
    Sum t1=(a,b)->(a+b);
    Concat t2=(s1,s2)->s1+s2;
    System.out.println("Sum: " +t1.sum(10,20));
    System.out.println("Concat: " +t2.concat("Hello, ","friend"));
    }
}
