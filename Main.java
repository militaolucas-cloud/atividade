public class Main {
    public static void main(String[] args) {
      
        ContaCorrente cc = new ContaCorrente("Carlos Eduardo", 300.00, 500.00);
        ContaPoupanca cp = new ContaPoupanca("Ana Beatriz", 2500.00, 0.65); // 0.65% ao mês

        System.out.println("=== TESTANDO OPERAÇÕES BANCÁRIAS ===");
        
        cc.sacar(400.00); 
        
        cp.renderJuros();

       
        ContaBancaria[] portfolioContas = { cc, cp };

        System.out.println("\n=== EXTRATOS CONSOLIDADOS (POLIMORFISMO) ===");
        for (ContaBancaria conta : portfolioContas) {
            System.out.println(conta.extrato());
        }
    }
}
