import java.util.HashMap;
import java.util.Map;


public class CodificaSimples implements ICodificador {
    private ICodificador codificadorDecorado;
    private String str;
    private Map<Character, Character> tabCod;
    private Map<Character, Character> tabDeCod;


    public CodificaSimples(ICodificador codificadorDecorado) {
        this.codificadorDecorado = codificadorDecorado;
        str = codificadorDecorado.codifica();
        tabCod = new HashMap<>();
        tabCod.put('a', '@');
        tabCod.put('e', '#');
        tabCod.put('i', '!');
        tabCod.put('o', '$');
        tabCod.put('u', '%');
        tabDeCod = new HashMap<>();
        tabDeCod.put('@', 'a');
        tabDeCod.put('#', 'e');
        tabDeCod.put('!', 'i');
        tabDeCod.put('$', 'o');
        tabDeCod.put('%', 'u');
    }


    @Override
    public String codifica() {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for (int i = 0; i < aux.length; i++) {
            if (tabCod.containsKey(aux[i])) {
                resp[i] = tabCod.get(aux[i]);
            } else {
                resp[i] = aux[i];
            }
        }
        str = new String(resp);
        return str;
    }


    @Override
    public String deCodifica() {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for (int i = 0; i < aux.length; i++) {
            if (tabDeCod.containsKey(aux[i])) {
                resp[i] = tabDeCod.get(aux[i]);
            } else {
                resp[i] = aux[i];
            }
        }
        str = new String(resp);
        return str;
    }
}




