/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientific.calculator;

/**
 *
 * @author Sanele
 */
public class ScientificClculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmCalculator frmCalc = new frmCalculator();
        frmCalc.setTitle("Multi-purpose Scientific Calculator");
        frmCalc.setLocation(400, 100);
        frmCalc.setSize(420, 502);
        frmCalc.show();
    }
    
}
