/***************************************************************************
 *   Copyright (C) 2014 by Paul Lutus                                      *
 *   http://arachnoid.com/administration                                   *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program; if not, write to the                         *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 ***************************************************************************/

/*
 * ImagePanel.java
 *
 * Created on Nov 15, 2011, 12:59:33 AM
 */
package hdtvtestpattern;

import java.awt.*;
import java.awt.geom.*;
import java.io.*;

/**
 *
 * @author lutusp
 */
public class ImagePanel extends javax.swing.JPanel {

    HDTVTestPattern parent;
    Font ttfFont = null;

    /** Creates new form ImagePanel */
    public ImagePanel(HDTVTestPattern p) {
        parent = p;
        initComponents();
        setBorder(null);
        try {
            InputStream is = HDTVTestPattern.class.getResourceAsStream("verdana.ttf");
            ttfFont = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        int width = getWidth();
        int height = getHeight();
        renderPattern(gg, width, height, true);
    }

    public void renderPattern(Graphics gg, int width, int height, boolean fromJava) {
        Graphics2D g2 = (Graphics2D) gg;
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        g2.setColor(Color.black);
        g2.fillRect(0, 0, width, height);

        Font numFont = ttfFont.deriveFont(Font.PLAIN, 6.5e-3f * width);
        Font hFont = numFont.deriveFont(11e-3f * width);
        FontMetrics metrics = g2.getFontMetrics(hFont);
        drawInstructions(g2, width, height, hFont, metrics, fromJava);
        AffineTransform fat = new AffineTransform();
        fat.rotate(Math.PI / 2);
        Font vFont = hFont.deriveFont(fat);
        int ch = metrics.getHeight();
        int cw = metrics.charWidth('H');
        FontMetrics hmetrics = g2.getFontMetrics(numFont);
        int fh = hmetrics.getHeight();
        int xs = (int) (12e-3 * width);
        int sh = (int) (4.44e-2 * height);
        int oh = sh + fh + 10;
        int ybase = height / 2;
        int step = 4;
        int efw = width - (int) (4.3e-2 * width);
        Color[] cols = new Color[]{Color.white, Color.red, Color.green, Color.blue, Color.yellow, Color.magenta, Color.cyan};
        String[] colName = new String[]{"White", "Red", "Green", "Blue", "Yellow", "Magenta", "Cyan"};
        g2.setFont(vFont);
        int lyh = ybase + (fh + sh) * cols.length;
        drawLimits(g2, step, efw, xs, 16, ybase, lyh, "Black Reference", metrics);
        drawLimits(g2, step, efw, xs, 236, ybase, lyh, "White Reference", metrics);

        for (int y = 0; y < cols.length; y++) {
            g2.setFont(numFont);
            drawStrip(g2, xs, step, fh, efw, ybase + y * oh, sh, cols[y], hmetrics);
            g2.setFont(hFont);
            g2.setColor(Color.black);
            g2.drawString(colName[y], width * 4 / 5, ybase + y * oh + sh * 2 / 3);
        }
        drawBorders(g2, ch, width, height, vFont, hFont, metrics);
    }

    private void drawStrip(Graphics2D g2, int xs, int step, int fh, int efw, int ys, int bh, Color col, FontMetrics metrics) {

        for (int i = 0; i <= 256; i += step) {
            int qr = col.getRed() * i / 256;
            int qg = col.getGreen() * i / 256;
            int qb = col.getBlue() * i / 256;
            int xp = xs + efw * i / 256;
            int bw = (efw * step / 256) + 1;
            g2.setColor(new Color(qr, qg, qb));
            g2.fillRect(xp, ys, bw, bh);
            g2.setColor(Color.white);
            String s = "" + i;
            int w = metrics.stringWidth(s);
            float xt = xp + (bw - w) / 2.0f;
            int j = (i > 0)?i-1:i;
            g2.drawString("" + j, xt, ys + bh + fh);
        }
    }

    private void drawLimits(Graphics2D g2, int step, int efw, int xs, int x, int y, int h, String s, FontMetrics vmetrics) {
        int bw = (efw * step / 256);
        int xp = (xs + efw * x / 256) + bw / 2;
        int sw = vmetrics.stringWidth(s + "  ");
        y -= sw;
        h -= sw;
        g2.setColor(Color.gray);
        g2.drawLine(xp, y, xp, y + h);
        g2.setColor(Color.white);
        g2.drawString(s, xp + 4, y);
    }

    private void drawInstructions(Graphics2D g2, int width, int height, Font font, FontMetrics metrics, boolean fromJava) {
        int lineHeight = (int) (metrics.getHeight() * 1.2);
        int charWidth = metrics.charWidth('H');
        g2.setFont(font);
        g2.setColor(Color.white);
        // in character units
        int vpos = 2;
        int hpos = 2;
        for (String s : parent.instructions) {
            if (s.matches(".*%dx%d.*")) {
                s = String.format(s, width, height);
            }
            if (!s.matches("(?i).*press any key.*") || fromJava) {
                if (s.substring(0, 1).equals(">")) {
                    s = "    * " + s.substring(1);
                }
                vpos = printLine(g2, lineHeight, charWidth, hpos, vpos, s);
            }
        }

    }

    private int printLine(Graphics2D g2, int lineHeight, int charWidth, int hPos, int vpos, String s) {
        g2.drawString(s, hPos * charWidth, vpos * lineHeight);
        return vpos + 1;
    }

    private void drawBorders(Graphics2D g2, int ch, int width, int height, Font vFont, Font hFont, FontMetrics metrics) {
        g2.setColor(Color.white);
        g2.drawRect(0, 0, width - 1, height - 1);
        String s = "White border indicates no overscan";
        int len = metrics.stringWidth(s);
        int h = (width - len) / 2;
        g2.setFont(hFont);
        g2.drawString(s, h, ch - 6);
        g2.drawString(s, h, height - 4);
        g2.setFont(vFont);
        int v = (height - len) / 2;
        g2.drawString(s, 4, v);
        g2.drawString(s, width - ch + 6, v);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
