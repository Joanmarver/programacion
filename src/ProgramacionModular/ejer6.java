package ProgramacionModular;

public class ejer6 {
    public static void main(String[] args) {
        int num=1;
        tablas(num);
    }
    public static void tablas (int num) {
        int result;
        int lol = 1;
        for (int e = 1; e <= 10; e++) {
            System.out.println("tabla del " + lol);
            for (int i = 1 ; i <= 10; i++) {
                result = lol * i;
                System.out.println(result);
            }
         lol++;
        }

    }
}
