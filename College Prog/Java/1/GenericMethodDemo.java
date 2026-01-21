// Program to demonstrate a generic method
class Test1 {
    // Generic method
    public static <T> void generic(T obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        generic(10);        
        generic("Hello");   
        generic(10.0);      
    }
}
