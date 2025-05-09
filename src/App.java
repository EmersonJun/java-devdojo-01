public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador1 = new Jogador("pele");
        Time time = new Time("selecao br");

        jogador1.setTime(time);
        jogador1.imprime();
        // Jogador jogador2 = new Jogador("neymar");
        // Jogador jogador3 = new Jogador("kaka");
        //  Jogador[] jogadores = {jogador1, jogador2, jogador3};

        //  for (Jogador jogador : jogadores) {
        //      jogador.imprime();
        //  }
    }
}
