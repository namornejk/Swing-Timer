import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MainFrame extends JFrame {
    private JLabel lblTime;

    public MainFrame(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        lblTime = new JLabel(getTime());
        add(lblTime);
        pack();
        timer();
    }

    private void timer(){
        ActionListener updateClockAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblTime.setText(getTime());
            }
        };

        Timer t = new Timer(1000, updateClockAction);
        t.start();
    }

    private String getTime(){
        return new Date().toString();
    }
}
