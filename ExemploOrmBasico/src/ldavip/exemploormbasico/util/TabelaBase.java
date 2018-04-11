package ldavip.exemploormbasico.util;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Luis Davi
 */
public abstract class TabelaBase <T> extends AbstractTableModel {

    protected List<T> lista;
    
    public TabelaBase(List<T> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }
    
    public T getValor(int linha) {
        return lista.get(linha);
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public List<T> getLista() {
        return this.lista;
    }
}
