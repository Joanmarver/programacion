package Objetos;


    public class claseejer1 {
        public static void main(String[] args) {

            // Crear un reloj usando el constructor vacío
            Reloj reloj1 = new Reloj();
            reloj1.mostrarHora(); // Muestra la hora por defecto (00:00:00)

            // Configurar la hora usando setters
            reloj1.setHoras(10);
            reloj1.setMinutos(45);
            reloj1.setSegundos(30);
            reloj1.setFormato24Horas(false);
            reloj1.mostrarHora();

            // Crear un reloj usando el constructor con parámetros
            Reloj reloj2 = new Reloj(23, 59, 59);
            reloj2.mostrarHora(); // Muestra la hora en formato 24 horas

            // Intentar usar valores no válidos
            reloj2.setHoras(25);
            reloj2.setMinutos(60);
            reloj2.setSegundos(-1);

            // Mostrar la representación de los relojes con toString()
            System.out.println(reloj1);
            System.out.println(reloj2);
        }
    }

