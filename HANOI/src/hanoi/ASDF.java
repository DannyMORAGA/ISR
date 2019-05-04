package hanoi;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



 class ASDF extends javax.swing.JFrame {
    int movi=0;
    PILA TA;
    PILA TB;
    PILA TC;
    
    DefaultTableModel MTA, MTB, MTC;
    
    int obj=0;
    
    double min=0;
    
    boolean para=false;
     
    public ASDF() {
        initComponents();
        MTA = (DefaultTableModel) A.getModel();
        MTA.setRowCount(6);
        
        MTB = (DefaultTableModel) B.getModel();
        MTB.setRowCount(6);
        
        MTC = (DefaultTableModel) C.getModel();
        MTC.setRowCount(6);
        
        DefaultTableCellRenderer RA= new DefaultTableCellRenderer();
        RA.setHorizontalAlignment(SwingConstants.CENTER);
        A.getColumnModel().getColumn(0).setCellRenderer(RA);
        
        DefaultTableCellRenderer RB= new DefaultTableCellRenderer();
        RB.setHorizontalAlignment(SwingConstants.CENTER);
        B.getColumnModel().getColumn(0).setCellRenderer(RB);
        
        DefaultTableCellRenderer RC= new DefaultTableCellRenderer();
        RC.setHorizontalAlignment(SwingConstants.CENTER);
        C.getColumnModel().getColumn(0).setCellRenderer(RC);
        
        
        
    }

    private void clean(){
    movi=0;
    min=0;
    lis.setSelectedItem(String.valueOf(obj));
    }
    private void Cantmovi(){
    movi++;
    movii.setText(String.valueOf(movi));
    }
    
    private void START (){
        try {
        TA=new PILA();
        TB=new PILA();
        TC=new PILA();
        obj = Integer.parseInt(lis.getSelectedItem().toString());
        min=Math.pow(2, obj)-1;
        movii.setText(String.valueOf(movi));
        requii.setText(String.valueOf(String.format("%.0f", min)));
        
        for (int cont=obj; cont >=1; cont--){
        HANOI pla= new HANOI();
        String Disc= "";
        for(int cont2 = cont; cont2 >0; cont2--){
        Disc+="$";
        }
        pla.setDat(Disc);
        TA.PUSH(pla);
        }
        preA();
        preB();
        preC();
        }
        catch(Exception E){
        System.out.println("ERROR: " +E.getMessage());  
        }
        
    
    }

    private void preA(){
    ((DefaultTableModel)A.getModel()).setRowCount(0);
    MTA.setRowCount(10);
    HANOI k;
    int RD=(10-TA.getContno());
    
    if(TA.getContno()>0){
    for(k=TA.getCabeza(); k.getDown() !=null; k= k.getDown()){
        String[] VN= {k.getDat()};
        MTA.insertRow(RD, VN);
        RD++;
        
    }
    if(k.getDown()==null){
       String[] VN= {k.getDat()};
     MTA.insertRow(RD, VN);
    }
    }
    
    A.setModel(MTA);
    MTA.setRowCount(10);
    
    
    }
    
    
    
    
    private void preB(){
    ((DefaultTableModel)B.getModel()).setRowCount(0);
    MTB.setRowCount(10);
    HANOI k;
    int RD=(10-TB.getContno());
    
    if(TB.getContno()>0){
    for(k=TB.getCabeza(); k.getDown() !=null; k= k.getDown()){
        String[] VN= {k.getDat()};
        MTB.insertRow(RD, VN);
        RD++;
        
    }
    if(k.getDown()==null){
     String[] VN= {k.getDat()};
     MTB.insertRow(RD, VN);
    }
    }
    
    B.setModel(MTB);
    MTB.setRowCount(10);
    
    
    }
    
    private void preC(){
    ((DefaultTableModel)C.getModel()).setRowCount(0);
    MTC.setRowCount(10);
    HANOI k;
    int RD=(10-TC.getContno());
    
    if(TC.getContno()>0){
    for(k=TC.getCabeza(); k.getDown() !=null; k= k.getDown()){
        String[] VN= {k.getDat()};
        MTC.insertRow(RD, VN);
        RD++;
        
    }
    if(k.getDown()==null){
     String[] VN= {k.getDat()};
     MTC.insertRow(RD, VN);
    }
    }
    
    C.setModel(MTC);
    MTC.setRowCount(10);
    
    
    }
    
    private void volv(){
    try{
        if(!requii.getText().equals("")){
        clean();
        START();
        } 
    }
    catch(Exception E){
        System.out.println("ERROR: " +E.getMessage());  
        }
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        A = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        B = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        C = new javax.swing.JTable();
        AB = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        BA = new javax.swing.JButton();
        BC = new javax.swing.JButton();
        CA = new javax.swing.JButton();
        CB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        requii = new javax.swing.JTextField();
        movii = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        lis = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A"
            }
        ));
        A.setAutoscrolls(false);
        A.setFocusable(false);
        A.setRowSelectionAllowed(false);
        A.setShowHorizontalLines(false);
        A.setShowVerticalLines(false);
        jScrollPane1.setViewportView(A);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 107, 200));

        B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "B"
            }
        ));
        B.setAutoscrolls(false);
        B.setFocusable(false);
        B.setRowSelectionAllowed(false);
        B.setShowHorizontalLines(false);
        B.setShowVerticalLines(false);
        jScrollPane2.setViewportView(B);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 107, 200));

        C.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C"
            }
        ));
        C.setAutoscrolls(false);
        C.setFocusable(false);
        C.setRowSelectionAllowed(false);
        C.setShowHorizontalLines(false);
        C.setShowVerticalLines(false);
        jScrollPane3.setViewportView(C);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 107, 200));

        AB.setText("B");
        AB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABActionPerformed(evt);
            }
        });
        getContentPane().add(AB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        AC.setText("C");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });
        getContentPane().add(AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        BA.setText("A");
        BA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAActionPerformed(evt);
            }
        });
        getContentPane().add(BA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        BC.setText("C");
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });
        getContentPane().add(BC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        CA.setText("A");
        CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAActionPerformed(evt);
            }
        });
        getContentPane().add(CA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        CB.setText("B");
        CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBActionPerformed(evt);
            }
        });
        getContentPane().add(CB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jLabel1.setText("NUMERO DE MOVIMIENTOS REALIZADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jLabel2.setText("# DE DISCOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));
        getContentPane().add(requii, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 120, 30));
        getContentPane().add(movii, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 120, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("REINICIAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, 50));

        lis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(lis, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 110, 30));

        jLabel3.setText("NUMERO DE MOVIMIENTOS REQUERIDOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("START");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_A(){
     try{
            if(TB.getContno()>0){
            HANOI pla = new HANOI();
            pla.setDat(TB.Peek());
            if(TA.getContno()>0){
                if(pla.getDat().compareTo(TA.Peek()) >  0){
                return;
                }
            
            }
            TB.POP();
            TA.PUSH(pla);
            preB();
            preA();
            Cantmovi();
            }
        }
        catch(Exception E){
        System.out.println("ERROR: " +E.getMessage());  
        }
    }
    
    private void BAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAActionPerformed
        B_A();
    }//GEN-LAST:event_BAActionPerformed

    private void C_A(){
    
    try{
            if(TC.getContno()>0){
            HANOI pla = new HANOI();
            pla.setDat(TC.Peek());
            if(TA.getContno()>0){
                if(pla.getDat().compareTo(TA.Peek()) >  0){
                return;
                }
            
            }
            TC.POP();
            TA.PUSH(pla);
            preC();
            preA();
            Cantmovi();
            }
        }
        catch(Exception E){
        System.out.println("ERROR: " +E.getMessage());  
        }
    }
    
    private void CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAActionPerformed
        C_A();
    }//GEN-LAST:event_CAActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     volv();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      START();  
    }//GEN-LAST:event_jButton8ActionPerformed

    
    private void A_B(){
    
        try{
            if(TA.getContno()>0){
            HANOI pla = new HANOI();
            pla.setDat(TA.Peek());
            if(TB.getContno()>0){
                if(pla.getDat().compareTo(TB.Peek()) >  0){
                return;
                }
            
            }
            TA.POP();
            TB.PUSH(pla);
            preA();
            preB();
            Cantmovi();
            }
        }
        catch(Exception E){
        System.out.println("ERROR: " +E.getMessage());  
        }
    }
    
    
    private void ABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABActionPerformed
        A_B();
    }//GEN-LAST:event_ABActionPerformed

    
    
    private void A_C(){
    try{
            if(TA.getContno()>0){
            HANOI pla = new HANOI();
            pla.setDat(TA.Peek());
            if(TC.getContno()>0){
                if(pla.getDat().compareTo(TC.Peek()) >  0){
                return;
                }
            
            }
            TA.POP();
            TC.PUSH(pla);
            preA();
            preC();
            Cantmovi();
            
            if(TC.getContno()==obj && movi==min){
            JOptionPane.showMessageDialog(null,"FELICIDADES LO LOGRASTE CON LOS MOVIMIENTOS REQUERIDOS");       
            }
            else{
            if(TC.getContno()==obj && movi!=min){
            JOptionPane.showMessageDialog(null,"FELICIDADES LO LOGRASTE\n AHORA INTENTA LOGRAR HACERLO CON LOS MOVIMEINTOS REQUERIDOS");    
            }
            }
            }
        }
        catch(Exception E){
        System.out.println("ERROR: " +E.getMessage());  
        }
    
    }
    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        A_C();
    }//GEN-LAST:event_ACActionPerformed

    private void B_C(){
     try{
            if(TB.getContno()>0){
            HANOI pla = new HANOI();
            pla.setDat(TB.Peek());
            if(TC.getContno()>0){
                if(pla.getDat().compareTo(TC.Peek()) >  0){
                return;
                }
            
            }
            TB.POP();
            TC.PUSH(pla);
            preB();
            preC();
            Cantmovi();
            
            if(TC.getContno()==obj && movi==min){
            JOptionPane.showMessageDialog(null,"FELICIDADES LO LOGRASTE CON LOS MOVIMIENTOS REQUERIDOS");       
            }
            else{
            if(TC.getContno()==obj && movi!=min){
            JOptionPane.showMessageDialog(null,"FELICIDADES LO LOGRASTE\n AHORA INTENTA LOGRAR HACERLO CON LOS MOVIMEINTOS REQUERIDOS");    
            }
            }
            }
        }
        catch(Exception E){
        System.out.println("ERROR: " +E.getMessage());  
        }
    }
    
    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        B_C();
    }//GEN-LAST:event_BCActionPerformed

    private void C_B(){
    try{
            if(TC.getContno()>0){
            HANOI pla = new HANOI();
            pla.setDat(TC.Peek());
            if(TB.getContno()>0){
                if(pla.getDat().compareTo(TB.Peek()) >  0){
                return;
                }
            
            }
            TC.POP();
            TB.PUSH(pla);
            preC();
            preB();
            Cantmovi();
            
            if(TC.getContno()==obj && movi==min){
            JOptionPane.showMessageDialog(null,"FELICIDADES LO LOGRASTE CON LOS MOVIMIENTOS REQUERIDOS");       
            }
            else{
            if(TC.getContno()==obj && movi!=min){
            JOptionPane.showMessageDialog(null,"FELICIDADES LO LOGRASTE\n AHORA INTENTA LOGRAR HACERLO CON LOS MOVIMEINTOS REQUERIDOS");    
            }
            }
            }
        }
        catch(Exception E){
        System.out.println("ERROR: " +E.getMessage());  
        }
    
    }
    
    private void CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBActionPerformed
        C_B();
    }//GEN-LAST:event_CBActionPerformed

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
            java.util.logging.Logger.getLogger(ASDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ASDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ASDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ASDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ASDF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable A;
    private javax.swing.JButton AB;
    private javax.swing.JButton AC;
    private javax.swing.JTable B;
    private javax.swing.JButton BA;
    private javax.swing.JButton BC;
    private javax.swing.JTable C;
    private javax.swing.JButton CA;
    private javax.swing.JButton CB;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> lis;
    private javax.swing.JTextField movii;
    private javax.swing.JTextField requii;
    // End of variables declaration//GEN-END:variables
}
