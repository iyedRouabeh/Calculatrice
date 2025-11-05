public class Operation {
    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b;
    }

    public static double division(double a, double b) {
    if (b != 0) {
        return a / b;
    } else {
        System.out.println("Erreur : division par zéro !");
        return 0;
    }
}

}
