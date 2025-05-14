public enum TipoCliente {
    PESSOA_FISICA(1,"relatorio1"),
    PESSOA_JURIDICA(2,"relatorio2");

    private int valor;
    private String nomeDoRelatorio;
    private TipoCliente(int valor, String nomeDoRelatorio) {
        this.valor = valor;
        this.nomeDoRelatorio = nomeDoRelatorio;
    }
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeDoRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeDoRelatorio().equals(nomeDoRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }
    public int getValor() {
        return valor;
    }
    public String getNomeDoRelatorio() {
        return nomeDoRelatorio;
    }

    
}
