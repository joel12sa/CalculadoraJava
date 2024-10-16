package Exeptions;

public class DivicionExeption extends Exception{
    @Override
    public String getMessage(){
        return "No se puede dividir para 0";
    }
}
    
