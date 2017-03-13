
package Crud;

import Entidades.Usuario;
import UsuarioCliente.UsuarioJerseyClient;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 * @author bellyoz
 */
public class UsuarioCrud {
    public boolean insertarUsuario(String usuario , String pass){
        try {
            UsuarioJerseyClient cliente = new UsuarioJerseyClient();
        Usuario user = new Usuario(usuario,pass);
        cliente.create_XML(user);
        return true;
        } catch (Exception e) {
            System.out.println("Error en insertar usuario : "+e);
        }
        return false;
    }
    public boolean editarUsuario( String usuario , String pass){
         try {
            UsuarioJerseyClient cliente = new UsuarioJerseyClient();
            Usuario user = new Usuario(usuario,pass);
            cliente.edit_XML(user, usuario);
        return true;
        } catch (Exception e) {
            System.out.println("Error en editar usuario : "+e);
        }
        return false;
    }
    public boolean eliminarUsuario(String id){
         try {
            UsuarioJerseyClient cliente = new UsuarioJerseyClient();
         
            cliente.remove(id);
        return true;
        } catch (Exception e) {
            System.out.println("Error en eliminar usuario : "+e);
        }
        return false;
    }
    public List<Usuario> usuarios(){
        List<Usuario> data = new ArrayList<Usuario>();
        try {
             UsuarioJerseyClient client = new UsuarioJerseyClient();
        Response response = client.findAll_XML(Response.class);


        GenericType<List<Usuario>> genericType = new GenericType<List<Usuario>>() {
        };
        data = new ArrayList<Usuario>();
        data = (response.readEntity(genericType));
        
        client.close();
        return data;
        } catch (Exception e) {
            System.out.println("error en cargar user :"+e);
        }              
        return data;
    }
    public Usuario usuario(String id){
        Usuario user = new Usuario();
        try {
             UsuarioJerseyClient client = new UsuarioJerseyClient();
        Response response = client.find_XML(Response.class, id);
        GenericType<Usuario> genericType = new GenericType<Usuario>() {
        };
        user = (Usuario) response.readEntity(genericType);
        client.close();
        return user;
        } catch (Exception e) {
            System.out.println("error en cargar usuario :"+e);
        }
            
       
        return user;
    }
}
