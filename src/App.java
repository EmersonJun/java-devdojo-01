public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador1 = new Jogador("pele");
        Jogador jogador2 = new Jogador("neymar");
        Jogador jogador3 = new Jogador("kaka");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
