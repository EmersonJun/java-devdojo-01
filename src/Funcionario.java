public class Funcionario extends Pessoa{
    private int salario;

    public Funcionario(String nome){
        super(nome);
    }
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public void relatorioDePagamento(){
        System.out.println("eu: "+ this.nome + "ganho: " +this.salario);
    }
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
