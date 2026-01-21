import java.util.Random;

public class A1LinearSearch {

    static final int INPUTS = 20;

    static void generateRandomNumbers(int[] arr,int maxVal,Random rand){
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(maxVal);
        }
    }

    static int linearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    static void checkProgramWithSize(int size){
        int[] arr=new int[size];
        Random rand=new Random();

        generateRandomNumbers(arr,size,rand);
        int key=rand.nextInt(size);

        long start=System.nanoTime();
        linearSearch(arr,key);
        long end=System.nanoTime();

        double timeTakenMs=(end-start)/1_000_000.0;
        System.out.println(size+", "+timeTakenMs);
    }

    public static void main(String[] args){
        System.out.println("No of Inputs, Time (ms)");
        for(int i=1;i<=INPUTS;i++){
            checkProgramWithSize(i*10000);
        }
    }
}
