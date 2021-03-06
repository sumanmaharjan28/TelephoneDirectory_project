/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telephonedirectory_project;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author dam nosrep
 */
public class Telephone_Directory extends javax.swing.JFrame {

    /**
     * Creates new form Telephone_Directory
     */ 
   Connection conn=null;
   ResultSet rs=null;
   PreparedStatement st=null;
    
    public Telephone_Directory() {
        initComponents();
        conn=connectDB.ConnectrDB();
         Fillcombo();
         Update_table();
    }
private void Update_table()
{
    try{
        String sql="select * from directorytb";
        st=conn.prepareStatement(sql);
        rs=st.executeQuery();
        table_info.setModel(DbUtils.resultSetToTableModel(rs));
        
    }
   
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        
    }
}
private void Fillcombo()
{
    try{
            String sql="select * from directorytb";
            st=conn.prepareStatement(sql);
            rs=st.executeQuery();
            
            while(rs.next()){
                String name=rs.getString("name");
                combobox_name.addItem(name);
            }
    }
    catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
}
public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING); 
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        combobox_name = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_info = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rb_female = new javax.swing.JRadioButton();
        txt_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rb_male = new javax.swing.JRadioButton();
        txt_address = new javax.swing.JTextField();
        txt_mobile = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        txt_telephone = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        clear_bttn = new javax.swing.JButton();
        del_database = new javax.swing.JButton();
        close_bttn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bttn_new = new javax.swing.JButton();
        bttn_delete = new javax.swing.JButton();
        bttn_edit = new javax.swing.JButton();
        bttn_Save = new javax.swing.JButton();
        bttn_clear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Telephone Directory");
        setResizable(false);

        combobox_name.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combobox_namePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        combobox_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_nameActionPerformed(evt);
            }
        });

        table_info.setModel(new javax.swing.table.DefaultTableModel(
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
        table_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_infoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_info);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UserInfo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(27, 134, 153))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Address:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("SurName:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sex:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mobile No:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID:");

        buttonGroup1.add(rb_female);
        rb_female.setText("Female");
        rb_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_femaleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telephone No:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        buttonGroup1.add(rb_male);
        rb_male.setText("Male");
        rb_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_maleActionPerformed(evt);
            }
        });

        txt_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mobileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_female)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_ID, txt_address, txt_mobile, txt_name, txt_surname, txt_telephone});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_male)
                        .addComponent(rb_female)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_ID, txt_address, txt_mobile, txt_name, txt_surname, txt_telephone});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(163, 11, 43))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jToolBar1.setRollover(true);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikesh\\Desktop\\BirthdayReminderproject\\TelephoneDirectory_project\\icon\\edit-validated-icon.png")); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikesh\\Desktop\\BirthdayReminderproject\\TelephoneDirectory_project\\icon\\Device-Floppy-icon.png")); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        clear_bttn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikesh\\Desktop\\BirthdayReminderproject\\TelephoneDirectory_project\\icon\\clear-icon.png")); // NOI18N
        clear_bttn.setFocusable(false);
        clear_bttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clear_bttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clear_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_bttnActionPerformed(evt);
            }
        });
        jToolBar1.add(clear_bttn);

        del_database.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikesh\\Desktop\\BirthdayReminderproject\\TelephoneDirectory_project\\icon\\Misc-Delete-Database-icon.png")); // NOI18N
        del_database.setFocusable(false);
        del_database.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        del_database.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        del_database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_databaseActionPerformed(evt);
            }
        });
        jToolBar1.add(del_database);

        close_bttn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikesh\\Desktop\\BirthdayReminderproject\\TelephoneDirectory_project\\icon\\Close-icon.png")); // NOI18N
        close_bttn.setFocusable(false);
        close_bttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close_bttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        close_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_bttnActionPerformed(evt);
            }
        });
        jToolBar1.add(close_bttn);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buttons", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(122, 180, 32))); // NOI18N

        bttn_new.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bttn_new.setText("New");
        bttn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_newActionPerformed(evt);
            }
        });

        bttn_delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bttn_delete.setText("Delete");
        bttn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_deleteActionPerformed(evt);
            }
        });

        bttn_edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bttn_edit.setText("Edit");
        bttn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_editActionPerformed(evt);
            }
        });

        bttn_Save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bttn_Save.setText("Save");
        bttn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_SaveActionPerformed(evt);
            }
        });

        bttn_clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bttn_clear.setText("Clear");
        bttn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bttn_new)
                        .addComponent(bttn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bttn_clear)
                        .addComponent(bttn_delete))
                    .addComponent(bttn_edit))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bttn_Save, bttn_clear, bttn_delete, bttn_edit, bttn_new});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttn_Save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttn_new)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttn_clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttn_edit)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bttn_Save, bttn_clear, bttn_delete, bttn_edit, bttn_new});

        jMenu1.setText("File");
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox_name, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combobox_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_maleActionPerformed
        gender="male";
    }//GEN-LAST:event_rb_maleActionPerformed

    private void txt_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mobileActionPerformed

    private void combobox_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_nameActionPerformed

    private void table_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_infoMouseClicked
        
        try{
            int row=table_info.getSelectedRow();
            String Table_click=(table_info.getModel().getValueAt(row, 0).toString());
            String sql="select * from directorytb where ID='"+Table_click+"' ";
            st=conn.prepareStatement(sql);
            rs=st.executeQuery();
            
            if(rs.next()){
                    String add1=rs.getString("ID");
                    txt_ID.setText(add1);
                    String add2=rs.getString("Name");
                    txt_name.setText(add2);
                    String add3=rs.getString("LastName");
                    txt_surname.setText(add3);
                    String add4=rs.getString("Address");
                    txt_address.setText(add4);
                    String add5=rs.getString("TelephoneNo");
                    txt_telephone.setText(add5);
                    String add6=rs.getString("MobileNo");
                    txt_mobile.setText(add6);
            }
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_table_infoMouseClicked

    private void combobox_namePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combobox_namePopupMenuWillBecomeInvisible
        
        String tmp=(String)combobox_name.getSelectedItem();
        String sql="select * from directorytb where Name=? ";
        try{
            
            
            st=conn.prepareStatement(sql);
            st.setString(1,tmp);
            rs=st.executeQuery();
            
            if(rs.next())
            {
                String add1=rs.getString("ID");
                    txt_ID.setText(add1);
                    String add2=rs.getString("Name");
                    txt_name.setText(add2);
                    String add3=rs.getString("LastName");
                    txt_surname.setText(add3);
                    String add4=rs.getString("Address");
                    txt_address.setText(add4);
                    String add5=rs.getString("TelephoneNo");
                    txt_telephone.setText(add5);
                    String add6=rs.getString("MobileNo");
                    txt_mobile.setText(add6);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_combobox_namePopupMenuWillBecomeInvisible

    private void bttn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_SaveActionPerformed
        try{
            String sql="Insert into directorytb(ID,Name,LastName,Address,Sex,TelephoneNo,MobileNo) values (?,?,?,?,?,?,?)";
            st=conn.prepareStatement(sql); 
            st.setString(1,txt_ID.getText());
            st.setString(2,txt_name.getText());
            st.setString(3,txt_surname.getText());
            st.setString(4,txt_address.getText());
            st.setString(5,gender);
            st.setString(6,txt_telephone.getText());
            st.setString(7,txt_mobile.getText());
            st.execute();
             JOptionPane.showMessageDialog(null,"Saved");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please Fill up the form");
            
        }
         Update_table();
    }//GEN-LAST:event_bttn_SaveActionPerformed

    private void rb_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_femaleActionPerformed
       gender="female";
    }//GEN-LAST:event_rb_femaleActionPerformed

    private void bttn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_clearActionPerformed
        txt_ID.setText("");
        txt_name.setText("");
        txt_surname.setText("");
        txt_address.setText("");
        buttonGroup1.clearSelection();
        txt_telephone.setText("");
        txt_mobile.setText("");
    }//GEN-LAST:event_bttn_clearActionPerformed

    private void bttn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_deleteActionPerformed
        int p=JOptionPane.showConfirmDialog(null,"Do you really want to delete the data?","Delete",JOptionPane.YES_NO_OPTION);
        if (p==0){
        String sql="Delete from directorytb where ID=?";   
        try{
                st=conn.prepareStatement(sql); 
                st.setString(1,txt_ID.getText());
                st.execute();
                JOptionPane.showMessageDialog(null,"Deleted From Database");
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null,e);
            }
        Update_table();
        }
    }//GEN-LAST:event_bttn_deleteActionPerformed

    private void bttn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_newActionPerformed
        close();
        user_info s=new user_info();
        s.setVisible(true);
    }//GEN-LAST:event_bttn_newActionPerformed

    private void clear_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_bttnActionPerformed
         txt_ID.setText("");
         txt_name.setText("");
         txt_surname.setText("");
         txt_address.setText("");
         buttonGroup1.clearSelection();
         txt_telephone.setText("");
         txt_mobile.setText("");
    }//GEN-LAST:event_clear_bttnActionPerformed

    private void del_databaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_databaseActionPerformed
         String sql="Delete from directorytb where ID=?";   
        try{
                st=conn.prepareStatement(sql); 
                st.setString(1,txt_ID.getText());
                st.execute();
                JOptionPane.showMessageDialog(null,"Deleted From Database");
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null,e);
            }
        Update_table();
    }//GEN-LAST:event_del_databaseActionPerformed

    private void close_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_bttnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close_bttnActionPerformed

    private void bttn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_editActionPerformed
        try{
            String value1=txt_ID.getText();
            String value2=txt_name.getText();
            String value3=txt_surname.getText();
            String value4=txt_address.getText();
            String value5=gender;
            String value6=txt_telephone.getText();
            String value7=txt_mobile.getText();
            
            String sql="update directorytb set ID='"+value1+"',Name='"+value2+"',LastName='"+value3+"',Address='"+value4+"',Sex='"+value5+"',TelephoneNo='"+value6+"',MobileNo='"+value7+"' where ID='"+value1+"'";
             st=conn.prepareStatement(sql);            
             st.execute();
             JOptionPane.showMessageDialog(null,"Edited");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table();
    }//GEN-LAST:event_bttn_editActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Telephone_Directory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telephone_Directory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telephone_Directory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telephone_Directory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telephone_Directory().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_Save;
    private javax.swing.JButton bttn_clear;
    private javax.swing.JButton bttn_delete;
    private javax.swing.JButton bttn_edit;
    private javax.swing.JButton bttn_new;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_bttn;
    private javax.swing.JButton close_bttn;
    private javax.swing.JComboBox combobox_name;
    private javax.swing.JButton del_database;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton rb_female;
    private javax.swing.JRadioButton rb_male;
    private javax.swing.JTable table_info;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration//GEN-END:variables
private String gender;
}

