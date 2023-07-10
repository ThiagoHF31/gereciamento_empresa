public class Funcionario {
    private String nome;
    private String email;
    protected double salarioBase;
    public String cargo;

    public Funcionario(String nome, String email, double salarioBase, String cargo) {
        this.nome = nome;
        this.email = email;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public void ConsutarSalario(){
        System.out.println();
        System.out.println("O salario é: "+getSalarioBase());
    }

    public void StatusFuncionario(){
        System.out.println("_____________________________________");
        System.out.println("Nome: "+getNome());
        System.out.println("Email: "+getEmail());
        System.out.println("Salario base: "+getSalarioBase());
        System.out.println("Cargo: "+getCargo());
        System.out.println("_____________________________________");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
