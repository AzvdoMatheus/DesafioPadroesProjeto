public class ValidadorStrategy{
    private IValidadorStrategy _validadorStrategy;
    
    public void setState(IValidadorStrategy validadorStrategy){
    _validadorStrategy = validadorStrategy;
    }
    
    public boolean valida(String valor){
     return _validadorStrategy.valida(valor);
    }
}