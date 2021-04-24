public class TestaConta {
    public static void main(String[] args){
        Conta contas[] = new Conta[3];

        ContaCorrente cc = new ContaCorrente(22, 3, "Banco 1", 100.00, 1000.00);
        ContaPoupanca cp = new ContaPoupanca(33, 3, "Banco 1", 100.00, 20, 0.05);
        ContaSalario cs = new ContaSalario(44,3,"Banco 1",500.00,4);

        System.out.println(cp);
        cp.depositar(400);
        System.out.println(cp);
        System.out.println("O saldo atual é: "+ cp.getSaldo(25));

    }
}
