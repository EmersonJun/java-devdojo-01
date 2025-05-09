public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private double velocidadeLimite = 250;
    public String getNome() {
        return nome;
    }
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void imprime(){
        System.out.println("-------------------------");
        System.out.println("nome: "+this.nome);
        System.out.println("velocidade maxima: "+ this.velocidadeMaxima);
        System.out.println("velocidade limite: "+ this.velocidadeLimite );
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }
    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }

    
}
