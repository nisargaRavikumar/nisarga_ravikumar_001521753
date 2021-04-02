/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Restaurant.RestuarantCatalog;
import Business.Restaurant.dishes;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ItemQuantity;
import Business.WorkQueue.OrderWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nisar
 */
public class PlaceOrder extends javax.swing.JPanel {

    /**
     * Creates new form PlaceOrder
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Customer customer;
    private DefaultTableModel menuTable;
    private DefaultTableModel cartTable;
    private int index = -1;
    private int row = 0;
    private int column = 0;
    private int quantity = 0;
    private EcoSystem ecosystem;
    private RestaurantDirectory resturantDirectory;
    private List<ItemQuantity> itemsQuantityList = new ArrayList<ItemQuantity>();
    public PlaceOrder(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        customer = (Customer) account;
        resturantDirectory = ecosystem.getRestaurantDirectory();
        menuTable = (DefaultTableModel) tblOrder.getModel();
        cartTable = (DefaultTableModel) tblCart.getModel();
        populateRestaurantsList(resturantDirectory.getRestaurantList());
        if (resturantDirectory.getRestaurantList().size() > 0) {
            index = 0;
            populateMenu();
        }
        totalPrice.setEditable(false);

    }
public boolean isItemSelected(dishes item) {
        int nRow = tblOrder.getRowCount();
        int count1 = 0;
        boolean s = true;

        for (int i = 0; i < nRow; i++) {
            if (null != tblOrder.getValueAt(i, 2)) {
                if ((Boolean) tblOrder.getValueAt(i, 2) == false) {
                    count1++;
                }
            }
        }
        if (count1 == nRow) {
            s = false;
            JOptionPane.showMessageDialog(null, "Please select an item");
        }
        return s;
    }

    public void populateRestaurantsList(ArrayList<Restaurant> restaurantList) {
        for (Restaurant restaurant : restaurantList) {
            restaurantComboBox.addItem(restaurant.getName());
        }
    }

    private void populateMenu() {
        menuTable.setRowCount(0);
        //createAddToCartButton();
        Restaurant restaurant = resturantDirectory.getRestaurantList().get(index);
        RestuarantCatalog menu = restaurant.getCatalog();
        List<dishes> items = menu.getDishesList();
        for (dishes item : items) {
            Object[] row = new Object[menuTable.getColumnCount()];
            row[0] = item.getName();
            row[1] = item.getAmount();
            menuTable.addRow(row);
        }
    }
     private void populateItemsQuantityTable() {
        double total = 0.0;
        cartTable.setRowCount(0);
        for (ItemQuantity itemWithQuantity : itemsQuantityList) {
            Object[] row = new Object[cartTable.getColumnCount()];
            row[0] = itemWithQuantity.getDish().getName();
            row[1] = itemWithQuantity.getQuant();
            row[2] = itemWithQuantity.getDish().getAmount() * itemWithQuantity.getQuant();
            total += itemWithQuantity.getDish().getAmount() * itemWithQuantity.getQuant();
            cartTable.addRow(row);
        }
        totalPrice.setText(total + "");
    }
     private void initListners() {
        tblOrder.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblOrder.getSelectedRow();
                if (selectedRow >= 0) {
                    String name = (String) tblOrder.getValueAt(selectedRow, 0);
                    double price = (Double) tblOrder.getValueAt(selectedRow, 1);
                    dishes item = new dishes(name,price);
                    if (item != null) {
                        String response = JOptionPane.showInputDialog("Please provide Quantity");
                        try {
                            quantity = Integer.parseInt(response);
                        } catch (NumberFormatException e) {

                        }
                        if (quantity != 0) {
                            ItemQuantity itemWithQuantity = new ItemQuantity(item, quantity);
                            itemsQuantityList.add(itemWithQuantity);
                            System.out.println("QUANTITY : " + quantity);
                            populateItemsWithQuantityTable();
                        }

                    }
                }
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        restaurantComboBox = new javax.swing.JComboBox<>();
        enterpriseLabel1 = new javax.swing.JLabel();
        cartScrollPane = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        message = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 70, 790, -1));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 120));

        restaurantComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantComboBoxActionPerformed(evt);
            }
        });
        add(restaurantComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 190, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Select Restaurant");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 140, 20));

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Qty", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartScrollPane.setViewportView(tblCart);

        add(cartScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 660, 110));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CART");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 650, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PLACE ORDER");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 740, -1));

        requestTestJButton.setText("Request Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Additional Instructions");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 170, -1));
        add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 460, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });
        add(totalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 230, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        if (createOrder()) {
            JOptionPane.showMessageDialog(null, "Ordered Placed Successfully");
            ViewOrder orderStatusJPanel = new ViewOrder(userProcessContainer, ecosystem, customer);
            userProcessContainer.add("OrderStatusJPanel", orderStatusJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void restaurantComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantComboBoxActionPerformed
        index = restaurantComboBox.getSelectedIndex();
        //clear of the selected items
        itemsQuantityList.clear();
        populateMenu();
        populateItemsQuantityTable();
    }//GEN-LAST:event_restaurantComboBoxActionPerformed

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceActionPerformed
private void populateItemsWithQuantityTable() {
        double total = 0.0;
        cartTable.setRowCount(0);
        for (ItemQuantity itemWithQuantity : itemsQuantityList) {
            Object[] row = new Object[cartTable.getColumnCount()];
            row[0] = itemWithQuantity.getDish().getName();
            row[1] = itemWithQuantity.getQuant();
            row[2] = itemWithQuantity.getDish().getAmount() * itemWithQuantity.getQuant();
            total += itemWithQuantity.getDish().getAmount() * itemWithQuantity.getQuant();
            cartTable.addRow(row);
        }
        totalPrice.setText(total + "");
    }

    private boolean createOrder() {

        if (itemsQuantityList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add items to cart, it cannot be empty");
            return false;
        } else {
            OrderWorkRequest orderWorkRequest = new OrderWorkRequest();
            orderWorkRequest.setItemsWithQuantityList(itemsQuantityList);
            orderWorkRequest.setMessage(message.getText());
            if (customer != null) {
                orderWorkRequest.setCustomer(customer);
            } else {
                System.out.println("Customer is null");
                return false;
            }
            Restaurant restaurant = resturantDirectory.getRestaurantList().get(index);
            if (restaurant != null) {
                orderWorkRequest.setRestaurant(restaurant);
            } else {
                System.out.println("Restaurant is null");
                return false;
            }
            orderWorkRequest.setRequestDate(new Date());
            orderWorkRequest.setStatus("Ordered");
            ecosystem.getWorkQueue().addWorkRequest(orderWorkRequest);
            return true;

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane cartScrollPane;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField message;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox<String> restaurantComboBox;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField totalPrice;
    // End of variables declaration//GEN-END:variables
}
