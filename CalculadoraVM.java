public class CalculadoraVM {
    private double deslocamento = 1200;
    private double  intTempo = 71;

    public  double calculandoVM(){
        Calculadora calculadora = new Calculadora();
        return calculadora.divisao(deslocamento, intTempo);
    }





}
