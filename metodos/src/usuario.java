public class usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV ligada:? "+smartTv.ligada);
        System.out.println("Canal Atual:? "+smartTv.canal);
        System.out.println("Volume Atual:? "+smartTv.volume);
    }
}
