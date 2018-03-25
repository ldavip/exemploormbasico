package ldavip.exemploormbasico.dao;

import java.sql.Connection;
import ldavip.exemploormbasico.model.Produto;
import ldavip.ormbasico.dao.Dao;

/**
 *
 * @author Luis Davi
 */
public class ProdutoDao extends Dao<Produto> {

    public ProdutoDao(Connection conexao) {
        super(conexao);
    }

}
