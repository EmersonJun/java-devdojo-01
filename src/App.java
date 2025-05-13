public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("tay", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("tay", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("tay", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("tay", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
