public class TesteCalculadoraCientifica {

    public static void main(String[] args) {
        CalculadoraCientifica hp = new CalculadoraCientifica();
        System.out.println(hp.raiz(16));
        System.out.println(hp.raiz(3.1415926535));
        System.out.println(hp.raiz("100"));
        byte a = 2;
        byte b = 3;
        System.out.println(hp.potencia(a, b));
        System.out.println(hp.potencia("2", "10"));
        int i = 3;
        double d = 3.5;
        System.out.println(hp.potencia(i, d));
    }
}
