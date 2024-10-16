import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Exeptions.DivicionExeption;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*Calculadora cal=new Calculadora();
        int resultado;
        try {
            resultado=cal.dividir(12, 0);
            System.out.println("Es el resultado"+resultado);
        } catch (DivicionExeption e) {
            e.printStackTrace();
            System.out.println("Esto despues de exeption");
        }*/
        List<String> familia = new ArrayList<>();
        familia.add("Erick");
        familia.add("Erika");
        familia.add("Joel");
        familia.add("Marco");
        familia.add("Luis");
        familia.add("Ana");
        familia.add("Erick");
        familia.set(4, "Marco Sasig");
         System.out.println("Quienes son de mi familia");
        for (String miFamily : familia) {
            System.out.println(miFamily);
            
        }
        System.out.println(familia.get(5));
        
                
        
    }
}
