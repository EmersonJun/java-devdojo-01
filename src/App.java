public class App {
    public static void main(String[] args) throws Exception {
        Endereco endereco = new Endereco();
        endereco.setCep("123456789");
        endereco.setRua("braba");
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("987654321");
        pessoa.setNome("paulo");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("jonas");
        funcionario.setCpf("23141526");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1200);
        funcionario.imprime();
    }
}
