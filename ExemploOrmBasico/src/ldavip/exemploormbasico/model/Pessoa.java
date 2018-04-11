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
@Tabela(nome = "pessoa")
public class Pessoa {

    @PrimaryKey
    @AutoIncrement
    @Coluna(nome = "id")
    private int codigo;
    
    @NotNull
    @Coluna
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
