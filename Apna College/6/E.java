/* 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     *
 */
public class E {
    public static void main(String[] args) {
        int i,j,k;
        for (i=1;i<6;i++){
            for(j=0;i+j<5;j++){
                System.out.print(" ");
                }
            for(k=1;k<=2*i;k+=2){
                System.out.print("* ");
                }
            System.out.println();
            }
            for (i=1;i<6;i++){
            for(j=0;i+j>0;j--){
                System.out.print(" ");
                }
            for(k=10;k>=2*i;k-=2){
                System.out.print("* ");
                }
            System.out.println();
            }
        }
    
}
