package ldavip.exemploormbasico.model;

import ldavip.ormbasico.annotation.Coluna;
import ldavip.ormbasico.annotation.NotNull;
import ldavip.ormbasico.annotation.Tabela;

/**
 *
 * @author Luis Davi
 */
@Tabela(nome = "funcionario")
public class Funcionario extends Pessoa {

    @NotNull
    @Coluna
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
