package Assessments;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    static int[] firstArr = {1,3,4,5};
    static int[] secondArr = {2,6,7,8};
    public static void main(String[] args) {

        System.out.println(Arrays.toString(merge(firstArr, secondArr)));
    }

    public static int[] merge(int[] left, int[] right){
        int[] fullArray = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                fullArray[k] = left[i];
                i++;
            } else {
                fullArray[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length){
            fullArray[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            fullArray[k] = right[j];
            k++;
            j++;
        }
        return fullArray;
    }

}
