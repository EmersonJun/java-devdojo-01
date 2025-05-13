public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; 
    public final Comprador comprador = new Comprador();

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Comprador getComprador() {
        return comprador;
    }
}
