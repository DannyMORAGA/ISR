/*
Jehu Daniel Moraga Galve, 0901-17-3945
14/05/2019 11:15 am
Programa con formas pra poder visualizar Arboles y poder ponerlos en su forma de Postorden, Inorden y Preorden 
 */
package arbolBB;
/**
 *
 * @author
 */
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class PanelFondo extends javax.swing.JPanel {

    private String ruta;
//Da tamañao al panel.
    public PanelFondo() {
        initComponents();
        this.setSize(933, 690);
        this.ruta = "";

    }

    @Override
    public void paintComponent(Graphics g) {
        
        Dimension tam = getSize();
        ImageIcon ImagenFondo = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage());
        g.drawImage(ImagenFondo.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}