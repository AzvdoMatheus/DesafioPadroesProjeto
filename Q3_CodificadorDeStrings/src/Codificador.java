public class Codificador implements ICodificador {
    private String str;

    public Codificador(String str) {
        this.str = str;
    }

    @Override
    public String codifica() {
        return str;
    }

    @Override
    public String deCodifica() {
        return str;
    }
}