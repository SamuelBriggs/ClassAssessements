package Assessments;

public class BinaryToDecimla {

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(1101));
    }

    public static int binaryToDecimal(int number){
        int additional = 1;
        int remainder = number;
        int solution = 0;

        while (remainder!=0){
            int modulo = remainder % 10;
            solution += modulo * additional;
            remainder = remainder / 10;
            additional = additional * 2;
        }
        return solution;
    }
}
