public class FuncionarioVenda extends Funcionario{
    private double valorTotalVendas = 0.0;

    public FuncionarioVenda(String nome, String email, double salarioBase, 
    String cargo, int valorTotalVendas) {
        super(nome, email, salarioBase, cargo);
    }

    public double getSalarioVendas(){
        return getSalarioBase() + 0.05*getValorTotalVendas();
    }

    public void registraVenda(double valor){
        setValorTotalVendas(valorTotalVendas + valor);
    }

    public double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(double d) {
        this.valorTotalVendas = d;
    }
}
