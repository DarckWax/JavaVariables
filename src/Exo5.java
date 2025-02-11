public class Exo5 {
    public static void main(String[] args) {
        Integer variableReference = null;
        int x = 42 * (variableReference == null ? 1 : 0) + (variableReference != null ? variableReference : 0);

        System.out.println("La valeur dépendante est : " + x);
        System.out.println("(Elle vaut 42 car la variable de référence est null)");
    }
}