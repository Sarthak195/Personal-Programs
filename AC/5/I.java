/*
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1
*/
public class I {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            int k=(i+2)%2;
            for(j=1;j<=i;j++){
                System.out.print(k+" ");
                k=((k+1)%2);       
        }
        System.out.println("");
    }
}
}