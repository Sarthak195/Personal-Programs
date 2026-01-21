import java.util.*;
class Wildcard
{
public static void main (String[] args)
{
List <Integer>list1=Arrays.asList(1,2,3,4,5);
System.out.println("total sum is:"+sum(list1));

List <Integer>list2=Arrays.asList(23, 22, 7454, 3675, 55);
System.out.println("total sum is:"+sum(list2));
}
private static double sum(List <?>list)
{
double sum=0.0;
for(Object i:list)
 if(i instanceof Number)
{
sum += ((Number) i).doubleValue();
}
return sum;
}
}