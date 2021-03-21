import javax.swing.*;

public class Main extends JFrame{

    public Main() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Светофор");
        setSize(500,500);
        setVisible(true);
        Light light = new Light();
        add(light);
        light.showColor();

    }


    public static void main(String[] args) {

        Main trafic = new Main();

    }
}
