import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int numero1 = 0;
        int numero2 = 0;
        int dado1 = 0;
        int dado2 = 0;
        int suma1 = 0 ;
        int suma2 = 0;

        System.out.println("Ejercicio del dado");


        do {
            numero1 = aleatorio.nextInt(6) + 1;
            numero2 = aleatorio.nextInt(6) + 1;

            dado1 = numero1;
            dado2 = numero2;


            suma1= suma1 + dado1;
            suma2= suma2 + dado2;


            System.out.println("  dado1:" + dado1);
            System.out.println("  dado2:" + dado2);


        } while (dado1 != dado2);


        System.out.println(" la suma del  primer dado es :" + suma1);

        System.out.println(" la suma del segundo dado es :" + suma2);

        if(suma1 > suma2) {
            System.out.println(" el ganador es el dado 1:");
        }else if (suma2 > suma1) {
            System.out.println("el ganador es el 2:");
        }

    }
}



