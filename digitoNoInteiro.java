public class digitoNoInteiro{
    public static void main(String[]args){
System.out.println(DigitosAux(338));
    }
    public static int DigitosAux(int inteiro){
        if(inteiro<=0){
            return 0;
        }
        return Digitos(0,inteiro);
    }
    public static int Digitos(int totalDigitos,int inteiro){
        if(inteiro<=0){
            return totalDigitos;
        }
        return Digitos(totalDigitos+1,inteiro/10);
    }
}