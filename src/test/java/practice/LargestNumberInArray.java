package practice;

public class LargestNumberInArray {

    public static void main(String[] args) {
        int a[] = {18, 12, 23, 78, 59};
        int max=a[0];
        int secmax =a[0];

       for(int i=0;i<a.length;i++){
           if(a[i]>max){
               secmax=max;
               max=a[i];
           } else if (a[i]>secmax) {
               secmax=a[i];


           }
       }
        System.out.println("1st high value " + max);
        System.out.println("2nd max value " + secmax);
    }
}
