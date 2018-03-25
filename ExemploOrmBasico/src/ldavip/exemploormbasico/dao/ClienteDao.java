package ldavip.exemploormbasico.dao;

import java.sql.Connection;
import ldavip.exemploormbasico.model.Cliente;
import ldavip.ormbasico.dao.Dao;

/**
 *
 * @author Luis Davi
 */
public class ClienteDao extends Dao<Cliente> {

    public ClienteDao(Connection conexao) {
        super(conexao);
    }

}
