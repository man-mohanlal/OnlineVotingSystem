/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevotingsystem;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author JUNAID COMPUTER LRK
 */
public class Voting extends javax.swing.JFrame {

    /**
     * Creates new form Voting
     */
    public Voting() {
        initComponents();
        DisplayCandidates();
        BravoLbl.setVisible(false);
    }

    int VotingId;

    public Voting(int VoterId) {
        initComponents();
        DisplayCandidates();
        BravoLbl.setVisible(false);
       VotingId = VoterId;
       //JOptionPane.showMessageDialog(this, VotingId);
    }

    
    
    
    
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    
    private void DisplayCandidates(){
        try{
             Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinevotingsystem", "root", "");
             st = Con.createStatement();
             rs = st.executeQuery("SELECT * FROM Candidate_table");
             CandidateListTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateListTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CandidatePictureLbl = new javax.swing.JLabel();
        CnameLbl = new javax.swing.JLabel();
        VoteBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        BravoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        CandidateListTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CandidateListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CandidateListTable.setRowHeight(20);
        CandidateListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateListTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("WELCOME! ELECTION VOTING APPLICATION");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Your Candidate");

        BackBtn.setText("BACK");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ELECTION MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        CnameLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CnameLbl.setText("Name");

        VoteBtn.setText("VOTE");
        VoteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoteBtnMouseClicked(evt);
            }
        });
        VoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Candidate List");

        BravoLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BravoLbl.setText("VOTE COUNTED!!! BRAVO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(CnameLbl)
                                    .addComponent(VoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(BravoLbl))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CnameLbl)
                        .addGap(18, 18, 18)
                        .addComponent(VoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BravoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void VoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoteBtnActionPerformed

    
    private ImageIcon ResizePhoto(String ImagePath,byte[] pic){
        ImageIcon MyImage = null;
        if(ImagePath != null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(CandidatePictureLbl.getWidth(), CandidatePictureLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    private void FetchPhoto(){
        String Query = "SELECT CPhoto FROM Candidate_table WHERE CId = "+key;
        Statement st;
        ResultSet rs;
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinevotingsystem", "root", "");
            st = Con.createStatement();
            rs = st.executeQuery(Query);
            if(rs.next()){
                CandidatePictureLbl.setIcon(ResizePhoto(null,rs.getBytes("CPhoto")));
            }
        }catch(Exception e){
            
        }
    }
    
    int key = -1;
    int ElecId;
    
    private void CandidateListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateListTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) CandidateListTable.getModel();
        int MyIndex = CandidateListTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        CnameLbl.setText(model.getValueAt(MyIndex, 1).toString());
        ElecId = Integer.valueOf(model.getValueAt(MyIndex, 5).toString());
        FetchPhoto();
    }//GEN-LAST:event_CandidateListTableMouseClicked

     int VId ;
    Statement St1 = null;
    ResultSet Rs1 = null;
    // auto count the election and generate EId;
    private void VCount(){
        try{
           St1 = Con.createStatement();
           Rs1 = St1.executeQuery("SELECT MAx(VoteId) FROM Votes_table");
           Rs1.next();
           VId = Rs1.getInt(1) + 1;
        }catch(Exception e){
     
            
        }
    }
    
    int VNumber;
    private void VCheck(){
        try{
           St1 = Con.createStatement();
           Rs1 = St1.executeQuery("SELECT Count(*) FROM Votes_table WHERE VoterId ="+VotingId+" AND ElectId = "+ElecId+"");
//           VNumber = rs.getInt(1);
           if(Rs1.next()){
               VNumber = 1;
           }else{
               VNumber = 0;
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
            
        }
    }
    
    private void VoteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoteBtnMouseClicked
        // TODO add your handling code here:
        VCheck();
        if(key == -1){
            JOptionPane.showMessageDialog(this, "Select your Candidates");
        }else if(VNumber < 0){
            System.out.println(VNumber);
            JOptionPane.showMessageDialog(this, "You Can Not Vote Twice!!!");
        }else{    
            try{
               
                VCount();
      
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinevotingsystem", "root", "");
                PreparedStatement Add  = Con.prepareStatement("INSERT INTO Votes_table VALUES(?,?,?,?)");
                Add.setInt(1, VId);
                Add.setInt(2, VotingId);
                Add.setInt(3, ElecId);
                Add.setInt(4, key);
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Vote Counted");
                Con.close();
                BravoLbl.setVisible(true);
                DisplayCandidates();
                VoteBtn.setVisible(false);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_VoteBtnMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BravoLbl;
    private javax.swing.JTable CandidateListTable;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JLabel CnameLbl;
    private javax.swing.JButton VoteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
