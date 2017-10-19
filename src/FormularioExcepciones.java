import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ana M.Hunter on 19/10/2017.
 */
public class FormularioExcepciones {
    private JButton button1;
    private JPanel panel1;
    private JTextField numero1;
    private JTextField numero2;

    public FormularioExcepciones() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hola " + nombre.getText());
                JOptionPane.showMessageDialog(null, "Quiero Dividir " + numero1.getText() + " y " + numero2.getText());
            }
        });

    }
    public static void main(String [] args)
    {
        FormularioExcepciones formulario = new FormularioExcepciones();
        JFrame ventana = new JFrame();
        ventana.setContentPane(formulario.panel1);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();//hace la ventana del tamaño de los componentes
        ventana.setVisible(true);
    }

}
