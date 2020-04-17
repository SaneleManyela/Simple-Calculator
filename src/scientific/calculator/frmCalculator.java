/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientific.calculator;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sanele
 */
public class frmCalculator extends javax.swing.JFrame {

    /**
     * Creates new form frmCalculator
     */
    public frmCalculator() {
        initComponents();
    }

    clsCalculatorMethods clsCalcMethods = new clsCalculatorMethods();
    double dblAnswer;
    int intAnswer;
    
    private void mSinCalculationAndOutput(JTextField txt)
    {
        try{
            dblAnswer = clsCalcMethods.mSin(Double.parseDouble(txt.getText()));
            JOptionPane.showMessageDialog(null, "Sin "+txt.getText()+" = "+dblAnswer);
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mCosCalculationsAndOutput(JTextField txt)
    {
        try{
            dblAnswer = clsCalcMethods.mCos(Double.parseDouble(txt.getText()));
            JOptionPane.showMessageDialog(null, "Cos "+txt.getText()+" = "+dblAnswer);
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mTanCalculationsAndOutput(JTextField txt)
    {
        try{
            dblAnswer = clsCalcMethods.mTan(Double.parseDouble(txt.getText()));
            JOptionPane.showMessageDialog(null, "Tan "+txt.getText()+" = "+dblAnswer);
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mSqrtCalculationsAndOutput(JTextField txt)
    {
        try{
            dblAnswer = clsCalcMethods.mSqrt(Double.parseDouble(txt.getText()));
            JOptionPane.showMessageDialog(null, "Square root "+txt.getText()+" = "+dblAnswer);
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mAbsoluteValueCalculationsAndOutput(JTextField txt)
    {
        try{
            dblAnswer = clsCalcMethods.mAbs(Double.parseDouble(txt.getText()));
            JOptionPane.showMessageDialog(null, "Absolute value of "+txt.getText()+" is "+dblAnswer);
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mCelsiusCalculationsAndOutput(JTextField txt)
    {
        try{
            intAnswer = clsCalcMethods.mFarenheitToCelsius(Integer.parseInt(txt.getText()));
            JOptionPane.showMessageDialog(null, txt.getText()+" Fahrenheits is "+intAnswer+" Celsius");
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mFahrenheitCalculationsAndOutput(JTextField txt)
    {
        try{
            intAnswer = clsCalcMethods.mCelsiusToFahrenheit(Integer.parseInt(txt.getText()));
            JOptionPane.showMessageDialog(null, txt.getText()+" Celsius is "+intAnswer+" Fahrenheits");
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mKmCalculationsAndOutput(JTextField txt)
    {
        try{
            dblAnswer = clsCalcMethods.mMilesToKilometres(Double.parseDouble(txt.getText()));
            JOptionPane.showMessageDialog(null, txt.getText()+" miles is "+dblAnswer+" km");
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mMilesCalculationsAndOutput(JTextField txt)
    {
        try{
            dblAnswer = clsCalcMethods.mKilometresToMiles(Double.parseDouble(txt.getText()));
            JOptionPane.showMessageDialog(null, txt.getText()+" kilometres is "+dblAnswer+" miles");
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mMetresCalculationsAndOutput(JTextField txt)
    {
        try{
            dblAnswer = clsCalcMethods.mCentimetresToMetres(Double.parseDouble(txt.getText()));
            JOptionPane.showMessageDialog(null, txt.getText()+" centimetres is "+dblAnswer+" metres");
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mCentimetresCalculationsAndOutput(JTextField txt)
    {
        try{
            dblAnswer = clsCalcMethods.mMetresToCentimetres(Double.parseDouble(txt.getText()));
            JOptionPane.showMessageDialog(null, txt.getText()+" metres is "+dblAnswer+" centimetres");
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mKilogramsCalculationsAndOutput(JTextField txt)
    {
        try{
            dblAnswer = clsCalcMethods.mPoundsToKilograms(Double.parseDouble(txt.getText()));
            JOptionPane.showMessageDialog(null, txt.getText()+" lbs is "+dblAnswer+" kg");
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
        }
    }
    
    private void mPoundsCalculationsAndOutput(JTextField txt)
    {
        try{
            dblAnswer = clsCalcMethods.mKilogramsToPounds(Double.parseDouble(txt.getText()));
            JOptionPane.showMessageDialog(null, txt.getText()+" kg is "+dblAnswer+" lbs");
        }catch(NumberFormatException eX){
            JOptionPane.showMessageDialog(null, "Please enter numbers.");
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

        dsktpCalculator = new javax.swing.JDesktopPane();
        lblHeading = new javax.swing.JLabel();
        txtInput1 = new javax.swing.JTextField();
        txtInput2 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnAbsoluteValue = new javax.swing.JButton();
        btnCelsius = new javax.swing.JButton();
        btnFarenheit = new javax.swing.JButton();
        btnKM = new javax.swing.JButton();
        btnModulus = new javax.swing.JButton();
        btnCM = new javax.swing.JButton();
        btnKG = new javax.swing.JButton();
        btnPounds = new javax.swing.JButton();
        btnMiles = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        sprtArithmetic = new javax.swing.JSeparator();
        sprtTrigonometry = new javax.swing.JSeparator();
        sprtTemperature = new javax.swing.JSeparator();
        sprtDistance = new javax.swing.JSeparator();
        sprtMass = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dsktpCalculator.setBackground(new java.awt.Color(102, 153, 255));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeading.setText("Calculator");
        lblHeading.setToolTipText("");
        dsktpCalculator.add(lblHeading);
        lblHeading.setBounds(153, 20, 92, 22);
        dsktpCalculator.add(txtInput1);
        txtInput1.setBounds(10, 100, 145, 20);

        txtInput2.setToolTipText("");
        dsktpCalculator.add(txtInput2);
        txtInput2.setBounds(240, 100, 144, 20);

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnAdd);
        btnAdd.setBounds(10, 160, 50, 25);

        btnSubtract.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubtract.setText("-");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnSubtract);
        btnSubtract.setBounds(89, 160, 50, 25);

        btnMultiply.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnMultiply);
        btnMultiply.setBounds(161, 160, 60, 25);

        btnDivide.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnDivide);
        btnDivide.setBounds(250, 160, 50, 25);

        btnSin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSin.setText("Sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnSin);
        btnSin.setBounds(10, 240, 60, 23);

        btnCos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCos.setText("Cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnCos);
        btnCos.setBounds(90, 240, 60, 23);

        btnTan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTan.setText("Tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnTan);
        btnTan.setBounds(170, 240, 60, 23);

        btnSqrt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSqrt.setText("sqrt");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnSqrt);
        btnSqrt.setBounds(250, 240, 60, 23);

        btnAbsoluteValue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAbsoluteValue.setText("abs");
        btnAbsoluteValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsoluteValueActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnAbsoluteValue);
        btnAbsoluteValue.setBounds(320, 240, 60, 23);

        btnCelsius.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCelsius.setText("Celsius");
        btnCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelsiusActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnCelsius);
        btnCelsius.setBounds(10, 300, 80, 23);

        btnFarenheit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFarenheit.setText("Fahreheit");
        btnFarenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarenheitActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnFarenheit);
        btnFarenheit.setBounds(100, 300, 100, 23);

        btnKM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKM.setText("KM");
        btnKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKMActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnKM);
        btnKM.setBounds(10, 350, 70, 23);

        btnModulus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModulus.setText("%");
        btnModulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModulusActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnModulus);
        btnModulus.setBounds(320, 160, 60, 25);

        btnCM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCM.setText("CM");
        btnCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCMActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnCM);
        btnCM.setBounds(300, 350, 80, 23);

        btnKG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKG.setText("KG");
        btnKG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKGActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnKG);
        btnKG.setBounds(10, 420, 70, 23);

        btnPounds.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPounds.setText("lbs");
        btnPounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoundsActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnPounds);
        btnPounds.setBounds(100, 420, 80, 23);

        btnMiles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMiles.setText("Miles");
        btnMiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMilesActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnMiles);
        btnMiles.setBounds(100, 350, 80, 23);

        btnM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnM.setText("M");
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnM);
        btnM.setBounds(200, 350, 80, 23);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnClear);
        btnClear.setBounds(200, 420, 80, 23);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        dsktpCalculator.add(btnExit);
        btnExit.setBounds(300, 420, 80, 23);

        sprtArithmetic.setForeground(new java.awt.Color(0, 0, 0));
        dsktpCalculator.add(sprtArithmetic);
        sprtArithmetic.setBounds(0, 140, 420, 61);

        sprtTrigonometry.setForeground(new java.awt.Color(0, 0, 0));
        dsktpCalculator.add(sprtTrigonometry);
        sprtTrigonometry.setBounds(0, 220, 420, 50);

        sprtTemperature.setForeground(new java.awt.Color(0, 0, 0));
        dsktpCalculator.add(sprtTemperature);
        sprtTemperature.setBounds(0, 280, 420, 50);

        sprtDistance.setForeground(new java.awt.Color(0, 0, 0));
        dsktpCalculator.add(sprtDistance);
        sprtDistance.setBounds(0, 340, 420, 50);

        sprtMass.setForeground(new java.awt.Color(0, 0, 0));
        dsktpCalculator.add(sprtMass);
        sprtMass.setBounds(0, 400, 420, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dsktpCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dsktpCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        if(txtInput1.getText().equals("") || txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on both text boxes.");
        }else if(txtInput1.getText().equals("") && txtInput2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "The text boxes must not be empty.");
        }else{
            try{
                if(Double.parseDouble(txtInput2.getText()) == 0)
                {
                    JOptionPane.showMessageDialog(null, "A divisor must be not be zero");
                }else{
                    dblAnswer = clsCalcMethods.mDivide(Double.parseDouble(txtInput1.getText()),
                            Double.parseDouble(txtInput2.getText()));
                    JOptionPane.showMessageDialog(null, txtInput1.getText()+" divide by "+txtInput2.getText()
                    +" = "+dblAnswer);
                }
            }catch(NumberFormatException eX){
                JOptionPane.showMessageDialog(null, "Please enter numbers.");
            }
        }
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtInput1.getText().equals("") || txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on both text boxes.");
        }else if(txtInput1.getText().equals("") && txtInput2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "The text boxes must not be empty.");
        }else{
            try{
                dblAnswer = clsCalcMethods.mAddition(Double.parseDouble(txtInput1.getText()),
                        Double.parseDouble(txtInput2.getText()));
                JOptionPane.showMessageDialog(null, txtInput1.getText()+" plus "+txtInput2.getText()
                +" = "+dblAnswer);
            }catch(NumberFormatException eX){
                JOptionPane.showMessageDialog(null, "Please enter numbers.");
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        if(txtInput1.getText().equals("") || txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on both text boxes.");
        }else if(txtInput1.getText().equals("") && txtInput2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "The text boxes must not be empty.");
        }else{
            try{
                dblAnswer = clsCalcMethods.mSubtract(Double.parseDouble(txtInput1.getText()),
                        Double.parseDouble(txtInput2.getText()));
                JOptionPane.showMessageDialog(null, txtInput1.getText()+" minus "+txtInput2.getText()
                +" = "+dblAnswer);
            }catch(NumberFormatException eX){
                JOptionPane.showMessageDialog(null, "Please enter numbers.");
            }
        }
    }//GEN-LAST:event_btnSubtractActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        if(txtInput1.getText().equals("") || txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on both text boxes.");
        }else if(txtInput1.getText().equals("") && txtInput2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "The text boxes must not be empty.");
        }else{
            try{
                dblAnswer = clsCalcMethods.mMultiply(Double.parseDouble(txtInput1.getText()),
                        Double.parseDouble(txtInput2.getText()));
                JOptionPane.showMessageDialog(null, txtInput1.getText()+" multiply by "+txtInput2.getText()
                +" = "+dblAnswer);
            }catch(NumberFormatException eX){
                JOptionPane.showMessageDialog(null, "Please enter numbers.");
            }
        }
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnModulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModulusActionPerformed
        if(txtInput1.getText().equals("") || txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on both text boxes.");
        }else if(txtInput1.getText().equals("") && txtInput2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "The text boxes must not be empty.");
        }else{
            try{
                dblAnswer = clsCalcMethods.mModulo(Double.parseDouble(txtInput1.getText()),
                        Double.parseDouble(txtInput2.getText()));
                JOptionPane.showMessageDialog(null, txtInput1.getText()+" modulus "+txtInput2.getText()
                +" = "+dblAnswer);
            }catch(NumberFormatException eX){
                JOptionPane.showMessageDialog(null, "Please enter numbers.");
            }
        }
    }//GEN-LAST:event_btnModulusActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mSinCalculationAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mSinCalculationAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mCosCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mCosCalculationsAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mTanCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mTanCalculationsAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mSqrtCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mSqrtCalculationsAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void btnAbsoluteValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsoluteValueActionPerformed
       if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mAbsoluteValueCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mAbsoluteValueCalculationsAndOutput(txtInput1);
            }
        } 
    }//GEN-LAST:event_btnAbsoluteValueActionPerformed

    private void btnCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelsiusActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mCelsiusCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mCelsiusCalculationsAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnCelsiusActionPerformed

    private void btnFarenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarenheitActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mFahrenheitCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mFahrenheitCalculationsAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnFarenheitActionPerformed

    private void btnKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKMActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mKmCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mKmCalculationsAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnKMActionPerformed

    private void btnMilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMilesActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mMilesCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mMilesCalculationsAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnMilesActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mMetresCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mMetresCalculationsAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnMActionPerformed

    private void btnCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCMActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mCentimetresCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mCentimetresCalculationsAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnCMActionPerformed

    private void btnKGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKGActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mKilogramsCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mKilogramsCalculationsAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnKGActionPerformed

    private void btnPoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoundsActionPerformed
        if(txtInput1.getText().equals("") && txtInput2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number on at least one text box.");
        }else if(!(txtInput1.getText().equals("")) && !(txtInput2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter a number using a single text box");
        }else{
            if(txtInput1.getText().equals("")){
                mPoundsCalculationsAndOutput(txtInput2);
            }else if(txtInput2.getText().equals("")){
                mPoundsCalculationsAndOutput(txtInput1);
            }
        }
    }//GEN-LAST:event_btnPoundsActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtInput1.setText("");
        txtInput2.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(frmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbsoluteValue;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCM;
    private javax.swing.JButton btnCelsius;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFarenheit;
    private javax.swing.JButton btnKG;
    private javax.swing.JButton btnKM;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnMiles;
    private javax.swing.JButton btnModulus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnPounds;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JButton btnTan;
    private javax.swing.JDesktopPane dsktpCalculator;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JSeparator sprtArithmetic;
    private javax.swing.JSeparator sprtDistance;
    private javax.swing.JSeparator sprtMass;
    private javax.swing.JSeparator sprtTemperature;
    private javax.swing.JSeparator sprtTrigonometry;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput2;
    // End of variables declaration//GEN-END:variables
}
