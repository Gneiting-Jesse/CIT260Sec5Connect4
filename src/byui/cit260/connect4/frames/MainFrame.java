/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.frames;

import byui.cit260.connect4.menucontrols.MainMenuControl;
/**
 *
 * @author Owner
 */
public class MainFrame extends javax.swing.JFrame {
    public MainMenuControl executeCommands = new MainMenuControl();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    public MainMenuControl getExecuteCommands() {
        return executeCommands;
    }

    public void setExecuteCommands(MainMenuControl executeCommands) {
        this.executeCommands = executeCommands;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jpMenuItems = new javax.swing.JPanel();
        onePlayerGame = new javax.swing.JButton();
        twoPlayerGame = new javax.swing.JButton();
        takeQuiz = new javax.swing.JButton();
        getHelp = new javax.swing.JButton();
        exitGame = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtWelcome = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect 4");

        jpBody.setBackground(new java.awt.Color(0, 204, 102));
        jpBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jpTitle.setBackground(new java.awt.Color(0, 204, 102));

        jlTitle.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jlTitle.setText("Connect 4");

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jlTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlTitle)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jpMenuItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        onePlayerGame.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        onePlayerGame.setText("Begin a One Player Game");
        onePlayerGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onePlayerGameActionPerformed(evt);
            }
        });

        twoPlayerGame.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        twoPlayerGame.setText("Begin a Two Player Game");
        twoPlayerGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPlayerGameActionPerformed(evt);
            }
        });

        takeQuiz.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        takeQuiz.setText("Take Quiz");
        takeQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeQuizActionPerformed(evt);
            }
        });

        getHelp.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        getHelp.setText("Help");
        getHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getHelpActionPerformed(evt);
            }
        });

        exitGame.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        exitGame.setText("Quit");
        exitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuItemsLayout = new javax.swing.GroupLayout(jpMenuItems);
        jpMenuItems.setLayout(jpMenuItemsLayout);
        jpMenuItemsLayout.setHorizontalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitGame, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takeQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoPlayerGame, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onePlayerGame))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpMenuItemsLayout.setVerticalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(onePlayerGame)
                .addGap(18, 18, 18)
                .addComponent(twoPlayerGame)
                .addGap(18, 18, 18)
                .addComponent(takeQuiz)
                .addGap(18, 18, 18)
                .addComponent(getHelp)
                .addGap(18, 18, 18)
                .addComponent(exitGame)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jtWelcome.setEditable(false);
        jtWelcome.setColumns(20);
        jtWelcome.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jtWelcome.setLineWrap(true);
        jtWelcome.setRows(5);
        jtWelcome.setText("               Welcome to Connect 4\n\nYou will have the option of choosing a 1 player game or a 2 player game. Each player will have a different game piece. The object of the game is to place 4 of your game pieces consecutively in a line either vertically, horizontally or diagonally.\n\n               Good Luck!!!");
        jtWelcome.setToolTipText("");
        jtWelcome.setWrapStyleWord(true);
        jtWelcome.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(jtWelcome);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpMenuItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void twoPlayerGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayerGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoPlayerGameActionPerformed

    private void exitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exitGameActionPerformed

    private void getHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getHelpActionPerformed

    private void takeQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeQuizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_takeQuizActionPerformed

    private void onePlayerGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onePlayerGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onePlayerGameActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitGame;
    private javax.swing.JButton getHelp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpMenuItems;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JTextArea jtWelcome;
    private javax.swing.JButton onePlayerGame;
    private javax.swing.JButton takeQuiz;
    private javax.swing.JButton twoPlayerGame;
    // End of variables declaration//GEN-END:variables
}
