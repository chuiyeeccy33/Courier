/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier;

/**
 *
 * @author jasmi
 */
public class DeliveryStaffChangeStatusAndView extends javax.swing.JFrame {

    /**
     * Creates new form DeliveryStaffChangeStatusAndView
     */
    public DeliveryStaffChangeStatusAndView() {
        initComponents();
        assignedpersonphonelbl1.setVisible(false);
        assignedpersonphonetxt.setVisible(false);
        assignedpersonlbl.setVisible(false);
        assignedpersoncbox.setVisible(false);
        deliverystatuslbl.setVisible(false);
        deliverystatuscbox.setVisible(false);
        updatebtn.setVisible(false);     
        //updatebtn.setText("Add");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deliveryOrderlbl = new javax.swing.JLabel();
        deliverysenderlbl = new javax.swing.JLabel();
        deliverystatuslbl = new javax.swing.JLabel();
        deliveryreceiverlbl = new javax.swing.JLabel();
        orderidlbl = new javax.swing.JLabel();
        useridlbl = new javax.swing.JLabel();
        orderdetailslbl = new javax.swing.JLabel();
        shippingfeelbl = new javax.swing.JLabel();
        itempricelbl = new javax.swing.JLabel();
        totallbl = new javax.swing.JLabel();
        assignedpersonlbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        weightlbl = new javax.swing.JLabel();
        lengthlbl = new javax.swing.JLabel();
        widthlbl = new javax.swing.JLabel();
        heightlbl = new javax.swing.JLabel();
        Wcmlbl = new javax.swing.JLabel();
        Lcmlbl = new javax.swing.JLabel();
        Hcmlbl = new javax.swing.JLabel();
        receivernamelbl = new javax.swing.JLabel();
        receiveraddresslbl = new javax.swing.JLabel();
        receiverphonelbl = new javax.swing.JLabel();
        receiveremaillbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiveraddresstxt = new javax.swing.JTextArea();
        receivernametxt = new javax.swing.JTextField();
        receiverphonetxt = new javax.swing.JTextField();
        receiveremailltxt = new javax.swing.JTextField();
        sendernametxt = new javax.swing.JTextField();
        senderemailtxt = new javax.swing.JTextField();
        senderphonetxt = new javax.swing.JTextField();
        sendernamelbl = new javax.swing.JLabel();
        senderaddresslbl = new javax.swing.JLabel();
        senderphonelbl = new javax.swing.JLabel();
        senderemaillbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        senderaddresstxt = new javax.swing.JTextArea();
        orderidtxt = new javax.swing.JTextField();
        useridtxt = new javax.swing.JTextField();
        assignedpersoncbox = new javax.swing.JComboBox<>();
        widthtxt = new javax.swing.JTextField();
        lengthtxt = new javax.swing.JTextField();
        heighttxt = new javax.swing.JTextField();
        shippingfeetxt = new javax.swing.JTextField();
        itempricetxt = new javax.swing.JTextField();
        totaltxt = new javax.swing.JTextField();
        deliverystatuscbox = new javax.swing.JComboBox<>();
        jTextField12 = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        weighttxt = new javax.swing.JTextField();
        kglbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderdetailstxt = new javax.swing.JTextArea();
        assignedpersonphonelbl1 = new javax.swing.JLabel();
        assignedpersonphonetxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deliveryOrderlbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        deliveryOrderlbl.setText("Delivery");

        deliverysenderlbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        deliverysenderlbl.setText("Sender Details");

        deliverystatuslbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        deliverystatuslbl.setText("Delivery Status:");

        deliveryreceiverlbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        deliveryreceiverlbl.setText("Receiver Details");

        orderidlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        orderidlbl.setText("Order ID:");

        useridlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        useridlbl.setText("User ID:");

        orderdetailslbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        orderdetailslbl.setText("Order Details: ");

        shippingfeelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        shippingfeelbl.setText("Shipping Fee:");

        itempricelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itempricelbl.setText("Item Price:");

        totallbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        totallbl.setText("Total: ");

        assignedpersonlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        assignedpersonlbl.setText("Assigned Delivery Person: ");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Date:");

        weightlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        weightlbl.setText("Weight:");

        lengthlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lengthlbl.setText("L:");

        widthlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        widthlbl.setText("W:");

        heightlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        heightlbl.setText("H:");

        Wcmlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Wcmlbl.setText("cm");

        Lcmlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Lcmlbl.setText("cm");

        Hcmlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Hcmlbl.setText("cm");

        receivernamelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        receivernamelbl.setText("Receiver Name:");

        receiveraddresslbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        receiveraddresslbl.setText("Address:");

        receiverphonelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        receiverphonelbl.setText("Phone Number:");

        receiveremaillbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        receiveremaillbl.setText("Email Address:");

        receiveraddresstxt.setColumns(20);
        receiveraddresstxt.setRows(5);
        jScrollPane1.setViewportView(receiveraddresstxt);

        sendernamelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sendernamelbl.setText("Sender Name:");

        senderaddresslbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        senderaddresslbl.setText("Address:");

        senderphonelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        senderphonelbl.setText("Phone Number:");

        senderemaillbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        senderemaillbl.setText("Email Address:");

        senderaddresstxt.setColumns(20);
        senderaddresstxt.setRows(5);
        jScrollPane2.setViewportView(senderaddresstxt);

        assignedpersoncbox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        assignedpersoncbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        deliverystatuscbox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        deliverystatuscbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Shipping", "Cancelled", "Delivered" }));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backbtn.setText("Back");

        updatebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatebtn.setText("Update");

        kglbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        kglbl.setText("KG");

        orderdetailstxt.setColumns(20);
        orderdetailstxt.setRows(5);
        jScrollPane3.setViewportView(orderdetailstxt);

        assignedpersonphonelbl1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        assignedpersonphonelbl1.setText("Delivery Staff Contact No.: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(weightlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(weighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(useridlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orderidlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(useridtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orderidtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(shippingfeelbl)
                                .addComponent(itempricelbl)
                                .addComponent(totallbl))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(shippingfeetxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(itempricetxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(totaltxt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(assignedpersonlbl)
                                .addComponent(assignedpersonphonelbl1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(assignedpersonphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(assignedpersoncbox, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(updatebtn))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(deliveryreceiverlbl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                                            .addComponent(backbtn)))
                                    .addGap(24, 24, 24))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(4, 4, 4)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(receivernamelbl)
                                                        .addComponent(receiverphonelbl)
                                                        .addComponent(receiveraddresslbl)
                                                        .addComponent(receiveremaillbl)))
                                                .addComponent(deliverystatuslbl))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane1)
                                                .addComponent(receiverphonetxt)
                                                .addComponent(receiveremailltxt)
                                                .addComponent(receivernametxt)
                                                .addComponent(deliverystatuscbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(kglbl)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(layout.createSequentialGroup()
                    .addGap(202, 202, 202)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(widthlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(widthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Wcmlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lengthlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lengthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(orderdetailslbl))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Lcmlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(heightlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(heighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Hcmlbl)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(deliverysenderlbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(senderphonelbl)
                                    .addComponent(senderaddresslbl)
                                    .addComponent(senderemaillbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(senderemailtxt)
                                    .addComponent(senderphonetxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(sendernamelbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendernametxt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(deliveryOrderlbl)))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryreceiverlbl)
                    .addComponent(deliverysenderlbl)
                    .addComponent(backbtn))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receivernamelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(receivernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sendernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sendernamelbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receiveraddresslbl)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receiverphonelbl)
                            .addComponent(receiverphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receiveremaillbl)
                            .addComponent(receiveremailltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deliverystatuscbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliverystatuslbl))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(senderphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senderphonelbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(senderemailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senderemaillbl))
                                .addGap(53, 53, 53))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(senderaddresslbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(deliveryOrderlbl)
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderidlbl)
                    .addComponent(jLabel8)
                    .addComponent(orderidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useridlbl)
                    .addComponent(useridtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightlbl)
                            .addComponent(weighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(heightlbl)
                                    .addComponent(Lcmlbl)
                                    .addComponent(Hcmlbl)
                                    .addComponent(heighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(updatebtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(widthlbl)
                                    .addComponent(lengthlbl)
                                    .addComponent(Wcmlbl)
                                    .addComponent(widthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lengthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(shippingfeelbl)
                                    .addComponent(shippingfeetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderdetailslbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(itempricelbl)
                                    .addComponent(itempricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totallbl)
                                    .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(assignedpersonphonelbl1)
                                    .addComponent(assignedpersonphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(assignedpersonlbl)
                                    .addComponent(assignedpersoncbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(kglbl))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeliveryStaffChangeStatusAndView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliveryStaffChangeStatusAndView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliveryStaffChangeStatusAndView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliveryStaffChangeStatusAndView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeliveryStaffChangeStatusAndView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hcmlbl;
    private javax.swing.JLabel Lcmlbl;
    private javax.swing.JLabel Wcmlbl;
    private javax.swing.JComboBox<String> assignedpersoncbox;
    private javax.swing.JLabel assignedpersonlbl;
    private javax.swing.JLabel assignedpersonphonelbl1;
    private javax.swing.JTextField assignedpersonphonetxt;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel deliveryOrderlbl;
    private javax.swing.JLabel deliveryreceiverlbl;
    private javax.swing.JLabel deliverysenderlbl;
    private javax.swing.JComboBox<String> deliverystatuscbox;
    private javax.swing.JLabel deliverystatuslbl;
    private javax.swing.JLabel heightlbl;
    private javax.swing.JTextField heighttxt;
    private javax.swing.JLabel itempricelbl;
    private javax.swing.JTextField itempricetxt;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JLabel kglbl;
    private javax.swing.JLabel lengthlbl;
    private javax.swing.JTextField lengthtxt;
    private javax.swing.JLabel orderdetailslbl;
    private javax.swing.JTextArea orderdetailstxt;
    private javax.swing.JLabel orderidlbl;
    private javax.swing.JTextField orderidtxt;
    private javax.swing.JLabel receiveraddresslbl;
    private javax.swing.JTextArea receiveraddresstxt;
    private javax.swing.JLabel receiveremaillbl;
    private javax.swing.JTextField receiveremailltxt;
    private javax.swing.JLabel receivernamelbl;
    private javax.swing.JTextField receivernametxt;
    private javax.swing.JLabel receiverphonelbl;
    private javax.swing.JTextField receiverphonetxt;
    private javax.swing.JLabel senderaddresslbl;
    private javax.swing.JTextArea senderaddresstxt;
    private javax.swing.JLabel senderemaillbl;
    private javax.swing.JTextField senderemailtxt;
    private javax.swing.JLabel sendernamelbl;
    private javax.swing.JTextField sendernametxt;
    private javax.swing.JLabel senderphonelbl;
    private javax.swing.JTextField senderphonetxt;
    private javax.swing.JLabel shippingfeelbl;
    private javax.swing.JTextField shippingfeetxt;
    private javax.swing.JLabel totallbl;
    private javax.swing.JTextField totaltxt;
    private javax.swing.JButton updatebtn;
    private javax.swing.JLabel useridlbl;
    private javax.swing.JTextField useridtxt;
    private javax.swing.JLabel weightlbl;
    private javax.swing.JTextField weighttxt;
    private javax.swing.JLabel widthlbl;
    private javax.swing.JTextField widthtxt;
    // End of variables declaration//GEN-END:variables
}
