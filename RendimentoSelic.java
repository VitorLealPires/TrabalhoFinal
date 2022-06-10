public class RendimentoSelic {
    
   
    public double rendimentoAnual(double numA, double numB){
       Calculadora c = new Calculadora();
       double rendimento = c.multiplicacao((numA/100 + 1), numB);
       return rendimento;
    }
   
   }
   