
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SAK1
 */
public class CurrencyConverter extends javax.swing.JFrame {

    /**
     * Creates new form Currency_Converter
     */
    public CurrencyConverter() {
        initComponents();
    }
    
    //Units of Currencies
    String [] currencyUnits = {
        "units",
        "US Dollar",
        "Nigerian Naira",
        "Brazilian Real",
        "Canadian Dollar",
        "Kenyan Shilling",
        "Indonesian Rupiah",
        "Indian Rupee",
        "Philippine Pisco",
        "Pakistan Rupee"
    };
    
    
    //Cost of each of the currencies in pounds as on 16/11/2022
    double US_Dollar = 1.19;
    double Nigerian_Naira = 525.43;
    double Brazillian_Real = 6.40;
    double Canadian_Dollar = 1.59;
    double Kenyan_Shilling = 145.19;
    double Indonesian_Ripah =18592.51;
    double Indian_Rupee = 96.89;
    double Philipiine_Pisco =68.31;
    double Pakistan_Rupee = 264.63;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<>();
        secondCountry = new javax.swing.JComboBox<>();
        textFirstCountry = new javax.swing.JTextField();
        textSecondCountry = new javax.swing.JTextField();
        firstCountryUnit = new javax.swing.JLabel();
        secondCountryUnit = new javax.swing.JLabel();
        convert = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CURRENCY CONVERTER");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From Currency of");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To Currency of");

        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "USA", "Nigeria", "Brazil", "Canada", "Kenayan", "Indonesia", "India", "Philipine", "Pakistan" }));
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "USA", "Nigeria", "Brazil", "Canada", "Kenayan", "Indonesia", "India", "Philipine", "Pakistan" }));
        secondCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondCountryActionPerformed(evt);
            }
        });

        firstCountryUnit.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        firstCountryUnit.setForeground(new java.awt.Color(255, 255, 255));
        firstCountryUnit.setText("Units");

        secondCountryUnit.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        secondCountryUnit.setForeground(new java.awt.Color(255, 255, 255));
        secondCountryUnit.setText("Units");

        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(firstCountryUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(secondCountryUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(textFirstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textSecondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(186, 186, 186)
                                    .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(74, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(convert)
                .addGap(119, 119, 119)
                .addComponent(reset)
                .addGap(107, 107, 107)
                .addComponent(exit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFirstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSecondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCountryUnit)
                    .addComponent(secondCountryUnit))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convert)
                    .addComponent(reset)
                    .addComponent(exit))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
        // TODO add your handling code here:
        int position = firstCountry.getSelectedIndex();
         
        firstCountryUnit.setText(currencyUnits[position]); //Setting the unit of currency of first Country
    }//GEN-LAST:event_firstCountryActionPerformed

    private void secondCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondCountryActionPerformed
        // TODO add your handling code here:
        int position = secondCountry.getSelectedIndex();
         
        secondCountryUnit.setText(currencyUnits[position]);//Setting the unit of currency of second Country
    }//GEN-LAST:event_secondCountryActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
        
        //Dialog box to remind user to select country if not selected
        if(textFirstCountry.getText().equals("")){
           JOptionPane.showMessageDialog(null,"You must select both countries and must input the amount","Error Message", JOptionPane.INFORMATION_MESSAGE
                   );
           return;
       }
       double amountToChange = Double.parseDouble(textFirstCountry.getText());
       double amountInPounds = 0.0;
       
       //Converting each of the amount in pounds with respect to the currency
       
       switch (firstCountry.getSelectedItem().toString()){
           case "USA" :amountInPounds = amountToChange/US_Dollar;
           break;
           
           case "Nigeria" :amountInPounds = amountToChange / Nigerian_Naira;
           break;
           
           case "Brazil" :amountInPounds = amountToChange / Brazillian_Real;
           break;
           
           case "Canada" :amountInPounds = amountToChange / Canadian_Dollar;
           break;
           
           case "Kenayan" :amountInPounds = amountToChange / Kenyan_Shilling;
           break;
           
           case "Indonesia" :amountInPounds = amountToChange / Indonesian_Ripah;
           break;
           
           case "India" :amountInPounds = amountToChange / Indian_Rupee;
           break;
           
           case "Philipine " :amountInPounds = amountToChange / Philipiine_Pisco;
           break;
           
           case "Pakistan" :amountInPounds = amountToChange / Pakistan_Rupee;
           break;
           
           default:amountInPounds = 0.0;
       }
       
       double amountChanged = 0.0;
       
       //Converting amount to desired currency
       
       switch (secondCountry.getSelectedItem().toString()){
           case "USA" :amountChanged =amountInPounds * US_Dollar;
           break;
           case "India" : amountChanged =amountInPounds * Indian_Rupee;
           break;
           case "Nigeria":amountChanged =amountInPounds * Nigerian_Naira;
           break;
           case "Brazil":amountChanged =amountInPounds * Brazillian_Real;
            break;
           case "Canada":amountChanged =amountInPounds * Canadian_Dollar;
            break;
           case "Kenayan":amountChanged =amountInPounds * Kenyan_Shilling;
            break;
           case "Indonesia":amountChanged =amountInPounds * Indonesian_Ripah;
            break;
           case "Philipine":amountChanged =amountInPounds * Philipiine_Pisco;
            break;
           case "Pakistan":amountChanged =amountInPounds * Pakistan_Rupee;
            break;
            default:amountChanged =amountInPounds * 0.0;
       }
       
       String value = String.format("%.4f", amountChanged);
       textSecondCountry.setText(value);
    }//GEN-LAST:event_convertActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // Resets the countries to be selected
        firstCountry.setSelectedIndex(0);
       secondCountry.setSelectedIndex(0);
       textFirstCountry.setText(null);
       textSecondCountry.setText(null);
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convert;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCountryUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reset;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCountryUnit;
    private javax.swing.JTextField textFirstCountry;
    private javax.swing.JTextField textSecondCountry;
    // End of variables declaration//GEN-END:variables
}
