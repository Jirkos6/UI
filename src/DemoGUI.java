import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class DemoGUI extends JFrame {
    private JTextField txtName;
    private JButton btnClick;
    private JPanel panelMain;
    private JTextPane textPane1;
    private JButton kopirujButton;



    public DemoGUI() {


        textPane1.setEditable(false);


        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random generator = new Random();
                int nahodne = generator.nextInt(100); // -> 0..99
                System.out.println(nahodne);

             //   textPane1.setText(txtName.getText() + "\n" + nahodne);


                txtName.setText(Integer.toString(nahodne));


            }
        });

        kopirujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ){
                textPane1.setText(textPane1.getText() + txtName.getText() + "\n");


            }
        });
    }

    public static void main(String[] args) {
        DemoGUI h = new DemoGUI();
        h.setContentPane(h.panelMain);
        h.setTitle("javaGUI");
        h.setBounds(600,200,600,200);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
