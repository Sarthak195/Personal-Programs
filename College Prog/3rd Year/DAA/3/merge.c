#include<stdio.h>
#include<stdlib.h>
#include<time.h>

#define INPUTS 10

void generateRandomNumbers(int arr[],int size){
    for(int i=0;i<size;i++)
        arr[i]=rand()%10000;
}

void merge(int arr[],int left,int mid,int right){
    int n1=mid-left+1;
    int n2=right-mid;

    int *leftArr=(int*)malloc(n1*sizeof(int));
    int *rightArr=(int*)malloc(n2*sizeof(int));

    for(int i=0;i<n1;i++)
        leftArr[i]=arr[left+i];

    for(int j=0;j<n2;j++)
        rightArr[j]=arr[mid+1+j];

    int i=0,j=0,k=left;

    while(i<n1 && j<n2){
        if(leftArr[i]<=rightArr[j])
            arr[k++]=leftArr[i++];
        else
            arr[k++]=rightArr[j++];
    }

    while(i<n1)
        arr[k++]=leftArr[i++];

    while(j<n2)
        arr[k++]=rightArr[j++];

    free(leftArr);
    free(rightArr);
}

void mergeSort(int arr[],int left,int right){
    if(left<right){
        int mid=left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
}

void checkProgramWithSize(int size){
    int *arr=(int*)malloc(size*sizeof(int));
    clock_t start,end;
    double cpu_time_used;

    generateRandomNumbers(arr,size);

    start=clock();
    mergeSort(arr,0,size-1);
    end=clock();

    cpu_time_used=((double)(end-start))/CLOCKS_PER_SEC;

    printf("%d, %f\n",size,cpu_time_used);

    free(arr);
}

int main(){
    srand(time(NULL));

    printf("No of Inputs, Merge Sort - time (sec)\n");

    for(int i=1;i<=INPUTS;i++)
        checkProgramWithSize(i*10000);

    return 0;
}