/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet11;

/**
 *
 * @author ASUS
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm1841720155Fana extends JFrame {
    
    private static final int  FRAME_WIDTH=600;
    private static final int FRAME_HEIGHT=200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JPanel panel;
    
    public MyInputForm1841720155Fana(){
    createTextField();
    createButton();
    createPanel();
    setSize(FRAME_WIDTH, FRAME_WIDTH);
    }
    
    private void createTextField(){
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai C: ");
        cLabel = new JLabel("Hasil : ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    private void createButton(){
            button = new JButton("calculate");// untuk membuat tombol calculate"
            class AddInteresListener implements ActionListener{
                //untuk event klik
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());//mengambil inputan 
                int b = Integer.valueOf(bField.getText());
                int c = a*b;
                cLabel.setText("Hasil: "+c);
            }
            }  
        ActionListener listener =  new AddInteresListener();
        button.addActionListener(listener);
    }
    private void createPanel(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        add(panel);
    }
    
    public static void main(String[] args) {
         //TODO code application logic here
         JFrame frame = new MyInputForm1841720155Fana();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
         frame.setLocationRelativeTo(null);
    }
}

