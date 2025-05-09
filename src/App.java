public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro("c1", 280);
        Carro c2 = new Carro("gol", 100);
        Carro c3 = new Carro("polo", 10);

        Carro.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
