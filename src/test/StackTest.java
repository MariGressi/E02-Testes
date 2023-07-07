package test;

import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void testStackIsEmpty() {
        assertTrue(stack.estaVazia());
    }

    @Test
    public void testStackIsNotEmpty() {
        stack.empilhar(10);
        assertFalse(stack.estaVazia());
    }

    // Outros testes de unidade

    @Test
    public void testStackIsEmptyAfterPoppingAllElements() throws Exception {
        stack.empilhar(10);
        stack.empilhar(20);
        stack.desempilhar();
        stack.desempilhar();
        assertTrue(stack.estaVazia());
    }

    public void testStackIsNotEmptyAfterPushingElements() {
        stack.empilhar(10);
        stack.empilhar(20);
        assertFalse(stack.estaVazia());
    }

    public void testElementsArePushedCorrectly() {
        stack.empilhar(10);
        stack.empilhar(20);
        stack.empilhar(30);
        assertEquals(3, stack.tamanho());
    }

    public void testElementsArePoppedCorrectly() throws Exception {
        stack.empilhar(10);
        stack.empilhar(20);
        stack.empilhar(30);
        assertEquals(30, stack.desempilhar());
        assertEquals(20, stack.desempilhar());
        assertEquals(10, stack.desempilhar());
    }

    public void testExceptionIsThrownWhenPoppingFromEmptyStack() {
        assertThrows(Exception.class, () -> stack.desempilhar());
    }



}
