package Assessments;

public class FindFirstUnique {

    public static void main(String[] args) {
        int[] array = {9,2,3,3,6,6,2};
        System.out.println(findFirstUniqueElement(array));

    }

    public static int findFirstUniqueElement(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            int count = 0;
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i] == arr[j]) count ++;
            }
            if (count == 1) return arr[i];
            break;
        }


    return 0;
    }
}
