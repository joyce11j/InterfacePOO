package test;

import org.junit.jupiter.api.Test;
import pilha.Pilha;
import pilha.PilhaList;

import static org.junit.jupiter.api.Assertions.*;

public class PilhaTest {

    Pilha<Integer> getPilha() {
        return new PilhaList<>();
    }

    @Test
    void testPushPop() {
        Pilha<Integer> pilha = getPilha();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        assertDoesNotThrow(() -> assertEquals(3, pilha.pop()));
        assertDoesNotThrow(() -> assertEquals(2, pilha.pop()));
        assertDoesNotThrow(() -> assertEquals(1, pilha.pop()));
    }

    @Test
    void testSize() {
        Pilha<Integer> pilha = getPilha();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        assertEquals(3, pilha.size());

        assertDoesNotThrow(pilha::pop);
        assertDoesNotThrow(pilha::pop);
        assertDoesNotThrow(pilha::pop);

        assertEquals(0, pilha.size());
    }

    @Test
    void testPeek() {
        Pilha<Integer> pilha = getPilha();
        assertThrows(PilhaVazaiaException.class, pilha::peek);
        pilha.push(1);
        assertDoesNotThrow(() -> assertEquals(1, pilha.peek()));
        pilha.push(2);
        assertDoesNotThrow(() -> assertEquals(2, pilha.peek()));
        pilha.push(3);
        assertDoesNotThrow(() -> assertEquals(3, pilha.peek()));
    }

    private void assertThrows(Class<PilhaVazaiaException> pilhaVazaiaExceptionClass, Object peek) {
    }
}
