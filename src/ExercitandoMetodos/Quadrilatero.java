package ExercitandoMetodos;

public class Quadrilatero {

    public static double area(double base) {

        return base * base;
    }

    public static double area(double baseA, double baseB) {

            return baseA * baseB;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

            return ((baseMaior + baseMenor) * altura) / 2;
    }
}
