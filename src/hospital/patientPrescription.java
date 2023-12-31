/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class patientPrescription extends javax.swing.JFrame {

    /**
     * Creates new form patientReport
     */
    public patientPrescription() {
        initComponents();
        java.awt.Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    public patientPrescription(String Id){
        initComponents();
        pId.setText(Id);
        java.awt.Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        pId = new javax.swing.JTextField();
        pName = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        medicine1 = new javax.swing.JTextField();
        reference1 = new javax.swing.JTextField();
        dose1 = new javax.swing.JTextField();
        num1 = new javax.swing.JTextField();
        date1 = new javax.swing.JTextField();
        dailyDose1 = new javax.swing.JTextField();
        medication1 = new javax.swing.JTextField();
        effects1 = new javax.swing.JTextField();
        medicine2 = new javax.swing.JTextField();
        reference2 = new javax.swing.JTextField();
        dose2 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        date2 = new javax.swing.JTextField();
        dailyDose2 = new javax.swing.JTextField();
        medication2 = new javax.swing.JTextField();
        effects2 = new javax.swing.JTextField();
        medicine3 = new javax.swing.JTextField();
        reference3 = new javax.swing.JTextField();
        dose3 = new javax.swing.JTextField();
        num3 = new javax.swing.JTextField();
        date3 = new javax.swing.JTextField();
        dailyDose3 = new javax.swing.JTextField();
        medication3 = new javax.swing.JTextField();
        effects3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prescription.setColumns(20);
        prescription.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        prescription.setRows(5);
        jScrollPane1.setViewportView(prescription);
        prescription.getAccessibleContext().setAccessibleParent(null);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 800, 903));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Prescription");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        pId.setBackground(new java.awt.Color(204, 204, 255));
        pId.setForeground(new java.awt.Color(204, 204, 255));
        pId.setBorder(null);
        jPanel1.add(pId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        pName.setBackground(new java.awt.Color(0, 0, 0));
        pName.setBorder(null);
        jPanel1.add(pName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 750, 30, 30));

        age.setBackground(new java.awt.Color(0, 0, 0));
        age.setBorder(null);
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 710, 30, 30));

        medicine1.setBackground(new java.awt.Color(0, 0, 0));
        medicine1.setBorder(null);
        jPanel1.add(medicine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        reference1.setBackground(new java.awt.Color(0, 0, 0));
        reference1.setBorder(null);
        jPanel1.add(reference1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        dose1.setBackground(new java.awt.Color(0, 0, 0));
        dose1.setBorder(null);
        jPanel1.add(dose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        num1.setBackground(new java.awt.Color(0, 0, 0));
        num1.setBorder(null);
        jPanel1.add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        date1.setBackground(new java.awt.Color(0, 0, 0));
        date1.setBorder(null);
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        dailyDose1.setBackground(new java.awt.Color(0, 0, 0));
        dailyDose1.setBorder(null);
        jPanel1.add(dailyDose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        medication1.setBackground(new java.awt.Color(0, 0, 0));
        medication1.setBorder(null);
        jPanel1.add(medication1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        effects1.setBackground(new java.awt.Color(0, 0, 0));
        effects1.setBorder(null);
        jPanel1.add(effects1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        medicine2.setBackground(new java.awt.Color(0, 0, 0));
        medicine2.setBorder(null);
        jPanel1.add(medicine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        reference2.setBackground(new java.awt.Color(0, 0, 0));
        reference2.setBorder(null);
        jPanel1.add(reference2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        dose2.setBackground(new java.awt.Color(0, 0, 0));
        dose2.setBorder(null);
        jPanel1.add(dose2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        num2.setBackground(new java.awt.Color(0, 0, 0));
        num2.setBorder(null);
        jPanel1.add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        date2.setBackground(new java.awt.Color(0, 0, 0));
        date2.setBorder(null);
        jPanel1.add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        dailyDose2.setBackground(new java.awt.Color(0, 0, 0));
        dailyDose2.setBorder(null);
        jPanel1.add(dailyDose2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        medication2.setBackground(new java.awt.Color(0, 0, 0));
        medication2.setBorder(null);
        jPanel1.add(medication2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        effects2.setBackground(new java.awt.Color(0, 0, 0));
        effects2.setBorder(null);
        jPanel1.add(effects2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        medicine3.setBackground(new java.awt.Color(0, 0, 0));
        medicine3.setBorder(null);
        jPanel1.add(medicine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        reference3.setBackground(new java.awt.Color(0, 0, 0));
        reference3.setBorder(null);
        jPanel1.add(reference3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        dose3.setBackground(new java.awt.Color(0, 0, 0));
        dose3.setBorder(null);
        jPanel1.add(dose3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        num3.setBackground(new java.awt.Color(0, 0, 0));
        num3.setBorder(null);
        jPanel1.add(num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        date3.setBackground(new java.awt.Color(0, 0, 0));
        date3.setBorder(null);
        jPanel1.add(date3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        dailyDose3.setBackground(new java.awt.Color(0, 0, 0));
        dailyDose3.setBorder(null);
        jPanel1.add(dailyDose3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        medication3.setBackground(new java.awt.Color(0, 0, 0));
        medication3.setBorder(null);
        jPanel1.add(medication3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        effects3.setBackground(new java.awt.Color(0, 0, 0));
        effects3.setBorder(null);
        jPanel1.add(effects3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 30, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jButton1.setText("Get Prescription");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 50));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String Id=pId.getText();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from prescription where pID='"+Id+"'");
            if(rs.next()){
                pName.setText(rs.getString(2));
                age.setText(rs.getString(3));
                medicine1.setText(rs.getString(4));
                reference1.setText(rs.getString(5));
                dose1.setText(rs.getString(6));
                num1.setText(rs.getString(7));
                date1.setText(rs.getString(8));
                dailyDose1.setText(rs.getString(9));
                medication1.setText(rs.getString(10));
                effects1.setText(rs.getString(11));
                
                
                medicine2.setText(rs.getString(12));
                reference2.setText(rs.getString(13));
                dose2.setText(rs.getString(14));
                num2.setText(rs.getString(15));
                date2.setText(rs.getString(16));
                dailyDose2.setText(rs.getString(17));
                medication2.setText(rs.getString(18));
                effects2.setText(rs.getString(19));
                
                
                medicine3.setText(rs.getString(20));
                reference3.setText(rs.getString(21));
                dose3.setText(rs.getString(22));
                num3.setText(rs.getString(23));
                date3.setText(rs.getString(24));
                dailyDose3.setText(rs.getString(25));
                medication3.setText(rs.getString(26));
                effects3.setText(rs.getString(27));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Connection error" );
        }
       
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Qty8 = (pId.getText());
        String Qty9 = (pName.getText());
        String Qty10 = (age.getText());
        String Qty0 = (medicine1.getText());
        String Qty1 = (reference1.getText());
        String Qty2 = (dose1.getText());
        String Qty3 = (num1.getText());
        String Qty4 = (date1.getText());
        String Qty5 = (dailyDose1.getText());
        String Qty6 = (medication1.getText());
        String Qty7 = (effects1.getText());
        
        
        String Qty11 = (medicine2.getText());
        String Qty12 =(reference2.getText());
        String Qty13= (dose2.getText());
        String Qty14= (num2.getText());
        String Qty15= (date2.getText());
        String Qty16= (dailyDose2.getText());
        String Qty17= (medication2.getText());
        String Qty18= (effects2.getText());
        
        
        
        String Qty19 = (medicine3.getText());
        String Qty20 =(reference3.getText());
        String Qty21= (dose3.getText());
        String Qty22= (num3.getText());
        String Qty23= (date3.getText());
        String Qty24= (dailyDose3.getText());
        String Qty25= (medication3.getText());
        String Qty26= (effects3.getText());
        
        
        prescription.setText("");
        prescription.append("\t\n\t\t\t    Hospital Management Systems\n"
        +"\nPatient ID  :\t" + Qty8
        +"\nPatient Name:\t" + Qty9
        +"\nPatient Age :\t" + Qty10
        +"\n\nMedicine Name:\t" + Qty0
        +"\nReference No:\t" + Qty1
        +"\nDose(mg)    :\t" + Qty2
        +"\nTotal Amount:\t" + Qty3
        +"\nIssued Date :\t" + Qty4
        +"\nDaily Amount:\t" + Qty5
        +"\nMedications :\t" + Qty6
        +"\nEffects     :\t" + Qty7
        +"\n"
        +"\nMedicine Name:\t" + Qty11
        +"\nReference No:\t" + Qty12
        +"\nDose(mg)    :\t" + Qty13
        +"\nTotal Amount:\t" + Qty14
        +"\nIssued Date :\t" + Qty15
        +"\nDaily Amount:\t" + Qty16
        +"\nMedications :\t" + Qty17
        +"\nEffects     :\t" + Qty18
        +"\n"       
        +"\nMedicine Name:\t" + Qty19
        +"\nReference No:\t" + Qty20
        +"\nDose(mg)    :\t" + Qty21
        +"\nTotal Amount:\t" + Qty22
        +"\nIssued Date :\t" + Qty23
        +"\nDaily Amount:\t" + Qty24
        +"\nMedications :\t" + Qty25
        +"\nEffects     :\t" + Qty26
        );
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            prescription.print();
            
        }catch(PrinterException ex){
            Logger.getLogger(prescriptionDR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String Id = pId.getText();
        new PatientHome(Id).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(patientPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patientPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patientPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patientPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patientPrescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField dailyDose1;
    private javax.swing.JTextField dailyDose2;
    private javax.swing.JTextField dailyDose3;
    private javax.swing.JTextField date1;
    private javax.swing.JTextField date2;
    private javax.swing.JTextField date3;
    private javax.swing.JTextField dose1;
    private javax.swing.JTextField dose2;
    private javax.swing.JTextField dose3;
    private javax.swing.JTextField effects1;
    private javax.swing.JTextField effects2;
    private javax.swing.JTextField effects3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medication1;
    private javax.swing.JTextField medication2;
    private javax.swing.JTextField medication3;
    private javax.swing.JTextField medicine1;
    private javax.swing.JTextField medicine2;
    private javax.swing.JTextField medicine3;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JTextField num3;
    private javax.swing.JTextField pId;
    private javax.swing.JTextField pName;
    private javax.swing.JTextArea prescription;
    private javax.swing.JTextField reference1;
    private javax.swing.JTextField reference2;
    private javax.swing.JTextField reference3;
    // End of variables declaration//GEN-END:variables
}
