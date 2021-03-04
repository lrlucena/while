package plp.enquanto;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class Propriedades {
    private final ParseTreeProperty<Object> valores;

    public Propriedades() {
        valores = new ParseTreeProperty<>();
    }

    @SuppressWarnings(value = "unchecked")
    public <T> T pegue(ParseTree node) {
        T valor = (T) valores.get(node);
        valores.removeFrom(node);
        return valor;
    }

    public <T> void insira(ParseTree node, T valor) {
        valores.put(node, valor);
    }
}