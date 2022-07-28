
package principal;
import Modelo.*;
import vistas.*;

public class main {

    public static void main(String[] args) {
            
        conexion conexionBD = new conexion();
        
        Login login = new Login();
        //se hace visible la interfas cuando ejecutamos la aplicacion
        login.setVisible(true);
        
    }
    
}
 