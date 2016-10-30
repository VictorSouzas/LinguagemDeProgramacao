/**
 *
 * @author victor_souzas@yahoo.com.br
 */

import java.util.ArrayList;

public class GerenciaAnimal {
    private static ArrayList<Animal> animais = new ArrayList();
    
    public static void Adicionar(Animal animal) {
        animais.add(animal);
    }
    
    public static int qntRaca(String raca){
        int contador = 0;
        for (Animal animal : animais) {
            if(animal.getRaca().equalsIgnoreCase(raca)) {
                contador++;
            }
        }
        return contador;
    }
    
    public static String dados(){
        String retorno = "";
        for (Animal animal : animais) {
            retorno += animal.dados();
        }
        return retorno;
    }
    
}
