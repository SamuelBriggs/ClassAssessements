package Assessments;

public class PrintValueOfPy {

    public static void main(String[] args) {
        double pi = 0;
        double numerator = 4;
        double denominator = 1;
        double division = 0;
        int count = 0;
        for (int i = 0; i < 20 ; i++) {
            division = (numerator/denominator) - (numerator/denominator+2);
            System.out.println(division);
            pi += division;
            denominator += 2;
            count ++;
            System.out.println(denominator);
        }
        String newPi = pi + " ";
        if (newPi.startsWith("3.14159")) System.out.println(count);
        System.out.println(pi);

    }
}
