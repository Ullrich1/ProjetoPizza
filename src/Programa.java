//terminar esse negócio legal
//falta fazer a soma dos dois pedidos


import java.util.Scanner;
/**Define o método main**/
public class Programa {
    /**iniciar e executar o código**/
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Forno forno = new Forno();

        PizzaCalabresa pizzaCalabresa = new PizzaCalabresa();
        PizzaSensacao pizzaSensacao = new PizzaSensacao();

        System.out.println("O que deseja fazer?");
        System.out.println("-------------------");
        System.out.println("1 - pedir pizza");
        System.out.println("2 - Saber o total");
        System.out.println("3 - sair");

        int escolha = ler.nextInt();
        switch (escolha){
            case 1:

                System.out.println("Qual sabor você quer?");
                System.out.println("---------------------");
                System.out.println("1 - Calabresa");
                System.out.println("2 - Sensação");

                int pedido = ler.nextInt();
                switch (pedido){
                    case 1:
                        forno.fabricar(pizzaCalabresa);
                        System.out.println("FIM!");
                        break;
                    case 2:
                        forno.fabricar(pizzaSensacao);
                        System.out.println("FIM!");
                        break;
                    default:
                        System.out.println("Insira uma opção válida (1 ou 2)");
                }

                break;

            case 2:
                pizzaSensacao.preco();
                pizzaCalabresa.preco();

                System.out.println("O valor da pizza de calabresa + sensação é igual a ");
                break;

            case 3:
                System.out.println("Saindo...");
                try{

                Thread.sleep(2000);
                }
                catch(InterruptedException e){
                System.out.println(e);
                }

                System.exit(0);

                break;
            default:
                System.out.println("Insira uma opção válida (1 ou 2)");
        }





    }
}
