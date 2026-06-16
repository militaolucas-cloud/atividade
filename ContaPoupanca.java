public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldoInicial, double taxaRendimento) {
        super(titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void renderJuros() {
        if (getSaldo() > 0) {
            double juros Gerados = getSaldo() * (taxaRendimento / 100);
            depositar(jurosGerados);
            System.out.println("[POUPANÇA] Rendimento mensal aplicado: R$ " + String.format("%.2f", jurosGerados));
        } else {
            System.out.println("[AVISO] Conta sem saldo para render juros.");
        }
    }

    @Override
    public String extrato() {
        return super.extrato() + String.format(" | Rentabilidade: %.2f%% a.m.", taxaRendimento);
    }
}
