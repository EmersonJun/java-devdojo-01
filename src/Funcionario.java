public class Funcionario extends Pessoa{
    private int salario;
    static{
        System.out.println("dentro do bloco de inicializacao estatico funcionario");
    }
    {
        System.out.println("dentro do bloco de inicializacao funcionario 1");
    }
    {
        System.out.println("dentro do bloco de inicializacao funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("dentro do construtor de funcionario");
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
