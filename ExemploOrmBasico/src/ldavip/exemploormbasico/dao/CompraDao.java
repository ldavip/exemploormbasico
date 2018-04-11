package ldavip.exemploormbasico.dao;

import java.sql.Connection;
import ldavip.exemploormbasico.model.Compra;
import ldavip.ormbasico.dao.Dao;

/**
 *
 * @author Luis Davi
 */
public class CompraDao extends Dao<Compra> {

    public CompraDao() {
    }

    public CompraDao(Connection conexao) {
        super(conexao);
    }

}
