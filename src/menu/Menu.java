package menu;

import opciones.operacionesmatematicas.OperacionesMatematicas;

import javax.swing.*;

public class Menu extends JFrame {

    private JPanel menu;
    private JButton btnoperacionesmatematicas;

    public Menu(){

        add(menu);
        setTitle("Menu Principal");
        setSize(500,500);

        btnoperacionesmatematicas.addActionListener(e-> {
            {
                OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
                operacionesMatematicas.setVisible(true);
                esconderventana();
            }
        });
    }

    private void  esconderventana()
    {
        this.dispose();
    }

}
