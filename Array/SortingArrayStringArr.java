package Array;

import java.util.Arrays;

// import java.util.Arrays;

public class SortingArrayStringArr {
    // public static void main(String[] args) {
    //     int arr[]={1,23,4,45,6};
    //     // for(int i=0;i<arr.length-1;i++){
    //     //     for(int j=0;j<arr.length-1;j++){
    //     //         if(arr[j]>arr[j+1]){
    //     //             int temp=arr[j];
    //     //             arr[j]=arr[j+1];
    //     //             arr[j+1]=temp;
    //     //         }
    //     //     }
    //     // }
    //     Arrays.sort(arr);// Using BulidIn Function
    //     for (int i : arr) {
    //         System.out.print(i+" ");
    //     }
    // }

    public static void main(String[] args) {
        String str[]={"EKTA","Shlok","Abhishek","Riya","Abhigya"};
        Arrays.sort(str);
        for (String string : str) {
            System.out.println(string);
        }
    }
}
