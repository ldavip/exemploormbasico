package ldavip.exemploormbasico.model;

import ldavip.ormbasico.annotation.AutoIncrement;
import ldavip.ormbasico.annotation.Coluna;
import ldavip.ormbasico.annotation.NotNull;
import ldavip.ormbasico.annotation.PrimaryKey;
import ldavip.ormbasico.annotation.Tabela;

/**
 *
 * @author Luis Davi
 */
@Tabela(nome = "categoria")
public class Categoria {

    @AutoIncrement
    @Coluna
    @PrimaryKey
    private int id;
    
    @NotNull
    @Coluna
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
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
        final Categoria other = (Categoria) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
