package gui;

import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.MySql;

public class Customer extends javax.swing.JPanel {

    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String dNow = sdf2.format(new Date());

    public Customer() {
        initComponents();
        loadCustomers();
        jButton1.setBackground(new Color(0, 102, 255));
        jButton1.setForeground(Color.WHITE);
        ((DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.LEFT);
    }

    //loadcustomers
    public void loadCustomers() {
        try {

            ResultSet rs1 = MySql.search("SELECT `status`.`name`, `customer`.* FROM `customer` INNER JOIN `status` ON `customer`.`status_id` = `status`.`id` WhERE `customer`.`status_id` =  '1' OR `customer`.`status_id` =  '2' ORDER BY `customer`.`id` ASC");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs1.next()) {
                Vector v = new Vector();
                v.add(rs1.getString("customer.id"));
                v.add(rs1.getString("customer.first_name") + " " + rs1.getString("customer.last_name"));
                v.add(rs1.getString("customer.contact_number"));
                v.add(rs1.getString("customer.reg_date"));
                v.add(rs1.getString("status.name"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // searchCustomers
    public void searchCustomers(String text) {
        try {

            ResultSet rs1 = MySql.search("SELECT `status`.`name`, `customer`.* FROM `customer` INNER JOIN `status` ON `customer`.`status_id` = `status`.`id` WHERE `customer`.`first_name` LIKE '" + text + "%' AND `customer`.`status_id` =  '1' OR `customer`.`status_id` =  '2' ORDER BY `customer`.`id` ASC");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs1.next()) {
                Vector v = new Vector();
                v.add(rs1.getString("customer.id"));
                v.add(rs1.getString("customer.first_name") + " " + rs1.getString("customer.last_name"));
                v.add(rs1.getString("customer.contact_number"));
                v.add(rs1.getString("customer.reg_date"));
                v.add(rs1.getString("status.name"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // clear fields
    public void clearFields() {
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField9.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(748, 645));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(938, 640));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(944, 50));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Manage Employees");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Manage Customers");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Manage Suppliers");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Manage Administration");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(938, 250));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact Number", "Register Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(944, 100));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(938, 100));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 125, 207));
        jLabel1.setText("  MANAGE CUSTOMERS");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 357, 94));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/search-animated.png"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 94));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Search Customers");
        jTextField1.setBorder(null);
        jTextField1.setPreferredSize(new java.awt.Dimension(64, 25));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 35, 270, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 11));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 270, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back-40x.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 170, 100));

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("    First Name");

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(27, 125, 207));
        jTextField4.setBorder(null);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(27, 125, 207));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("    Last Name");

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(27, 125, 207));
        jTextField5.setBorder(null);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(27, 125, 207));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("    Mobile Number");

        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(27, 125, 207));
        jTextField9.setBorder(null);
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jSeparator9.setForeground(new java.awt.Color(27, 125, 207));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator4)
                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator9)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel10);

        jPanel6.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Add New Customer");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 125, 207), 2));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Update Customer");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 125, 207), 2));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Remove Customer");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 125, 207), 2));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("Set Active Status");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(27, 125, 207), 2));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                .addGap(113, 113, 113))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel12);

        jPanel6.add(jPanel8);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jButton2.setBackground(new Color(0, 102, 255));
        jButton2.setForeground(Color.WHITE);

        jButton1.setBackground(Color.WHITE);
        jButton1.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);

        Employee d = new Employee();
        Dashboard.jPanel7.removeAll();
        Dashboard.jPanel7.add(d);
        Dashboard.jPanel7.revalidate();
        Dashboard.jPanel7.repaint();

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jButton1.setBackground(new Color(0, 102, 255));
        jButton1.setForeground(Color.WHITE);

        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);

        Customer d = new Customer();
        Dashboard.jPanel7.removeAll();
        Dashboard.jPanel7.add(d);
        Dashboard.jPanel7.revalidate();
        Dashboard.jPanel7.repaint();

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        jButton3.setBackground(new Color(0, 102, 255));
        jButton3.setForeground(Color.WHITE);

        jButton1.setBackground(Color.WHITE);
        jButton1.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
        jButton4.setBackground(Color.WHITE);
        jButton4.setForeground(Color.BLACK);

        Supplier d = new Supplier();
        Dashboard.jPanel7.removeAll();
        Dashboard.jPanel7.add(d);
        Dashboard.jPanel7.revalidate();
        Dashboard.jPanel7.repaint();

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        jButton4.setBackground(new Color(0, 102, 255));
        jButton4.setForeground(Color.WHITE);

        jButton1.setBackground(Color.WHITE);
        jButton1.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLACK);
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);

        Admin d = new Admin();
        Dashboard.jPanel7.removeAll();
        Dashboard.jPanel7.add(d);
        Dashboard.jPanel7.revalidate();
        Dashboard.jPanel7.repaint();

    }//GEN-LAST:event_jButton4MouseClicked

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        String text = jTextField1.getText();
        if (text.equals("Search Customers")) {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0, 102, 204));
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        String text = jTextField1.getText();
        if (text.equals("")) {
            jTextField1.setText("Search Customers");
            jTextField1.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Main d = new Main();
        Dashboard.jPanel7.removeAll();
        Dashboard.jPanel7.add(d);
        Dashboard.jPanel7.revalidate();
        Dashboard.jPanel7.repaint();
        Dashboard.jPanel9.setBackground(new Color(0, 122, 204));
        Dashboard.jPanel20.setBackground(new Color(41, 39, 38));
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            alerts.Alert_warning a1 = new alerts.Alert_warning(null, true);
            a1.alertMessage.setText("Please Select Customer to Update");
            a1.setVisible(true);
        } else {

            String fname = jTextField4.getText();
            String lname = jTextField5.getText();
            String mobile = jTextField9.getText();

            if (fname.isEmpty()) {
                jLabel5.setText("    First Name *");
                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13));
                jLabel5.setForeground(Color.red);

            } else if (lname.isEmpty()) {
                jLabel6.setText("    Last Name *");
                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13));
                jLabel6.setForeground(Color.red);
            } else if (mobile.isEmpty()) {
                jLabel7.setText("    Employee NIC *");
                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13));
                jLabel7.setForeground(Color.red);
            } else {

                try {
                    String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                    ResultSet rs1 = MySql.search("SELECT `customer`.* FROM `customer` WHERE `customer`.`id` = '" + id + "'");

                    if (rs1.next()) {

                        MySql.iud("UPDATE `customer` SET `first_name` = '" + fname + "', `last_name` = '" + lname + "', `contact_number` = '" + mobile + "' WHERE `customer`.`id` = '" + id + "'");
                        clearFields();
                        // insert to activity
                        String act = "(" + fname + ")" + " " + "Customer Details Updated";
                        MySql.iud("INSERT INTO `activity` (`date`, `activity`, `admin_id`) VALUES ('" + dNow + "', '" + act + "', " + Signin.system_userID + ")");

                        loadCustomers();

                        //alert
                        alerts.Alert_success a2 = new alerts.Alert_success(null, true);
                        a2.alertMessage.setText("(" + fname + ")" + " " + "Customer Details Updated");
                        a2.setVisible(true);

                    } else {
                        alerts.Alert_error a2 = new alerts.Alert_error(null, true);
                        a2.alertMessage.setText("Customer Not Exists");
                        a2.setVisible(true);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            alerts.Alert_warning a1 = new alerts.Alert_warning(null, true);
            a1.alertMessage.setText("Please Select Customer to Remove");
            a1.setVisible(true);
        } else {

            String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            MySql.iud("UPDATE `customer` SET `status_id` = '3' WHERE `id` = '" + id + "'");

            clearFields();
            // insert to activity
            String act = "(" + id + ")" + " " + "Customer Removed";
            MySql.iud("INSERT INTO `activity` (`date`, `activity`, `admin_id`) VALUES ('" + dNow + "', '" + act + "', " + Signin.system_userID + ")");

            loadCustomers();

            //alert
            alerts.Alert_success a2 = new alerts.Alert_success(null, true);
            a2.alertMessage.setText(" custID : (" + id + ")" + " " + "Customer Removed");
            a2.setVisible(true);

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    // INSERT
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String fname = jTextField4.getText();
        String lname = jTextField5.getText();
        String mobile = jTextField9.getText();

        if (fname.isEmpty()) {
            jLabel5.setText("    First Name *");
            jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13));
            jLabel5.setForeground(Color.red);

        } else if (lname.isEmpty()) {
            jLabel6.setText("    Last Name *");
            jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13));
            jLabel6.setForeground(Color.red);
        } else if (mobile.isEmpty()) {
            jLabel7.setText("    Mobile Number *");
            jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13));
            jLabel7.setForeground(Color.red);
        } else {

            try {
                ResultSet rs1 = MySql.search("SELECT `customer`.`contact_number` FROM `customer` WHERE `customer`.`contact_number` = '" + mobile + "' ");

                if (rs1.next()) {
                    alerts.Alert_warning al = new alerts.Alert_warning(null, true);
                    al.alertMessage.setText("Customer Already Exist");
                    al.setVisible(true);
                } else {

                    MySql.iud("INSERT INTO `customer` (`first_name`, `last_name`, `contact_number`, `reg_date`) VALUES ('" + fname + "', '" + lname + "', '" + mobile + "', '" + dNow + "')");
                    clearFields();
                    // insert to activity
                    String act = "New Customer Added";
                    MySql.iud("INSERT INTO `activity` (`date`, `activity`, `admin_id`) VALUES ('" + dNow + "', '" + act + "', " + Signin.system_userID + ")");

                    loadCustomers();

                    //alert
                    alerts.Alert_success a2 = new alerts.Alert_success(null, true);
                    a2.alertMessage.setText("New Customer Registered");
                    a2.setVisible(true);

                }
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String text = jTextField1.getText();
        searchCustomers(text);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        jLabel5.setText("    First Name");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jLabel5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        jLabel6.setText("    Last Name");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jLabel6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        jLabel7.setText("    Mobile Number");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jLabel7.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        if (jTextField9.getText().length() == 10) {
            jTextField9.setEnabled(false);
        }
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        if (evt.getClickCount() == 1) {
            jTextField9.setEnabled(true);
            jTextField9.setText("");
        }
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 1) {

            try {

                String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                ResultSet rs1 = MySql.search("SELECT `customer`.* FROM `customer` WHERE `customer`.`id` = '" + id + "'");

                while (rs1.next()) {
                    jTextField4.setText(rs1.getString("customer.first_name"));
                    jTextField5.setText(rs1.getString("customer.last_name"));
                    jTextField9.setText(rs1.getString("customer.contact_number"));

                    if (rs1.getString("customer.status_id").equals("1")) {
                        jButton9.setText("Set As Inactive");
                    } else {
                        jButton9.setText("Set As Active");
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            alerts.Alert_warning a1 = new alerts.Alert_warning(null, true);
            a1.alertMessage.setText("Please Select Customer to Change Status");
            a1.setVisible(true);
        } else {

            String status = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
            String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();

            if (status.equals("Active")) {
                MySql.iud("UPDATE `customer` SET `status_id` = '2' WHERE `id` = '" + id + "'");
            } else {
                MySql.iud("UPDATE `customer` SET `status_id` = '1' WHERE `id` = '" + id + "'");
            }

            clearFields();
            // insert to activity
            String act = "(" + id + ")" + " " + "Customer Status Changed";
            MySql.iud("INSERT INTO `activity` (`date`, `activity`, `admin_id`) VALUES ('" + dNow + "', '" + act + "', " + Signin.system_userID + ")");

            loadCustomers();

            //alert
            alerts.Alert_success a2 = new alerts.Alert_success(null, true);
            a2.alertMessage.setText("( custID : " + id + ")" + " " + "Customer Status Changed");
            a2.setVisible(true);

        }
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
