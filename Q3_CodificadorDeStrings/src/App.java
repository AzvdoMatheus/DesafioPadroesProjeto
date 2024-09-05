public class App {
    public static void main(String[] args) {
        ICodificador frase = new Codificador("Desafio Padrões de Projeto");
        System.out.println("Frase original: " + frase.codifica());

        ICodificador codificadorSimples = new CodificaSimples(frase);
        String fraseCodificada = codificadorSimples.codifica();
        System.out.println("Frase codificada simples : " + fraseCodificada);

        String fraseDecodificada = codificadorSimples.deCodifica();
        System.out.println("Frase decodificada simples: " + fraseDecodificada);

        ICodificador codificadorDesloca = new CodificaDesloca(frase);
        String fraseCodificada2 = codificadorDesloca.codifica();
        System.out.println("Frase codificada deslocada: " + fraseCodificada2);

        String fraseDecodificada2 = codificadorDesloca.deCodifica();
        System.out.println("Frase decodificada deslocada: " + fraseDecodificada2);
    }
}
