public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 26;

        if(valorSolicitado < saldo) {
        saldo = saldo - valorSolicitado;

        System.out.println("Saldo atual: " + saldo);
        }
        else {
        System.out.println("Saldo insuficiente seu pobre");
        }
    }
}
