public class main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(500);

        Conta poupanca = new ContaPoupanca();

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
