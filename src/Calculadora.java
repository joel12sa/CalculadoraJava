import Exeptions.DivicionExeption;

public class Calculadora {
    public int dividir(int dividendo,int divisor) throws DivicionExeption{
        if(divisor==0) throw new  DivicionExeption();
        return dividendo/divisor;
    }
}

