public class CalculadoraIMC {
    private double peso = 180 ;
    private double altura = 1.96;

    public  double calculandoIMC(){
        Calculadora calculadora = new Calculadora();
        return calculadora.divisao(peso, calculadora.exponencial(altura, 2));
    }




}
