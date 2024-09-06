import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados implements IFonteDeDados{
    private List<Integer> lst;
    private List<Observer> observers;

    public FonteDeDados(){
        lst = new LinkedList<>();
        observers = new LinkedList<>();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notifyObservers(value);
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }

    @Override
    public void addObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    @Override
    public void notifyObservers(Integer value){
        for(Observer o: observers){
            o.update(value);
        }
    }
}