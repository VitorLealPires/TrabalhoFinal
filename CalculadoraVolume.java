public class CalculadoraVolume {
    private double volume = 30;
    private double altura = 1.00;
    private double comprimento = 1.50;

    public  double calculandoVolume(){
        Calculadora calculadora = new Calculadora();
        return calculadora.multiplicacao(volume,calculadora.multiplicacao(altura,comprimento));
    }




}