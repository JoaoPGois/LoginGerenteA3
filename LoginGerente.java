
package View;

import javax.swing.JOptionPane;


public class LoginGerente extends javax.swing.JFrame {

    public LoginGerente() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        c_login = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_senha = new javax.swing.JPasswordField();
        b_entrar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();

        setTitle("Programa de gerencia");
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setText("Login:");

        c_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_loginActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha:");

        c_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_senhaActionPerformed(evt);
            }
        });

        b_entrar.setText("Entrar");
        b_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_entrarActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_login, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(b_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_entrar)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_login, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_entrar)
                    .addComponent(b_cancelar))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_entrarActionPerformed
        
 if (c_login.getText().isEmpty() || c_senha.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else if (c_login.getText().equals("12345") && new String(c_senha.getPassword()).equals("12345")) {
            TelaGerencia obj = new TelaGerencia();
        obj.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
            
        }


    }//GEN-LAST:event_b_entrarActionPerformed

    private void c_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_loginActionPerformed
       
    
    }//GEN-LAST:event_c_loginActionPerformed

    private void c_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_senhaActionPerformed
        
    }//GEN-LAST:event_c_senhaActionPerformed

  
    public static void main(String args[]) {
     

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_entrar;
    private javax.swing.JTextField c_login;
    private javax.swing.JPasswordField c_senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
