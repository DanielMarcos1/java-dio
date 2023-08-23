public class Classe {
// Classes são nomeadas com letra maiúscula ex: MinhaClasse
// Variáveis com camelCase ex: minhaVariavel
public static void main(String [] args) {
    String primeiroNome = "Daniel";
    String segundoNome = "Marcos";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.print(nomeCompleto);

}
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
}
}
