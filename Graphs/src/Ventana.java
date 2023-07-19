import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    Graph graph=new Graph();
    private JPanel principal;
    private JTabbedPane tabbedPane1;
    private JSpinner spinner1;
    private JButton crearGrafoButton;
    private JTextField vertex1txt;
    private JTextField vertex2txt;
    private JTextField weighttxt;
    private JButton connectButton;
    private JTable tableMatrix;
    private JTextField v1Buscar;
    private JTextField v2Buscar;
    private JButton buscarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,600);
    }

    public Ventana() {
    crearGrafoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int dimentiontxt=Integer.parseInt(spinner1.getValue().toString());
            graph.initialize(dimentiontxt);
            JOptionPane.showMessageDialog(null,"Grafo Creado Existosamente con dimensiones= "+dimentiontxt);
        }
    });
        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v1=Integer.parseInt(vertex1txt.getText());
                int v2=Integer.parseInt(vertex2txt.getText());
                int weight=Integer.parseInt(weighttxt.getText());
                Edge newEdge=new Edge(v1,v2,weight);
                try {
                    graph.addEdge(newEdge);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
                configureTable();
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                int v1=Integer.parseInt(v1Buscar.getText().toString());
                int v2=Integer.parseInt(v2Buscar.getText().toString());
                if(graph.adjacent(v1,v2)){
                    JOptionPane.showMessageDialog(null,"si existe Catredoblesetentatripleijueputa\n y tiene peso de "+graph.weight(v1,v2));
                }
                else{
                    JOptionPane.showMessageDialog(null,"No existe");
                }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
    }
    public void configureTable(){
        DefaultTableModel dtm=new DefaultTableModel();
        for(int i=0;i<graph.dimention();i++){
            dtm.addColumn(""+i);
        }

        for(int a=0;a<graph.dimention();a++){
            Object[] fila=new Object[graph.dimention()];
            for(int b=0;b< graph.dimention();b++){
                fila[b]=graph.matrix[a][b];
            }
            dtm.addRow(fila);
        }
        tableMatrix.setModel(dtm);
    }
}
