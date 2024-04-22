/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarna;

import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Melker & Rebecka
 */
public class SkapaForfragan extends javax.swing.JFrame {

    
    private boolean isWindowLoaded = false;
    private PrisBeraknare prisBeraknare;
    
    /**
     * Creates new form SkapaForfragan
     */
    public SkapaForfragan() {
        initComponents();
        
        prisBeraknare = new PrisBeraknare();
        
        FyllComboBoxes();
        UppdateraGUI();
        isWindowLoaded = true;
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
        
        ArrayList<Accessoar> allaAccessoarer = Accessoar.getAllaAccessoar();
        for(Accessoar enAccessoar : allaAccessoarer){
            accessoarCBX.addItem(enAccessoar.getBenamning());
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
        String beskrivning = kommentarTXTAREA.getText();
        
        String farg = fargCBX.getSelectedItem().toString();
        
        String accessoar = accessoarCBX.getSelectedItem().toString();
        
        String material = "";
        if(storlekCBX.getSelectedItem().toString().equals("SKRIV HÄR")){
            //Skriv kod här
        }
        else{
            material = materialCBX.getSelectedItem().toString();
        }
        
            if(Validering.isHeltal(antalTimmarTXTFLD) == false || antalTimmarTXTFLD.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vänligen fyll i antal timmar för att beräkna pris.");
            return null;
        }
                   
        int antalTimmar = Integer.parseInt(antalTimmarTXTFLD.getText());
        
        if(antalTimmar <= 0){
            JOptionPane.showMessageDialog(null, "Timmar måste vara över 0 för att kunna beräknas.");
            return null;
        }
        
        if(Validering.isDecimalTal(antalMeterTXT) == false || antalMeterTXT.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vänligen fyll i ett antal meter för att beräkna pris.");
            return null;
        }
        
        double antalMeter = Double.parseDouble(antalMeterTXT.getText());
        
        if(antalMeter <= 0){
            JOptionPane.showMessageDialog(null, "Antal meter måste vara över 0 för att kunna beräknas.");
            return null;
        }
        
        boolean arExpress = expressCheck.isSelected();
        
        //Man måste fylla i fler grejer
        
        Hatt nyHatt = new Hatt(benamning,storlek, farg, accessoar, material, beskrivning, arExpress, antalMeter, antalTimmar);
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
        totalKostnadTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        antalTimmarTXTFLD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        antalMeterTXT = new javax.swing.JTextField();
        expressCheck = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        specialCheck = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        materialCBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialCBXActionPerformed(evt);
            }
        });

        accessoarLBL.setText("Accessoar");

        accessoarCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        accessoarCBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessoarCBXActionPerformed(evt);
            }
        });

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
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(103, 103, 103)
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        totalKostnadTXT.setEditable(false);
        totalKostnadTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalKostnadTXTActionPerformed(evt);
            }
        });

        jLabel3.setText("Total kostnad:");

        jButton1.setText("Beräkna");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ange beräknad tid/h:");

        expressCheck.setText("Är express");

        jLabel5.setText("+ meter");

        specialCheck.setText("Specialbeställning");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(antalTimmarTXTFLD, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(materialCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(antalMeterTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(materialLBL)
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel5))
                                            .addComponent(specialCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(kommentarLBL)
                                            .addComponent(accessoarCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(accessoarLBL))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hattCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(hattLBL)))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(storlekLBL))
                                    .addComponent(storlekCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fargCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(fargLBL)))))
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(131, 131, 131))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(220, 220, 220)
                                        .addComponent(expressCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalKostnadTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(materialLBL)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(materialCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(antalMeterTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(accessoarLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accessoarCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kommentarLBL)
                    .addComponent(specialCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(antalTimmarTXTFLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(expressCheck))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalKostnadTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
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
        Hatt hattAttBestalla = SkapaNyHatt();
        
        if(hattAttBestalla == null){
            return;
        }
        
        this.dispose();
        new KundFormular(hattAttBestalla).setVisible(true);
    }//GEN-LAST:event_nextBtnActionPerformed

    private void hattCBXItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hattCBXItemStateChanged
        UppdateraGUI();
    }//GEN-LAST:event_hattCBXItemStateChanged

    private void totalKostnadTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalKostnadTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalKostnadTXTActionPerformed

    private void materialCBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialCBXActionPerformed
        // TODO add your handling code here:
        if (!isWindowLoaded) {
        return; // Förhindra att koden körs innan fönstret är helt laddat
        }
        
        String valtItem = (String) materialCBX.getSelectedItem();
        /*
        if (valtItem != null) { // Extra kontroll om inget är valt
            String input = JOptionPane.showInputDialog(this, "Ange antal meter för: " + valtItem);
            if(Validering.isDecimalTal(input)){                    
                antalMaterialMeter = Double.parseDouble(input);
            }
            else{
                antalMaterialMeter = 0;
            }
        }*/
    }//GEN-LAST:event_materialCBXActionPerformed

    private void accessoarCBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessoarCBXActionPerformed
        // TODO add your handling code here:
        if (!isWindowLoaded) {
        return; // Förhindra att koden körs innan fönstret är helt laddat
    }
    String valtItem = (String) accessoarCBX.getSelectedItem();
    
    /*
    if (valtItem != null) { // Extra kontroll om inget är valt
        String input = JOptionPane.showInputDialog(this, "Ange antal : " + valtItem);
        System.out.println("Du valde " + input);
    }*/
    }//GEN-LAST:event_accessoarCBXActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Hatt hattAttBerakna = SkapaNyHatt();
        /*
        if(Validering.isHeltal(antalTimmarTXTFLD) == false || antalTimmarTXTFLD.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vänligen fyll i antal timmar för att beräkna pris.");
            return;
        }
                   
        int antalTimmar = Integer.parseInt(antalTimmarTXTFLD.getText());
        
        if(antalTimmar <= 0){
            JOptionPane.showMessageDialog(null, "Timmar måste vara över 0 för att kunna beräknas.");
            return;
        }
        
        if(Validering.isDecimalTal(antalMeterTXT) == false || antalMeterTXT.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vänligen fyll i ett antal meter för att beräkna pris.");
            return;
        }
        
        double antalMeter = Double.parseDouble(antalMeterTXT.getText());
        
        if(antalMeter <= 0){
            JOptionPane.showMessageDialog(null, "Antal meter måste vara över 0 för att kunna beräknas.");
            return;
        }
        
        boolean arExpress = expressCheck.isSelected();
        */
        
        if(hattAttBerakna == null){
            return;
        }
        
        double pris = prisBeraknare.raknaUtPris(hattAttBerakna);
        totalKostnadTXT.setText(Double.toString(pris));
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accessoarCBX;
    private javax.swing.JLabel accessoarLBL;
    private javax.swing.JTextField antalMeterTXT;
    private javax.swing.JTextField antalTimmarTXTFLD;
    private javax.swing.JCheckBox expressCheck;
    private javax.swing.JComboBox<String> fargCBX;
    private javax.swing.JLabel fargLBL;
    private javax.swing.JButton goBack;
    private javax.swing.JComboBox<String> hattCBX;
    private javax.swing.JLabel hattLBL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kommentarLBL;
    private javax.swing.JTextArea kommentarTXTAREA;
    private javax.swing.JComboBox<String> materialCBX;
    private javax.swing.JLabel materialLBL;
    private javax.swing.JButton nextBtn;
    private javax.swing.JCheckBox specialCheck;
    private javax.swing.JComboBox<String> storlekCBX;
    private javax.swing.JLabel storlekLBL;
    private javax.swing.JTextField totalKostnadTXT;
    // End of variables declaration//GEN-END:variables
}
