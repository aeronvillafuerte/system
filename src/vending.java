
import javax.swing.JOptionPane;


public class vending extends javax.swing.JFrame {

    
    public vending() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        coke = new javax.swing.JButton();
        sprite = new javax.swing.JButton();
        fanta = new javax.swing.JButton();
        pepsi = new javax.swing.JButton();
        jazz = new javax.swing.JButton();
        sevenup = new javax.swing.JButton();
        summit = new javax.swing.JButton();
        sparkle = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ttlpayment = new javax.swing.JTextField();
        slcprdct = new javax.swing.JTextField();
        shwprice = new javax.swing.JTextField();
        slcqty = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        jLabel11.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT PRODUCT");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 10, 362, 47);

        coke.setBackground(new java.awt.Color(255, 255, 255));
        coke.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        coke.setText("COKE");
        coke.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coke.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        coke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeActionPerformed(evt);
            }
        });
        jPanel1.add(coke);
        coke.setBounds(60, 50, 170, 42);

        sprite.setBackground(new java.awt.Color(255, 204, 204));
        sprite.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        sprite.setText("SPRITE");
        sprite.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sprite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteActionPerformed(evt);
            }
        });
        jPanel1.add(sprite);
        sprite.setBounds(60, 100, 170, 42);

        fanta.setBackground(new java.awt.Color(204, 255, 204));
        fanta.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        fanta.setText("FANTA");
        fanta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fanta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantaActionPerformed(evt);
            }
        });
        jPanel1.add(fanta);
        fanta.setBounds(60, 150, 170, 42);

        pepsi.setBackground(new java.awt.Color(204, 204, 255));
        pepsi.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        pepsi.setText("PEPSI");
        pepsi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pepsi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiActionPerformed(evt);
            }
        });
        jPanel1.add(pepsi);
        pepsi.setBounds(60, 200, 170, 42);

        jazz.setBackground(new java.awt.Color(255, 255, 204));
        jazz.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jazz.setText("JAZZ");
        jazz.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jazz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jazz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jazzActionPerformed(evt);
            }
        });
        jPanel1.add(jazz);
        jazz.setBounds(250, 50, 170, 42);

        sevenup.setBackground(new java.awt.Color(204, 255, 153));
        sevenup.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        sevenup.setText("7 UP");
        sevenup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sevenup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sevenup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenupActionPerformed(evt);
            }
        });
        jPanel1.add(sevenup);
        sevenup.setBounds(250, 100, 170, 42);

        summit.setBackground(new java.awt.Color(255, 153, 153));
        summit.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        summit.setText("SUMMIT");
        summit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        summit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        summit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summitActionPerformed(evt);
            }
        });
        jPanel1.add(summit);
        summit.setBounds(250, 150, 170, 41);

        sparkle.setBackground(new java.awt.Color(255, 153, 102));
        sparkle.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        sparkle.setText("SPARKLE");
        sparkle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sparkle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sparkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparkleActionPerformed(evt);
            }
        });
        jPanel1.add(sparkle);
        sparkle.setBounds(250, 200, 170, 41);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRICE LIST: ");

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel3.setText("COKE");

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel4.setText("php12.00");

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel5.setText("php11.00");

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel6.setText("SPRITE");

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel7.setText("FANTA");

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel8.setText("php11.00");

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel9.setText("PEPSI");

        jLabel10.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel10.setText("php12.00");

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel12.setText("JAZZ");

        jLabel13.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel13.setText("7UP");

        jLabel14.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel14.setText("SUMMIT");

        jLabel15.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel15.setText("SPARKLE");

        jLabel16.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel16.setText("php8.00");

        jLabel17.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel17.setText("php9.00");

        jLabel18.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel18.setText("php10.00");

        jLabel19.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel19.setText("php8.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel16)))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(60, 250, 362, 140);

        jLabel20.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("PRICE:");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel20);
        jLabel20.setBounds(530, 110, 350, 40);

        jLabel21.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("SELECTED QUANTITY:");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel21);
        jLabel21.setBounds(530, 200, 350, 40);

        jLabel22.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("TOTAL PAYMENT:");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel22);
        jLabel22.setBounds(530, 290, 350, 40);

        jLabel23.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText(" SELECTED PRODUCT:");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel23);
        jLabel23.setBounds(530, 20, 350, 40);

        ttlpayment.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        ttlpayment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ttlpayment.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        ttlpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttlpaymentActionPerformed(evt);
            }
        });
        jPanel1.add(ttlpayment);
        ttlpayment.setBounds(530, 330, 350, 52);

        slcprdct.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        slcprdct.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        slcprdct.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(slcprdct);
        slcprdct.setBounds(530, 60, 347, 52);

        shwprice.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        shwprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        shwprice.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(shwprice);
        shwprice.setBounds(530, 150, 350, 52);

        slcqty.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        slcqty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        slcqty.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(slcqty);
        slcqty.setBounds(530, 240, 350, 52);

        back.setBackground(new java.awt.Color(255, 102, 0));
        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARR-removebg-preview1.png"))); // NOI18N
        back.setText("BACK");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(10, 410, 80, 30);

        clear.setBackground(new java.awt.Color(255, 102, 0));
        clear.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        clear.setText("CLEAR");
        clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(800, 410, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ttlpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttlpaymentActionPerformed
      
    }//GEN-LAST:event_ttlpaymentActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
               // TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    
       
    lib2 lb = new lib2();
    lb.setVisible(true);
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void spriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriteActionPerformed
         String qty = JOptionPane.showInputDialog("Enter Quantity? (10 IS THE MAXIMUM!)");
            
            int quantity = Integer.parseInt(qty);
            while(quantity>10 || quantity <1)
            {
                JOptionPane.showMessageDialog(null,"MAXIMUM IS 10!");
                qty = JOptionPane.showInputDialog("Enter Quantity?(10 IS THE MAXIMUM!)");
                quantity = Integer.parseInt(qty);
            }
            slcqty.setText(""+qty);
            slcprdct.setText("SPRITE");
            shwprice.setText("11.00");
            
            double tprice = Double.parseDouble(shwprice.getText());
        double quant = Double.parseDouble(slcqty.getText());
        
        double total = tprice * quant;
        ttlpayment.setText(" "+total);
            
    }//GEN-LAST:event_spriteActionPerformed

    private void pepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsiActionPerformed
            String qty = JOptionPane.showInputDialog("Enter Quantity? (10 IS THE MAXIMUM!)");
            
            int quantity = Integer.parseInt(qty);
            while(quantity>10 || quantity <1)
            {
                JOptionPane.showMessageDialog(null,"MAXIMUM IS 10!");
                qty = JOptionPane.showInputDialog("Enter Quantity?(10 IS THE MAXIMUM!)");
                quantity = Integer.parseInt(qty);
            }
            slcqty.setText(""+qty);
            slcprdct.setText("PEPSI");
            shwprice.setText("12.00");
            
            double tprice = Double.parseDouble(shwprice.getText());
        double quant = Double.parseDouble(slcqty.getText());
        
        double total = tprice * quant;
        ttlpayment.setText(" "+total);
    }//GEN-LAST:event_pepsiActionPerformed

    private void cokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeActionPerformed
         String qty = JOptionPane.showInputDialog("Enter Quantity? (10 IS THE MAXIMUM!)");
            
            int quantity = Integer.parseInt(qty);
            while(quantity>10 || quantity <1)
            {
                JOptionPane.showMessageDialog(null,"MAXIMUM IS 10!");
                qty = JOptionPane.showInputDialog("Enter Quantity?(10 IS THE MAXIMUM!)");
                quantity = Integer.parseInt(qty);
            }
            slcqty.setText(""+qty);
            slcprdct.setText("COKE");
            shwprice.setText("12.00");
            
            double tprice = Double.parseDouble(shwprice.getText());
        double quant = Double.parseDouble(slcqty.getText());
        
        double total = tprice * quant;
        ttlpayment.setText(" "+total);
    }//GEN-LAST:event_cokeActionPerformed

    private void fantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fantaActionPerformed
         String qty = JOptionPane.showInputDialog("Enter Quantity? (10 IS THE MAXIMUM!)");
            
            int quantity = Integer.parseInt(qty);
            while(quantity>10 || quantity <1)
            {
                JOptionPane.showMessageDialog(null,"MAXIMUM IS 10!");
                qty = JOptionPane.showInputDialog("Enter Quantity?(10 IS THE MAXIMUM!)");
                quantity = Integer.parseInt(qty);
            }
            slcqty.setText(""+qty);
            slcprdct.setText("FANTA");
            shwprice.setText("11.00");
            
            double tprice = Double.parseDouble(shwprice.getText());
        double quant = Double.parseDouble(slcqty.getText());
        
        double total = tprice * quant;
        ttlpayment.setText(" "+total);
    }//GEN-LAST:event_fantaActionPerformed

    private void jazzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jazzActionPerformed
         String qty = JOptionPane.showInputDialog("Enter Quantity? (10 IS THE MAXIMUM!)");
            
            int quantity = Integer.parseInt(qty);
            while(quantity>10 || quantity <1)
            {
                JOptionPane.showMessageDialog(null,"MAXIMUM IS 10!");
                qty = JOptionPane.showInputDialog("Enter Quantity?(10 IS THE MAXIMUM!)");
                quantity = Integer.parseInt(qty);
            }
            slcqty.setText(""+qty);
            slcprdct.setText("JAZZ");
            shwprice.setText("8.00");
            
            double tprice = Double.parseDouble(shwprice.getText());
        double quant = Double.parseDouble(slcqty.getText());
        
        double total = tprice * quant;
        ttlpayment.setText(" "+total);
    }//GEN-LAST:event_jazzActionPerformed

    private void sevenupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenupActionPerformed
         String qty = JOptionPane.showInputDialog("Enter Quantity? (10 IS THE MAXIMUM!)");
            
            int quantity = Integer.parseInt(qty);
            while(quantity>10 || quantity <1)
            {
                JOptionPane.showMessageDialog(null,"MAXIMUM IS 10!");
                qty = JOptionPane.showInputDialog("Enter Quantity?(10 IS THE MAXIMUM!)");
                quantity = Integer.parseInt(qty);
            }
            slcqty.setText(""+qty);
            slcprdct.setText("7 UP");
            shwprice.setText("9.00");
            
            double tprice = Double.parseDouble(shwprice.getText());
        double quant = Double.parseDouble(slcqty.getText());
        
        double total = tprice * quant;
        ttlpayment.setText(" "+total);
    }//GEN-LAST:event_sevenupActionPerformed

    private void summitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summitActionPerformed
        String qty = JOptionPane.showInputDialog("Enter Quantity? (10 IS THE MAXIMUM!)");
            
            int quantity = Integer.parseInt(qty);
            while(quantity>10 || quantity <1)
            {
                JOptionPane.showMessageDialog(null,"MAXIMUM IS 10!");
                qty = JOptionPane.showInputDialog("Enter Quantity?(10 IS THE MAXIMUM!)");
                quantity = Integer.parseInt(qty);
            }
            slcqty.setText(""+qty);
            slcprdct.setText("SUMMIT");
            shwprice.setText("10.00");
            
            double tprice = Double.parseDouble(shwprice.getText());
        double quant = Double.parseDouble(slcqty.getText());
        
        double total = tprice * quant;
        ttlpayment.setText(" "+total);
    }//GEN-LAST:event_summitActionPerformed

    private void sparkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparkleActionPerformed
         String qty = JOptionPane.showInputDialog("Enter Quantity? (10 IS THE MAXIMUM!)");
            
            int quantity = Integer.parseInt(qty);
            while(quantity>10 || quantity <1)
            {
                JOptionPane.showMessageDialog(null,"MAXIMUM IS 10!");
                qty = JOptionPane.showInputDialog("Enter Quantity?(10 IS THE MAXIMUM!)");
                quantity = Integer.parseInt(qty);
            }
            slcqty.setText(""+qty);
            slcprdct.setText("SPARKLE");
            shwprice.setText("8.00");
            
            double tprice = Double.parseDouble(shwprice.getText());
        double quant = Double.parseDouble(slcqty.getText());
        
        double total = tprice * quant;
        ttlpayment.setText(" "+total);
    }//GEN-LAST:event_sparkleActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       slcprdct.setText("");
       shwprice.setText("");
       slcqty.setText("");
       ttlpayment.setText("");
             
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(vending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vending().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JButton coke;
    private javax.swing.JButton fanta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jazz;
    private javax.swing.JButton pepsi;
    private javax.swing.JButton sevenup;
    private javax.swing.JTextField shwprice;
    private javax.swing.JTextField slcprdct;
    private javax.swing.JTextField slcqty;
    private javax.swing.JButton sparkle;
    private javax.swing.JButton sprite;
    private javax.swing.JButton summit;
    private javax.swing.JTextField ttlpayment;
    // End of variables declaration//GEN-END:variables
}
