public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salarioMinimo = 2500;

        //----------------------------------------------------------

        short numeroCurto = 1;
        int numeroNormal1 = numeroCurto;
        short numeroCurto2 = (short) numeroNormal1;

        //----------------------------------------------------------

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.12; // Não pode ser mudado o valor da variavel

    }
}
