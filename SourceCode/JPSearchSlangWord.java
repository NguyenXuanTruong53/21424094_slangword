/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCode;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;
import javax.swing.JLabel;

/**
 *
 * @author ngoti
 */
public class JPSearchSlangWord extends javax.swing.JPanel {

    /**
     * Creates new form JPSearchSlangWord
     */
    
    private TreeMap<String, String> DictionarySlangWord = new TreeMap<>();

    public ArrayList<String> History = new ArrayList();
    
    public JPSearchSlangWord(TreeMap _DictionarySlangWord) {
        DictionarySlangWord = _DictionarySlangWord;
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

        jLTitle = new javax.swing.JLabel();
        jTSearchSlangWord = new javax.swing.JTextField();
        jPResult = new javax.swing.JPanel();
        jLResult = new javax.swing.JLabel();
        jLSlangWord = new javax.swing.JLabel();
        jBSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTitle.setText("Tìm kiếm theo Slang Word");

        jTSearchSlangWord.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTSearchSlangWord.setToolTipText("");

        jLResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLSlangWord.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLSlangWord.setText("Defenition : ");

        javax.swing.GroupLayout jPResultLayout = new javax.swing.GroupLayout(jPResult);
        jPResult.setLayout(jPResultLayout);
        jPResultLayout.setHorizontalGroup(
            jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPResultLayout.createSequentialGroup()
                .addComponent(jLSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 309, Short.MAX_VALUE))
        );
        jPResultLayout.setVerticalGroup(
            jPResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultLayout.createSequentialGroup()
                .addComponent(jLSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLResult, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jBSearch.setText("Tìm kiếm");
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTitle)
                .addGap(249, 249, 249))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTSearchSlangWord, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTSearchSlangWord, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jPResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        // TODO add your handling code here:
        Date currentTime = new Date();
        String jTxtSearch = jTSearchSlangWord.getText();
        jLResult.setText(jTxtSearch + " : " + DictionarySlangWord.get(jTxtSearch));
        History.add(jTxtSearch + " ---- " + currentTime);
    }//GEN-LAST:event_jBSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSearch;
    private javax.swing.JLabel jLResult;
    private javax.swing.JLabel jLSlangWord;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JPanel jPResult;
    private javax.swing.JTextField jTSearchSlangWord;
    // End of variables declaration//GEN-END:variables
}
