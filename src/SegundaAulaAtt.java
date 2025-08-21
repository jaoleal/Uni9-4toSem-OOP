public class SegundaAulaAtt {
    /* The program needs to:
        - read 3 integers
        - print them separated by '-'
        - show its sum
        - show its sub
    */
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Por favor insira os tres numeros para as operacoes");
        }

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        
        System.out.println("Numbers: " + n1 + "-" +  n2 + "-" + n3);

        // Showing their sum
        System.out.println("Sum: " + (n1 + n2 + n3));
        // Showing their sub
        System.out.println("Subtraction: " + (n1 - n2 - n3));
    }
}
