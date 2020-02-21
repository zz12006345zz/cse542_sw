import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class Panel implements ActionListener {
    /* add button, left up */
    private JButton AddButton;
    /* remove button, right up */
    private JButton RemoveButton;
    /* window */
    private JFrame frame;

    private class student {
        private String name;
        private String email;
        private String password;
    }
    /* constructor */
    public Panel(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AddButton = new JButton("Add a student");
        RemoveButton = new JButton("Remove a student");
        AddButton.addActionListener(this);

        frame.add(BorderLayout.NORTH, AddButton);
		frame.add(BorderLayout.SOUTH, RemoveButton);
		frame.pack(); // Size the window automatically
		frame.setVisible(true);
    }

    public static void main(String[] args){
        Panel test = new Panel();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == AddButton) {
            String str = JOptionPane.showInputDialog("What is your name?");
        }
    }
}

