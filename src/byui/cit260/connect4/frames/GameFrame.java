/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.connect4.frames;

import byui.cit260.connect4.enums.GameStatus;
import byui.cit260.connect4.enums.GameType;
import byui.cit260.connect4.enums.PlayerType;
import byui.cit260.connect4.exceptions.GameException;
import byui.cit260.connect4.exceptions.Connect4Exception;
import byui.cit260.connect4.menucontrols.GameMenuControl;
import byui.cit260.connect4.models.Game;
import byui.cit260.connect4.frames.MainFrame;
import byui.cit260.connect4.models.Player;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Owner
 */
public class GameFrame extends javax.swing.JFrame {
    
    private String currentMarker = null;
    private Game game = null;
    private GameMenuControl gameCommands = null;
    
    /**
     * Creates new form MainFrame
     */
    public GameFrame() {
        this.initComponents();
        this.initializeFrame();
        setLocationRelativeTo(null);
    }

    public GameFrame(Game game) {
        this();
        this.game = game;
        this.gameCommands = new GameMenuControl(game);
    }
    
    public void initializeFrame() {
        
        connect4Table.getTableHeader().setVisible(false);
        connect4Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Color backgroundColor = connect4Table.getBackground();
        connect4Table.setSelectionBackground(backgroundColor);
        
        CellRenderer cellRenderer = new CellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        TableColumnModel columnTableModel = connect4Table.getColumnModel();
        for (int i = 0; i < connect4Table.getColumnCount(); i++) {
        columnTableModel.getColumn(i).setCellRenderer(cellRenderer);
        }
    }

    public String getCurrentMarker() {
        return currentMarker;
    }

    public void setCurrentMarker(String currentMarker) {
        this.currentMarker = currentMarker;
    }

    public JButton getBeginGame() {
        return beginGame;
    }

    public void setBeginGame(JButton beginGame) {
        this.beginGame = beginGame;
    }

    public JTable getConnect4Table() {
        return connect4Table;
    }

    public void setConnect4Table(JTable connect4Table) {
        this.connect4Table = connect4Table;
    }

    public JPanel getJpBody() {
        return jpBody;
    }

    public void setJpBody(JPanel jpBody) {
        this.jpBody = jpBody;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jpMenuItems = new javax.swing.JPanel();
        getMarker = new javax.swing.JButton();
        beginGame = new javax.swing.JButton();
        exitGame = new javax.swing.JButton();
        getHelp = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        connect4Table = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMessageArea = new javax.swing.JTextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect 4");

        jpBody.setBackground(new java.awt.Color(0, 204, 102));
        jpBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jpTitle.setBackground(new java.awt.Color(0, 204, 102));

        jlTitle.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jlTitle.setText("Game Menu");

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jlTitle)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jpMenuItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        getMarker.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        getMarker.setText("Get Marker");
        getMarker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getMarkerActionPerformed(evt);
            }
        });

        beginGame.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        beginGame.setText("Begin Game");
        beginGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginGameActionPerformed(evt);
            }
        });

        exitGame.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        exitGame.setText("Quit");
        exitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameActionPerformed(evt);
            }
        });

        getHelp.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        getHelp.setText("Help");
        getHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuItemsLayout = new javax.swing.GroupLayout(jpMenuItems);
        jpMenuItems.setLayout(jpMenuItemsLayout);
        jpMenuItemsLayout.setHorizontalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(exitGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beginGame, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(getMarker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpMenuItemsLayout.setVerticalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(getMarker)
                .addGap(34, 34, 34)
                .addComponent(beginGame)
                .addGap(35, 35, 35)
                .addComponent(getHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(exitGame)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        connect4Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        connect4Table.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        connect4Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ));
        connect4Table.setFocusable(false);
        connect4Table.setRowHeight(44);
        connect4Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellClicked(evt);
            }
        });
        jScrollPane3.setViewportView(connect4Table);

        jtMessageArea.setColumns(20);
        jtMessageArea.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jtMessageArea.setLineWrap(true);
        jtMessageArea.setRows(5);
        jtMessageArea.setWrapStyleWord(true);
        jtMessageArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(jtMessageArea);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jpBodyLayout.createSequentialGroup()
                        .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpMenuItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
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

    private void exitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameActionPerformed
        connect4.Connect4.mainFrame.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exitGameActionPerformed

    private void beginGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginGameActionPerformed
        this.gameCommands.startNewGame(this.game);
        clearMarkers();
        takeFirstTurn();
        String nextPlayersMessage = this.game.getCurrentPlayer().getName() + ", it's your turn.";
        this.jtMessageArea.setText(nextPlayersMessage);
    }//GEN-LAST:event_beginGameActionPerformed

    private void getMarkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMarkerActionPerformed
        GetMarkerFrame getMarkerFrame = new GetMarkerFrame();
        getMarkerFrame.setVisible(true);
    }//GEN-LAST:event_getMarkerActionPerformed

    private void getHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getHelpActionPerformed
        HelpFrame helpFrame = new HelpFrame();
        helpFrame.setVisible(true);
    }//GEN-LAST:event_getHelpActionPerformed

    private void cellClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellClicked
       JTable jTable = JTable evt.getComponent();
       this.jtMessageArea.setForeground(Color.BLACK);
       this.takeTurn(jTable);
    }//GEN-LAST:event_cellClicked

    /**
     * @param args the command line arguments
     */
    
        private void clearMarkers() {
        TableModel model = this.connect4Table.getModel();
        int rowCount = this.connect4Table.getRowCount();
        int colCount = this.connect4Table.getColumnCount();
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                model.setValueAt("", row, col);
            }
        }   
    }
        
        
        private String getNextPlayerMessage(Player player) {
        if (this.game.getGameType() == GameType.ONE_PLAYER) {
            return "The computer made it's move. Now make yours."
                    + player.getName();
        } else {
            return "It's your turn."
                    + player.getName();
        }
    }
        
        private boolean gameOver() {
        if (this.game.getStatus() == GameStatus.TIE) { 
            this.jtMessageArea.setText(this.game.getTiedMessage());
            return true;
        } else if (this.game.getStatus() == GameStatus.WINNER) { 
            this.jtMessageArea.setText(this.game.getWinningMessage());
            return true;
        }

        return false;
    }
        
        private void takeFirstTurn() {
        Player currentPlayer = this.game.getCurrentPlayer();
        
        if (this.game.getStatus() == GameStatus.NEW_GAME
                && this.game.getGameType() == GameType.ONE_PLAYER
                && currentPlayer.getPlayerType() == PlayerType.COMPUTER_PLAYER) {
            try {
                Point locationMarkerPlaced = this.gameCommands.playerTakesTurn(currentPlayer, null);

                String playersMarker = game.getCurrentPlayer().getMarker();
                this.connect4Table.getModel().setValueAt(playersMarker, locationMarkerPlaced.x, locationMarkerPlaced.y);
                
            } catch (Exception ex) {
                this.jtMessageArea.setText(ex.getMessage());
                ex.printStackTrace();
                this.dispose();
            }
        }
        
        String promptNextPlayer = getNextPlayerMessage(currentPlayer);
        this.jtMessageArea.setText(promptNextPlayer);
        this.game.setStatus(GameStatus.PLAYING);
    }

    private void takeTurn(JTable table) {
        String playersMarker;
        int selectedRow = table.getSelectedRow();
        int selectedColumn = table.getSelectedColumn();
        Point selectedLocation = new Point(selectedRow, selectedColumn);

        Player currentPlayer = this.game.getCurrentPlayer();
        Player otherPlayer = this.game.getOtherPlayer();

        try {

            if (this.game.getGameType() == GameType.ONE_PLAYER) {
                // regular players turn
                Point locationMarkerPlaced = 
                this.gameCommands.playerTakesTurn(currentPlayer, selectedLocation);
                playersMarker = currentPlayer.getMarker();
                table.getModel().setValueAt(playersMarker, locationMarkerPlaced.x, locationMarkerPlaced.y);
                if (this.gameOver()) { 
                    return;
                }
              
                table.setCellSelectionEnabled(false);
                ListSelectionModel selectionModel = table.getSelectionModel();
                selectionModel.clearSelection();
                

                // computers turn
                locationMarkerPlaced = this.gameCommands.playerTakesTurn(otherPlayer, null);
                playersMarker = otherPlayer.getMarker();
                table.getModel().setValueAt(playersMarker, locationMarkerPlaced.x, locationMarkerPlaced.y);

                if (this.gameOver()) { // game won or tied?
                    return;
                }
                
            } else { 
                               
                Point locationMarkerPlaced = this.gameCommands.playerTakesTurn(this.game.getCurrentPlayer(), selectedLocation);
                playersMarker = currentPlayer.getMarker();
                table.getModel().setValueAt(playersMarker, locationMarkerPlaced.x, selectedColumn);
                if (this.gameOver()) { // game won or tied?
                    return;
                }
                
                table.setCellSelectionEnabled(false);
                ListSelectionModel selectionModel = table.getSelectionModel();
                selectionModel.clearSelection();
            }

            if (this.gameOver()) { // game won or tied?
                return;
            }

            String promptNextPlayer = getNextPlayerMessage(this.game.getCurrentPlayer());
            this.jtMessageArea.setText(promptNextPlayer);

        } catch (GameException | Connect4Exception gex) {
            this.jtMessageArea.setText(gex.getMessage());
            ListSelectionModel selectionModel = table.getSelectionModel();
            selectionModel.clearSelection();
        } catch (Exception ex) {
            this.jtMessageArea.setText(ex.getMessage());
            ex.printStackTrace();
            this.dispose();
        }
    }

    private class CellRenderer extends DefaultTableCellRenderer {

        public CellRenderer() {
            super();
        }

        public void setValue(Player player) {
            setText((player == null) ? "" : player.getMarker());
        }
    }

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beginGame;
    private javax.swing.JTable connect4Table;
    private javax.swing.JButton exitGame;
    private javax.swing.JButton getHelp;
    private javax.swing.JButton getMarker;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpMenuItems;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JTextArea jtMessageArea;
    // End of variables declaration//GEN-END:variables
}
