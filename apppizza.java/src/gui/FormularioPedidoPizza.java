package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FormularioPedidoPizza extends JFrame
{
        
        private JTextField txtnombre;
        private JTextField txtNumero;
        private JTextField txtDireccion;
}

public FormularioPedidoPizza()
{
        super("Formulario Pedido de Pizza");
        initUI();
}
private void initUI()
{
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Formulario de Ingreso");
        setSize(550,650);
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Pedido de Pizza", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setBorder(new EmptyBorder(15, 10, 10, 10));
        add(titulo, BorderLayout.NORTH);

        // Se crea el panel central con BoxLayout para organizar los subpaneles verticalmente
        JPanel centro = new JPanel();
        centro.setLayout(new BoxLayout(centro, BoxLayout.Y_AXIS));
        centro.setBorder(new EmptyBorder(5, 15, 5, 15));
        centro.add(crearPanelCliente());
        centro.add(crearPanelPizza());
        centro.add(crearPanelIngredientes());
        centro.add(crearPanlePago());
        add(centro, BorderLayout.CENTER);
        add(crearPanelBotones(), BorderLayout.SOUTH);

        private JPanel crearPanelCliente()
        {
                JPanel panel = new JPanel(new GridLayout(3, 2, 8, 8));
                panel.setBorder(new CompoundBorder(new TitledBorder("Datos del Cliente"), new EmptyBorder(8, 8, 8, 8)));
        }

        txtnombre = new JTextField();
        txtNumero = new JTextField();
        txtDireccion = new JTextField();

        panel.add(new JLabel("Nombre:"));
        panel.add(txtnombre);
        panel.add(new JLabel("Número:"));
        panel.add(txtNumero);
        panel.add(new JLabel("Dirección:"));
        panel.add(txtDireccion);
        return panel;
}
