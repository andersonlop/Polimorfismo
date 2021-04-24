public class ContaPoupanca extends Conta{
    private int diaAniversario;
    private double taxaDejuros;


    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDejuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDejuros = taxaDejuros;
    }

    public double getSaldo(int dia) {
        if (dia >= this.diaAniversario){
            this.saldo = this.saldo + this.saldo*this.taxaDejuros;
            return this.saldo;
        }
        else
            return this.saldo;
    }

    public boolean sacar(double quantia) {
        this.saldo -= quantia;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaDejuros=" + taxaDejuros +
                '}';
    }
}
