public class ValidadorFactory {
    public static IValidadorStrategy criarValidador(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new ValidadorEmail();
            case "matricula":
                return new ValidadorMatricula();
            case "inteiro":
                return new ValidadorInteiro();
            default:
                throw new IllegalArgumentException("Tipo de validador desconhecido: " + tipo);
        }
    }
}