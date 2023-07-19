import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JComboBox comboMarca;
    private JTextField txtAnio;
    private JButton btnAgregar;
    private JTextArea textArea1;
    private JButton btnPagar;
    private JButton btnConsultar;
    private JPanel principal;

    private PatioAutos patio=new PatioAutos();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(900 ,500);
        frame.setVisible(true);
    }
public Ventana() {
    btnAgregar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            patio.encolar(comboMarca.getSelectedItem().toString(),Integer.parseInt(txtAnio.getText()));
            textArea1.setText(patio.listarAutos());
        }
    });
    btnConsultar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea1.setText(patio.listarPorMarca(comboMarca.getSelectedItem().toString()));

        }
    });
}
}
