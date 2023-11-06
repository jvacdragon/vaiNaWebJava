package backend.desafio;

public class VogalConsoante {

    public static void main(String[] args) {
        System.out.println(vogalConsoante('U'));
    }
    static String vogalConsoante(char letra){
        switch ((int) letra){
            case 97, 65, 69, 101, 73, 105, 79, 111, 85, 117 -> {
                return "Vogal";
            }
            default -> {
                return "Consoante";
            }
        }
    }
}
