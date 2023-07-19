import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private Tree empleadosList=new Tree();
    private JPanel princ;
    private JSpinner spinnerCode;
    private JTextField textFieldName;
    private JComboBox comboBoxDepartmment;
    private JTextField textFieldSalary;
    private JButton insertButton;
    private JTextArea textArea1;
    private JButton PREORDERButton;
    private JButton INORDERButton;
    private JButton POSTORDERButton;
    private JButton recorridoNivelesButton;
    private JButton sumaSalariosButton;


    public Ventana() {
    insertButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int code=Integer.parseInt(spinnerCode.getValue().toString());
            String name=textFieldName.getText();
            float salary= Float.parseFloat(textFieldSalary.getText());
            String department=comboBoxDepartmment.getSelectedItem().toString();
            Empleado emp=new Empleado(code,name,salary,department);
            empleadosList.insert(emp);
            textArea1.setText("Listado de Empleado");
            textArea1.append("\n"+empleadosList.preOrder());
        }
    });
    PREORDERButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea1.setText("Listado de Empleado");
            textArea1.append("\n"+empleadosList.preOrder());
        }
    });
    INORDERButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea1.setText("Listado de Empleado");
            textArea1.append("\n"+empleadosList.inOrder());
        }
    });
    POSTORDERButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea1.setText("Listado de Empleado");
            textArea1.append("\n"+empleadosList.postOrder());
        }
    });
        recorridoNivelesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("Listado de Empleado");
                for(Node node:empleadosList.recorridoNiveles()){
                    textArea1.append(node.getEmp().toString());

                }
            }
        });
        sumaSalariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("Listado de Empleado");
                textArea1.append("La suma de salarios es:"+empleadosList.sumSalary());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().princ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300,300);
    }
}

