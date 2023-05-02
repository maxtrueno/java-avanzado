public class Main {
    public static void main(String[] args) {
        Singlenton singlenton = Singlenton.getInstance();
        Singlenton singlenton2 = Singlenton.getInstance();

        //No es posible
        //Singlenton singlenton3 = new Singlenton();




        System.out.println(singlenton2.prueba() + "soy el singleton: " + singlenton2);
        System.out.println(singlenton.prueba() + "soy el singleton: " + singlenton);
    }
}