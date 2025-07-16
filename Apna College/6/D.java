/*
   1
   212
  32123
 4321234
543212345
*/
public class D {
    public static void main(String[] args) {
        int i,j,k;
        for(i=0;i<6;i++){
            for(j=5;j>i;j--){
                System.out.print(" ");
                }
            for(k=j;k>0;k--){
                System.out.print(k);
                }
            for(j=2;j<=i;j++){
                System.out.print(j);
                }
            System.out.println();
        }
    }
    
}
