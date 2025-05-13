public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador(); 
        System.out.println("velocidade maxima do carro: "+Carro.VELOCIDADE_LIMITE);
        carro.comprador.setNome("carlos");
        System.out.println(carro.comprador);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("sla");
        ferrari.imprime();
    }
}
