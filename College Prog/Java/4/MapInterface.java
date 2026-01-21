import java.util.*;
class MapInterface
{
public static void main(String[] args)
{
HashMap<Integer,String>m1= new HashMap<>();
HashMap<Integer,String>m2= new HashMap<>();
m1.put(22,"Sarthak");
m1.put(19,"Samaksh");
m1.put(05,"Salaj");
m1.put(23,"Sanjana");
System.out.println("Contents of m1:" + m1);
m1.remove(23);
System.out.println("Is 23 present? :" + m1.containsValue("23"));
m1.get(19);
System.out.println("Value of key map is:" + m1.get(19));
m2.putAll(m1);
System.out.println("Contents of new m1:" + m1);
System.out.println("Contents of m2:" + m2);
}
}
