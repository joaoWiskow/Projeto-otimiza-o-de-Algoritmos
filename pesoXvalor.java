import javax.swing.SortOrder;

public class pesoXvalor{
    //Teorema da mochila
    public static void main(String[]args){
       double[]valor=new double[]{
        92, 57, 49, 68, 60, 43, 67, 84, 87, 72
       };
       double[] peso=new double[]{
        23, 31, 29, 44, 53, 38, 63, 85, 89, 82
       };
       double[]valorXpeso=CustoBeneficio(peso, valor);
       for(double a:valorXpeso){
      System.out.print(a+", ");
       }
    }
    public static double[] PreencherContainer(double capacidade, double[] pesos, double[] valores){
            
    double custoBeneficio[]=CustoBeneficio(pesos,valores);
    double pesoTotal=0;
    for(int i=0;i<pesos.length;i++){
      
    }
    }
    public static double[] CustoBeneficio(double[] peso,double[] valor){
        double[] custoBeneficio=new double[peso.length];
        for(int i=0;i<peso.length;i++){
          double preco=(valor[i]/peso[i]);
          custoBeneficio[i]=preco;
        }
        return custoBeneficio;

    }
}
