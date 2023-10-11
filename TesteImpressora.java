public class TesteImpressora {

    public static void main(String[] args) {
        Impressora epson = new Impressora();
        epson.exibir(2.9f);
        epson.exibir(2.2f, 3.2f);
        epson.exibir(1f, "texto");
        epson.exibir("texto", 1f);
        epson.exibir("t1", "t2", "t3");
        epson.exibir(1, 2, "string");
    }

}
