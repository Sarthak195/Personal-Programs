/* Butterfly
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
*/
public class A {
    public static void main(String[] args) {
        int i,j,k;
        for(i=0;i<=3;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
                }
            for(k=0;j+k<4;k++){
                System.out.print("  ");
                }
            for(j=0;j<=i;j++){
                System.out.print("*");
                }
            System.out.println("");
            }
        for(i=0;i<=3;i++){
            for(j=4;j>i;j--){
                System.out.print("*");
                }
            for(k=4;j+k>4;k--){
                System.out.print("  ");
                }
            for(j=4;j>i;j--){
                System.out.print("*");
                }      
            System.out.println("");
        }
    }
}