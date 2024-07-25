package pilha;

import java.util.ArrayList;
import java.util.List;

public class PilhaList<T> implements Pilha<T> {
    private List<T> pilha = new ArrayList<>();

    @Override
    public void push(T elem) {
        pilha.add(elem);
    }

    @Override
    public T pop() {
        return pilha.remove(pilha.size() - 1);
    }

    @Override
    public T peek() {
        if (pilha.size() > 0)
            return pilha.get(pilha.size() - 1);

        return null;
    }

    @Override
    public int size() {
        return pilha.size();
    }
}
