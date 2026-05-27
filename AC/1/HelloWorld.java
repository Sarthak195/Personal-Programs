public class HelloWorld {
    public static void main(String[] args) {
        int[] num={10,20,30,40,50};
        inc(num, 5);
        System.out.println();
        inc(num, -10);
        }
    public static void inc (int[] num, int diff){
        for(int i=0;i<num.length;i++){
            num[i]+=diff;
            System.out.print(num[i]+" ");
            }
        }
    }