public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Integers
        byte javaIntermediario = 1; // 1 byte
        short javaAvancado = 2; // 2 bytes 
        int javaInt = 4; // 4 byte
        long javaPro = 8L; // 8 bytes
        // Decimals
        float javaFloat = 4.00F; // 4 bytes
        double javaDouble = 8.00; // 8 bytes

        // Strong type breaking the code 
        short numeroCurto = 1;
        int numeroNormal = numeroCurto; // Ok an integer should store a short as it has range of memory to cover.
        //short numeroNormal2 = numeroNormal; // Oops, the short type can't store the int range.
        short numeroNormal2 = (short) numeroNormal; // Here I cast the type, telling the compiler my int value is also a short.
    
        final String JAVA_CONSTANT = "final"; // Constantes em Java são escritos em letra maiúscula e tipo "final".
        
    }
}
