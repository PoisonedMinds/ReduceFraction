package reducefraction;

import javax.swing.*;

/**
 * @title ReduceFraction
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 24-Mar-2015 12:52:46 PM
 * @purpose The purpose of this program is to reduce a fraction to lowest terms
 */
public class ReduceFraction {

    public static void main(String[] args) {
        int n, d, gcd;
        //get user input
        n=Integer.parseInt(JOptionPane.showInputDialog("input the numerator."));
        d=Integer.parseInt(JOptionPane.showInputDialog("input the denominator."));
        gcd = reduce(n, d);//get greatest common divisor
        n=n/gcd;//calculate new numberator and denominator
        d=d/gcd;
        JOptionPane.showMessageDialog(null, n+"/"+d);
    }

    private static int reduce(int n, int d) {
        int r;
        if ((n == d) || (d == 0)) {//output if recursion is done
            return n;
        } else {
            r = n % d;//Euclid's algorithm
            n = d;
            d = r;
            return reduce(n, d);
        }

    }

}
