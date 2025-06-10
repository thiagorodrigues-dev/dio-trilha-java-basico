public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("---operacao ternaria---");

        //operacao ternaria
        int nota2 = 7;
        String resultado = nota2 >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        System.out.println("----mais um exemplo de operacao ternaria----");
        String resultado2 = nota2 >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado";
    }
}
