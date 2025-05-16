public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
        calculaBonus();
    }

    

    @Override
    public void calculaBonus() {
        this.salario = salario +salario * 0.5;
    }

    @Override
    public void imprime(){
        System.out.println("imprimindo");
    }

    @Override
    public String toString() {
        return "nome: "+this.nome+"\nsalario: "+this.salario;
    }
}
