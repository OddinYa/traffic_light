import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Light extends JPanel implements ActionListener {


    private boolean oN = true;

    public void showColor() {
        while (oN) {
            setBackground(getColor());
        }


    }
    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }


    private int tryTime() {
        String time = getDateTime().substring(getDateTime().length() - 2);
        int sec = Integer.parseInt(time);
        return sec;
    }
    // private DateTime //почитать java 8 Date Time ..

    public Color getColor() {
        if (tryTime() <= 20) return Color.RED;
        if (tryTime() > 20 && tryTime() <= 40) return Color.YELLOW;
        if (tryTime() > 40) return Color.GREEN;
        return null;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
//        long starTime = System.currentTimeMillis();
//        long timerColor = 0;
//        timerColor = (new Date()).getTime() - starTime;
