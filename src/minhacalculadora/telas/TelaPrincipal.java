package minhacalculadora.telas;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlFechar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mCalculadoras = new javax.swing.JMenu();
        mSimples = new javax.swing.JMenuItem();
        mIMC = new javax.swing.JMenuItem();
        mTMB = new javax.swing.JMenuItem();
        mMoedas = new javax.swing.JMenuItem();
        mInflacao = new javax.swing.JMenuItem();
        mDatas = new javax.swing.JMenuItem();
        mGeometrica = new javax.swing.JMenuItem();
        mSobre = new javax.swing.JMenu();

        jLabel1.setText("Deseja realmente encerrar o programa?");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dlFecharLayout = new javax.swing.GroupLayout(dlFechar.getContentPane());
        dlFechar.getContentPane().setLayout(dlFecharLayout);
        dlFecharLayout.setHorizontalGroup(
            dlFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlFecharLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlFecharLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        dlFecharLayout.setVerticalGroup(
            dlFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlFecharLayout.createSequentialGroup()
                .addGroup(dlFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlFecharLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(dlFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(dlFecharLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ferramentas");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mCalculadoras.setText("Calculadoras");

        mSimples.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minhacalculadora/imagens/calc.png"))); // NOI18N
        mSimples.setText("Matemática Simples");
        mSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSimplesActionPerformed(evt);
            }
        });
        mCalculadoras.add(mSimples);

        mIMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minhacalculadora/imagens/weight.png"))); // NOI18N
        mIMC.setText("Índice de Massa Corporal");
        mIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIMCActionPerformed(evt);
            }
        });
        mCalculadoras.add(mIMC);

        mTMB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minhacalculadora/imagens/muscle.png"))); // NOI18N
        mTMB.setText("Taxa Metabólica Basal");
        mTMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTMBActionPerformed(evt);
            }
        });
        mCalculadoras.add(mTMB);

        mMoedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minhacalculadora/imagens/currency.png"))); // NOI18N
        mMoedas.setText("Conversor de Moedas");
        mMoedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMoedasActionPerformed(evt);
            }
        });
        mCalculadoras.add(mMoedas);

        mInflacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minhacalculadora/imagens/inflation.png"))); // NOI18N
        mInflacao.setText("Correção de valor pela Inflação");
        mCalculadoras.add(mInflacao);

        mDatas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minhacalculadora/imagens/calendar.png"))); // NOI18N
        mDatas.setText("Datas");
        mCalculadoras.add(mDatas);

        mGeometrica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minhacalculadora/imagens/geometric.png"))); // NOI18N
        mGeometrica.setText("Geométrica");
        mCalculadoras.add(mGeometrica);

        jMenuBar1.add(mCalculadoras);

        mSobre.setText("Sobre");
        jMenuBar1.add(mSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSimplesActionPerformed
        CalcSimples calc = new CalcSimples();
        calc.setVisible(true);
    }//GEN-LAST:event_mSimplesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void mMoedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMoedasActionPerformed
        CalcMoedas calcMoeda = new CalcMoedas();
        calcMoeda.setVisible(true);
    }//GEN-LAST:event_mMoedasActionPerformed

    private void mTMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTMBActionPerformed
        CalcTMB calcTMB = new CalcTMB();
        calcTMB.setVisible(true);
    }//GEN-LAST:event_mTMBActionPerformed

    private void mIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIMCActionPerformed
        CalcIMC calcIMC = new CalcIMC();
        calcIMC.setVisible(true);
    }//GEN-LAST:event_mIMCActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog dlFechar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mCalculadoras;
    private javax.swing.JMenuItem mDatas;
    private javax.swing.JMenuItem mGeometrica;
    private javax.swing.JMenuItem mIMC;
    private javax.swing.JMenuItem mInflacao;
    private javax.swing.JMenuItem mMoedas;
    private javax.swing.JMenuItem mSimples;
    private javax.swing.JMenu mSobre;
    private javax.swing.JMenuItem mTMB;
    // End of variables declaration//GEN-END:variables
}
