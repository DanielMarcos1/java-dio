public class SistemaMedida {
    public static void main(String[] args) {
       /*  String plano = "A";

        switch (plano) {
            case "BASIC":
                System.out.println("100 minutos de ligação");
                break;
            case "MIDIA":
                System.out.println("100 minutos de ligação + whats e insta grátis");
                break;
            case "TURBO":
                System.out.println("100 minutos de ligação + Whats e insta grátis + 5gb yt");
                break;
            default:
                System.out.println("Sem plano");
                break;
        } */

        String plano =  "B"; // T, M or B

            switch (plano) {
                case "T": {
                    System.out.println("5 gb de YT");
                }
                case "M": { 
                System.out.println("Whats e insta grátis");
                }    
                case "B": {
                    System.out.println("100 minutos de ligação");
                }    
                default:
                    break;
            }
    }
}
