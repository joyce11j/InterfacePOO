package pilha;

import java.util.Objects;

public class Elemento{
    private int elemento;

    public Elemento(int elemento){
        this.elemento = elemento;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elemento elemento1 = (Elemento) o;
        return elemento == elemento1.elemento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(elemento);
    }
}
