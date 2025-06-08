public class Operadores {

    public static void main(String[] args) {
        String nome1 = "Gleison";
        String nome2 = new String("Gleison");

        System.out.println(nome1.equals(nome2));



        int numero1 = 1;
        int numero2 = 2;

        if (numero1 < numero2) {
            System.out.println("A nossas condição é verdadeira");
        }

        boolean simNao = numero1 == numero2;

        System.out.println("N1 é igual a n2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("N1 é igual a n2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("N1 é igual a n2? " + simNao);

    }
}
