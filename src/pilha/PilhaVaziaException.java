package pilha;

public class PilhaVaziaException extends Exception {
    public PilhaVaziaException(){
        super("A pilha está vazia!");
    }
}
