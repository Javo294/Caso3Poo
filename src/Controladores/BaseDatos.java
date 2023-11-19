package Controladores;
import java.sql.*;
public class BaseDatos {
    //Se define una variable de tipo "static" para poder utilizarla en todo el
    //proyecto, es decir, son globales del proyecto
    static String bd = "Caso3Poo";
    static String login = "JAVOPC/javie";
    static String password = "";
    //El pasword se escribe si al ingresar a MySQL existe pasword
    //sino se deja vacío
    static String url = "jdbc:mysql://localhost:3306/"+bd;
    //Aqui especificamente la direccion donde esta alojada la BD
    //Si por ejemplo está en un servidor, ahí se escribe la dirección IP
    //correspondiente 
    
    //define la variable con del tipo connection que nos va a permitir 
    //hacer conexion con la base de datos de Mysql
    public static Connection con = null;
    
    //define la varible de tipo statement para poder utilizar comandos
    //en al tabla de la BD, con INSERT, SELECT, UPDATE, DELETE
    public static Statement stmt;
    
    //procedimiento que permite conectar con la base de datos
    public void conectarbase()
   {
        try
        {
            //que accese al driver de conección de MySQl
            Class.forName("com.mysql.jdbc.Driver");
            //haga al conexion en la variable con que esta menejando 
            //los datos que tiene la url, login, password. 
            //Que se definieron anteriormente
            con = DriverManager.getConnection(url,login,password);
            //Se indica que por medio del stmt vamos a ejecutar los 
            //comandos de SQL como son, INSERT, SELECT, UPDATE, DELETE, etc.
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            if(con != null)
                System.out.println("Conexion con base de datos "+con+" correcta");
        } //Cierra el try
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//Fin de conectarbase 
        
    //procediento que permite desocnextar bd conecta
    public void desconectarbase()
    {
        try 
        {
            con.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    int main() {
    	conectarbase();
    	return 0;
    }
}
