package personas;

/**
 * Clase que describe objetos de tipo Cliente.
 * Esta clase hereda de Persona.
 * 
 * @author Marcos Laíño Ordóñez
 */
public class Cliente extends Persona{
    
    protected int id_cliente;
    protected int id_comercial;
    
    /**
     * Constructor de la clase Cliente
     */
    public Cliente(String usuario, String contraseña, String nombre, String apellidos, 
        String telefono, String nif, int id_comercial){
        super(usuario, contraseña, nombre, apellidos, telefono, nif);
        this.id_comercial = id_comercial;
    }
    
    // ***** setters *****
    public void setIdCliente(){
    }
    public void setComercial(int id_comercial){
        this.id_comercial = id_comercial;
    }
    // ***** getters *****
    public int getIdCliente(){
        return this.id_cliente;
    }
    public int getIdComercial(){
        return this.id_comercial;
    }

    
}
