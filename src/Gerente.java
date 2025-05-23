public class Gerente extends Funcionario{
    
    public Gerente(String nome, double salario) {
        super(nome, salario);
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("imprimindo");
    }

    @Override
    public String toString() {
        return "nome: "+this.nome+"\nsalario: "+this.salario;
    }

    @Override
    public void calculaBonus() {
       salario = salario + salario * 2;
    }
    
}
