public class TestaConta {
    public static void main(String[] args){
        Conta contas[] = new Conta[3];

        ContaCorrente cc = new ContaCorrente(22, 3, "Banco 1", 100.00, 1000.00);
        ContaPoupanca cp = new ContaPoupanca(33, 3, "Banco 1", 10.00, 20, 0.05);
        ContaSalario cs = new ContaSalario(44,3,"Banco 1",500.00,4);

        contas[0] = cc;
        contas[1] = cp;
        contas[2] = cs;

        cc.sacar(400);
        //cp.depositar(1000);


        System.out.println("Obtendo o saldo das contas: ");
        for(Conta conta:contas){
            System.out.println(conta);
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
            System.out.println("-------------");
        }

    }
}
