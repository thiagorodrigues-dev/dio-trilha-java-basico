public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "TURBO";

        switch (plano){
            case "BASIC":
                System.out.println("Seu plano: BASIC | Beneficios: 100 minutos de ligação");
                break;
            case "MIDIA":
                System.out.println("Seu plano: MIDIA | Beneficios: 100 minutos de ligação + Whats e Instagram grátis");
                break;
            case "TURBO":
                System.out.println("Seu plano: TURBO | Beneficios: 100 minutos de ligação + Whats e Instagram grátis + 5Gb Youtube");
                break;
            default:
                System.out.println("Plano indefinido");
                break;
        }
    }
}
