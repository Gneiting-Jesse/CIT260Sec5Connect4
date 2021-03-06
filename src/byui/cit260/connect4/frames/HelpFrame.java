/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.frames;

import byui.cit260.connect4.enums.HelpType;
import byui.cit260.connect4.exceptions.Connect4Exception;
import byui.cit260.connect4.menucontrols.HelpMenuControl;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesse
 */
public class HelpFrame extends javax.swing.JFrame {
    HelpMenuControl helpCommands = new HelpMenuControl();

    /**
     * Creates new form HelpFrame
     */
    public HelpFrame() {
        initComponents();
    }
    
    public HelpMenuControl getHelpCommands() {
        return helpCommands;
    }
    
    private void displayHelpText(HelpType command) throws Connect4Exception {
        try {
        String helpText = this.helpCommands.displayGameHelp(command);
        this.jtHelpMessage.setText(helpText); 
        } catch (Connect4Exception ex) {
            this.jtHelpMessage.setText(ex.getMessage());
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHelpMessage = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        gameObjective = new javax.swing.JButton();
        player1GameHelp = new javax.swing.JButton();
        player2GameHelp = new javax.swing.JButton();
        quitHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel1.setText("Help Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(292, 292, 292))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jtHelpMessage.setEditable(false);
        jtHelpMessage.setColumns(20);
        jtHelpMessage.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jtHelpMessage.setLineWrap(true);
        jtHelpMessage.setRows(5);
        jtHelpMessage.setText("Click on the buttons to the left to display help information on the required topic.\n\nWhen finished click on the \"Quit Help\" button to exit the Help Menu screen.");
        jtHelpMessage.setWrapStyleWord(true);
        jtHelpMessage.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(jtHelpMessage);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        gameObjective.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        gameObjective.setText("Game Objective");
        gameObjective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameObjectiveActionPerformed(evt);
            }
        });

        player1GameHelp.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        player1GameHelp.setText("1 Player Game");
        player1GameHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1GameHelpActionPerformed(evt);
            }
        });

        player2GameHelp.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        player2GameHelp.setText("2 Player Game");
        player2GameHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2GameHelpActionPerformed(evt);
            }
        });

        quitHelp.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        quitHelp.setText("Quit Help");
        quitHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gameObjective, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player1GameHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player2GameHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quitHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(gameObjective)
                .addGap(18, 18, 18)
                .addComponent(player1GameHelp)
                .addGap(18, 18, 18)
                .addComponent(player2GameHelp)
                .addGap(18, 18, 18)
                .addComponent(quitHelp)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameObjectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameObjectiveActionPerformed
        try {
            displayHelpText(HelpType.INSTRUCTIONS);
        } catch (Connect4Exception ex) {
            Logger.getLogger(HelpFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gameObjectiveActionPerformed

    private void player1GameHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1GameHelpActionPerformed
        try {
            displayHelpText(HelpType.ONE_PERSON_GAME);
        } catch (Connect4Exception ex) {
            Logger.getLogger(HelpFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_player1GameHelpActionPerformed

    private void player2GameHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2GameHelpActionPerformed
        try {
            displayHelpText(HelpType.TWO_PERSON_GAME);
        } catch (Connect4Exception ex) {
            Logger.getLogger(HelpFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_player2GameHelpActionPerformed

    private void quitHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitHelpActionPerformed
        this.dispose();
    }//GEN-LAST:event_quitHelpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gameObjective;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtHelpMessage;
    private javax.swing.JButton player1GameHelp;
    private javax.swing.JButton player2GameHelp;
    private javax.swing.JButton quitHelp;
    // End of variables declaration//GEN-END:variables

}
