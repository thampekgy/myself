/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class AddFood extends javax.swing.JFrame {

    /**
     * Creates new form mainmenu
     */
    
    private String host = "jdbc:derby://localhost:1527/FastestDeliveryman";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "FOODMENU";
    private Connection conn;
    private PreparedStatement stmt;
    
    public AddFood() 
    {
        initComponents();
        createConnection();
        txtFID.setText(generateFOOD_ID());
    }
    public void createConnection()
    {
        try{
            conn = DriverManager.getConnection(host,user,password);
            System.out.println("***TRACE: Connection established.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    public String generateFOOD_ID()
    {
        String id = "";
        int subID = 0;
        
        try{
            
            String query = "SELECT MAX(FOOD_ID) FROM " + tableName;
            stmt = conn.prepareStatement(query);  
            
            
            ResultSet rs =stmt.executeQuery() ;
            while(rs.next())
            {
                id = rs.getString(1);
                subID=Integer.valueOf(id.substring(1,5));
            
            }subID++;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        String finalID = "F00" + subID;
        return finalID; 
    }
    
    
    public void clear() {
        txtFType.setText("");
        txtFID.setText("");
        txtFPrice.setText("");
        txtFDesc.setText("");
        txtFName.setText("");
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblFID = new javax.swing.JLabel();
        jlblFName = new javax.swing.JLabel();
        jlblFDesc = new javax.swing.JLabel();
        jlblFPrice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFDesc = new javax.swing.JTextArea();
        txtFName = new javax.swing.JTextField();
        txtFID = new javax.swing.JTextField();
        txtFPrice = new javax.swing.JTextField();
        jlblFType = new javax.swing.JLabel();
        txtFType = new javax.swing.JTextField();
        jbtnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbtnCanel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblFID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlblFID.setText("Food ID      : ");

        jlblFName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlblFName.setText("Food Name : ");

        jlblFDesc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlblFDesc.setText("Description :");

        jlblFPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlblFPrice.setText("Price   (RM)    :");

        txtFDesc.setColumns(20);
        txtFDesc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFDesc.setRows(5);
        jScrollPane1.setViewportView(txtFDesc);

        txtFName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtFID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtFPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFPrice.setText("\n");

        jlblFType.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlblFType.setText("Food Type  :");

        txtFType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jbtnAdd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnAdd.setText("ADD");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel6.setText("Add Food");

        jbtnCanel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnCanel.setText("Cancel");
        jbtnCanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlblFType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblFName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblFID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblFDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblFPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFType, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCanel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblFID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblFType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblFDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCanel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCanelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtnCanelActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        // TODO add your handling code here:
        
         String insertStr="INSERT INTO "+tableName+" VALUES(?,?,?,?,?)";
        try{
            stmt=conn.prepareStatement(insertStr);
            stmt.setString(1,txtFType.getText());
            stmt.setString(2,txtFID.getText());
            stmt.setString(3,txtFPrice.getText());
            stmt.setString(4,txtFDesc.getText());
            stmt.setString(5,txtFName.getText());
            
            stmt.executeUpdate();//update delete create
            JOptionPane.showMessageDialog(null, "New Food" + txtFName.getText() + "' is added", "Successfully added.", JOptionPane.INFORMATION_MESSAGE);
             clear();

            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_jbtnAddActionPerformed

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
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnCanel;
    private javax.swing.JLabel jlblFDesc;
    private javax.swing.JLabel jlblFID;
    private javax.swing.JLabel jlblFName;
    private javax.swing.JLabel jlblFPrice;
    private javax.swing.JLabel jlblFType;
    private javax.swing.JTextArea txtFDesc;
    private javax.swing.JTextField txtFID;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFPrice;
    private javax.swing.JTextField txtFType;
    // End of variables declaration//GEN-END:variables
}
