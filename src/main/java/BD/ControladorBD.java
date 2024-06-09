package BD;

import com.mycompany.crud_postgre.ModeloCRUD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omarc
 */
public class ControladorBD {

    private static ControladorBD instancia; //todas las clases usan la misma instancia

    private static List<String> contenedor = new ArrayList<>();

    public static synchronized ControladorBD getInstance() {

        /*Si no existe una instancia, crea una; de lo contrario,
        devuelve la instancia existente.*/
        if (instancia == null) {
            instancia = new ControladorBD();
        }
        return instancia;

        /*Se va a acceder a los resultados desde otras Clases,
        * por ello se requiere una misma instnacia para todo*/
    }
    
    public void ejecutaQuery(String comando, String tipo_oper) throws SQLException {
        //Instancia de la clase modelo_crud para hacer una nueva operación
        ModeloCRUD oper_bd = new ModeloCRUD();
        oper_bd.setComando(comando, tipo_oper);
        contenedor = new ArrayList<>();
        contenedor = oper_bd.OperacionBD();
    }

    public List<String> getContenedor() {
        return contenedor;
    }



}
