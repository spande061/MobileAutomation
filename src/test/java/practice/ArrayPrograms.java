package practice;

import org.testng.annotations.Test;


public class ArrayPrograms {

    public static void main(String[] args) {


        int a[] = {22, 21, 32, 12, 9, 14};

        int x = a.length;
// for odd & even numbers
//        for(int i=0;i<x;i++){
//            if(a[i]%2==0){
//                System.out.println(a[i]+ "number is even");
//            }else{
//                System.out.println(a[i]+" number is odd");
//            }
//        }
        //---------------------------------------------------------------

        // for greter and smaller number
//        int max = a[0];
//
//        for (int i = 0; i < x; i++) {
//            if (a[i] > max) {
//                max = a[i];
//
//            }
//        }
//        System.out.println("maximum number is " + max);

        //reverse the array

//        for(int i=x-1;i>0;i--){
//            System.out.print(a[i]+" ");
//        }
        //sum of array


//        int sum=0;
//        for(int i=0;i<x;i++){
//            sum +=a[i];
//
//        }
//        System.out.println("sum of all array is "+ sum);

        //avarage
        double sum=0;
        double avg =0;
        for(int i=0;i<x;i++){
            sum +=a[i];

        }
        System.out.println(sum);
        avg=sum/x;
        System.out.println(avg);


    }
}
