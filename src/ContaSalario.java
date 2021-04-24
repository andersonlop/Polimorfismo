public class ContaSalario extends Conta{
    private int limiteSaques;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteSaques) {
        super(numero, agencia, banco, saldo);
        this.limiteSaques = limiteSaques;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaSalario{" +
                "limiteSaques=" + limiteSaques +
                '}';
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean sacar(double quantia){
        if (quantia>saldo){
            return false;
        }
        else {
            if (this.limiteSaques >0 ){
                this.limiteSaques--;
                this.saldo -= quantia;
                return true;
            }
            else {
                System.out.println("Limite de saques exedido.");
                return false;
            }
        }
    }

}
