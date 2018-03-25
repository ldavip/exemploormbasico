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
@Tabela(nome = "cliente")
public class Cliente {

    @AutoIncrement
    @Coluna
    @PrimaryKey
    private int id;
    
    @NotNull
    @Coluna
    private String nome;
    
    @Coluna
    private boolean ativo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
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
        final Cliente other = (Cliente) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return nome;
    }
}
