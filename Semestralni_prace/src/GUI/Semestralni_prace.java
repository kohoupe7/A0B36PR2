package GUI;

import exeptions.ChybiOperandExep;
import exeptions.ZavorkyExep;
import calc.Vyraz;
import exeptions.ZnamenkaExep;
import graf.Graf;
import java.awt.SystemColor;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Petr Kohout
 */
public class Semestralni_prace extends javax.swing.JFrame {

    Graf gr;
    Vyraz v = new Vyraz();
    boolean graf = false;

    
    public Semestralni_prace() {
        try {//Nastavení vzhledu na vzhled systému
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            getContentPane().setBackground(SystemColor.control);
        } catch (Exception ex) {
        }
        initComponents();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnRovno = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnZavL = new javax.swing.JButton();
        btnNa = new javax.swing.JButton();
        btnFakt = new javax.swing.JButton();
        btnLn = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnZavP = new javax.swing.JButton();
        btnTecka = new javax.swing.JButton();
        btnPi = new javax.swing.JButton();
        btnDeleno = new javax.swing.JButton();
        btnKrat = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        btnGraf = new javax.swing.JButton();
        btnNa2 = new javax.swing.JButton();
        btn2Sqrt = new javax.swing.JButton();
        btnUnMinus = new javax.swing.JButton();
        txtVyraz = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grafická kalkulačka");
        setBounds(new java.awt.Rectangle(0, 0, 450, 250));
        setPreferredSize(new java.awt.Dimension(450, 235));
        setResizable(false);

        btn7.setLabel("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btn0.setLabel("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnRovno.setLabel("=");
        btnRovno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRovnoAction(evt);
            }
        });

        btnLog.setActionCommand("log(");
        btnLog.setLabel("log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnSin.setActionCommand("sin(");
        btnSin.setLabel("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnCos.setActionCommand("cos(");
        btnCos.setLabel("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btn9.setLabel("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btn8.setLabel("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnZavL.setLabel("(");
        btnZavL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnNa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/mocnina.jpg"))); // NOI18N
        btnNa.setActionCommand("^");
        btnNa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnFakt.setLabel("!");
        btnFakt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnLn.setActionCommand("ln(");
        btnLn.setLabel("ln");
        btnLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnE.setLabel("e");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnZavP.setLabel(")");
        btnZavP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnTecka.setLabel(".");
        btnTecka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnPi.setLabel("pi");
        btnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnDeleno.setLabel("/");
        btnDeleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnKrat.setActionCommand("*");
        btnKrat.setLabel("x");
        btnKrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btn6.setLabel("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btn5.setLabel("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btn4.setLabel("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnMinus.setLabel("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btn3.setLabel("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btn2.setLabel("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnPlus.setLabel("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btn1.setLabel("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnSqrt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/odmocninaOb.jpg"))); // NOI18N
        btnSqrt.setActionCommand("sqrt(");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnX.setLabel("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromenaAction(evt);
            }
        });

        btnClear.setText("CA");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBackspace.setText("C");
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceAction(evt);
            }
        });

        btnGraf.setText("Zobrazit graf");
        btnGraf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrafActionPerformed(evt);
            }
        });

        btnNa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/mocnina2.jpg"))); // NOI18N
        btnNa2.setActionCommand("^2");
        btnNa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btn2Sqrt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/odmocnina.jpg"))); // NOI18N
        btn2Sqrt.setActionCommand("2sqrt(");
        btn2Sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAction(evt);
            }
        });

        btnUnMinus.setText("+/-");
        btnUnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnMinusbtnNumAction(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTecka, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRovno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKrat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFakt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGraf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNa2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2Sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnZavL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZavP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSin)
                    .addComponent(btnFakt)
                    .addComponent(btnGraf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn4)
                        .addComponent(btn5)
                        .addComponent(btn6)
                        .addComponent(btnKrat)
                        .addComponent(btnCos)
                        .addComponent(btnUnMinus))
                    .addComponent(btnClear)
                    .addComponent(btnNa2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2Sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn2)
                                .addComponent(btn3)
                                .addComponent(btnMinus)
                                .addComponent(btnLog)
                                .addComponent(btnZavL)
                                .addComponent(btnZavP)
                                .addComponent(btnX))
                            .addComponent(btn1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn0)
                            .addComponent(btnPlus)
                            .addComponent(btnTecka)
                            .addComponent(btnRovno)
                            .addComponent(btnPi)
                            .addComponent(btnE)
                            .addComponent(btnLn)
                            .addComponent(btnBackspace)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        txtVyraz.setEditable(false);
        txtVyraz.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jMenu1.setText("File");

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVyraz, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(txtVyraz, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumAction
        v.pridej(evt.getActionCommand());//přidání stisknutého znaku do výrazu
        txtVyraz.setText(v.getVyraz());
    }//GEN-LAST:event_btnNumAction

    private void btnRovnoAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRovnoAction

        try {
            if (!v.isEmpty()) {
                txtVyraz.setText(v.vyres());//výpis výsledku
                v.clear();
            } else {//odchycení chyb a vyvolání vyskakovacích oken
                JOptionPane.showMessageDialog(this, "Chyba. Nic nezadáno", "Chyba", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ZavorkyExep e) {
            JOptionPane.showMessageDialog(this, "Chyba. " + e.getMessage(), "Chyba", JOptionPane.ERROR_MESSAGE);
        } catch (ChybiOperandExep e) {
            JOptionPane.showMessageDialog(this, "Chyba, nezadán operand u funkce " + e.getMessage(), "Chyba", JOptionPane.ERROR_MESSAGE);
        } catch (ZnamenkaExep e) {
            JOptionPane.showMessageDialog(this, "Chyba, zadány dvě znaménka vedle sebe " + e.getMessage(), "Chyba", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnRovnoAction

    private void btnPromenaAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromenaAction
        v.pridej(evt.getActionCommand());//přidání proměnné do výrazu
        txtVyraz.setText(v.getVyraz());
    }//GEN-LAST:event_btnPromenaAction

    private void btnBackspaceAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceAction
        v.odeber();// odmazání posledního znaku
        txtVyraz.setText(v.getVyraz());
    }//GEN-LAST:event_btnBackspaceAction

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);//ukončení aplikace
    }//GEN-LAST:event_menuExitActionPerformed

    private void btnGrafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrafActionPerformed


        try {
            if (!v.isEmpty()) {
                v.napln();
                gr = new Graf(v.getExp(), v.getVyraz());//vytvoření instance třídy Graf, která se stará o vykreslení grafu
                gr.setVisible(true);
            } else {//odchycení chyb, které mohou nastat při vykreslování
                JOptionPane.showMessageDialog(this, "Chyba. Nic nezadáno", "Chyba", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ZavorkyExep e) {
            JOptionPane.showMessageDialog(this, "Chyba. " + e.getMessage(), "Chyba", JOptionPane.ERROR_MESSAGE);
        } catch (ChybiOperandExep e) {
            JOptionPane.showMessageDialog(this, "Chyba, nezadán operand u některé z funkcí", "Chyba", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGrafActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        v.clear();//vymazání celého výrazu
        txtVyraz.setText(v.getVyraz());
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUnMinusbtnNumAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnMinusbtnNumAction
        txtVyraz.setText(v.unarMinus());//přidá unární mínus k poslednímu prvku
    }//GEN-LAST:event_btnUnMinusbtnNumAction

    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Semestralni_prace().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn2Sqrt;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDeleno;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnFakt;
    private javax.swing.JButton btnGraf;
    private javax.swing.JButton btnKrat;
    private javax.swing.JButton btnLn;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnNa;
    private javax.swing.JButton btnNa2;
    private javax.swing.JButton btnPi;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnRovno;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnTecka;
    private javax.swing.JButton btnUnMinus;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnZavL;
    private javax.swing.JButton btnZavP;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JTextField txtVyraz;
    // End of variables declaration//GEN-END:variables
}
