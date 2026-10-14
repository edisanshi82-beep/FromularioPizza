package beans;

public class PedidosPizzaBean 
{
    private String nombre;
    private String numero;
    private String direccion;

    /**
     * Constructor sin parámetros.
     * 
     */
    public PedidosPizzaBean()
    {
        this.nombre = new String();
        this.numero = new String();
        this.direccion = new String();
    }

    /**
     * Constructor con parámetros.
     * @param nombre El nombre del cliente
     * @param numero El número de teléfono del cliente
     * @param direccion La dirección del cliente
     */
    public PedidosPizzaBean(String nombre, String numero, String direccion)
    {
        // this() llama al constructor sin parámetros de ESTA misma clase.
        this();
        setNombre(nombre);
        setNumero(numero);
        setDireccion(direccion);
    }

    // ---------- Accesadores (Getters) ----------
    /**
     * Obtiene el nombre del cliente.
     * @return El nombre del cliente
     */

    public String getNombre() 
    {
        return nombre;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     * @return El número de teléfono del cliente
     */
    public String getNumero() 
    {
        return numero;
    }

    /**
     * Obtiene la dirección del cliente.
     * @return La dirección del cliente
     */
    public String getDireccion() 
    {
        return direccion;
    }

    // ---------- Mutadores (Setters) ----------
    /**
     * Establece el nombre del cliente.
     * @param nombre El nombre del cliente
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Establece el número de teléfono del cliente.
     * @param numero El número de teléfono del cliente
     */
    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    /**
     * Establece la dirección del cliente.
     * @param direccion La dirección del cliente
     */
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    /**
     * toString() devuelve una representación en cadena del objeto PedidosPizzaBean.
     * @return Una cadena que representa el objeto PedidosPizzaBean
     */
    @Override
    public String toString()
    {
        return "PedidosPizzaBean{" +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

}
