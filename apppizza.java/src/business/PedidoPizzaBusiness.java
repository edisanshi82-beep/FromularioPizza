package business;

import beans.PedidosPizzaBean;
import exception.DatosPedidoException;

public class PedidoPizzaBusiness 
{
    /**
     * Valida los datos y, si todo está bien, crea el PedidosPizzaBean.
     * "throws DatosPedidoException" avisa a quien llame este método
     * que puede fallar y que debe estar preparado para manejarlo.
     
     @param nombre el nombre del cliente
     @param numero el número de teléfono del cliente
     @param direccion la dirección del cliente
     @return el PedidosPizzaBean creado
     @throws DatosPedidoException si algún dato no es válido
     */
    public PedidosPizza create(String nombre, String numero, String dirección)
            throws DatosPedidoException
    {
        // Regla 1: el nombre no puede ser nulo, vacío ni tener menos de 3 caracteres.
        if (nombre == null || nombre.trim().isEmpty())
        {
            throw new DatosPedidoException("El nombre del cliente es obligatorio.");
        }
        if (nombre.trim().length() < 3)
        {
            throw new DatosPedidoException("El nombre del cliente debe tener al menos 3 caracteres.");
        }

        // Regla 2: el número no puede ser nulo, vacío ni tener menos de 7 caracteres.
        if (numero == null)
        {
            throw new DatosPedidoException("El número de teléfono del cliente es obligatorio.");

        }   
        // Regla 3: la dirección no puede ser nula, vacía ni tener menos de 5 caracteres.
        if (direccion == null)
        {
            throw new DatosPedidoException("La dirección del cliente es obligatoria.");
        }

        // Si llegamos aquí, todos los datos son válidos: creamos el objeto.
        return new pedidosPizzaBean(nombre.trim(), numero.trim(), direccion.trim());
    }
    
}
