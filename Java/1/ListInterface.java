import java.util.*;
class ListInterface{
    public static void main(String[] args) {
        ArrayList<String>l1=new ArrayList<>();
        l1.add("hsuy");
        l1.add("World");
        l1.add("friend");
        l1.remove("friend");
        System.out.println(l1.contains("Hi"));
        for(String i : l1){
            System.out.println(i);
        }
    }
}