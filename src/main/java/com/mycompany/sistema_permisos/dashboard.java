/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_permisos;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import javax.swing.UIManager;

/**
 *
 * @author javis
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        InitStyles();

    }

    //INICAR O DARLE ESTILOS A LOS COMPONENTES DEL SWING
    private void InitStyles() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        btnprincipal = new javax.swing.JButton();
        btnpermisos = new javax.swing.JButton();
        btngrupos = new javax.swing.JButton();
        btncerrarsesion = new javax.swing.JButton();
        btndocentes = new javax.swing.JButton();
        btnusuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        header = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(8, 56, 127));

        btnprincipal.setBackground(new java.awt.Color(8, 56, 127));
        btnprincipal.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnprincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-outline.png"))); // NOI18N
        btnprincipal.setText("Principal");
        btnprincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnprincipal.setBorderPainted(false);
        btnprincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnprincipal.setIconTextGap(10);
        btnprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprincipalActionPerformed(evt);
            }
        });

        btnpermisos.setBackground(new java.awt.Color(8, 56, 127));
        btnpermisos.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnpermisos.setForeground(new java.awt.Color(255, 255, 255));
        btnpermisos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-permiso-24.png"))); // NOI18N
        btnpermisos.setText("Permisos");
        btnpermisos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        btnpermisos.setBorderPainted(false);
        btnpermisos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnpermisos.setIconTextGap(10);
        btnpermisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpermisosActionPerformed(evt);
            }
        });

        btngrupos.setBackground(new java.awt.Color(8, 56, 127));
        btngrupos.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btngrupos.setForeground(new java.awt.Color(255, 255, 255));
        btngrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-grupo-24 (1).png"))); // NOI18N
        btngrupos.setText("Grupos");
        btngrupos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        btngrupos.setBorderPainted(false);
        btngrupos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btngrupos.setIconTextGap(10);
        btngrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngruposActionPerformed(evt);
            }
        });

        btncerrarsesion.setBackground(new java.awt.Color(8, 56, 127));
        btncerrarsesion.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btncerrarsesion.setForeground(new java.awt.Color(255, 255, 255));
        btncerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-cerrar-ventana-24.png"))); // NOI18N
        btncerrarsesion.setText("Cerrar sesión");
        btncerrarsesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        btncerrarsesion.setBorderPainted(false);
        btncerrarsesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncerrarsesion.setIconTextGap(10);
        btncerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsesionActionPerformed(evt);
            }
        });

        btndocentes.setBackground(new java.awt.Color(8, 56, 127));
        btndocentes.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btndocentes.setForeground(new java.awt.Color(255, 255, 255));
        btndocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-profesor-24.png"))); // NOI18N
        btndocentes.setText("Docentes");
        btndocentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        btndocentes.setBorderPainted(false);
        btndocentes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btndocentes.setIconTextGap(10);
        btndocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndocentesActionPerformed(evt);
            }
        });

        btnusuarios.setBackground(new java.awt.Color(8, 56, 127));
        btnusuarios.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnusuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        btnusuarios.setText("Usuarios");
        btnusuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        btnusuarios.setBorderPainted(false);
        btnusuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnusuarios.setIconTextGap(10);
        btnusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuariosActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGOUNACH.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnpermisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndocentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btngrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnusuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncerrarsesion, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnpermisos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btndocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btngrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btncerrarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        header.setBackground(new java.awt.Color(210, 170, 46));
        header.setAutoscrolls(true);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnusuariosActionPerformed

    private void btndocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndocentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndocentesActionPerformed

    private void btncerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsesionActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btncerrarsesionActionPerformed

    private void btngruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngruposActionPerformed

    private void btnpermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpermisosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpermisosActionPerformed

    private void btnprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprincipalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btncerrarsesion;
    private javax.swing.JButton btndocentes;
    private javax.swing.JButton btngrupos;
    private javax.swing.JButton btnpermisos;
    private javax.swing.JButton btnprincipal;
    private javax.swing.JButton btnusuarios;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
