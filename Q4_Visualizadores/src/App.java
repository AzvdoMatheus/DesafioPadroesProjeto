import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FonteDeDados dados = new FonteDeDados();
        VisualizadorDeMedia cm = new VisualizadorDeMedia(dados.getValores());
        VisualizadorDeSomatorio cs = new VisualizadorDeSomatorio(dados.getValores());
        dados.addObserver(cm);
        dados.addObserver(cs);


        Scanner s = new Scanner(System.in);
        int value = 0;
        while(true){
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            value = Integer.parseInt(s.nextLine());
            if (value == 0){
                break;
            }
            dados.add(value);
        }
        System.out.println("Fim");
    }
}
