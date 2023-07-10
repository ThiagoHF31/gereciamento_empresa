public class FuncionarioADM extends Funcionario {
    protected String departamento;

    public FuncionarioADM(String nome, String email, double salarioBase, String cargo) {
        super(nome, email, salarioBase, cargo);
        this.setDepartamento(departamento);
    }

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}