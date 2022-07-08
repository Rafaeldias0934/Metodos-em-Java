public class Calculadora {

    public static void soma(int numero1, int numero2) {

        int resultado = numero1 + numero2;

        System.out.println("a soma de " + numero1 + " mais " + numero2 + " é igual a: " + resultado);
    }
    public static void subtracao(int numero1, int numero2) {

        int resultado = numero1 - numero2;

        System.out.println("a subtracao de " + numero1 + " menos " + numero2 + " é igual a: " + resultado);
    }

    public static void multiplicacao(int numero1, int numero2) {

        int resultado = numero1 * numero2;

        System.out.println("a multiplicacao de " + numero1 + " vezes " + numero2 + " é igual a: " + resultado);
    }

    public static void divisao(int numero1, int numero2) {

        int resultado = numero1 / numero2;

        System.out.println("a divisao de " + numero1 + " por " + numero2 + " é igual a: " + resultado);
    }
}
