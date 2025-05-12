public class Funcionario extends Pessoa{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [salario=" + salario + "]";
    }
    
}
