package ldavip.exemploormbasico.model;

import java.util.Objects;
import ldavip.ormbasico.annotation.AutoIncrement;
import ldavip.ormbasico.annotation.Coluna;
import ldavip.ormbasico.annotation.ForeignKey;
import ldavip.ormbasico.annotation.NotNull;
import ldavip.ormbasico.annotation.PrimaryKey;
import ldavip.ormbasico.annotation.Tabela;

/**
 *
 * @author Luis Davi
 */
@Tabela(nome = "compra")
public class Compra {

    @AutoIncrement
    @Coluna(nome = "id")
    @PrimaryKey
    private int id;

    @NotNull
    @Coluna(nome = "id_cliente")
    @ForeignKey
    private Cliente cliente;

    @NotNull
    @Coluna(nome = "id_produto")
    @ForeignKey
    private Produto produto;

    @NotNull
    @Coluna(nome = "quantidade")
    private int quantidade;
    
    @Coluna(nome = "valor_total")
    private double valorTotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.cliente);
        hash = 41 * hash + Objects.hashCode(this.produto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compra other = (Compra) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return Objects.equals(this.produto, other.produto);
    }

    @Override
    public String toString() {
        return "Compra{" + "cliente=" + cliente + ", produto=" + produto + ", quantidade=" + quantidade + '}';
    }
}
