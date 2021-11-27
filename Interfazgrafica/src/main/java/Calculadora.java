
public class Calculadora extends javax.swing.JFrame {
    public Double n1;
    public Double n2;
    public String op;
    

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        igual = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        div = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        salida = new javax.swing.JTextField();
        all = new javax.swing.JButton();
        del = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        salida2 = new javax.swing.JTextField();
        raiz = new javax.swing.JButton();
        pot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        igual.setBackground(new java.awt.Color(57, 57, 56));
        igual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setText("=");
        igual.setFocusPainted(false);
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        suma.setBackground(new java.awt.Color(20, 20, 20));
        suma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        suma.setForeground(new java.awt.Color(255, 255, 255));
        suma.setText("+");
        suma.setFocusPainted(false);
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setBackground(new java.awt.Color(20, 20, 20));
        resta.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        resta.setForeground(new java.awt.Color(255, 255, 255));
        resta.setText("-");
        resta.setFocusPainted(false);
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        mult.setBackground(new java.awt.Color(20, 20, 20));
        mult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mult.setForeground(new java.awt.Color(255, 255, 255));
        mult.setText("x");
        mult.setFocusPainted(false);
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });

        div.setBackground(new java.awt.Color(20, 20, 20));
        div.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        div.setForeground(new java.awt.Color(255, 255, 255));
        div.setText("÷");
        div.setFocusPainted(false);
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        cero.setBackground(new java.awt.Color(7, 7, 7));
        cero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cero.setForeground(new java.awt.Color(255, 255, 255));
        cero.setText("0");
        cero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cero.setFocusPainted(false);
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        uno.setBackground(new java.awt.Color(7, 7, 7));
        uno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        uno.setForeground(new java.awt.Color(255, 255, 255));
        uno.setText("1");
        uno.setFocusPainted(false);
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(7, 7, 7));
        dos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dos.setForeground(new java.awt.Color(255, 255, 255));
        dos.setText("2");
        dos.setFocusPainted(false);
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(7, 7, 7));
        tres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tres.setForeground(new java.awt.Color(255, 255, 255));
        tres.setText("3");
        tres.setFocusPainted(false);
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(7, 7, 7));
        cuatro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cuatro.setForeground(new java.awt.Color(255, 255, 255));
        cuatro.setText("4");
        cuatro.setFocusPainted(false);
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(7, 7, 7));
        cinco.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cinco.setForeground(new java.awt.Color(255, 255, 255));
        cinco.setText("5");
        cinco.setFocusPainted(false);
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(7, 7, 7));
        seis.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        seis.setForeground(new java.awt.Color(255, 255, 255));
        seis.setText("6");
        seis.setFocusPainted(false);
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(7, 7, 7));
        siete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        siete.setForeground(new java.awt.Color(255, 255, 255));
        siete.setText("7");
        siete.setFocusPainted(false);
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(7, 7, 7));
        ocho.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ocho.setForeground(new java.awt.Color(255, 255, 255));
        ocho.setText("8");
        ocho.setFocusPainted(false);
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(7, 7, 7));
        nueve.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nueve.setForeground(new java.awt.Color(255, 255, 255));
        nueve.setText("9");
        nueve.setFocusPainted(false);
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        salida.setBackground(new java.awt.Color(30, 30, 30));
        salida.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        salida.setForeground(new java.awt.Color(255, 255, 255));
        salida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        salida.setBorder(null);
        salida.setCaretColor(new java.awt.Color(30, 30, 30));
        salida.setFocusable(false);
        salida.setOpaque(true);
        salida.setSelectionColor(new java.awt.Color(30, 30, 30));
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });

        all.setBackground(new java.awt.Color(7, 7, 7));
        all.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        all.setForeground(new java.awt.Color(255, 255, 255));
        all.setText("C");
        all.setFocusPainted(false);
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });

        del.setBackground(new java.awt.Color(20, 20, 20));
        del.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        del.setForeground(new java.awt.Color(255, 255, 255));
        del.setText("DEL");
        del.setFocusPainted(false);
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        punto.setBackground(new java.awt.Color(7, 7, 7));
        punto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        punto.setForeground(new java.awt.Color(255, 255, 255));
        punto.setText(".");
        punto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        punto.setFocusPainted(false);
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        salida2.setBackground(new java.awt.Color(30, 30, 30));
        salida2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salida2.setForeground(new java.awt.Color(165, 165, 165));
        salida2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        salida2.setBorder(null);
        salida2.setCaretColor(new java.awt.Color(30, 30, 30));
        salida2.setFocusable(false);
        salida2.setOpaque(true);
        salida2.setSelectionColor(new java.awt.Color(30, 30, 30));
        salida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salida2ActionPerformed(evt);
            }
        });

        raiz.setBackground(new java.awt.Color(20, 20, 20));
        raiz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        raiz.setForeground(new java.awt.Color(255, 255, 255));
        raiz.setText("√");
        raiz.setFocusPainted(false);
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

        pot.setBackground(new java.awt.Color(20, 20, 20));
        pot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pot.setForeground(new java.awt.Color(255, 255, 255));
        pot.setText("x2");
        pot.setFocusPainted(false);
        pot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salida2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(salida2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pot, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(all, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        n1=Double.parseDouble(salida.getText());
        op="-";
        salida.setText("");
        salida2.setText(n1+"-");
    }//GEN-LAST:event_restaActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        salida.setText(salida.getText()+"0");
    }//GEN-LAST:event_ceroActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        salida.setText(salida.getText()+"2");
    }//GEN-LAST:event_dosActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        salida.setText(salida.getText()+"8");
    }//GEN-LAST:event_ochoActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        salida.setText(salida.getText()+"1");
    }//GEN-LAST:event_unoActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        salida.setText(salida.getText()+"7");
    }//GEN-LAST:event_sieteActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        salida.setText(salida.getText()+"9");
    }//GEN-LAST:event_nueveActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        salida.setText(salida.getText()+"4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        salida.setText(salida.getText()+"5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        salida.setText(salida.getText()+"6");
    }//GEN-LAST:event_seisActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
       salida.setText(salida.getText()+"3");
    }//GEN-LAST:event_tresActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        salida.setText("");
        salida2.setText("");
    }//GEN-LAST:event_allActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        String resul;
        resul=salida.getText();
        if(resul.length()>0){
           resul=resul.substring(0,resul.length()-1);
           salida.setText(resul);
           
        }
    }//GEN-LAST:event_delActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salidaActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        n1=Double.parseDouble(salida.getText());
        op="+";
        salida.setText("");
        salida2.setText(n1+"+");
        
        
    }//GEN-LAST:event_sumaActionPerformed

    
    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        n2=Double.parseDouble(salida.getText());
        switch(op){
         
            case"+": salida.setText(Double.toString(n1+n2));
                     salida2.setText(n1+"+"+n2+"=");
            break;
            case"-": salida.setText(Double.toString(n1-n2));
                     salida2.setText(n1+"-"+n2+"=");
            break;
            case"*": salida.setText(Double.toString(n1*n2));
                     salida2.setText(n1+"x"+n2+"=");
            break;
            case"/": salida.setText(Double.toString(n1/n2));
                     salida2.setText(n1+"÷"+n2+"=");
            break;
            case"√": 
                     salida.setText(Double.toString(Math.sqrt(n2)));
                     salida2.setText("√"+n2+"=");
            break;
            case"^": 
                     salida.setText(Double.toString(Math.pow(n2,2)));
                     salida2.setText("sqr"+"("+n2+")"+"=");
            break;
        }
    }//GEN-LAST:event_igualActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        n1=Double.parseDouble(salida.getText());
        op="*";
        salida.setText("");
        salida2.setText(n1+"x");
    }//GEN-LAST:event_multActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        n1=Double.parseDouble(salida.getText());
        op="/";
        salida.setText("");
        salida2.setText(n1+"÷");
    }//GEN-LAST:event_divActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed

            salida.setText(salida.getText()+".");
             
         
    }//GEN-LAST:event_puntoActionPerformed

    
    private void salida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salida2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salida2ActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        //n1=Integer.parseInt(salida.getText());
        op="√";
        salida.setText("");
        salida2.setText("√");
    }//GEN-LAST:event_raizActionPerformed

    private void potActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potActionPerformed
        salida.setText((salida.getText()));
        n1=Double.parseDouble(salida.getText());
        op="^";
        //salida.setText("");
        salida2.setText("sqr"+"("+n1+")");
    }//GEN-LAST:event_potActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton all;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton del;
    private javax.swing.JButton div;
    private javax.swing.JButton dos;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mult;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton pot;
    private javax.swing.JButton punto;
    private javax.swing.JButton raiz;
    private javax.swing.JButton resta;
    private javax.swing.JTextField salida;
    private javax.swing.JTextField salida2;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton suma;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
