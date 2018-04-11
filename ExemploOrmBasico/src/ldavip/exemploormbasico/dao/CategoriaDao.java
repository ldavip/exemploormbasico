package ldavip.exemploormbasico.dao;

import java.sql.Connection;
import ldavip.exemploormbasico.model.Categoria;
import ldavip.ormbasico.dao.Dao;

/**
 *
 * @author Luis Davi
 */
public class CategoriaDao extends Dao<Categoria> {

    public CategoriaDao() {
    }

    public CategoriaDao(Connection conexao) {
        super(conexao);
    }

}
