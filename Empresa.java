public class Empresa {
    public static void main(String[] args) {
        FuncionarioADM administrador = new FuncionarioADM("João", "joão12@gmail.com",
         3000, "ADM");

        FuncionarioVenda vendedor = new FuncionarioVenda("Thiago", "thiago12@gmail.com",
         2000, "Vendedor", 200);

         vendedor.registraVenda(2000);
         vendedor.getSalarioVendas();
         vendedor.ConsutarSalario();
         System.out.println("____________");
         vendedor.StatusFuncionario();

         administrador.ConsutarSalario();
         administrador.StatusFuncionario();
    }
}
