/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Dao_TonKho;
import dao.Dao_NguyenLieu;
import dao.Dao_QuayCafe;
import java.awt.Font;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.QuayCafe;
import model.ThongKeTonKho;
import model.NguyenLieu;
import model.QuayCafe;

/**
 *
 * @author nghia
 */
public final class panelTonKho extends javax.swing.JPanel {

    /**
     * Creates new form panelTonKho
     */
   private static DefaultTableModel dtm;
   private int STT=1;
    private List<NguyenLieu> lsnguyenlieu;//lay theo ten nguyen lieu
    public panelTonKho() {
        initComponents();
        tableTonKho.getTableHeader().setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
         dtm=(DefaultTableModel) tableTonKho.getModel();
        layDSTEN_NGUYEN_LIEU();
        layDSMAQUAY();
    }
    //lay danh sach ten nguyen lieu
    public void layDSTEN_NGUYEN_LIEU(){
        this.lsnguyenlieu=Dao_NguyenLieu.layDS();
        comboxTenNL.removeAllItems();
         if(!this.lsnguyenlieu.isEmpty()){
             this.lsnguyenlieu.forEach(p -> {
                 comboxTenNL.addItem(p.getTenNL());
         });
        }
       
    }
    
     //get all list MA QUAY -> combox
    public void layDSMAQUAY(){
        List<QuayCafe> ls=Dao_QuayCafe.layDSQuay();
        Comboxquay.removeAllItems();
         if(!ls.isEmpty()){
                ls.forEach(pn -> {
                    Comboxquay.addItem(      
                        pn.getMa()+""
                     );
                });
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel49 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        comboxTenNL = new javax.swing.JComboBox<>();
        Comboxquay = new javax.swing.JComboBox<>();
        btnkiemtra = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableTonKho = new javax.swing.JTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel49.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Kiểm Tra Số Lượng Tồn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel49.setMaximumSize(new java.awt.Dimension(2147483647, 150));
        jPanel49.setMinimumSize(new java.awt.Dimension(261, 100));
        jPanel49.setPreferredSize(new java.awt.Dimension(637, 65));
        jPanel49.setLayout(new java.awt.GridBagLayout());

        jLabel30.setForeground(new java.awt.Color(0, 102, 204));
        jLabel30.setText("Tên Nguyên Liệu");
        jLabel30.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel49.add(jLabel30, gridBagConstraints);

        comboxTenNL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cafe Hạt", "Sữa Đặc" }));
        comboxTenNL.setSelectedIndex(-1);
        comboxTenNL.setMinimumSize(new java.awt.Dimension(100, 24));
        comboxTenNL.setPreferredSize(new java.awt.Dimension(240, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel49.add(comboxTenNL, gridBagConstraints);

        Comboxquay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quầy 1", "Quầy 2", "Quầy 3" }));
        Comboxquay.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel49.add(Comboxquay, gridBagConstraints);

        btnkiemtra.setForeground(new java.awt.Color(0, 102, 204));
        btnkiemtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/check-16.png"))); // NOI18N
        btnkiemtra.setText("Kiểm Tra");
        btnkiemtra.setPreferredSize(new java.awt.Dimension(100, 30));
        btnkiemtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkiemtraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        jPanel49.add(btnkiemtra, gridBagConstraints);

        jLabel54.setForeground(new java.awt.Color(0, 102, 204));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel54.setText("Quầy Cafe");
        jLabel54.setPreferredSize(new java.awt.Dimension(80, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel49.add(jLabel54, gridBagConstraints);

        add(jPanel49);

        jPanel50.setPreferredSize(new java.awt.Dimension(754, 250));

        tableTonKho.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tableTonKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên Nguyên Liệu", "Đơn Vị Tính", "Số Lượng Còn Lại", "Địa Chỉ Quầy"
            }
        ));
        tableTonKho.setRowHeight(18);
        jScrollPane11.setViewportView(tableTonKho);

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );

        add(jPanel50);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkiemtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkiemtraActionPerformed
        String Quay=null;
        Quay=Comboxquay.getSelectedItem().toString();
        String TenNL=null;
        TenNL=comboxTenNL.getSelectedItem().toString();
 
        List<ThongKeTonKho> ls=Dao_TonKho.DSThongKeTonKho(TenNL,Quay);
        //show ta table thong ke ton kho
        if(!ls.isEmpty()){
            this.showDS(ls);
        }
    }//GEN-LAST:event_btnkiemtraActionPerformed
     private void showDS(List<ThongKeTonKho> ls){
                 dtm.setRowCount(0);
                  this.STT=0;
                if(!ls.isEmpty()){
                    //show thong ke ton kho -> table
                ls.forEach(cp -> {
                    dtm.addRow(new Object[]{ 
                            this.STT++,
                           cp.getTenNL(),
                           cp.getDVT(),
                           String.valueOf(cp.getSoLuongConLai()),
                           cp.getAddressQUAY()
                        });
                    });
                }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Comboxquay;
    private javax.swing.JButton btnkiemtra;
    private javax.swing.JComboBox<String> comboxTenNL;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTable tableTonKho;
    // End of variables declaration//GEN-END:variables
}
