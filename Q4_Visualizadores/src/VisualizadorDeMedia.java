import java.util.List;

public class VisualizadorDeMedia implements Observer{
    private List<Integer> values;

    public VisualizadorDeMedia(List<Integer> values){
        this.values = values;
    }

    public void defineValores(List<Integer> values){
        this.values = values;
    }

    @Override
    public void update(Integer value){
        this.values.add(value);
        exibeMedia();
    }

    public void exibeMedia(){
        double media = values.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: "+media+", quantidade de elementos analisados: "+values.size());
    }
}
