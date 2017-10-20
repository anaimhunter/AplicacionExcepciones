import javax.print.attribute.IntegerSyntax;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

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
               try
               {
                int num1 = Integer.parseInt(numero1.getText()); //transforma la cadena a entero
                int num2 = Integer.parseInt(numero2.getText()); //transforma la cadena a entero
                int resultado = num1/num2;

                JOptionPane.showMessageDialog(null, "La división de  "
                           + numero1.getText() + " y " + numero2.getText()+ " es " +resultado);

                }
                catch(ArithmeticException excepcion)
                {
                    JOptionPane.showMessageDialog(null, "No puedes dividir por cer");
                }
                catch (NumberFormatException excepcion)
                {
                    JOptionPane.showMessageDialog(null, "Numero invalido");
                }


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
