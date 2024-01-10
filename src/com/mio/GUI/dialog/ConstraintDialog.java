
package com.mio.GUI.dialog;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JDialog;

public class ConstraintDialog extends JDialog {
    private int x, y;
    public ConstraintDialog(JDialog parent) {
        super(parent, true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
            
        });
        
        ConstraintDialog me = this;
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                me.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
            }
        });
        menuSplit1.setText("制約");
        table.fixTable(scroll);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.mio.GUI.swing.PanelBorder();
        panelBorder2 = new com.mio.GUI.swing.PanelBorder();
        btnOk = new com.mio.GUI.swing.Button();
        menuSplit1 = new com.mio.GUI.swing.MenuSplit();
        scroll = new javax.swing.JScrollPane();
        table = new com.mio.GUI.swing.MyTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelBorder2.setBackground(new java.awt.Color(44, 116, 179));

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "教室が重複する"},
                {"2", "教室の収容力が足りません"},
                {"3", "教室のタイプが合っていない"},
                {"4", "教師のスケジュールが矛盾している"},
                {"5", "学生グループのスケジュールが矛盾している"},
                {"6", "教師は来られない"},
                {"7", "教室は使えない"},
                {"8", "クラス"}
            },
            new String [] {
                "ID", "詳細"
            }
        ));
        table.getTableHeader().setReorderingAllowed(false);
        scroll.setViewportView(table);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuSplit1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addComponent(menuSplit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mio.GUI.swing.Button btnOk;
    private com.mio.GUI.swing.MenuSplit menuSplit1;
    private com.mio.GUI.swing.PanelBorder panelBorder1;
    private com.mio.GUI.swing.PanelBorder panelBorder2;
    private javax.swing.JScrollPane scroll;
    private com.mio.GUI.swing.MyTable table;
    // End of variables declaration//GEN-END:variables
}
