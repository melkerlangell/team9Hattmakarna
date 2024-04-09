/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarna;

import java.util.ArrayList;

/**
 *
 * @author Melker & Rebecka
 */
public class SkapaForfragan extends javax.swing.JFrame {

    /**
     * Creates new form SkapaForfragan
     */
    public SkapaForfragan() {
        initComponents();
        FyllComboBoxes();
        UppdateraGUI();
    }
    
    private void FyllComboBoxes(){
        hattCBX.removeAllItems();
        storlekCBX.removeAllItems();
        fargCBX.removeAllItems();
        materialCBX.removeAllItems();
        accessoarCBX.removeAllItems();
        
        ArrayList<HattMall> fardigaHattar = ProduktHanterare.getProduktLista();
        
        for(HattMall enHatt : fardigaHattar){
            hattCBX.addItem(enHatt.getBenamning());
            accessoarCBX.addItem(enHatt.getAccessoar());
        }
        hattCBX.addItem("Annat");
        
        ArrayList<String> storlekar = Storlek.getStorlekar();
        for(String enStorlek : storlekar){
            storlekCBX.addItem(enStorlek);
        }
        
        ArrayList<String> farger = Farg.getFarger();
        for(String farg : farger){
            fargCBX.addItem(farg);
        }
        
        ArrayList<Material> material = Material.getAllaMaterial();
        for(Material ettMaterial : material){
            materialCBX.addItem(ettMaterial.getBenamning());
        }
    }
    
    private void UppdateraGUI(){
        if(hattCBX.getSelectedItem() == null){
            return;
        }
        
        ArrayList<HattMall> fardigaHattar = ProduktHanterare.getProduktLista();

        if(hattCBX.getSelectedItem() == "Annat"){
            //Skriv kod här
        }
        else{
            String hattBenamning = String.valueOf(hattCBX.getSelectedItem());
            HattMall enHattMall = null;
            
            for(HattMall enHatt : fardigaHattar){
                if(hattBenamning.equals(enHatt.getBenamning())){
                    enHattMall = enHatt;
                    break;
                }
            }
            storlekCBX.setSelectedItem(enHattMall.getStorlek());
            fargCBX.setSelectedItem(enHattMall.getFarg());
            materialCBX.setSelectedItem(enHattMall.getMaterial());
            accessoarCBX.setSelectedItem(enHattMall.getAccessoar());
        } 
    }
    
    private Hatt SkapaNyHatt(){
        String benamning = hattCBX.getSelectedItem().toString();
        String storlek = storlekCBX.getSelectedItem().toString();
        
        String farg = "";
        
        String accessoar = accessoarCBX.getSelectedItem().toString();
        
        String material = "";
        if(storlekCBX.getSelectedItem().toString().equals("SKRIV HÄR")){
            //Skriv kod här
        }
        else{
            material = materialCBX.getSelectedItem().toString();
        } 
        
        Hatt nyHatt = new Hatt(benamning,storlek, farg, accessoar, material, 4, "");
        return nyHatt;
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
        hattCBX = new javax.swing.JComboBox<>();
        hattLBL = new javax.swing.JLabel();
        storlekLBL = new javax.swing.JLabel();
        materialLBL = new javax.swing.JLabel();
        storlekCBX = new javax.swing.JComboBox<>();
        materialCBX = new javax.swing.JComboBox<>();
        accessoarLBL = new javax.swing.JLabel();
        accessoarCBX = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        kommentarTXTAREA = new javax.swing.JTextArea();
        kommentarLBL = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        fargCBX = new javax.swing.JComboBox<>();
        fargLBL = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        goBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Skapa förfrågan");

        hattCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hattCBX.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hattCBXItemStateChanged(evt);
            }
        });

        hattLBL.setText("Välj mall");

        storlekLBL.setText("Storlek");

        materialLBL.setText("Material");

        storlekCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        materialCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        accessoarLBL.setText("Accessoar");

        accessoarCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        kommentarTXTAREA.setColumns(20);
        kommentarTXTAREA.setRows(5);
        jScrollPane1.setViewportView(kommentarTXTAREA);

        kommentarLBL.setText("Kommentar");

        nextBtn.setBackground(new java.awt.Color(0, 102, 102));
        nextBtn.setForeground(new java.awt.Color(255, 255, 255));
        nextBtn.setText("Nästa");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        fargCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        fargLBL.setText("Färg");

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hattmakarna/2714927-200 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(69, 69, 69)
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hattCBX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(hattLBL)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(storlekLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(storlekCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fargCBX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(fargLBL)))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(materialCBX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(materialLBL)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(accessoarCBX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(accessoarLBL)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(kommentarLBL)
                                        .addGap(88, 88, 88))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(87, 87, 87))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(hattLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hattCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(storlekLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(storlekCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fargLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fargCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(materialLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(materialCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accessoarLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accessoarCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(kommentarLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Personalmeny().setVisible(true);
    }//GEN-LAST:event_goBackActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Hatt hattAttBestalla = SkapaNyHatt();
        new KundFormular(hattAttBestalla).setVisible(true);
    }//GEN-LAST:event_nextBtnActionPerformed

    private void hattCBXItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hattCBXItemStateChanged
        UppdateraGUI();
    }//GEN-LAST:event_hattCBXItemStateChanged



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accessoarCBX;
    private javax.swing.JLabel accessoarLBL;
    private javax.swing.JComboBox<String> fargCBX;
    private javax.swing.JLabel fargLBL;
    private javax.swing.JButton goBack;
    private javax.swing.JComboBox<String> hattCBX;
    private javax.swing.JLabel hattLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kommentarLBL;
    private javax.swing.JTextArea kommentarTXTAREA;
    private javax.swing.JComboBox<String> materialCBX;
    private javax.swing.JLabel materialLBL;
    private javax.swing.JButton nextBtn;
    private javax.swing.JComboBox<String> storlekCBX;
    private javax.swing.JLabel storlekLBL;
    // End of variables declaration//GEN-END:variables
}
