public class MultaRescisoria {
    public double valorMulta(double mesRescisão, double avisoPrevio, double finsRescisórios){
        Calculadora c = new Calculadora();
        double valorA = c.multiplicacao(mesRescisão, 0.08);
        double valorB = c.multiplicacao(avisoPrevio, 0.08);
        double valorC = c.multiplicacao(finsRescisórios, 0.4);
        double valorD = c.soma(valorA, valorB);
        double valorDevido = c.soma(valorC, valorD);
        return valorDevido;
    }

}
