// Write a program to find maximum & minimum number from array
#include <stdio.h> 
int main(){
    int i,n,a[100],min,max;
    printf("Enter size of the array : ");
    scanf("%d",&n);
    printf("Enter elements in array : ");
    for(i=0; i<n; i++){
        scanf("%d",&a[i]);
        }
    min=max=a[0];
    for(i=1; i<n; i++){
        if(min>a[i])
	    min=a[i];   
		if(max<a[i])
	    max=a[i];       
        }
    printf("Minimum and Maximum of array is : %d and %d",min,max);
    return 0;
}