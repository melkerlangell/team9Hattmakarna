/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarna;

import static hattmakarna.ProduktHanterare.getProduktLista;
import javax.swing.JComboBox;
import java.util.ArrayList;

/**
 *
 * @author Melker
 */
public class HanteraProdukter extends javax.swing.JFrame {

    private ArrayList<HattMall> produktLista;
    private HattMall hattAttAndra;

    /**
     * Creates new form HanteraProdukter
     */
    public HanteraProdukter() {
        initComponents();
        setEnabled(true);
        produktLista = ProduktHanterare.getProduktLista();
        laddaHattCbx();
        laddaStorlekCbx();
        laddaFargCbx();
        laddaMaterialCbx();
        laddaAccessoarCbx();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UppdateraKnapp = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        hattCBX = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        goBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        RaderaKnapp = new javax.swing.JButton();
        SkapaKnapp = new javax.swing.JButton();
        storlekCBX = new javax.swing.JComboBox<>();
        fargCBX = new javax.swing.JComboBox<>();
        accessoarCBX = new javax.swing.JComboBox<>();
        materialCBX = new javax.swing.JComboBox<>();
        benamningTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Ändra hattinfo");

        jLabel2.setText("Benämning");

        jLabel3.setText("Storlek");

        jLabel4.setText("Färg");

        jLabel5.setText("Accessoar");

        jLabel6.setText("Material");

        UppdateraKnapp.setBackground(new java.awt.Color(0, 102, 102));
        UppdateraKnapp.setForeground(new java.awt.Color(255, 255, 255));
        UppdateraKnapp.setText("Uppdatera");
        UppdateraKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UppdateraKnappActionPerformed(evt);
            }
        });

        jLabel7.setText("Välj hatt");

        hattCBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hattCBXActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        goBack.setBackground(new java.awt.Color(102, 102, 102));
        goBack.setForeground(new java.awt.Color(255, 255, 255));
        goBack.setText("Gå tillbaka");
        goBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hattmakarna/hatt.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel8)
                .addGap(99, 99, 99)
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        RaderaKnapp.setBackground(new java.awt.Color(0, 102, 102));
        RaderaKnapp.setForeground(new java.awt.Color(255, 255, 255));
        RaderaKnapp.setText("Radera");
        RaderaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaderaKnappActionPerformed(evt);
            }
        });

        SkapaKnapp.setBackground(new java.awt.Color(0, 102, 102));
        SkapaKnapp.setForeground(new java.awt.Color(255, 255, 255));
        SkapaKnapp.setText("Skapa hatt");
        SkapaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkapaKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(storlekCBX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hattCBX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fargCBX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accessoarCBX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(materialCBX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(benamningTxt))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RaderaKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SkapaKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(UppdateraKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(hattCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(benamningTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(storlekCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fargCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(accessoarCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(materialCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(UppdateraKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RaderaKnapp)
                    .addComponent(SkapaKnapp))
                .addGap(279, 279, 279))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Personalmeny().setVisible(true);
    }//GEN-LAST:event_goBackActionPerformed

    private void hattCBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hattCBXActionPerformed
       // Antag att produktLista är din ArrayList och hattCBX är din combobox
// bara benämning, ej id!
//for (int i = 0; i < produktLista.size(); i++) {
 //   hattCBX.addItem(produktLista.get(i).getBenamning());
//}
test();

    }//GEN-LAST:event_hattCBXActionPerformed
private void test(){
    int selectedIndex = hattCBX.getSelectedIndex();
    
    // Ensure a valid selection
        if (selectedIndex != -1) {
        // Retrieve the selected HattMall object from the produktLista
        HattMall selectedHatt = produktLista.get(selectedIndex);
        
        // Set the values from the selected HattMall object to the JTextFields
        benamningTxt.setText(selectedHatt.getBenamning());
        storlekCBX.setSelectedItem(selectedHatt.getStorlek());
        fargCBX.setSelectedItem(selectedHatt.getFarg());
        accessoarCBX.setSelectedItem(selectedHatt.getAccessoar());
        materialCBX.setSelectedItem(selectedHatt.getMaterial());
        }
}
    private void UppdateraKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UppdateraKnappActionPerformed
        // TODO add your handling code here:
    int selectedIndex = hattCBX.getSelectedIndex();

    // Ensure a valid selection
    if (selectedIndex != -1) {
        // Retrieve the selected HattMall object from the produktLista
        HattMall selectedHatt = produktLista.get(selectedIndex);
        
        // Update the attributes of the selected HattMall object with the values from the JTextFields
        selectedHatt.setBenamning(benamningTxt.getText());
        selectedHatt.setStorlek(storlekCBX.getSelectedItem().toString());
        selectedHatt.setFarg(fargCBX.getSelectedItem().toString());
        selectedHatt.setAccessoar(accessoarCBX.getSelectedItem().toString());
        selectedHatt.setMaterial(materialCBX.getSelectedItem().toString());
        
        ProduktHanterare.uppdateraHattmall(selectedHatt);   
    }
        
    }//GEN-LAST:event_UppdateraKnappActionPerformed

    private void RaderaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaderaKnappActionPerformed
        // TODO add your handling code here:
        
        int selectedIndex = hattCBX.getSelectedIndex();

    // Ensure a valid selection
        if (selectedIndex != -1) {
        // Retrieve the selected HattMall object from the produktLista
        HattMall selectedHatt = produktLista.get(selectedIndex);
        produktLista.remove(selectedHatt);
        hattCBX.removeItemAt(selectedIndex);
        
        }
        
    }//GEN-LAST:event_RaderaKnappActionPerformed

    private void SkapaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkapaKnappActionPerformed
        // TODO add your handling code here:
        new SkapaHatt().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_SkapaKnappActionPerformed

    private void laddaHattCbx() {
        for(HattMall enHatt : ProduktHanterare.getProduktLista()) {
            hattCBX.addItem(enHatt.getBenamning());
        }
    }
    
    
    
    private void laddaStorlekCbx() {
        for(String enStorlek : Storlek.getStorlekar()) {
            storlekCBX.addItem(enStorlek);
        }
    }
    
    private void laddaFargCbx() {
        for(String enFarg : Farg.getFarger()) {
            fargCBX.addItem(enFarg);
        }
    }
    
    private void laddaAccessoarCbx() {
        for(Accessoar enAccessoar : Accessoar.getAllaAccessoar()) {
            accessoarCBX.addItem(enAccessoar.getBenamning());
        }
    }

    private void laddaMaterialCbx() {
        for(Material ettMat : Material.getAllaMaterial()) {
            materialCBX.addItem(ettMat.getBenamning());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RaderaKnapp;
    private javax.swing.JButton SkapaKnapp;
    private javax.swing.JButton UppdateraKnapp;
    private javax.swing.JComboBox<String> accessoarCBX;
    private javax.swing.JTextField benamningTxt;
    private javax.swing.JComboBox<String> fargCBX;
    private javax.swing.JButton goBack;
    private javax.swing.JComboBox<String> hattCBX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> materialCBX;
    private javax.swing.JComboBox<String> storlekCBX;
    // End of variables declaration//GEN-END:variables

    private static class arrayListComboBox {

        public arrayListComboBox() {
        }
    }
}
