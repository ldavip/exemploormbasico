package ldavip.exemploormbasico.dao;

import java.sql.Connection;
import ldavip.exemploormbasico.model.Pessoa;
import ldavip.ormbasico.dao.Dao;

/**
 *
 * @author Luis Davi
 */
public class PessoaDao extends Dao<Pessoa> {

    public PessoaDao() {
    }

    public PessoaDao(Connection conexao) {
        super(conexao);
    }

}
