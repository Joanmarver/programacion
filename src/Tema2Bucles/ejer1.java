package Tema2Bucles;

public class ejer1 {
    public static void main(String[] args) {
    int nummin = 1;
    int nummax = 1000;
    int cant = 1000;
        for (int i = 1; i < cant ; i++) {
            if (nummin % 2 == 0) {
                System.out.println(nummin);
            }

        }

    while (nummin < nummax) {
        if (nummin % 2 == 0) {
            System.out.println(nummin);
            nummin = nummin + 1;
        } else {
            nummin = nummin + 1;
        }
    }
    }
}
