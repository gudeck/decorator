/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vision;

import control.*;
import domain.Roupa;
import domain.incrementos.*;
import domain.roupas.*;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author guzuc
 */
public class JDGCriacaoRoupas extends javax.swing.JDialog {

    private static JDGCriacaoRoupas uniqueInstance;

    private final ControleVisao controladorVisao;

    private Roupa roupa;
    private Object[] roupas;
    ArrayList<Roupa> listaRoupas = new ArrayList<>();

    private JDGCriacaoRoupas(java.awt.Frame parent, boolean modal, ControleVisao controlador) {
        super(parent, modal);
        initComponents();
        controladorVisao = controlador;
        roupas = new Object[]{
            new Calca(),
            new Camisa(),
            new Chapeu(),
            new Vestido()};
        cmbRoupas.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{
                    "Calça",
                    "Camisa",
                    "Chapéu",
                    "Vestido"}));
        ativarBotoes();
    }

    public static synchronized JDGCriacaoRoupas getInstance(java.awt.Frame parent, boolean modal, ControleVisao controlador) {
        if (uniqueInstance == null) {
            uniqueInstance = new JDGCriacaoRoupas(parent, modal, controlador);
        }

        uniqueInstance.setModal(modal);
        return uniqueInstance;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbRoupas = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMenosEstampa = new javax.swing.JButton();
        btnMaisEstampa = new javax.swing.JButton();
        btnMenosLantejoula = new javax.swing.JButton();
        btnMaisLantejoula = new javax.swing.JButton();
        btnMenosRenda = new javax.swing.JButton();
        btnMaisRenda = new javax.swing.JButton();
        btnMenosStrass = new javax.swing.JButton();
        btnMaisStrass = new javax.swing.JButton();
        btnMaisBotao = new javax.swing.JButton();
        btnMenosBotao = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProdutoCriado = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo"));

        cmbRoupas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoupasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbRoupas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbRoupas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Incrementos"));

        jLabel1.setText("Botão");

        jLabel2.setText("Estampa");

        jLabel3.setText("Lantejoula");

        jLabel4.setText("Renda");

        jLabel5.setText("Strass");

        btnMenosEstampa.setText("-");
        btnMenosEstampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosBotaoActionPerformed(evt);
            }
        });

        btnMaisEstampa.setMnemonic('E');
        btnMaisEstampa.setText("+");
        btnMaisEstampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisBotaoActionPerformed(evt);
            }
        });

        btnMenosLantejoula.setText("-");
        btnMenosLantejoula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosBotaoActionPerformed(evt);
            }
        });

        btnMaisLantejoula.setMnemonic('L');
        btnMaisLantejoula.setText("+");
        btnMaisLantejoula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisBotaoActionPerformed(evt);
            }
        });

        btnMenosRenda.setText("-");
        btnMenosRenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosBotaoActionPerformed(evt);
            }
        });

        btnMaisRenda.setMnemonic('R');
        btnMaisRenda.setText("+");
        btnMaisRenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisBotaoActionPerformed(evt);
            }
        });

        btnMenosStrass.setText("-");
        btnMenosStrass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosBotaoActionPerformed(evt);
            }
        });

        btnMaisStrass.setMnemonic('S');
        btnMaisStrass.setText("+");
        btnMaisStrass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisBotaoActionPerformed(evt);
            }
        });

        btnMaisBotao.setMnemonic('B');
        btnMaisBotao.setText("+");
        btnMaisBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisBotaoActionPerformed(evt);
            }
        });

        btnMenosBotao.setText("-");
        btnMenosBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMaisEstampa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenosEstampa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMaisLantejoula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenosLantejoula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMaisRenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenosRenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMaisStrass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenosStrass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMaisBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenosBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnMaisBotao)
                    .addComponent(btnMenosBotao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMaisEstampa)
                        .addComponent(btnMenosEstampa))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMaisLantejoula)
                        .addComponent(btnMenosLantejoula))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMaisRenda)
                        .addComponent(btnMenosRenda))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMaisStrass)
                        .addComponent(btnMenosStrass))
                    .addComponent(jLabel5)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto Criado"));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtProdutoCriado.setColumns(20);
        txtProdutoCriado.setRows(5);
        jScrollPane1.setViewportView(txtProdutoCriado);

        jLabel6.setText("Preço:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaisBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisBotaoActionPerformed

        if (roupa != null) {
            switch (((JButton) evt.getSource()).getMnemonic()) {
                case 'B': {
                    roupa = new Botao(roupa);
                    break;
                }
                case 'E': {
                    roupa = new Estampa(roupa);
                    break;
                }
                case 'L': {
                    roupa = new Lantejoula(roupa);
                    break;
                }
                case 'R': {
                    roupa = new Renda(roupa);
                    break;
                }
                case 'S': {
                    roupa = new Strass(roupa);
                    break;
                }
            }
            ativarBotoes();
            mostrarProduto();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma peça base.");
        }

    }//GEN-LAST:event_btnMaisBotaoActionPerformed

    private void btnMenosBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosBotaoActionPerformed

        roupa = roupa.getRoupa();
        ativarBotoes();
        mostrarProduto();

    }//GEN-LAST:event_btnMenosBotaoActionPerformed

    private void cmbRoupasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoupasActionPerformed

        listaRoupas.clear();

        Roupa aux = roupa;
        do {
            listaRoupas.add(aux);
            if (aux != null) {
                aux = aux.getRoupa();
            }
        } while (aux != null);

        roupa = (Roupa) roupas[cmbRoupas.getSelectedIndex()];

        if (listaRoupas.size() >= 2) {

            listaRoupas.get(listaRoupas.size() - 2).setRoupa(roupa);
            roupa = listaRoupas.get(0);

        }

        ativarBotoes();
        mostrarProduto();

    }//GEN-LAST:event_cmbRoupasActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        controladorVisao.getControleDominio().createRoupa(roupa);
        JOptionPane.showMessageDialog(this, "Produto inserido com sucesso.");
        roupa = null;
        ativarBotoes();
        lblPreco.setText("");
        txtProdutoCriado.setText("");

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        roupa = null;
        ativarBotoes();
        lblPreco.setText("");
        txtProdutoCriado.setText("");
        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void mostrarProduto() {
        txtProdutoCriado.setText(roupa.getNomeProduto());
        lblPreco.setText(roupa.getValorAluguel().toString());
    }

    private void ativarBotoes() {

        btnMenosBotao.setEnabled(roupa instanceof Botao);
        btnMenosEstampa.setEnabled(roupa instanceof Estampa);
        btnMenosLantejoula.setEnabled(roupa instanceof Lantejoula);
        btnMenosRenda.setEnabled(roupa instanceof Renda);
        btnMenosStrass.setEnabled(roupa instanceof Strass);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMaisBotao;
    private javax.swing.JButton btnMaisEstampa;
    private javax.swing.JButton btnMaisLantejoula;
    private javax.swing.JButton btnMaisRenda;
    private javax.swing.JButton btnMaisStrass;
    private javax.swing.JButton btnMenosBotao;
    private javax.swing.JButton btnMenosEstampa;
    private javax.swing.JButton btnMenosLantejoula;
    private javax.swing.JButton btnMenosRenda;
    private javax.swing.JButton btnMenosStrass;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbRoupas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTextArea txtProdutoCriado;
    // End of variables declaration//GEN-END:variables
}
