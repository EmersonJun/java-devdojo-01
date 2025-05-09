public class App {
    public static void main(String[] args) throws Exception {
        Professor professor = new Professor("paulo");
        Professor professor2 = new Professor("jonas");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("joao afonso", professores);
        escola.imprime();

    }
}
