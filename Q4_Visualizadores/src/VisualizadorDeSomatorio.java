import java.util.List;

public class VisualizadorDeSomatorio implements Observer{
    private List<Integer> values;

    public VisualizadorDeSomatorio(List<Integer> values){
        this.values = values;
    }

    public void defineValores(List<Integer> values){
        this.values = values;
    }

    @Override
    public void update(Integer value){
        this.values.add(value);
        exibeSomatorio();
    }

    public void exibeSomatorio(){
        Integer soma = values.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: "+soma+", quantidade de elementos analisados: "+values.size());
    }
}
