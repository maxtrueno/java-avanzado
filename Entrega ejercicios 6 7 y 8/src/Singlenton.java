public class Singlenton {
    private static Singlenton instance;

    private Singlenton() {}

    public static Singlenton getInstance() {
        if (instance == null) {
            instance = new Singlenton();
        }
        return instance;
    }

    public String prueba() {
         return "Esto es una prueba de Singlenton";
    }

}
