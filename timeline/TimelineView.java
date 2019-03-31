package timeline;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimelineView {

    private JPanel panel;

    private JTextField jtField;

    private JButton sendButton;

    private JButton resetButton;
    
    private JTextArea ta;
    
    private String at = "";

    public static void main(String args[]) {

        TimelineView view = new TimelineView();
        view.setUpview();
    }

    public void setUpview() {

        //Creating the Frame
        JFrame frame = new JFrame("Timeline");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        mb.add(m1);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        //Creating the panel at bottom and adding components
        panel = new JPanel();

        JLabel label = new JLabel("Enter Event");
        jtField = new JTextField(36); // accepts up to 36 characters
        sendButton = new JButton("Enter");
        resetButton = new JButton("Reset");
        sendButton.addActionListener(new LoadFileDataListener());
        panel.add(label); // Components Added using Flow Layout
        panel.add(label); // Components Added using Flow Layout
        panel.add(jtField);
        panel.add(sendButton);
        panel.add(resetButton);

        // Text Area at the Center
        ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }

    class LoadFileDataListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String boxText = jtField.getText();

            System.out.println("Inside Action Listener; file: ");

            System.out.println(boxText);
            
            at = at + boxText+"\n";
            
            ta.setText(at);

            jtField.setText("");
            
        }//end of action event
    }// end of action listener
} // end of class 

