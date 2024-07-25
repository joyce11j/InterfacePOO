package pilha;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PilhaImpl<T> implements Pilha<T>, Iterable<T>{
    private List<T> elementos = new ArrayList<>();

    @Override
    public void push(T elem) {
        elementos.add(elem);
    }

    @Override
    public T pop() throws PilhaVaziaException {
        if (elementos.isEmpty())
            throw new PilhaVaziaException();

        return elementos.remove(elementos.size()-1);
    }

    @Override
    public T peek() throws PilhaVaziaException {
        if (elementos.isEmpty())
            throw new PilhaVaziaException();

        return elementos.get(elementos.size()-1);
    }

    @Override
    public int size() {
        return elementos.size();
    }
    @Override
    public List<T> getElementos(){
        return elementos;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
    @Override
    public boolean hasNext(){
        return next > -1;
    }
    public T next(){
        return pilha[next];
    }
}