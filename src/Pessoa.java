public class Pessoa {
    protected String nome, cpf;
    protected Endereco endereco;
    static{
        System.out.println("dentro do bloco de inicializacao estatico pessoa");
    }
    {
        System.out.println("dentro do bloco de inicializacao pessoa 1");
    }
    {
        System.out.println("dentro do bloco de inicializacao pessoa 2");
    }
    
    public Pessoa(String nome) {
        super();
        this.nome = nome;
        System.out.println("dentro do construtor pessoa");
    }
    
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getCep()+ " " +this.endereco.getRua());
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
 