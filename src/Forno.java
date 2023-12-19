/**Define a fabricação da pizza**/
public class Forno {
    /**Fabrica a pizza calabresa tipo de pizza a ser fabricada**/
    public void fabricar(PizzaCalabresa calabresa){
        calabresa.preparar();
        calabresa.assar();
        calabresa.cobrar();
    }

    public void fabricar(PizzaSensacao chocolate){
        chocolate.preparar();
        chocolate.assar();
        chocolate.cobrar();
    }
}
