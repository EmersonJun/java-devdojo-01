public class Anime {
    private String nome;
    private static int[] episodios;


    static{
        System.out.println("episodios dentro do bloco de inicializacao");
        episodios = new int[10];
        for(int i = 0; i< episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    public Anime(){
        for(int episodios : Anime.episodios){
            System.out.println(episodios + " ");
        }
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int[] getEpisodios() {
        return episodios;
    }

    public static void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }

}