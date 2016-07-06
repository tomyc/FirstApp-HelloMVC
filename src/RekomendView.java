import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Tomasz on 06.07.2016.
 */
public class RekomendView extends JFrame {
    private JTextField regionTF;
    private JTextField wartoscTF;
    private JButton znajdzButton;
    private JTextPane wynikiWyszukiwaniaTP;
    private JPanel rekomendPanel;

    RekomendView(){
        this.add(rekomendPanel);
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getRegion(){
        return regionTF.getText();
    }

    public void setWynikiWyszukiwaniaTP(String miejsce){
        wynikiWyszukiwaniaTP.setText(miejsce);
    }

    void addZnajdzListener(ActionListener listenerForZnajdzBtn){
        znajdzButton.addActionListener(listenerForZnajdzBtn);
    }

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage);
    }




}
