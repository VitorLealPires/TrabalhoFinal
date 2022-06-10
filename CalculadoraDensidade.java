public class CalculadoraDensidade {
    private double massa = 200 ;
    private double volume = 40;

    public  double calculadoraDensidade(){
        Calculadora calculadora = new Calculadora();
        return calculadora.divisao(massa,volume);
    }




}