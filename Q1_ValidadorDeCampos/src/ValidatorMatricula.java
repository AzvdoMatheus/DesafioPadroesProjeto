public class ValidatorMatricula implements ValidadorStrategy{
    @Override 
    public boolean valida(String valor){
        if (!valida(Tipo.INTEIRO,valor)){
            return false;
        }else{
            int sum = 0;
            for(int i=0;i<valor.length()-1;i++){
                sum += Character.getNumericValue(valor.charAt(i));
            }
            int verificador = sum%10;
            if (verificador == Character.getNumericValue(valor.charAt(valor.length()-1))){
                return true;
            }
        }
    } 
    
}
