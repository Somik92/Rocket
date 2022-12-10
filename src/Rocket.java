//Usually you will require both swing and awt packages
// even if you are working with just swings.
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class Rocket {
    public static void main(String args[]) throws IOException, FontFormatException {

        //Creating the Frame
        Color darkColor = new Color(63, 59, 59);
        JFrame frame = new JFrame("Chat Frame");
        frame.getContentPane();



//        Font font = Font.createFont(new File("src/BebasNeue-Regular.ttf"));
//        Font font = Font.createFont("src/BebasNeue-Regular.ttf");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(3456, 2234);;
        frame.getContentPane().setBackground(darkColor);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
//        JTextArea ta = new JTextArea();


        // main Buttons
        JButton equityButton = createSimpleButton("EQUITY",createFont(), 0, 0);
        JButton bondButton = createSimpleButton("BOND", createFont(), 250, 0);
        JButton cryptoButton = createSimpleButton("CRYPTO", createFont(), 800, 500);
        JPanel panel2 = new JPanel();


        panel2.setBackground(darkColor);
        panel2.add(bondButton);
        panel2.add(equityButton);
        panel2.add(cryptoButton);



        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.CENTER, panel2);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
//        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }

    private static JButton createSimpleButton(String text, Font font, int x, int y) {
        JButton button = new JButton(text);
        button.setFont(font);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.BLACK);
        button.setBounds(x, y, 200, 100);
//        button.setPreferredSize(new Dimension(200, 100));
        return button;
    }

    public static Font createFont() throws IOException, FontFormatException {
        Font font = Font.createFont(Font.TRUETYPE_FONT, new File("src/BebasNeue-Regular.ttf")).deriveFont(50f);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);
        return font;
    }
}