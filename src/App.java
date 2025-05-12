public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador = new Jogador("cafu");
        Jogador pele = new Jogador("pele");
        Time brasil = new Time("brasil");
        Jogador[] jogadores = {jogador, pele};

        jogador.setTime(brasil);
        brasil.setJogadores(jogadores);

        System.out.println("--------------------------");
        jogador.impime();
        System.out.println("--------------------------");
        brasil.imprinme();
    }
}
