public class ContaCorrente extends ContaBancaria {
    private double limite;
    private final double TAXA_SAQUE_LIMITE = 5.00; 

    public ContaCorrente(String titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        double saldoDisponivel = getSaldo() + this.limite;
        
        if (valor <= 0 || valor > saldoDisponivel) {
            System.out.println("[ERRO] Saque recusado para " + getTitular() + ": Limite excedido.");
            return false;
        }

        
        if (valor > getSaldo()) {
            ajustarSaldo(getSaldo() - valor - TAXA_SAQUE_LIMITE);
            System.out.println("[ALERTA] Saque utilizou o limite. Tarifa de R$ 5,00 aplicada.");
        } else {
            ajustarSaldo(getSaldo() - valor);
        }
        return true;
    }

    @Override
    public String extrato() {
        return super.extrato() + String.format(" | Cheque Especial: R$ %,.2f", limite);
    }
}
