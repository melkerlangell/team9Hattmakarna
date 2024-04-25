/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarna;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.time.LocalDate;

/**
 *
 * @author Melker & Rebecka
 */
public class KundFormular extends javax.swing.JFrame {

    private Hatt hattAttBestalla;

    /**
     * Creates new form KundFormular
     */
    public KundFormular(Hatt enHatt) {
        hattAttBestalla = enHatt;

        initComponents();
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
        jTextNamn = new javax.swing.JTextField();
        jTextTelefon = new javax.swing.JTextField();
        jTextAdress = new javax.swing.JTextField();
        jTextEpost = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLaggTillKund = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        goBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Ange din personliga information");

        jLabel2.setText("Namn");

        jLabel3.setText("Telefon");

        jLabel4.setText("Adress");

        jLabel5.setText("Epost");

        jLabel6.setText("Datum på förfrågan");

        btnLaggTillKund.setBackground(new java.awt.Color(0, 102, 102));
        btnLaggTillKund.setForeground(new java.awt.Color(255, 255, 255));
        btnLaggTillKund.setText("Lägg förfrågan");
        btnLaggTillKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillKundActionPerformed(evt);
            }
        });

        jButton1.setText("Hämta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hattmakarna/2714927-200 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(100, 100, 100)
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLaggTillKund, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(167, 167, 167))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(165, 165, 165))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(168, 168, 168))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(48, 48, 48))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(jTextTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btnLaggTillKund, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String textToString(JTextField textToCheck) {
        String info = textToCheck.getText();

        return info;
    }

    private String hattInfo() {
        String benamning = hattAttBestalla.getBenamning();
        String materail = hattAttBestalla.getMaterial();
        String storlek = hattAttBestalla.getStorlek();
        String farg = hattAttBestalla.getFarg();
        String accessoar = hattAttBestalla.getAccessoar();
        String beskrivning = hattAttBestalla.getBeskrivning();
        double pris = PrisBeraknare.raknaUtPris(hattAttBestalla);
        String Kostnad = (Double.toString(pris));
        String meddelande = "Här är en bekräftelse på din hattbeställning." + "\n"
                + "---------------------------------------------"+"\n"
                + "Hatt: " + benamning + ".\n"
                + "Material: " + materail + ".\n"
                + "Storlek: " + storlek + ".\n"
                + "Färg: " + farg + ".\n"
                + "Accessoar: " + accessoar + ".\n"
                + "Special: " + beskrivning + ".\n"
                + "Pris: " + Kostnad + ".\n"
                + "Tack för din beställning!";
        return meddelande;

    }

    public Kund SkapaNyKund() {

        String namn = textToString(jTextNamn);
        String adress = textToString(jTextAdress);
        String telefon = textToString(jTextTelefon);
        String epost = textToString(jTextEpost);
        Kund nyKund = null;
        String felMeddelande = "";

        if (namn.isEmpty()) {
            felMeddelande += "Namnfältet är tomt. ";
        }
        if (adress.isEmpty()) {
            felMeddelande += "Adressfältetfältet är tomt. ";
        }
        if (telefon.isEmpty()) {
            felMeddelande += "Telefonfältet är tomt. ";
        }
        if (Validering.isSvensktMobilNummer(jTextTelefon) == false) {
            felMeddelande += "Ange ett giltigt mobilnummer. ";
        }
        if (epost.isEmpty()) {
            felMeddelande += "Epostfältet är tomt. ";
        }
        if (Validering.isEpost(jTextEpost) == false) {
            felMeddelande += "Ange en giltig epostadress. ";
        }

        if (felMeddelande.equals("")) {
            nyKund = new Kund(namn, adress, telefon, epost);
            JOptionPane.showMessageDialog(null, "Ny förfrågan är har registrerats och kund har blivit informerad.");
        } else {
            JOptionPane.showMessageDialog(null, "Dessa fel inträffade: " + felMeddelande);
        }

        return nyKund;
    }

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new SkapaForfragan().setVisible(true);
    }//GEN-LAST:event_goBackActionPerformed

    private void btnLaggTillKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillKundActionPerformed
//        DateFormat datumFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String datum = datumFormat.format(jDateChooser1.getDate());
        //Kommer bli problem, vad händer om det blir fel i kunden? Returns null

        LocalDate dagensDatum = LocalDate.now();
        String datum = dagensDatum.toString();
        //jLabelDatum.setText(datum); - denna kan användas för att visa datumet i förmuläret om vi känner för det 
        Kund nyKund = SkapaNyKund();
        
        if(nyKund == null){
            JOptionPane.showMessageDialog(null, "Det blev tyvärr fel. Prova igen.");
            return;
        }
        
        FörfrågningsRegister.laggTillForfragan(datum, nyKund, hattAttBestalla);
        EpostHanterare.skickaEpost(nyKund.getEpost(), "Din beställning", hattInfo());
        this.dispose();
        new Personalmeny().setVisible(true);
    }//GEN-LAST:event_btnLaggTillKundActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Kund enKund = KundRegister.hittaKundFranEpost(jTextEpost.getText());
        if (enKund != null) {
            jTextNamn.setText(enKund.getNamn());
            jTextTelefon.setText(enKund.getTelefon());
            jTextAdress.setText(enKund.getAdress());
        } else {
            JOptionPane.showMessageDialog(null, "Kunden finns inte i systemet, var god skriv in uppgifter manuellt.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillKund;
    private javax.swing.JButton goBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAdress;
    private javax.swing.JTextField jTextEpost;
    private javax.swing.JTextField jTextNamn;
    private javax.swing.JTextField jTextTelefon;
    // End of variables declaration//GEN-END:variables
}
