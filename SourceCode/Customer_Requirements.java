/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icmf;

import java.awt.CardLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author deepak
 */
public class Customer_Requirements extends javax.swing.JPanel {

    /**
     * Creates new form Customer_Details
     */
    public Customer_Requirements() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(104, 121, 249));
        setMaximumSize(new java.awt.Dimension(590, 513));
        setMinimumSize(new java.awt.Dimension(590, 513));
        setName(""); // NOI18N

        jLabel2.setText("System :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No System" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel3.setText("Duration(minutes) :");

        jLabel4.setText("Printers :");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Print" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel5.setText("No Of Prints :");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner1.setEnabled(false);

        jLabel6.setText("Xerox :");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Xerox" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel7.setText("No of Xerox :");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner2.setEnabled(false);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icmf/Computer.jpg"))); // NOI18N
        jLabel8.setIconTextGap(0);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner3.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jSpinner2)
                            .addComponent(jSpinner3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setText("Customer Requirements");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        JComboBox cb = (JComboBox) evt.getSource();
        String value = cb.getSelectedItem().toString();
        if(value == "No System"){
            jSpinner3.setEnabled(false);
            jSpinner3.setValue(0);
        }
        else
        {
            jSpinner3.setEnabled(true);
            jSpinner3.setValue(1);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        JComboBox cb = (JComboBox) evt.getSource();
        String value = cb.getSelectedItem().toString();
        if(value == "No Print"){
            jSpinner1.setEnabled(false);
            jSpinner1.setValue(0);
        }
        else
        {
            jSpinner1.setEnabled(true);
            jSpinner1.setValue(1);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        JComboBox cb = (JComboBox) evt.getSource();
        String value = cb.getSelectedItem().toString();
        if(value == "No Xerox"){
            jSpinner2.setEnabled(false);
            jSpinner2.setValue(0);
        }
        else
        {
            jSpinner2.setEnabled(true);
            jSpinner2.setValue(1);
        }
    
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        B2.setEnabled(false);
        customer.duration=(int)jSpinner3.getValue();
        customer.no_print=(int)jSpinner1.getValue();
        customer.no_xerox=(int)jSpinner2.getValue();
        customer.System=(String)jComboBox1.getSelectedItem();
        customer.Printer=(String)jComboBox3.getSelectedItem();
        customer.Xerox=(String)jComboBox4.getSelectedItem();
        
        icmf.Teminal_Array t = null ;
        try {
                    FileInputStream fi = new FileInputStream(new File("Terminal_Info_File.dat"));
                    ObjectInputStream oi = new ObjectInputStream(fi);

                    t=(icmf.Teminal_Array) oi.readObject();
                    oi.close();
                    fi.close();

                } catch (FileNotFoundException e) {
                    java.lang.System.out.println("File not found");
                }catch (IOException e) {
                    java.lang.System.out.println("Error initializing stream");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Main_Panel.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        icmf.System s = null ;
        try {
                    FileInputStream fi = new FileInputStream(new File("System_Info_File.dat"));
                    ObjectInputStream oi = new ObjectInputStream(fi);

                    s=(icmf.System) oi.readObject();
                    oi.close();
                    fi.close();

                } catch (FileNotFoundException e) {
                    java.lang.System.out.println("File not found");
                }catch (IOException e) {
                    java.lang.System.out.println("Error initializing stream");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Main_Panel.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        /*
            Terminal information update and sales informaition update 
            1 minute switching time is set b/w two customers on same terminal
        */
        
        icmf.Sales sales=new icmf.Sales();
        
        
        
        long min=10000000;
        String ter="";
        icmf.Terminal TT1=null;
        long Waiting_time = 0;
        Date d;
        Date startd;
        Date endd;
        if(customer.duration!=0){
            switch (customer.System) {
                case "Browsing System":
                    for (icmf.Terminal TT : t.Terminal_Array) {
                        d=new Date();
                        if(d.getTime()-TT.date_busy.getTime()>0){
                           Waiting_time=0; 
                           java.lang.System.out.println("0"+"  "+Integer.toString(customer.duration));
                        }
                        else{
                            Waiting_time=(TT.date_busy.getTime()-d.getTime())/60000;
                            java.lang.System.out.println(Waiting_time+"  "+Integer.toString(customer.duration));
                        }
                        if(Waiting_time<min && (TT.Id.substring(0,1).equals("A")||TT.Id.substring(0,1).equals("G")||TT.Id.substring(0,1).equals("B"))){
                            ter=TT.Id;
                            min=Waiting_time;
                            TT1=TT;
                        }
                    }
                    customer.System_TNO=ter;
                    if(Waiting_time==0){
                        TT1.update_to_now();
                    }
                    startd=new Date(TT1.date_busy.getTime());
                    TT1.date_busy=TT1.addMinutesToDate(customer.duration, TT1.date_busy);
                    endd=new Date(TT1.date_busy.getTime());
                    customer.System_waiting_time=(int)min;
                    customer.System_cost=s.no_Browsing_r*customer.duration;
                    sales.no_Browsing_s=customer.System_cost;
                    customer.Total_cost+=customer.System_cost;
                    Session_Construction(startd,endd,ter);
                    break;
                case "Academics System":
                    for (Terminal TT : t.Terminal_Array) {
                        d=new Date();
                        if(d.getTime()-TT.date_busy.getTime()>0){
                           Waiting_time=0; 
                        }
                        else{
                            Waiting_time=(TT.date_busy.getTime()-d.getTime())/60000;
                        }
                        if(Waiting_time<min && (TT.Id.substring(0,1).equals("A")||TT.Id.substring(0,1).equals("G"))){
                            ter=TT.Id;
                            min=Waiting_time;
                            TT1=TT;
                        }
                    }
                    customer.System_TNO=ter;
                    if(Waiting_time==0){
                        TT1.update_to_now();
                    }
                    startd=new Date(TT1.date_busy.getTime());
                    TT1.date_busy=TT1.addMinutesToDate(customer.duration, TT1.date_busy);
                    endd=new Date(TT1.date_busy.getTime());
                    customer.System_waiting_time=(int)min;
                    customer.System_cost=s.no_acaedmic_r*customer.duration;
                    sales.no_acaedmic_s=customer.System_cost;
                    customer.Total_cost+=customer.System_cost;
                    Session_Construction(startd,endd,ter);
                    break;
                case "Gaming System":
                    for (Terminal TT : t.Terminal_Array) {
                        d=new Date();
                        if(d.getTime()-TT.date_busy.getTime()>0){
                           Waiting_time=0; 
                        }
                        else{
                            Waiting_time=(TT.date_busy.getTime()-d.getTime())/60000;
                        }
                        if(Waiting_time<min && TT.Id.substring(0,1).equals("G")){
                            ter=TT.Id;
                            min=Waiting_time;
                            TT1=TT;
                        }
                    }
                    customer.System_TNO=ter;
                    if(Waiting_time==0){
                        TT1.update_to_now();
                    }
                    startd=new Date(TT1.date_busy.getTime());
                    TT1.date_busy=TT1.addMinutesToDate(customer.duration, TT1.date_busy);
                    endd=new Date(TT1.date_busy.getTime());
                    customer.System_waiting_time=(int)min;
                    customer.System_cost=s.no_gaming_r*customer.duration;
                    sales.no_gaming_s=customer.System_cost;
                    customer.Total_cost+=customer.System_cost;
                    Session_Construction(startd,endd,ter);
                    break;
            }
        }
        
        min=10000000;
        ter="";
        TT1=null;
        if(customer.no_print!=0){
            switch (customer.Printer) {
                case "Color Print":
                    for (Terminal TT : t.Terminal_Array) {
                        d=new Date();
                        if(d.getTime()-TT.date_busy.getTime()>0){
                           Waiting_time=0; 
                        }
                        else{
                            Waiting_time=(TT.date_busy.getTime()-d.getTime())/60000;
                        }
                        if(Waiting_time<min && TT.Id.substring(0,2).equals("CP")){
                            ter=TT.Id;
                            min=Waiting_time;
                            TT1=TT;
                        }
                    }
                    customer.Printer_TNO=ter;
                    TT1.date_busy=TT1.addMinutesToDate(2, TT1.date_busy);
                    customer.Printer_cost=s.no_color_printer_r * customer.no_print;
                    sales.no_color_printer_s=customer.Printer_cost;
                    customer.Total_cost+=customer.Printer_cost;
                    break;
                case "Plain Print":
                    for (Terminal TT : t.Terminal_Array) {
                        d=new Date();
                        if(d.getTime()-TT.date_busy.getTime()>0){
                           Waiting_time=0; 
                        }
                        else{
                            Waiting_time=(TT.date_busy.getTime()-d.getTime())/60000;
                        }
                        if(Waiting_time<min && TT.Id.substring(0,2).equals("PP")){
                            ter=TT.Id;
                            min=Waiting_time;
                            TT1=TT;
                        }
                    }
                    customer.Printer_TNO=ter;
                    TT1.date_busy=TT1.addMinutesToDate(2, TT1.date_busy);
                    
                    customer.Printer_cost=s.no_plain_printer_r * customer.no_print;
                    sales.no_plain_printer_s=customer.Printer_cost;
                    customer.Total_cost+=customer.Printer_cost;
                    break;
            }
        }
        
        min=10000000;
        ter="";
        TT1=null;
        if(customer.no_xerox!=0){
            switch (customer.Xerox) {
                case "Black-White":
                    for (Terminal TT : t.Terminal_Array) {
                        d=new Date();
                        if(d.getTime()-TT.date_busy.getTime()>0){
                           Waiting_time=0; 
                        }
                        else{
                            Waiting_time=(TT.date_busy.getTime()-d.getTime())/60000;
                        }
                        if(Waiting_time<min && TT.Id.substring(0,2).equals("BX")){
                            ter=TT.Id;
                            min=Waiting_time;
                            TT1=TT;
                        }
                    }
                    customer.Xerox_TNO=ter;
                    TT1.date_busy=TT1.addMinutesToDate(2, TT1.date_busy);
                    
                    customer.Xerox_cost=s.no_black_xerox_r * customer.no_xerox;
                    sales.no_black_xerox_s=customer.Xerox_cost;
                    customer.Total_cost+=customer.Xerox_cost;
                    break;
                case "Color":
                    for (Terminal TT : t.Terminal_Array) {
                        d=new Date();
                        if(d.getTime()-TT.date_busy.getTime()>0){
                           Waiting_time=0; 
                        }
                        else{
                            Waiting_time=(TT.date_busy.getTime()-d.getTime())/60000;
                        }
                        if(Waiting_time<min && TT.Id.substring(0,2).equals("CX")){
                            ter=TT.Id;
                            min=Waiting_time;
                            TT1=TT;
                        }
                    }
                    customer.Xerox_TNO=ter;
                    TT1.date_busy=TT1.addMinutesToDate(2, TT1.date_busy);
                    
                    customer.Xerox_cost=s.no_color_xerox_r * customer.no_xerox;
                    sales.no_color_xerox_s=customer.Xerox_cost;
                    customer.Total_cost+=customer.Xerox_cost;
                    break;
            }
        }
        
        
        
        
        //Updateing terminal informaiton
        
        try {
                FileOutputStream fi = new FileOutputStream(new File("Terminal_Info_File.dat"));
		ObjectOutputStream o = new ObjectOutputStream(fi);
		o.writeObject(t);
                o.close();
		fi.close();
                
                } catch (FileNotFoundException e) {
                    java.lang.System.out.println("File not found");
                } catch (IOException e) {
            	java.lang.System.out.println("Error initializing stream");
                }
    
        
        //Updating Sales information
        
        sales.total=customer.Total_cost;
        
        icmf.Sales Sales1 = null;
        
            try {
		FileInputStream fi = new FileInputStream(new File("Sales_Info_File.dat"));
		ObjectInputStream oi = new ObjectInputStream(fi);

		Sales1=(icmf.Sales) oi.readObject();
                oi.close();
		fi.close();

                } catch (FileNotFoundException e) {
                    java.lang.System.out.println("File not found");
                }catch (IOException e) {
                    java.lang.System.out.println("Error initializing stream");
                } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main_Panel.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            if(!Sales1.check()){
                try {
                    FileOutputStream f1 = new FileOutputStream(new File("Sales_Info_File.dat"));
                    ObjectOutputStream o = new ObjectOutputStream(f1);
                    o.writeObject(sales);
                    o.close();
                    f1.close();
                    } catch (FileNotFoundException e) {
                       java.lang.System.out.println("File not found");
                    } catch (IOException e) {
                      java.lang.System.out.println("Error initializing stream");
                    }
            }
            else{
                Sales1.no_Browsing_s+=sales.no_Browsing_s;
                Sales1.no_acaedmic_s+=sales.no_acaedmic_s;
                Sales1.no_black_xerox_s+=sales.no_black_xerox_s;
                Sales1.no_color_printer_s+=sales.no_color_printer_s;
                Sales1.no_color_xerox_s+=sales.no_color_xerox_s;
                Sales1.no_gaming_s+=sales.no_gaming_s;
                Sales1.no_plain_printer_s+=sales.no_plain_printer_s;
                Sales1.total+=sales.total;
                try {
                    FileOutputStream f1 = new FileOutputStream(new File("Sales_Info_File.dat"));
                    ObjectOutputStream o = new ObjectOutputStream(f1);
                    o.writeObject(Sales1);
                    o.close();
                    f1.close();
                    } catch (FileNotFoundException e) {
                       java.lang.System.out.println("File not found");
                    } catch (IOException e) {
                      java.lang.System.out.println("Error initializing stream");
                    }
                
            }
        
        customer_Bill1.jLabel3.setText(customer.System_TNO);
        customer_Bill1.jLabel14.setText(customer.Printer_TNO);
        customer_Bill1.jLabel16.setText(customer.Xerox_TNO);
        customer_Bill1.jLabel13.setText(Integer.toString(customer.System_cost));
        customer_Bill1.jLabel15.setText(Integer.toString(customer.Printer_cost));
        customer_Bill1.jLabel17.setText(Integer.toString(customer.Xerox_cost));
        customer_Bill1.jLabel18.setText(Integer.toString(customer.Total_cost));
        customer_Bill1.jLabel12.setText(Integer.toString(customer.System_waiting_time));
        
        if(!B1.isEnabled()){
            File f = new File("Customer_Info_File.dat");
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Customer_Requirements.class.getName()).log(Level.SEVERE, null, ex);
            }
            B1.setEnabled(true);
        }
        try {
		FileInputStream fi = new FileInputStream(new File("Customer_Info_File.dat"));
		ObjectInputStream oi = new ObjectInputStream(fi);

		customer_info1=(icmf.Customer_info) oi.readObject();
                oi.close();
		fi.close();

                } catch (FileNotFoundException e) {
                    java.lang.System.out.println("File not found");
                }catch (IOException e) {
                    java.lang.System.out.println("Error initializing stream");
                } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main_Panel.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        customer.ID=++customer_info1.ID;
        customer_info1.Customer_Array.add(customer);
        
        
        try {
                FileOutputStream f = new FileOutputStream(new File("Customer_Info_File.dat"));
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(customer_info1);
                o.close();
		f.close();
            } catch (FileNotFoundException e) {
		java.lang.System.out.println("File not found");
            } catch (IOException e) {
		java.lang.System.out.println("Error initializing stream");
            }
        
        jSpinner3.setValue(0);
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jComboBox1.setSelectedItem("No System");
        jComboBox3.setSelectedItem("No Print");
        jComboBox4.setSelectedItem("No Xerox");
        CardLayout cardLayout = (CardLayout) jButton2.getParent().getParent().getLayout();
        cardLayout.show(jButton2.getParent().getParent(), "card5");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jSpinner3.setValue(0);
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jComboBox1.setSelectedItem("No System");
        jComboBox3.setSelectedItem("No Print");
        jComboBox4.setSelectedItem("No Xerox");
        CardLayout cardLayout = (CardLayout) jButton2.getParent().getParent().getLayout();
        cardLayout.show(jButton2.getParent().getParent(), "card2");
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    //Custom Coded Functions
    
    public void initialize_parameters(icmf.Customer customer,icmf.Customer_Bill customer_Bill1,icmf.Customer_info customer_info1,javax.swing.JButton B1,icmf.System system,javax.swing.JButton B2,ArrayList<icmf.Session> Session_Array,icmf.Session_Log_Directory session_Log_Directory1){
        
        this.customer=customer;
        this.customer_Bill1=customer_Bill1;
        this.customer_info1=customer_info1;
        this.B1=B1;
        this.B2=B2;
        this.system=system;
        this.Session_Array=Session_Array;
        this.session_Log_Directory1=session_Log_Directory1;
        
    }
    
    private void Session_Construction(Date start,Date end,String ter){
       
        icmf.Session S =new icmf.Session(session_Log_Directory1, start,end, ter);
        Session_Array.add(S);
       
    }
    
    //End of Custom Coded Functions

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JComboBox jComboBox1;
    public javax.swing.JComboBox jComboBox3;
    public javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    // End of variables declaration//GEN-END:variables

    // Variables declaration - Custom Code
    public icmf.Customer customer;
    public icmf.Customer_Bill customer_Bill1;
    public icmf.Customer_info customer_info1;
    public javax.swing.JButton B1;
    public javax.swing.JButton B2;
    public icmf.System system;
    ArrayList<icmf.Session> Session_Array;
    public icmf.Session_Log_Directory session_Log_Directory1;
    
    // End of variables declaration 
}
