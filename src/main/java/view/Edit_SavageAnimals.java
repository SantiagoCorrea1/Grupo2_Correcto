/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import utility.SavageAnimal;
import control.MainClass;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author SANTIAGO
 */
public class Edit_SavageAnimals extends javax.swing.JFrame {
    MainClass mainClass;
    /**
     * Creates new form Edit_Animals
     * @param dptLogistic
     */
    public Edit_SavageAnimals(MainClass mainClass) {
        initComponents();
        this.mainClass = mainClass;
        setLocationRelativeTo(this);
    }

    Edit_SavageAnimals() {
    }
    
    void setNull(){
        boxCode.setText("");
        boxCodeDelete.setText("");
        boxCodeEdit.setText("");
        boxEditName.setText("");
        boxEditWeigth.setText("");
        boxName.setText("");
        boxSpecies.setText("");
        boxType.setText("");
        boxWeigth.setText("");
        boxDangerLevel.setText("");
        boxEditDangerousLevel.setText("");
        boxHabitat.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonBack = new javax.swing.JButton();
        boxCode = new javax.swing.JTextField();
        boxName = new javax.swing.JTextField();
        boxType = new javax.swing.JTextField();
        buttonEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buttonDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boxCodeDelete = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boxWeigth = new javax.swing.JTextField();
        boxSpecies = new javax.swing.JTextField();
        boxHabitat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        boxDangerLevel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        boxEditDangerousLevel = new javax.swing.JTextField();
        boxCodeEdit = new javax.swing.JTextField();
        boxEditName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        boxEditWeigth = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Tipo", "peso", "Especie", "nombreVulgar", "uso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        buttonBack.setText("Regresar");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        boxCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCodeActionPerformed(evt);
            }
        });
        boxCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxCodeKeyTyped(evt);
            }
        });

        boxName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxNameKeyTyped(evt);
            }
        });

        boxType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxTypeKeyTyped(evt);
            }
        });

        buttonEdit.setText("Editar");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        jLabel1.setText("Peligrosidad");

        buttonAdd.setText("Agregar");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        buttonDelete.setText("Eliminar");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Animales Salvajes");

        jLabel6.setText("Código");

        boxCodeDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCodeDeleteActionPerformed(evt);
            }
        });
        boxCodeDelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxCodeDeleteKeyTyped(evt);
            }
        });

        jLabel4.setText("Peso");

        jLabel7.setText("Especie");

        jLabel8.setText("Habitat");

        boxWeigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxWeigthActionPerformed(evt);
            }
        });
        boxWeigth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxWeigthKeyTyped(evt);
            }
        });

        boxSpecies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxSpeciesKeyTyped(evt);
            }
        });

        boxHabitat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxHabitatKeyTyped(evt);
            }
        });

        jLabel9.setText("Código");

        boxDangerLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDangerLevelActionPerformed(evt);
            }
        });
        boxDangerLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxDangerLevelKeyTyped(evt);
            }
        });

        jLabel10.setText("Peligrosidad");

        jLabel11.setText("Nombre");

        jLabel13.setText("Código");

        boxEditDangerousLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEditDangerousLevelActionPerformed(evt);
            }
        });
        boxEditDangerousLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxEditDangerousLevelKeyTyped(evt);
            }
        });

        boxCodeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCodeEditActionPerformed(evt);
            }
        });
        boxCodeEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxCodeEditKeyTyped(evt);
            }
        });

        boxEditName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxEditNameKeyTyped(evt);
            }
        });

        jLabel14.setText("Peso");

        boxEditWeigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEditWeigthActionPerformed(evt);
            }
        });
        boxEditWeigth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxEditWeigthKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonBack)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(128, 128, 128)
                                            .addComponent(buttonAdd)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel4))
                                                    .addGap(44, 44, 44)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(boxCode)
                                                        .addComponent(boxName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(82, 82, 82)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(boxWeigth)
                                                        .addComponent(boxType, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(38, 38, 38)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel10))
                                    .addGap(44, 44, 44))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addGap(22, 22, 22))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addGap(21, 21, 21)))
                                            .addGap(23, 23, 23)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(boxDangerLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(boxHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(boxSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(boxCodeEdit)
                                        .addComponent(boxEditName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel6))
                                .addComponent(boxEditWeigth, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boxEditDangerousLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonEdit))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(boxCodeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonDelete)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel5)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxCodeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6)
                            .addComponent(boxCodeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boxEditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(boxEditWeigth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(buttonDelete)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(boxEditDangerousLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(buttonEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(buttonBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(boxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxWeigth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(boxSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(boxHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxDangerLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(buttonAdd)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        Animals_Control animals_Control = new Animals_Control(mainClass);
        animals_Control.setVisible(true);
        dispose();
        setNull();
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
            // TODO add your handling code here:
            SavageAnimal savageAnimal = new SavageAnimal(boxDangerLevel.getText(), boxHabitat.getText(), boxSpecies.getText(),
                    boxCode.getText(), boxName.getText(), boxWeigth.getText(), boxType.getText());
            if (mainClass.getDptLogistic().animalExits(boxCode.getText())) {
                showMessageDialog(null, "el animal ya existe");
            } else {
                showMessageDialog(null, "el animal fue agregado correctamente");
                mainClass.getDptLogistic().getArraysControl().getSavageAnimals().add(savageAnimal);
            }
            setNull();
    }//GEN-LAST:event_buttonAddActionPerformed

    private void boxCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCodeActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        String code =  boxCodeEdit.getText();
        SavageAnimal savageAnimal =  new SavageAnimal(boxEditDangerousLevel.getText(), "", "", "", boxEditName.getText(),
                boxEditWeigth.getText(), "");
        mainClass.getDptLogistic().editSavage(code, savageAnimal);
        setNull();
    }//GEN-LAST:event_buttonEditActionPerformed

    private void boxCodeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCodeDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCodeDeleteActionPerformed

    private void boxWeigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxWeigthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxWeigthActionPerformed

    private void boxDangerLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDangerLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxDangerLevelActionPerformed

    private void boxEditDangerousLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEditDangerousLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEditDangerousLevelActionPerformed

    private void boxCodeEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCodeEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCodeEditActionPerformed

    private void boxEditWeigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEditWeigthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEditWeigthActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        mainClass.getDptLogistic().deleteAnimal(boxCodeDelete.getText(), "salvaje");
        setNull();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void boxNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxNameKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
    }//GEN-LAST:event_boxNameKeyTyped

    private void boxTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxTypeKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
    }//GEN-LAST:event_boxTypeKeyTyped

    private void boxSpeciesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxSpeciesKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
    }//GEN-LAST:event_boxSpeciesKeyTyped

    private void boxHabitatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxHabitatKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
    }//GEN-LAST:event_boxHabitatKeyTyped

    private void boxDangerLevelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxDangerLevelKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
    }//GEN-LAST:event_boxDangerLevelKeyTyped

    private void boxEditNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxEditNameKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
    }//GEN-LAST:event_boxEditNameKeyTyped

    private void boxEditDangerousLevelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxEditDangerousLevelKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean backSpace = key == 8;
            
        if (!(minusculas || mayusculas || espacio || backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Alfabéticos");
           
        }
    }//GEN-LAST:event_boxEditDangerousLevelKeyTyped

    private void boxCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxCodeKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
    }//GEN-LAST:event_boxCodeKeyTyped

    private void boxWeigthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxWeigthKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
    }//GEN-LAST:event_boxWeigthKeyTyped

    private void boxEditWeigthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxEditWeigthKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
    }//GEN-LAST:event_boxEditWeigthKeyTyped

    private void boxCodeEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxCodeEditKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
    }//GEN-LAST:event_boxCodeEditKeyTyped

    private void boxCodeDeleteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxCodeDeleteKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean backSpace = key == 8;
        
        if (!(numeros||backSpace)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Ingrese solo carácteres Numéricos");
        }
    }//GEN-LAST:event_boxCodeDeleteKeyTyped

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
            java.util.logging.Logger.getLogger(Edit_SavageAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_SavageAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_SavageAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_SavageAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_SavageAnimals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxCode;
    private javax.swing.JTextField boxCodeDelete;
    private javax.swing.JTextField boxCodeEdit;
    private javax.swing.JTextField boxDangerLevel;
    private javax.swing.JTextField boxEditDangerousLevel;
    private javax.swing.JTextField boxEditName;
    private javax.swing.JTextField boxEditWeigth;
    private javax.swing.JTextField boxHabitat;
    private javax.swing.JTextField boxName;
    private javax.swing.JTextField boxSpecies;
    private javax.swing.JTextField boxType;
    private javax.swing.JTextField boxWeigth;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
