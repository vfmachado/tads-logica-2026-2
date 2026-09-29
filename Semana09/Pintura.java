import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pintura extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        
        for (int i = 0; i < 400; i = i + 20) {
            g.drawLine(0, 400 - i, i, 0);
        }
        
        g.setColor(Color.YELLOW);
        for (int i = 0; i < 10; i++) {
            g.fillOval(0 + i * 40, 200, 20, 20);
        }

    }

    public static void main(String[] args) {
        
        // janela 400x400 + barra de titulo
        JFrame frame = new JFrame("Pintura");
        frame.setSize(400, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // painel 400x400
        Pintura panel = new Pintura();
        panel.setSize(400, 400);
        frame.add(panel);

        panel.repaint();

        frame.setVisible(true);
    }
}
