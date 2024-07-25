package pilha;


public interface Pilha<T> extends Iterable<T>{
    void push(T elem);
    T pop() throws PilhaVaziaException;
    T peek() throws PilhaVaziaException;
    int size();
}

