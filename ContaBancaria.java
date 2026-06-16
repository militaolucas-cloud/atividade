public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    
    
    protected void ajustarSaldo(double valor) {
        this.saldo = valor;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("[DEPÓSITO] R$ " + valor + " adicionado à conta de " + titular);
        }
    }

   
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public String extrato() {
        return String.format("Cliente: %-15s | Saldo Atual: R$ %,.2f", titular, saldo);
    }
}
