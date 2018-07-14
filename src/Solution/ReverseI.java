package Solution;

import java.util.Arrays;

public class ReverseI {
    public static int[] reverseI(int[] arr){
        int[] newArray = new int[arr.length];
        int j = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            newArray[i] = arr[j];
            j--;
        }
        return newArray;
    }
    public static void main(String[] args){
        int[] array = new int[] {1, 2, 6, 7, 9, 22, 33, 55, 66, 999};
        System.out.println(Arrays.toString(reverseI(array)));
    }
}
