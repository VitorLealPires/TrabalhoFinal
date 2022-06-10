public class CalculadoraMedia {
    private double nota1 = 8;
    private double nota2 = 7;
    
    public double calculandoMédia (){
         Calculadora calculadora = new Calculadora();
         return calculadora.divisao(calculadora.soma(nota1, nota2), 2);
    }
}
