public interface IFonteDeDados {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(Integer value);
}
