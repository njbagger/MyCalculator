public class MyCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Resultat: " + String.valueOf(calculator.add(Double.parseDouble(args[0]), Double.parseDouble(args[1]))));
    }
}