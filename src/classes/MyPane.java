package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class MyPane extends JPanel {
    private JLabel cLabel = new JLabel("Center");
    private JLabel wLabel = new JLabel("West");
    private JLabel sLabel = new JLabel("South");
    private JLabel nLabel = new JLabel("North");
    private JLabel eLabel = new JLabel("East");
    private BorderLayout bl = new BorderLayout();
    public MyPane() {
        setLayout(bl);
        nLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE,20));
        sLabel.setBorder(BorderFactory.createLineBorder(Color.ORANGE,20));
        wLabel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,20));
        eLabel.setBorder(BorderFactory.createLineBorder(Color.RED,20));
        cLabel.setBorder(BorderFactory.createLineBorder(Color.GREEN,20));
        add(nLabel, BorderLayout.NORTH);
        add(sLabel, BorderLayout.SOUTH);
        add(wLabel, BorderLayout.WEST);
        add(eLabel, BorderLayout.EAST);
        add(cLabel, BorderLayout.CENTER);
        nLabel.addMouseListener(new MouseEvent(1));
        sLabel.addMouseListener(new MouseEvent(2));
        wLabel.addMouseListener(new MouseEvent(3));
        eLabel.addMouseListener(new MouseEvent(4));
        cLabel.addMouseListener(new MouseEvent(5));
    }

    class MouseEvent implements MouseListener{
        int side;
        MouseEvent(int county) {
            this.side = county;
        }

        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {}
        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {}
        @Override
        public void mouseReleased(java.awt.event.MouseEvent e){}

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            switch (side) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в САО", "", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО", "", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО", "", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО", "", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО", "Окно", JOptionPane.YES_OPTION);
                    break;
                default:
                    break;
            }
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {}
    }



}