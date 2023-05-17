/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package glfood;

import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author ACER
 */
public class ChatManageServer extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Chat
     */
    boolean a = true;
    boolean b = true;
    private ChatMessageSocket mSocket;

    ChatManageServer() {
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

        menu = new javax.swing.JPanel();
        menuIcon = new javax.swing.JPanel();
        linehidenmenu = new javax.swing.JPanel();
        hidenmenu = new javax.swing.JPanel();
        buttonhidenmenu = new javax.swing.JLabel();
        setting = new javax.swing.JPanel();
        buttonsetting = new javax.swing.JLabel();
        linesetting = new javax.swing.JPanel();
        linechat = new javax.swing.JPanel();
        buttonhidenmenu2 = new javax.swing.JLabel();
        menuhide = new javax.swing.JPanel();
        foodmana = new javax.swing.JLabel();
        homepage = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        cusmana = new javax.swing.JLabel();
        revenue3 = new javax.swing.JLabel();
        sett = new javax.swing.JPanel();
        menuIcon1 = new javax.swing.JPanel();
        linehidenmenu1 = new javax.swing.JPanel();
        hidenmenu1 = new javax.swing.JPanel();
        buttonhidenmenu1 = new javax.swing.JLabel();
        setting1 = new javax.swing.JPanel();
        buttonsetting1 = new javax.swing.JLabel();
        linesetting1 = new javax.swing.JPanel();
        menuhide1 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        account = new javax.swing.JLabel();
        header2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        background2 = new javax.swing.JPanel();
        inputmess = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        send = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        connect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setPreferredSize(new java.awt.Dimension(50, 580));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuIcon.setBackground(new java.awt.Color(255, 102, 51));
        menuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linehidenmenu.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout linehidenmenuLayout = new javax.swing.GroupLayout(linehidenmenu);
        linehidenmenu.setLayout(linehidenmenuLayout);
        linehidenmenuLayout.setHorizontalGroup(
            linehidenmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidenmenuLayout.setVerticalGroup(
            linehidenmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        menuIcon.add(linehidenmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 10));

        hidenmenu.setBackground(new java.awt.Color(255, 102, 51));
        hidenmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonhidenmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonhidenmenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\PC\\Downloads\\PinClipart.com_cempasuchil-clipart_1812493.png")); // NOI18N
        buttonhidenmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonhidenmenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonhidenmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonhidenmenuMouseExited(evt);
            }
        });
        hidenmenu.add(buttonhidenmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        menuIcon.add(hidenmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 50));

        setting.setBackground(new java.awt.Color(255, 102, 51));
        setting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonsetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonsetting.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\PC\\Downloads\\—Pngtree—settings icon_4479688 (1).png")); // NOI18N
        buttonsetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonsettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonsettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonsettingMouseExited(evt);
            }
        });
        setting.add(buttonsetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        menuIcon.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 50, 50));

        linesetting.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout linesettingLayout = new javax.swing.GroupLayout(linesetting);
        linesetting.setLayout(linesettingLayout);
        linesettingLayout.setHorizontalGroup(
            linesettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linesettingLayout.setVerticalGroup(
            linesettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        menuIcon.add(linesetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 50, -1));

        linechat.setBackground(new java.awt.Color(255, 102, 51));
        linechat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linechatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                linechatMouseExited(evt);
            }
        });

        javax.swing.GroupLayout linechatLayout = new javax.swing.GroupLayout(linechat);
        linechat.setLayout(linechatLayout);
        linechatLayout.setHorizontalGroup(
            linechatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linechatLayout.setVerticalGroup(
            linechatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        menuIcon.add(linechat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 50, 10));

        buttonhidenmenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonhidenmenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\PC\\Downloads\\chat-icon.png")); // NOI18N
        buttonhidenmenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonhidenmenu2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonhidenmenu2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonhidenmenu2MouseExited(evt);
            }
        });
        menuIcon.add(buttonhidenmenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 50, 50));

        menu.add(menuIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 620));

        menuhide.setBackground(new java.awt.Color(51, 51, 51));
        menuhide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodmana.setBackground(new java.awt.Color(51, 51, 51));
        foodmana.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        foodmana.setForeground(new java.awt.Color(255, 255, 255));
        foodmana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodmana.setText("Food Management");
        foodmana.setOpaque(true);
        foodmana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodmanaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                foodmanaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                foodmanaMouseExited(evt);
            }
        });
        menuhide.add(foodmana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 50));

        homepage.setBackground(new java.awt.Color(51, 51, 51));
        homepage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homepage.setForeground(new java.awt.Color(255, 255, 255));
        homepage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homepage.setText("Home Page");
        homepage.setOpaque(true);
        homepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homepageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homepageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homepageMouseExited(evt);
            }
        });
        menuhide.add(homepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 50));

        Message.setBackground(new java.awt.Color(51, 51, 51));
        Message.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Message.setForeground(new java.awt.Color(255, 255, 255));
        Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Message.setText("Message Contact");
        Message.setOpaque(true);
        Message.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MessageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MessageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MessageMouseExited(evt);
            }
        });
        menuhide.add(Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 50));

        cusmana.setBackground(new java.awt.Color(51, 51, 51));
        cusmana.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cusmana.setForeground(new java.awt.Color(255, 255, 255));
        cusmana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cusmana.setText("Customer Management");
        cusmana.setOpaque(true);
        cusmana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cusmanaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cusmanaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cusmanaMouseExited(evt);
            }
        });
        menuhide.add(cusmana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

        revenue3.setBackground(new java.awt.Color(51, 51, 51));
        revenue3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        revenue3.setForeground(new java.awt.Color(255, 255, 255));
        revenue3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        revenue3.setText("Revenue Statistics");
        revenue3.setOpaque(true);
        revenue3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                revenue3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                revenue3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                revenue3MouseExited(evt);
            }
        });
        menuhide.add(revenue3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        menu.add(menuhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 580));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        sett.setPreferredSize(new java.awt.Dimension(50, 580));
        sett.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuIcon1.setBackground(new java.awt.Color(255, 102, 51));
        menuIcon1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linehidenmenu1.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout linehidenmenu1Layout = new javax.swing.GroupLayout(linehidenmenu1);
        linehidenmenu1.setLayout(linehidenmenu1Layout);
        linehidenmenu1Layout.setHorizontalGroup(
            linehidenmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidenmenu1Layout.setVerticalGroup(
            linehidenmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        menuIcon1.add(linehidenmenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 10));

        hidenmenu1.setBackground(new java.awt.Color(255, 102, 51));
        hidenmenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonhidenmenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonhidenmenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\PC\\Downloads\\PinClipart.com_cempasuchil-clipart_1812493.png")); // NOI18N
        buttonhidenmenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonhidenmenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonhidenmenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonhidenmenu1MouseExited(evt);
            }
        });
        hidenmenu1.add(buttonhidenmenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        menuIcon1.add(hidenmenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        setting1.setBackground(new java.awt.Color(255, 102, 51));
        setting1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonsetting1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonsetting1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\PC\\Downloads\\—Pngtree—settings icon_4479688 (1).png")); // NOI18N
        buttonsetting1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonsetting1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonsetting1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonsetting1MouseExited(evt);
            }
        });
        setting1.add(buttonsetting1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        menuIcon1.add(setting1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 50, 50));

        linesetting1.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout linesetting1Layout = new javax.swing.GroupLayout(linesetting1);
        linesetting1.setLayout(linesetting1Layout);
        linesetting1Layout.setHorizontalGroup(
            linesetting1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linesetting1Layout.setVerticalGroup(
            linesetting1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        menuIcon1.add(linesetting1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, -1));

        sett.add(menuIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 580));

        menuhide1.setBackground(new java.awt.Color(51, 51, 51));
        menuhide1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBackground(new java.awt.Color(51, 51, 51));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Log out");
        logout.setOpaque(true);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        menuhide1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 50));

        account.setBackground(new java.awt.Color(51, 51, 51));
        account.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        account.setForeground(new java.awt.Color(255, 255, 255));
        account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        account.setText("Change password");
        account.setOpaque(true);
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        menuhide1.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 50));

        sett.add(menuhide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 580));

        getContentPane().add(sett, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        header2.setBackground(new java.awt.Color(255, 102, 51));
        header2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\PC\\Downloads\\[CITYPNG.COM]HD Spoon & Fork Restaurant Cuisine White Icon PNG - 800x800.png")); // NOI18N
        jLabel3.setText("GLFOOD");
        header2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 270, 50));

        getContentPane().add(header2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 710, 50));

        background2.setBackground(new java.awt.Color(255, 255, 255));
        background2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input.setColumns(20);
        input.setRows(5);
        inputmess.setViewportView(input);

        background2.add(inputmess, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 510, 60));

        send.setBackground(new java.awt.Color(255, 102, 51));
        send.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        send.setForeground(new java.awt.Color(255, 255, 255));
        send.setText("SEND");
        send.setOpaque(true);
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        background2.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 80, 60));

        jScrollPane1.setViewportView(display);

        background2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 600, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Management");
        background2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 230, 40));

        connect.setBackground(new java.awt.Color(255, 102, 51));
        connect.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        connect.setForeground(new java.awt.Color(255, 255, 255));
        connect.setText("Connect");
        connect.setOpaque(true);
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });
        background2.add(connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 30));

        getContentPane().add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 710, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    public void changecolorLable(JLabel label, Color rand) {
        label.setBackground(rand);
    }

    public void clickmenu(JPanel h1, JPanel h2, int numberbool) {
        if (numberbool == 1) {
            h1.setBackground(new Color(51, 51, 51));
            h2.setBackground(new Color(255, 102, 51));
        } else {
            h1.setBackground(new Color(255, 102, 51));
            h2.setBackground(new Color(51, 51, 51));
        }
    }

    public void changeimage(JLabel button, String resourcheimg) {
        button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button.setIcon(new javax.swing.ImageIcon(resourcheimg));
    }

    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button) {
        if (dashboard == true) {
            menushowhide.setPreferredSize(new Dimension(250, menushowhide.getHeight()));
            changeimage(button, "C:\\Users\\ACER\\Downloads\\white-down-arrow-png-2-300x300.png");
        } else {
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "C:\\Users\\ACER\\Downloads\\PinClipart.com_cempasuchil-clipart_1812493.png");
            changecolor(hidenmenu, new Color(255, 102, 51));
        }
    }

    public void hideshowsetting(JPanel menushowhide, boolean dashboard, JLabel button) {
        if (dashboard == true) {
            menushowhide.setPreferredSize(new Dimension(250, menushowhide.getHeight()));
            changeimage(button, "C:\\Users\\ACER\\Downloads\\white-down-arrow-png-2-300x300.png");
        } else {
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "C:\\Users\\ACER\\Downloads\\—Pngtree—settings icon_4479688 (1).png");
            changecolor(setting, new Color(255, 102, 51));
        }
    }

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed

        if (input.getText().equals("")) {
            return;
        }
        mSocket.send(input.getText());

    }//GEN-LAST:event_sendActionPerformed

    private void buttonhidenmenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidenmenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonhidenmenu1MouseClicked

    private void buttonhidenmenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidenmenu1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonhidenmenu1MouseEntered

    private void buttonhidenmenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidenmenu1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonhidenmenu1MouseExited

    private void buttonsetting1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsetting1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonsetting1MouseClicked

    private void buttonsetting1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsetting1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonsetting1MouseEntered

    private void buttonsetting1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsetting1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonsetting1MouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dispose();
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered

        changecolorLable(logout, new Color(204, 0, 51));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited

        changecolorLable(logout, new Color(51, 51, 51));
    }//GEN-LAST:event_logoutMouseExited

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        dispose();
        changepassword change = new changepassword();
        change.setVisible(true);
        change.setLocationRelativeTo(null);
    }//GEN-LAST:event_accountMouseClicked

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        changecolorLable(account, new Color(204, 0, 51));
    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
        changecolorLable(account, new Color(51, 51, 51));
    }//GEN-LAST:event_accountMouseExited

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        try {
            ServerSocket serverSocket = new ServerSocket(7000);

            Thread th = new Thread() {
                public void run() {
                    try {
                        display.setText(display.getText() + "Waiting...");
                        Socket socket = serverSocket.accept();
                        mSocket = new ChatMessageSocket(socket, display);

                    } catch (Exception e) {
                        display.setText("Error: " + e.getMessage());
                    }

                }
            };
            th.start();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_connectActionPerformed

    private void buttonhidenmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidenmenuMouseClicked
        clickmenu(hidenmenu, setting, 1);
        if (a == true) {
            hideshow(menu, a, buttonhidenmenu);
            SwingUtilities.updateComponentTreeUI(this);
            a = false;

            sett.setPreferredSize(new Dimension(50, sett.getHeight()));
            changeimage(buttonsetting, "C:\\Users\\ACER\\Downloads\\—Pngtree—settings icon_4479688 (1).png");
            changecolor(setting, new Color(255, 102, 51));
            SwingUtilities.updateComponentTreeUI(this);
        } else {
            hideshow(menu, a, buttonhidenmenu);
            SwingUtilities.updateComponentTreeUI(this);
            a = true;
        }
    }//GEN-LAST:event_buttonhidenmenuMouseClicked

    private void buttonhidenmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidenmenuMouseEntered
        changecolor(linehidenmenu, Color.red);
    }//GEN-LAST:event_buttonhidenmenuMouseEntered

    private void buttonhidenmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidenmenuMouseExited
        changecolor(linehidenmenu, new Color(255, 102, 51));
    }//GEN-LAST:event_buttonhidenmenuMouseExited

    private void buttonsettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsettingMouseClicked
        clickmenu(setting, hidenmenu, 1);
        if (b == true) {
            hideshowsetting(sett, b, buttonsetting);
            SwingUtilities.updateComponentTreeUI(this);
            b = false;

            menu.setPreferredSize(new Dimension(50, menu.getHeight()));
            changeimage(buttonhidenmenu, "C:\\Users\\ACER\\Downloads\\PinClipart.com_cempasuchil-clipart_1812493.png");
            changecolor(hidenmenu, new Color(255, 102, 51));

        } else {
            hideshowsetting(sett, b, buttonsetting);
            SwingUtilities.updateComponentTreeUI(this);
            b = true;
        }
    }//GEN-LAST:event_buttonsettingMouseClicked

    private void buttonsettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsettingMouseEntered
        changecolor(linesetting, Color.red);
    }//GEN-LAST:event_buttonsettingMouseEntered

    private void buttonsettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsettingMouseExited
        changecolor(linesetting, new Color(255, 102, 51));
    }//GEN-LAST:event_buttonsettingMouseExited

    private void linechatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linechatMouseEntered

    }//GEN-LAST:event_linechatMouseEntered

    private void linechatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linechatMouseExited

    }//GEN-LAST:event_linechatMouseExited

    private void buttonhidenmenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidenmenu2MouseClicked

        ChatManageServer chatserver = new ChatManageServer();
        chatserver.setVisible(true);
        chatserver.setLocationRelativeTo(null);
    }//GEN-LAST:event_buttonhidenmenu2MouseClicked

    private void buttonhidenmenu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidenmenu2MouseEntered
        changecolor(linechat, Color.red);
        changeimage(buttonhidenmenu2, "C:\\Users\\ACER\\Downloads\\chat-icon (1).png");
    }//GEN-LAST:event_buttonhidenmenu2MouseEntered

    private void buttonhidenmenu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidenmenu2MouseExited
        changecolor(linechat, new Color(255, 102, 51));
        changeimage(buttonhidenmenu2, "C:\\Users\\ACER\\Downloads\\chat-icon.png");
    }//GEN-LAST:event_buttonhidenmenu2MouseExited

    private void foodmanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodmanaMouseClicked
        dispose();
        FoodManagement food = new FoodManagement();
        food.setVisible(true);
        food.setLocationRelativeTo(null);
    }//GEN-LAST:event_foodmanaMouseClicked

    private void foodmanaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodmanaMouseEntered
        changecolorLable(foodmana, new Color(204, 0, 51));
    }//GEN-LAST:event_foodmanaMouseEntered

    private void foodmanaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodmanaMouseExited
        changecolorLable(foodmana, new Color(51, 51, 51));
    }//GEN-LAST:event_foodmanaMouseExited

    private void homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseClicked
        dispose();
        AdminHomePage ad = new AdminHomePage();
        ad.setVisible(true);
        ad.setLocationRelativeTo(null);
    }//GEN-LAST:event_homepageMouseClicked

    private void homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseEntered
        changecolorLable(homepage, new Color(204, 0, 51));
    }//GEN-LAST:event_homepageMouseEntered

    private void homepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseExited
        changecolorLable(homepage, new Color(51, 51, 51));
    }//GEN-LAST:event_homepageMouseExited

    private void MessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MessageMouseClicked
        dispose();
        MessageContact re = new MessageContact();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
    }//GEN-LAST:event_MessageMouseClicked

    private void MessageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MessageMouseEntered
        changecolorLable(Message, new Color(204, 0, 51));
    }//GEN-LAST:event_MessageMouseEntered

    private void MessageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MessageMouseExited

        changecolorLable(Message, new Color(51, 51, 51));

    }//GEN-LAST:event_MessageMouseExited

    private void cusmanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusmanaMouseClicked
        CustomManage cus = new CustomManage();
        cus.setVisible(true);
        cus.setLocationRelativeTo(null);
    }//GEN-LAST:event_cusmanaMouseClicked

    private void cusmanaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusmanaMouseEntered
        changecolorLable(cusmana, new Color(204, 0, 51));
    }//GEN-LAST:event_cusmanaMouseEntered

    private void cusmanaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusmanaMouseExited
        changecolorLable(cusmana, new Color(51, 51, 51));
    }//GEN-LAST:event_cusmanaMouseExited

    private void revenue3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_revenue3MouseClicked
        Revenue re = new Revenue();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
    }//GEN-LAST:event_revenue3MouseClicked

    private void revenue3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_revenue3MouseEntered
        changecolorLable(revenue3, new Color(204, 0, 51));
    }//GEN-LAST:event_revenue3MouseEntered

    private void revenue3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_revenue3MouseExited
        changecolorLable(revenue3, new Color(51, 51, 51));
    }//GEN-LAST:event_revenue3MouseExited

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
            java.util.logging.Logger.getLogger(ChatManageServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatManageServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatManageServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatManageServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatManageServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message;
    private javax.swing.JLabel account;
    private javax.swing.JPanel background2;
    private javax.swing.JLabel buttonhidenmenu;
    private javax.swing.JLabel buttonhidenmenu1;
    private javax.swing.JLabel buttonhidenmenu2;
    private javax.swing.JLabel buttonsetting;
    private javax.swing.JLabel buttonsetting1;
    private javax.swing.JButton connect;
    private javax.swing.JLabel cusmana;
    private javax.swing.JTextPane display;
    private javax.swing.JLabel foodmana;
    private javax.swing.JPanel header2;
    private javax.swing.JPanel hidenmenu;
    private javax.swing.JPanel hidenmenu1;
    private javax.swing.JLabel homepage;
    private javax.swing.JTextArea input;
    private javax.swing.JScrollPane inputmess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel linechat;
    private javax.swing.JPanel linehidenmenu;
    private javax.swing.JPanel linehidenmenu1;
    private javax.swing.JPanel linesetting;
    private javax.swing.JPanel linesetting1;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuIcon;
    private javax.swing.JPanel menuIcon1;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel menuhide1;
    private javax.swing.JLabel revenue3;
    private javax.swing.JButton send;
    private javax.swing.JPanel sett;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel setting1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

    }
}