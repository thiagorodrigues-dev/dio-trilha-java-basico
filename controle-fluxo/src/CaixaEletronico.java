public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        System.out.println("boa noite");

        if (valorSolicitado <= saldo){
            saldo -= valorSolicitado;
            System.out.println("Novo saldo: "+saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}
