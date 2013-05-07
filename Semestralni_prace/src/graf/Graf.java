package graf;

import calc.Expr;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

public class Graf extends javax.swing.JFrame {

    private int a, v, velikostCarky, pocetDilkuX, pocetDilkuY, nulaX, nulaY, krokX, krokY, xStara, yStara;
    private int xMysiPosledni = 0, yMysiPosledni = 0;
    private boolean stejneOsy, mysUvnitr = false;
    private Color barvaPismen, barvaGrafu;
    private static double hodnotaDilkuX, hodnotaDilkuY;
    private double jemnost;
    private Expr exp;
    private String vyraz;

    
    public Graf(Expr exp, String vyraz) {
        this.exp = exp;
        this.vyraz=vyraz;
     
        initComponents();
        //Nastavení počátečních parametrů
        a = 0;//okraje stránky
        v = 10;//velikost bodu
        velikostCarky = 10;
        pocetDilkuX = 30;
        pocetDilkuY = 30;
        stejneOsy = true;
        jemnost = 0.1;
        hodnotaDilkuX = 1;
        hodnotaDilkuY = 1;
        //Nastavení počátečních parametrů - end

        barvaPismen = Color.RED;
        barvaGrafu = Color.GREEN;
        nulaX = vykreslovaciPlocha.getWidth() / 2;
        nulaY = vykreslovaciPlocha.getHeight() / 2;
        krokX = (vykreslovaciPlocha.getWidth() - 2 * a) / pocetDilkuX;
        krokY = stejneOsy ? krokX : (vykreslovaciPlocha.getHeight() - 2 * a) / pocetDilkuY;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vykreslovaciPlocha = new javax.swing.JPanel() {
            public void paint (Graphics g) {
                super.paint(g);
                kresli(g);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        polX = new javax.swing.JLabel();
        polY = new javax.swing.JLabel();
        chbxZobrazitKurzor = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPolX = new javax.swing.JLabel();
        lblPolY = new javax.swing.JLabel();
        chbxZobrazitBod = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        chbxZoomX = new javax.swing.JCheckBox();
        chbxZoomY = new javax.swing.JCheckBox();
        chbxPosun = new javax.swing.JCheckBox();
        btnUloz = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuClrGr = new javax.swing.JMenuItem();
        menuClrPop = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Graf");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setName("graf"); // NOI18N

        vykreslovaciPlocha.setBackground(new java.awt.Color(255, 255, 255));
        vykreslovaciPlocha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        vykreslovaciPlocha.setCursor( vykreslovaciPlocha.getToolkit().createCustomCursor(new BufferedImage( 1, 1, BufferedImage.TYPE_INT_ARGB ), new Point(), null));
        vykreslovaciPlocha.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                vykreslovaciPlochaZoom(evt);
            }
        });
        vykreslovaciPlocha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vykreslovaciPlochaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                vykreslovaciPlochaMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vykreslovaciPlochaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vykreslovaciPlochaMouseEntered(evt);
            }
        });
        vykreslovaciPlocha.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                vykreslovaciPlochaComponentResized(evt);
            }
        });
        vykreslovaciPlocha.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                vykreslovaciPlochaMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout vykreslovaciPlochaLayout = new javax.swing.GroupLayout(vykreslovaciPlocha);
        vykreslovaciPlocha.setLayout(vykreslovaciPlochaLayout);
        vykreslovaciPlochaLayout.setHorizontalGroup(
            vykreslovaciPlochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        vykreslovaciPlochaLayout.setVerticalGroup(
            vykreslovaciPlochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kurzor"));
        jPanel1.setFocusable(false);
        jPanel1.setMinimumSize(new java.awt.Dimension(117, 65));

        jLabel1.setText("X:");

        jLabel2.setText("Y:");

        polX.setText("num");

        polY.setText("num");

        chbxZobrazitKurzor.setText("Zobrazit");
        chbxZobrazitKurzor.setFocusPainted(false);
        chbxZobrazitKurzor.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(polX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(polY, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chbxZobrazitKurzor)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(chbxZobrazitKurzor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(polX)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(polY)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Hodnota"));
        jPanel3.setFocusable(false);
        jPanel3.setMinimumSize(new java.awt.Dimension(117, 65));

        jLabel5.setText("X:");

        jLabel6.setText("Y:");

        lblPolX.setText("num");

        lblPolY.setText("num");

        chbxZobrazitBod.setText("Zobrazit");
        chbxZobrazitBod.setFocusPainted(false);
        chbxZobrazitBod.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblPolY, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addComponent(lblPolX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chbxZobrazitBod)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(chbxZobrazitBod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPolX)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblPolY)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Nástroje"));
        jPanel4.setFocusable(false);
        jPanel4.setMinimumSize(new java.awt.Dimension(117, 65));

        chbxZoomX.setText("Zoom X");
        chbxZoomX.setFocusPainted(false);
        chbxZoomX.setFocusable(false);

        chbxZoomY.setText("Zoom Y");
        chbxZoomY.setFocusPainted(false);
        chbxZoomY.setFocusable(false);

        chbxPosun.setText("Posun");
        chbxPosun.setFocusPainted(false);
        chbxPosun.setFocusable(false);

        btnUloz.setText("Uložit");
        btnUloz.setFocusable(false);
        btnUloz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUloz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUloz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUlozActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chbxZoomX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chbxZoomY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chbxPosun)
                    .addComponent(btnUloz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(chbxPosun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbxZoomX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbxZoomY)
                .addGap(44, 44, 44)
                .addComponent(btnUloz, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jMenu1.setText("Úpravy");

        menuClrGr.setText("Barva popisů");
        menuClrGr.setActionCommand("pop");
        menuClrGr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColorAct(evt);
            }
        });
        jMenu1.add(menuClrGr);

        menuClrPop.setText("Barva grafu");
        menuClrPop.setActionCommand("graf");
        menuClrPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColorAct(evt);
            }
        });
        jMenu1.add(menuClrPop);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(vykreslovaciPlocha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(vykreslovaciPlocha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuColorAct(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColorAct
        switch (evt.getActionCommand()) {//výběr barev
            case "pop":
                barvaPismen = JColorChooser.showDialog(this, "Barva", barvaPismen);
                break;
            case "graf":
                barvaGrafu = JColorChooser.showDialog(this, "Barva", barvaGrafu);
                break;
        }
        vykreslovaciPlocha.repaint();
    }//GEN-LAST:event_menuColorAct

    private void vykreslovaciPlochaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vykreslovaciPlochaMousePressed
        xStara = evt.getX();//uchovává souřadnice při stisku, kvůli posuvu grafu
        yStara = evt.getY();

    }//GEN-LAST:event_vykreslovaciPlochaMousePressed

    private void vykreslovaciPlochaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vykreslovaciPlochaMouseReleased
        int xPosuv = xStara - evt.getX();
        int yPosuv = yStara - evt.getY();

        if (chbxPosun.isSelected()) {//při puštění myši vypočítá souřadnice, posune graf a překreslí
            nulaX = nulaX - xPosuv;
            nulaY = nulaY - yPosuv;
            vykreslovaciPlocha.repaint();
        }

    }//GEN-LAST:event_vykreslovaciPlochaMouseReleased

    private void vykreslovaciPlochaZoom(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_vykreslovaciPlochaZoom

        //pokud jsou zaškrtnuty boxy pro zoom, tak při otáčení kolečka myši mění měřítko určené osy
        if (chbxZoomX.isSelected()) {
            hodnotaDilkuX = evt.getWheelRotation() == 1 ? hodnotaDilkuX + 0.1 * hodnotaDilkuX : hodnotaDilkuX - 0.1 * hodnotaDilkuX;
            jemnost = evt.getWheelRotation() == 1 ? jemnost + 0.1 * jemnost : jemnost - 0.1 * jemnost;
        }
        if (chbxZoomY.isSelected()) {
            hodnotaDilkuY = evt.getWheelRotation() == 1 ? hodnotaDilkuY + 0.1 * hodnotaDilkuY : hodnotaDilkuY - 0.1 * hodnotaDilkuY;
        }

        vykreslovaciPlocha.repaint();

    }//GEN-LAST:event_vykreslovaciPlochaZoom

    private void vykreslovaciPlochaComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_vykreslovaciPlochaComponentResized
        //při zvětšení okna roztáhne graf
        krokX = (vykreslovaciPlocha.getWidth() - 2 * a) / pocetDilkuX;
        krokY = stejneOsy ? krokX : (vykreslovaciPlocha.getHeight() - 2 * a) / pocetDilkuY;
        vykreslovaciPlocha.repaint();
    }//GEN-LAST:event_vykreslovaciPlochaComponentResized

    private void vykreslovaciPlochaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vykreslovaciPlochaMouseMoved
        // vypisování souřadnic myši, a uchovávání souřadnic pro vykreslování bodu
        xMysiPosledni = evt.getX();
        yMysiPosledni = evt.getY();
        polX.setText(String.format("%.3f", Tools.pxToSour(evt.getX(), nulaX, krokX, 'x', hodnotaDilkuX)));
        polY.setText(String.format("%.3f", Tools.pxToSour(evt.getY(), nulaY, krokY, 'y', hodnotaDilkuY)));
        vykreslovaciPlocha.repaint();
    }//GEN-LAST:event_vykreslovaciPlochaMouseMoved

    private void vykreslovaciPlochaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vykreslovaciPlochaMouseEntered
        mysUvnitr = true;
        vykreslovaciPlocha.repaint();
    }//GEN-LAST:event_vykreslovaciPlochaMouseEntered

    private void vykreslovaciPlochaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vykreslovaciPlochaMouseExited
        mysUvnitr = false;
        vykreslovaciPlocha.repaint();
    }//GEN-LAST:event_vykreslovaciPlochaMouseExited

    private void btnUlozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUlozActionPerformed

        JFileChooser chs = new JFileChooser();
        chs.showSaveDialog(this);
        File imgFile = chs.getSelectedFile();//výběr souboru
        if(imgFile!=null){
        BufferedImage im = new BufferedImage(vykreslovaciPlocha.getWidth(), vykreslovaciPlocha.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
        Graphics obr = im.createGraphics();//vytvoření grafického obrázku
        obr.setColor(Color.white);
        obr.fillRect(0, 0, im.getWidth(), im.getHeight());
        kresli(obr);//vykreslí do obrázku graf
        obr.setColor(Color.black);
        obr.drawString("y="+vyraz, vykreslovaciPlocha.getWidth()-200, vykreslovaciPlocha.getHeight()-20);
        try {
            ImageIO.write(im, "png", imgFile);// ulozí obrázek jako PNG
        } catch (IOException ex) {
            Logger.getLogger(Graf.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_btnUlozActionPerformed

    private void kresli(Graphics g) {
        if (mysUvnitr) {// když je myš uvnitř panelu tak kreslí vodící čáry a bod
            if (chbxZobrazitKurzor.isSelected()) {
                vykreslovaciPlocha.setCursor(vykreslovaciPlocha.getToolkit().createCustomCursor(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB), new Point(), null));
                g.drawLine(xMysiPosledni, 0, xMysiPosledni, vykreslovaciPlocha.getHeight());
                g.drawLine(0, yMysiPosledni, vykreslovaciPlocha.getWidth(), yMysiPosledni);
            } else {
                vykreslovaciPlocha.setCursor(Cursor.getDefaultCursor());
            }
            if (chbxZobrazitBod.isSelected()) {
                BodGrafu b = new BodGrafu(exp,Tools.pxToSour(xMysiPosledni, nulaX, krokX, 'x', hodnotaDilkuX), nulaX, krokX, nulaY, krokY, g, v, barvaGrafu, hodnotaDilkuX, hodnotaDilkuY);
                lblPolX.setText(String.format("%.3f", b.getX()));
                lblPolY.setText(String.format("%.3f", b.getY()));
            }
        }

        g.setColor(Color.BLACK);
        vykresliOsy(g);//vykreslí osy souřadnic

        Prubeh j = new Prubeh(exp, Tools.pxToSour(a, nulaX, krokX, 'x', hodnotaDilkuX), Tools.pxToSour(vykreslovaciPlocha.getWidth() - a, nulaX, krokX, 'x', hodnotaDilkuX), jemnost, g, barvaGrafu, nulaX, nulaY, krokX, krokY);
        //vytvoří instanci třídy Prubeh, která uchovává jednotlivé body a rovnou celý průběh vykreslí
    }

    private void vykresliOsy(Graphics g) {

        g.drawLine(a, nulaY, vykreslovaciPlocha.getWidth() - a, nulaY);
        g.drawLine(nulaX, a, nulaX, vykreslovaciPlocha.getHeight() - a); //Vykreslení souřadných os

        int dilkyXAkt = 0;
        for (int i = nulaX, kolikatej = 0; i <= vykreslovaciPlocha.getWidth() - a; i = i + krokX, kolikatej++, dilkyXAkt++) { // vykreslení měřítka osa X doprava
            if (kolikatej % 5 == 0 && kolikatej != 0) {
                g.setColor(barvaPismen);
                g.drawLine(i, nulaY, i, nulaY + velikostCarky);

                g.drawString(String.format("%.2f", kolikatej * hodnotaDilkuX), i - 3, nulaY + 2 * velikostCarky + 3);
                g.setColor(Color.black);
            } else {
                g.drawLine(i, nulaY, i, nulaY + (velikostCarky / 2));
            }
        }
        for (int i = nulaX, kolikatej = 0; i >= a; i = i - krokX, kolikatej++, dilkyXAkt++) { // vykreslení měřítka osa X doleva
            if (kolikatej % 5 == 0 && kolikatej != 0) {
                g.setColor(barvaPismen);
                g.drawLine(i, nulaY, i, nulaY + velikostCarky);

                g.drawString("-" + String.format("%.2f", kolikatej * hodnotaDilkuX), i - 8, nulaY + 2 * velikostCarky + 3);
                g.setColor(Color.black);
            } else {
                g.drawLine(i, nulaY, i, nulaY + (velikostCarky / 2));
            }
        }

        for (int j = nulaY, kolikatej = 0; j >= a; j = j - krokY, kolikatej++) { //vykreslení měřítka osa Y dolu
            if (kolikatej % 5 == 0 && kolikatej != 0) {
                g.setColor(barvaPismen);
                g.drawLine(nulaX - velikostCarky, j, nulaX, j);
                g.drawString(String.format("%.2f", kolikatej * hodnotaDilkuY), nulaX + 2 * velikostCarky - 9, j + 5);
                g.setColor(Color.black);
            } else {
                g.drawLine(nulaX - (velikostCarky / 2), j, nulaX, j);
            }

        }
        for (int j = nulaY, kolikatej = 0; j <= vykreslovaciPlocha.getHeight() - a; j = j + krokY, kolikatej++) { //vykreslení měřítka osa Y 
            if (kolikatej % 5 == 0 && kolikatej != 0) {
                g.setColor(barvaPismen);
                g.drawLine(nulaX - velikostCarky, j, nulaX, j);
                g.drawString("-" + String.format("%.2f", kolikatej * hodnotaDilkuY), nulaX + 2 * velikostCarky - 15, j + 5);
                g.setColor(Color.black);
            } else {
                g.drawLine(nulaX - (velikostCarky / 2), j, nulaX, j);
            }
        }
    }

    public static double getHodnotaDilku(char ktery) {
        return ktery == 'x' ? hodnotaDilkuX : hodnotaDilkuY;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUloz;
    private javax.swing.JCheckBox chbxPosun;
    private javax.swing.JCheckBox chbxZobrazitBod;
    private javax.swing.JCheckBox chbxZobrazitKurzor;
    private javax.swing.JCheckBox chbxZoomX;
    private javax.swing.JCheckBox chbxZoomY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblPolX;
    private javax.swing.JLabel lblPolY;
    private javax.swing.JMenuItem menuClrGr;
    private javax.swing.JMenuItem menuClrPop;
    private javax.swing.JLabel polX;
    private javax.swing.JLabel polY;
    private javax.swing.JPanel vykreslovaciPlocha;
    // End of variables declaration//GEN-END:variables
}
