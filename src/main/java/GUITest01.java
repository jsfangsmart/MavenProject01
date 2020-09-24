import javax.swing.*;

/**
 * Description:
 * Auther:smart
 * Date: 2020/9/24 上午11:58
 */
    public class GUITest01 {
    private JButton button1;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUITest01");
        frame.setContentPane(new GUITest01().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
