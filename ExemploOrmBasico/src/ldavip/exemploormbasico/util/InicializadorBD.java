package ldavip.exemploormbasico.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import ldavip.ormbasico.util.ConnectionFactory;

/**
 *
 * @author Luis Davi
 */
public class InicializadorBD {

    public static void inicializar() {
        StringBuilder script = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(new File("resources/script/script_db.sql")))) {
            while (br.ready()) {
                script.append(br.readLine());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try (Connection conexao = ConnectionFactory.getConnection(); Statement stmt = conexao.createStatement()) {
            for (String cmd : script.toString().split(";")) {
                if (!cmd.isEmpty()) {
                    stmt.execute(cmd);
                }
            }
        } catch (SQLException ex1) {
            ex1.printStackTrace();
        }
    }
}
