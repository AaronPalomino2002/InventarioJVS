
package modelo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author aaron
 */
public class JpanelRound extends JPanel {
    private int topLeftRadius = 20;
    private int topRightRadius = 20;
    private int bottomLeftRadius = 20;
    private int bottomRightRadius = 20;

    public JpanelRound() {
        setOpaque(false); // Hace el panel transparente para que las esquinas redondeadas sean visibles.
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground()); // Usa el color de fondo actual del panel
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), topLeftRadius, topLeftRadius);
    }

    // Métodos para establecer el radio de cada esquina
    public void setTopLeftRadius(int radius) {
        this.topLeftRadius = radius;
        repaint();
    }

    public void setTopRightRadius(int radius) {
        this.topRightRadius = radius;
        repaint();
    }

    public void setBottomLeftRadius(int radius) {
        this.bottomLeftRadius = radius;
        repaint();
    }

    public void setBottomRightRadius(int radius) {
        this.bottomRightRadius = radius;
        repaint();
    }

    // Getters si necesitas recuperar el valor de los radios
    public int getTopLeftRadius() {
        return topLeftRadius;
    }

    public int getTopRightRadius() {
        return topRightRadius;
    }

    public int getBottomLeftRadius() {
        return bottomLeftRadius;
    }

    public int getBottomRightRadius() {
        return bottomRightRadius;
    }
}
