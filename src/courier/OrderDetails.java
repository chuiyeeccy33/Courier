/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier;

import java.awt.event.KeyEvent;
import java.io.*;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author jasmi
 */
public class OrderDetails extends javax.swing.JFrame {

    /**
     * Creates new form DeliveryStaffChangeStatusAndView
     */
    String Userid="";
    String Orderid = "";
    
    public OrderDetails(String UserID, String OrderID) {
        initComponents();
        idorderlbl.setVisible(false);
        orderidlbl.setVisible(false);
        idcustlbl.setVisible(false);
        custidlbl.setVisible(false);
        iddeliverylbl.setVisible(false);
        //deliveryidlbl.setVisible(false);
        assignedpersonphonelbl1.setVisible(false);
        assignedpersonphonetxt.setVisible(false);
        assignedpersonlbl.setVisible(false);
        assignedpersoncbox.setVisible(false);
        deliverystatuslbl.setVisible(false);
        deliverystatuslbl.setVisible(false);
        totaltxt.setEditable(false);
        fillcomboperson();
        Userid = UserID;
        Orderid = OrderID;
        
        try{
            File file = new File("UserDetails.txt");
            File file1 = new File("Orders.txt");
            Scanner sc = new Scanner(file); 
            Scanner sc1 = new Scanner(file1); 
            //read data from the file

            String temp;
            String temp1;
            boolean found = false;

            while(sc.hasNext() && !found /*the system will stop running while it found the correct userid*/) {
                temp = sc.nextLine(); //read a line of text from file
                String[] tempArr;
                tempArr = temp.split (","); 
                        
                if (Userid.equals(tempArr[0])) {
                    String Temptype = tempArr[2];

                    if(Temptype.equals("Customer")){
                        updatebtn.setText("Add");
                        assignedpersonphonelbl1.setVisible(true);
                        assignedpersonphonetxt.setVisible(true);
                        assignedpersonphonetxt.setEditable(false);
                        //set customer details in database
                        sendernametxt.setText(tempArr[1]);
                        senderphonetxt.setText(tempArr[6]);
                        senderemailtxt.setText(tempArr[5]);
                                
                        // Create a date object
                        LocalDate date = LocalDate.now(); 
                        //date format
                        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        String show = date.format(format);
                        datelbl.setText(show);
                        System.out.println(date); // Display the current date
                    } else if(Temptype.equals("Managing Staff")) {
                        assignedpersonlbl.setVisible(true);
                        assignedpersoncbox.setVisible(true);
                        deliverystatuslbl.setVisible(true);
                        deliverystatus1lbl.setVisible(true);
                        
                        while(sc1.hasNext() && !found) {
                            temp1 = sc1.nextLine();
                            String [] temp1Arr;
                            temp1Arr = temp1.split(",");
                                        
                            if(temp1Arr[0].equals(Orderid)) {
                                sendernametxt.setText(temp1Arr[1]);
                                senderaddresstxt.setText(temp1Arr[2]);
                                senderphonetxt.setText(temp1Arr[3]);
                                senderemailtxt.setText(temp1Arr[4]);
                                receivernametxt.setText(temp1Arr[5]);
                                receiveraddresstxt.setText(temp1Arr[6]);
                                receiverphonetxt.setText(temp1Arr[7]);
                                receiveremailtxt.setText(temp1Arr[8]);
                                orderidlbl.setText(temp1Arr[0]);
                                custidlbl.setText(temp1Arr[21]);
                                datelbl.setText(temp1Arr[9]);
                                weighttxt.setText(temp1Arr[10]);
                                widthtxt.setText(temp1Arr[11]);
                                lengthtxt.setText(temp1Arr[12]);
                                heighttxt.setText(temp1Arr[13]);
                                orderdetailstxt.setText(temp1Arr[14]);
                                shippingfee1lbl.setText(temp1Arr[15]);
                                itempricetxt.setText(temp1Arr[16]);
                                totaltxt.setText(temp1Arr[17]);
                                deliverystatus1lbl.setText(temp1Arr[18]);
                                deliveryidlbl.setText(temp1Arr[19]);
                            } else {
                                deliverystatuslbl.setVisible(true);
                                deliverystatus1lbl.setVisible(true);
                            }
                        }
                    }
                }
            }
        }catch(FileNotFoundException ex) {
                       ex.toString();
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

        deliveryOrderlbl = new javax.swing.JLabel();
        deliverysenderlbl = new javax.swing.JLabel();
        deliverystatuslbl = new javax.swing.JLabel();
        deliveryreceiverlbl = new javax.swing.JLabel();
        orderdetailslbl = new javax.swing.JLabel();
        shippingfeelbl = new javax.swing.JLabel();
        itempricelbl = new javax.swing.JLabel();
        totallbl = new javax.swing.JLabel();
        assignedpersonlbl = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
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
        receiveremailtxt = new javax.swing.JTextField();
        sendernametxt = new javax.swing.JTextField();
        senderemailtxt = new javax.swing.JTextField();
        senderphonetxt = new javax.swing.JTextField();
        sendernamelbl = new javax.swing.JLabel();
        senderaddresslbl = new javax.swing.JLabel();
        senderphonelbl = new javax.swing.JLabel();
        senderemaillbl = new javax.swing.JLabel();
        assignedpersoncbox = new javax.swing.JComboBox<>();
        widthtxt = new javax.swing.JTextField();
        lengthtxt = new javax.swing.JTextField();
        heighttxt = new javax.swing.JTextField();
        itempricetxt = new javax.swing.JTextField();
        totaltxt = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        weighttxt = new javax.swing.JTextField();
        kglbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderdetailstxt = new javax.swing.JTextArea();
        assignedpersonphonelbl1 = new javax.swing.JLabel();
        assignedpersonphonetxt = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        senderaddresstxt = new javax.swing.JTextArea();
        datelbl = new javax.swing.JLabel();
        calculatebtn = new javax.swing.JButton();
        itemlbl = new javax.swing.JLabel();
        itemlbl1 = new javax.swing.JLabel();
        idorderlbl = new javax.swing.JLabel();
        orderidlbl = new javax.swing.JLabel();
        idcustlbl = new javax.swing.JLabel();
        custidlbl = new javax.swing.JLabel();
        iddeliverylbl = new javax.swing.JLabel();
        deliveryidlbl = new javax.swing.JLabel();
        deliverystatus1lbl = new javax.swing.JLabel();
        itemlbl2 = new javax.swing.JLabel();
        shippingfee1lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deliveryOrderlbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        deliveryOrderlbl.setText("Delivery");

        deliverysenderlbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        deliverysenderlbl.setText("Sender Details");

        deliverystatuslbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        deliverystatuslbl.setText("Delivery Status:");

        deliveryreceiverlbl.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        deliveryreceiverlbl.setText("Receiver Details");

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

        Datelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Datelbl.setText("Date:");

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

        receiverphonetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                receiverphonetxtKeyTyped(evt);
            }
        });

        senderphonetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                senderphonetxtKeyTyped(evt);
            }
        });

        sendernamelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sendernamelbl.setText("Sender Name:");

        senderaddresslbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        senderaddresslbl.setText("Address:");

        senderphonelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        senderphonelbl.setText("Phone Number:");

        senderemaillbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        senderemaillbl.setText("Email Address:");

        assignedpersoncbox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        assignedpersoncbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignedpersoncboxActionPerformed(evt);
            }
        });

        widthtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                widthtxtKeyTyped(evt);
            }
        });

        lengthtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lengthtxtKeyTyped(evt);
            }
        });

        heighttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heighttxtKeyTyped(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        weighttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                weighttxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                weighttxtKeyTyped(evt);
            }
        });

        kglbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        kglbl.setText("KG");

        orderdetailstxt.setColumns(20);
        orderdetailstxt.setRows(5);
        jScrollPane3.setViewportView(orderdetailstxt);

        assignedpersonphonelbl1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        assignedpersonphonelbl1.setText("Delivery Staff Contact No.: ");

        senderaddresstxt.setColumns(20);
        senderaddresstxt.setRows(5);
        jScrollPane4.setViewportView(senderaddresstxt);

        datelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        calculatebtn.setText("Calculate");
        calculatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebtnActionPerformed(evt);
            }
        });

        itemlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemlbl.setText("RM");

        itemlbl1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemlbl1.setText("RM");

        idorderlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        idorderlbl.setText("Orderid:");

        idcustlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        idcustlbl.setText("Custid:");

        iddeliverylbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        iddeliverylbl.setText("Deliveryid:");

        itemlbl2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        itemlbl2.setText("RM");

        shippingfee1lbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deliverysenderlbl)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addComponent(sendernamelbl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sendernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addComponent(senderaddresslbl)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(senderphonelbl)
                                            .addComponent(senderemaillbl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(senderphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(senderemailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deliveryreceiverlbl)
                                        .addGap(149, 149, 149))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(receivernamelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(receiverphonelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(receiveraddresslbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(receiveremaillbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(deliverystatuslbl, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane1)
                                                .addComponent(receiverphonetxt)
                                                .addComponent(receiveremailtxt)
                                                .addComponent(receivernametxt))
                                            .addComponent(deliverystatus1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(68, 68, 68)))
                                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(deliveryOrderlbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(widthlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(99, 99, 99)
                                        .addComponent(Wcmlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lengthlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lengthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Lcmlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(heightlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(heighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Hcmlbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(shippingfeelbl)
                                                    .addComponent(itempricelbl)
                                                    .addComponent(totallbl))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(3, 3, 3)
                                                        .addComponent(widthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(71, 71, 71))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(itemlbl2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(shippingfee1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(itemlbl)
                                                                    .addComponent(itemlbl1))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(itempricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(assignedpersonlbl)
                                                    .addComponent(assignedpersonphonelbl1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(assignedpersonphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(assignedpersoncbox, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Datelbl)
                                                    .addComponent(weightlbl)
                                                    .addComponent(idorderlbl))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(weighttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                                    .addComponent(datelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(orderidlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(2, 2, 2)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(kglbl)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(calculatebtn)
                                                .addGap(39, 39, 39)
                                                .addComponent(orderdetailslbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(idcustlbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(custidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(iddeliverylbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(deliveryidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 113, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updatebtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deliverysenderlbl)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sendernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sendernamelbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(senderaddresslbl)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(senderphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senderphonelbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(senderemailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senderemaillbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deliveryreceiverlbl)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(receivernamelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(receivernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                    .addComponent(receiveremailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(deliverystatuslbl)
                                    .addComponent(deliverystatus1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(9, 9, 9)
                .addComponent(deliveryOrderlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orderidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idorderlbl)
                    .addComponent(custidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idcustlbl)
                    .addComponent(deliveryidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iddeliverylbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Datelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightlbl)
                            .addComponent(weighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(widthlbl)
                                .addComponent(lengthlbl)
                                .addComponent(Wcmlbl)
                                .addComponent(widthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lengthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(heightlbl)
                                .addComponent(Lcmlbl)
                                .addComponent(Hcmlbl)
                                .addComponent(heighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(shippingfee1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itemlbl2)
                                        .addComponent(shippingfeelbl)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(itempricelbl)
                                    .addComponent(itempricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemlbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totallbl)
                                    .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calculatebtn)
                                    .addComponent(itemlbl1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(assignedpersonphonelbl1)
                                    .addComponent(assignedpersonphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(assignedpersonlbl)
                                    .addComponent(assignedpersoncbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(orderdetailslbl)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(kglbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatebtn)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";       

        String TempUserID = Userid;
        UUID TempOrderID = UUID.randomUUID();
        String OrderID = TempOrderID.toString();
        String ExistOrderID = orderidlbl.getText();
        String Tempcustid = custidlbl.getText();
        String defaultdeliveryid = "None";
        String deliveryid = deliveryidlbl.getText();
        String Tempsendname = sendernametxt.getText();
        String Tempsendaddress = senderaddresstxt.getText();
        String Tempsendphone = senderphonetxt.getText();
        String Tempsendemail = senderemailtxt.getText();
        String Tempreceivename = receivernametxt.getText();       
        String Tempreceiveaddress = receiveraddresstxt.getText();
        String Tempreceivephone= receiverphonetxt.getText(); 
        String Tempreceiveemail = receiveremailtxt.getText();
        String Tempdate = datelbl.getText();
        String Tempweight= weighttxt.getText();
        String Tempwidth = widthtxt.getText();
        String Templength = lengthtxt.getText();
        String Tempheight = heighttxt.getText();       
        String Temporderdetails = orderdetailstxt.getText();
        String Tempshippingfee= shippingfee1lbl.getText(); 
        String Tempitemprice =itempricetxt.getText();
        String Temptotal =totaltxt.getText();
        String Tempdefaultstaffphone = "None";
        String Tempstaffphone = assignedpersonphonetxt.getText();
        String delivery =  assignedpersoncbox.getSelectedItem().toString();
        String Tempdeliverystatus = "Pending";
        
        try{
            File file = new File("UserDetails.txt");
            Scanner sc = new Scanner(file); 
            //read data from the file
            String temp;
            boolean found = false;
       
            while(sc.hasNext() && !found /*the system will stop running while it found the correct username and password*/) {
                temp = sc.nextLine(); //read a line of text from file
                String[] tempArr;
                tempArr = temp.split (",");
                if (TempUserID.equals(tempArr[0])) {
                    String Temptype = tempArr[2];
                    Users u = new Users();
                    u.setSelectedUserType(Temptype);                  
                    Orders o = new Orders(OrderID, Tempsendname,Tempsendaddress,Tempsendphone,Tempsendemail,Tempreceivename,Tempreceiveaddress,Tempreceivephone,Tempreceiveemail,Tempdate,Tempweight,Tempwidth,
                        Templength,Tempheight,Temporderdetails,Tempshippingfee,Tempitemprice,Temptotal,TempUserID);
                    
                    //customer role will add order
                    if(u.getSelectedUserType().equals("Customer")) {
                        if(o.checkEmptyOrderField()) { //if the text field is empty
                            JOptionPane.showMessageDialog(rootPane, "Please fill up the empty fields! ", "Empty ", JOptionPane.INFORMATION_MESSAGE);
                        } else { //else the field is not empty  
                            if(Tempsendemail.matches(regex) || Tempreceiveemail.matches(regex)) {  
                                if(!Tempitemprice.equals("")) {
                                    if(!Temptotal.equals("")) {
                                        o.AddOrder();
                                        clearFields();
                                        this.dispose();
                                        new CustomerOrderTable(Userid).setVisible(true);
                                    } else {
                                        JOptionPane.showMessageDialog(rootPane, "Please click 'calculate' to view your total amount. ", "Total Amount", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else{
                                    JOptionPane.showMessageDialog(rootPane, "Please enter your item price! ", "Item Price", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } //the email is not in format
                            else { 
                                JOptionPane.showMessageDialog(rootPane, "Please use the correct email format!", "Remind", JOptionPane.INFORMATION_MESSAGE);
                            }        
                        }
                        
                    } else if(u.getSelectedUserType().equals("Managing Staff")) {                    
                        if(o.checkEmptyOrderField()) { //if the text field is empty
                            JOptionPane.showMessageDialog(rootPane, "Please fill up the empty fields! ", "Empty ", JOptionPane.INFORMATION_MESSAGE);
                        } else { //else the field is not empty  
                            if(Tempsendemail.matches(regex) || Tempreceiveemail.matches(regex)) {
                                if(!Tempitemprice.equals("")) {
                                    if(!Temptotal.equals("")) {
                                        if(!delivery.equals("None")) {
                                            u.setUserid(Tempcustid);
                                            Delivery d = new Delivery(ExistOrderID, Tempsendname,Tempsendaddress,Tempsendphone,Tempsendemail,Tempreceivename,
                                                            Tempreceiveaddress,Tempreceivephone,Tempreceiveemail,Tempdate,Tempweight,Tempwidth,
                                                            Templength,Tempheight,Temporderdetails,Tempshippingfee,Tempitemprice,Temptotal,Tempdeliverystatus,
                                                            deliveryid, Tempstaffphone,Tempcustid);
                                               
                                            d.UpdateDelivery();
                                            clearFields();
                                            this.dispose();
                                            new DeliveryStaffOrderPage(Userid).setVisible(true);        
                                        } else {
                                            JOptionPane.showMessageDialog(rootPane, "Please assign a delivery staff for deliver orders. ", "Assign Delivery Staff", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    } else{
                                        JOptionPane.showMessageDialog(rootPane, "Please click 'calculate' to view your total amount. ", "Total Amount", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(rootPane, "Please enter your item price! ", "Item Price", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } //the email is not in format
                            else { 
                                JOptionPane.showMessageDialog(rootPane, "Please use the correct email format!", "Remind", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
            }                    
       } catch(FileNotFoundException ex) {
            ex.toString();
       }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void receiverphonetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_receiverphonetxtKeyTyped
        //function to allow digit to be typed
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_receiverphonetxtKeyTyped
    private void clearFields() {
        sendernametxt.setText("");
        senderaddresstxt.setText("");
        senderphonetxt.setText("");
        senderemailtxt.setText("");
        receivernametxt.setText("");
        receiveraddresstxt.setText("");
        receiverphonetxt.setText("");
        receiveremailtxt.setText("");
        weighttxt.setText("");
        widthtxt.setText("");
        lengthtxt.setText("");
        heighttxt.setText("");
        orderdetailstxt.setText("");
        itempricetxt.setText("");
        totaltxt.equals("");
        assignedpersonphonetxt.setText("");
    }
    
     private void fillcomboperson() {
        String role = "Delivery Staff";
        File file = new File("UserDetails.txt");
        assignedpersoncbox.addItem("None");
       
        try {    
            Scanner sc = new Scanner(file);
                
            String temp;
            boolean found = false;
            while(sc.hasNext() && !found /*the system will stop running while it found the correct username and password*/) {
                temp = sc.nextLine(); //read a line of text from file
                String[] tempArr;
                tempArr = temp.split (",");

                if (role.equals(tempArr[2])  && tempArr[8].equals("Active")){
                    //needed value in array
                    String valueneeded = tempArr[1];
                    String [] column = valueneeded.split(",");
                    for (String column1 : column) {
                        assignedpersoncbox.addItem(column1);
                    }
                }             
            }
        } catch(FileNotFoundException ex) {
                     ex.toString();
        }
    }
    private void senderphonetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senderphonetxtKeyTyped
       //function to allow digit to be typed
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_senderphonetxtKeyTyped

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
       
    }//GEN-LAST:event_backbtnActionPerformed

    private void calculatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebtnActionPerformed
           //value format
        DecimalFormat df = new DecimalFormat("#,###");
        //get shippingfee from textbox
        double shippingfee = Double.parseDouble(shippingfee1lbl.getText());
        //get itemprice from textbox
        double price = Double.parseDouble(itempricetxt.getText());
        //calculate of the total
        double total = Math.abs(shippingfee + price);

         //read the input
        System.out.println (df.format(shippingfee));
        System.out.println (df.format(price));
        System.out.println (df.format(total));
        //display total in textbox
        totaltxt.setText(df.format(total));
       
    }//GEN-LAST:event_calculatebtnActionPerformed

    private void assignedpersoncboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignedpersoncboxActionPerformed
       try{
            File file = new File("UserDetails.txt");
            Scanner sc = new Scanner(file); 
            //read data from the file

            String temp;
            boolean found = false;

            while(sc.hasNext() && !found /*the system will stop running while it found the correct username and password*/) {
                temp = sc.nextLine(); //read a line of text from file
                String[] tempArr;
                tempArr = temp.split (","); 
                if(assignedpersoncbox.getSelectedItem().equals(tempArr[1]) && !assignedpersoncbox.equals("None")) {
                    String deliveryID = tempArr[0];
                    String deliveryphone = tempArr[6];
                    deliveryidlbl.setText(deliveryID);
                    assignedpersonphonetxt.setText(deliveryphone);
                    
                }
            }
       }catch(FileNotFoundException ex) {
                     ex.toString();
       }
    }//GEN-LAST:event_assignedpersoncboxActionPerformed

    private void weighttxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weighttxtKeyReleased
          Double weight = Double.parseDouble(weighttxt.getText());
        
        if(weighttxt.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please enter your weight to get shipping fee!", "Weight", JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(weight > 0 && weight < 1) {
                System.out.println(5.5);
                shippingfee1lbl.setText("5.5");
            }else if(weight > 1 && weight < 3) {
                System.out.println(7.5);
                 shippingfee1lbl.setText("7.5");
            }else if(weight > 3 && weight < 6 ) {
                System.out.println(15);
                shippingfee1lbl.setText("15");
            }else if(weight > 6 && weight < 8 ) {
                System.out.println(20);
                shippingfee1lbl.setText("20");
            }else if(weight > 8 && weight < 12) {
                System.out.println(27);
                shippingfee1lbl.setText("27");
          }else if(weight > 12){
                System.out.println(30);
                shippingfee1lbl.setText("30");
            }    
        }
    }//GEN-LAST:event_weighttxtKeyReleased

    private void weighttxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weighttxtKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {      
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Only number is allowed", "Error", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else {
             weighttxt.setEditable(true);
             
        }
    }//GEN-LAST:event_weighttxtKeyTyped

    private void widthtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_widthtxtKeyTyped
         char c = evt.getKeyChar();
        if (Character.isLetter(c)) {         
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Only number is allowed", "Error", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else {
             widthtxt.setEditable(true);
             
        }
    }//GEN-LAST:event_widthtxtKeyTyped

    private void lengthtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lengthtxtKeyTyped
         char c = evt.getKeyChar();
        if (Character.isLetter(c)) {          
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Only number is allowed", "Error", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else {
             lengthtxt.setEditable(true);
             
        }
    }//GEN-LAST:event_lengthtxtKeyTyped

    private void heighttxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heighttxtKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {          
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Only number is allowed", "Error", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else {
             heighttxt.setEditable(true);
             
        }
    }//GEN-LAST:event_heighttxtKeyTyped

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
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DeliveryStaffChangeStatusAndView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datelbl;
    private javax.swing.JLabel Hcmlbl;
    private javax.swing.JLabel Lcmlbl;
    private javax.swing.JLabel Wcmlbl;
    private javax.swing.JComboBox<String> assignedpersoncbox;
    private javax.swing.JLabel assignedpersonlbl;
    private javax.swing.JLabel assignedpersonphonelbl1;
    private javax.swing.JTextField assignedpersonphonetxt;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton calculatebtn;
    private javax.swing.JLabel custidlbl;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel deliveryOrderlbl;
    private javax.swing.JLabel deliveryidlbl;
    private javax.swing.JLabel deliveryreceiverlbl;
    private javax.swing.JLabel deliverysenderlbl;
    private javax.swing.JLabel deliverystatus1lbl;
    private javax.swing.JLabel deliverystatuslbl;
    private javax.swing.JLabel heightlbl;
    private javax.swing.JTextField heighttxt;
    private javax.swing.JLabel idcustlbl;
    private javax.swing.JLabel iddeliverylbl;
    private javax.swing.JLabel idorderlbl;
    private javax.swing.JLabel itemlbl;
    private javax.swing.JLabel itemlbl1;
    private javax.swing.JLabel itemlbl2;
    private javax.swing.JLabel itempricelbl;
    private javax.swing.JTextField itempricetxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel kglbl;
    private javax.swing.JLabel lengthlbl;
    private javax.swing.JTextField lengthtxt;
    private javax.swing.JLabel orderdetailslbl;
    private javax.swing.JTextArea orderdetailstxt;
    private javax.swing.JLabel orderidlbl;
    private javax.swing.JLabel receiveraddresslbl;
    private javax.swing.JTextArea receiveraddresstxt;
    private javax.swing.JLabel receiveremaillbl;
    private javax.swing.JTextField receiveremailtxt;
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
    private javax.swing.JLabel shippingfee1lbl;
    private javax.swing.JLabel shippingfeelbl;
    private javax.swing.JLabel totallbl;
    private javax.swing.JTextField totaltxt;
    private javax.swing.JButton updatebtn;
    private javax.swing.JLabel weightlbl;
    private javax.swing.JTextField weighttxt;
    private javax.swing.JLabel widthlbl;
    private javax.swing.JTextField widthtxt;
    // End of variables declaration//GEN-END:variables
}
