package opciones.operacionesmatematicas;

import menu.Menu;

import javax.swing.*;

public class OperacionesMatematicas extends JFrame {

    private JPanel operacionesmatematicas;

    private JButton btnsalir;

    public OperacionesMatematicas(){
        add(operacionesmatematicas);
        setTitle("Opcion de Operaciones Matematicas");
        setSize(500,500);


        btnsalir.addActionListener(e-> {
            {
                Menu menu = new Menu();
                menu.setVisible(true);
                esconderventana();
            }
        });
    }
    private void  esconderventana()
    {
        this.dispose();
    }

}
