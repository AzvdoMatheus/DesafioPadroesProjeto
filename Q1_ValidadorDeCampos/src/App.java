public class App {
    public static void main(String[] args) throws Exception {
    String email = "bernardo.copstein@pucrs.br";
    String matricula = "12340";
    String matricula2 = "63g26t";
    ValidadorStrategy validador = new ValidadorStrategy();

    //cria um objeto ValidadorEmail usando o padrao factory method
    validador.setState(ValidadorFactory.criarValidador("email"));
    //valida se o email é valido
    if (validador.valida(email)){
    System.out.println(email+" é um email válido!");
    }else{
    System.out.println(email+" não é um email válido!");
    }
    
    //cria um objeto ValidadorMatricula usando o padrao factory method
    validador.setState(ValidadorFactory.criarValidador("matricula"));
    //valida se a matricula 1 é valida
    if (validador.valida(matricula)){
        System.out.println(matricula+" é uma matricula válida!");
    }else{
        System.out.println(matricula+" não é uma matricula válida!");
    }

    //valida se a matricula 2 é valida
    if (validador.valida(matricula2)){
        System.out.println(matricula2+" é uma matricula válida!");
    }else{
        System.out.println(matricula2+" não é uma matricula válida!");
    }
    }
}