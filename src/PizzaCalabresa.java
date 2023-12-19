/**Define comportamentos da Pizza**/
public class PizzaCalabresa {

    /**Define os condimentos**/
    public void preparar(){
        System.out.println("molho,queijo,calabresa,cebola e tomate");
    }

    /**Define o tempo de assamento**/
    public void assar(){
        System.out.println("15 minutos");
    }

    /**Define o valor da venda**/
    public void cobrar(){
        System.out.println("R$12,00");
    }

    public double preco(){
        double valor1 = 12.00;
        return valor1;
    }
}
