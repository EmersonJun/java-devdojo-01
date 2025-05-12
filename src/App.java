public class App {
    public static void main(String[] args) throws Exception {
        Aluno pedro = new Aluno("pedro", 10);
        Aluno paulo = new Aluno("paulo", 11);
        
        Professor jonas = new Professor("jonas", "matematica");
        Local curitiba = new Local("curitiba");

        Aluno[] alunos = {pedro, paulo};
        Seminario palestra = new Seminario("palestra", alunos, curitiba, jonas);
        palestra.imprime();
    }
}
