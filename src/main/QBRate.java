package main;
import javax.swing.*;
import java.math.*;

//Quochung Nguyen

public class QBRate {
	public static void main(String[] args) {
		
		
		BigDecimal TD = new BigDecimal(JOptionPane.showInputDialog("How many touchdown passes?"));
		BigDecimal YDS = new BigDecimal(JOptionPane.showInputDialog("How many yards?"));
		BigDecimal INT = new BigDecimal(JOptionPane.showInputDialog("How many interceptions?"));
		BigDecimal COMP = new BigDecimal(JOptionPane.showInputDialog("How many completions?"));
		BigDecimal ATT = new BigDecimal(JOptionPane.showInputDialog("How many passes attempted?"));
		
		BigDecimal numInst = COMP.divide(ATT);
		BigDecimal numInst2 = new BigDecimal ("0.3");
		BigDecimal numInst3 = new BigDecimal ("5");
		numInst = numInst.subtract(numInst2);
		BigDecimal a = numInst.multiply(numInst3);
		
		
		numInst = YDS.divide(ATT);
		numInst2 = BigDecimal.valueOf(3);
		numInst3 = BigDecimal.valueOf(0.25);
		numInst = numInst.subtract(numInst2);
		BigDecimal b = numInst.multiply(numInst3);
		
		numInst = TD.divide(ATT);
		numInst2 = BigDecimal.valueOf(20);
		BigDecimal c = numInst.multiply(numInst2);
		
		numInst = INT.divide(ATT);
		numInst2 = BigDecimal.valueOf(25);
		numInst3 = BigDecimal.valueOf(2.375);
		numInst = numInst.multiply(numInst2);
		BigDecimal d = numInst3.subtract(numInst);
		
	
		numInst2 = BigDecimal.valueOf(0);
		
		
		if (a.compareTo(numInst3)==1)
			a=numInst3;
		else if (a.compareTo(numInst2)==-1)
			a=numInst2;
		
		if (b.compareTo(numInst3)==1)
			b=numInst3;
		else if (b.compareTo(numInst2)==-1)
			b=numInst2;
		
		if (c.compareTo(numInst3)==1)
			c=numInst3;
		else if (c.compareTo(numInst2)==-1)
			c=numInst2;
		
		if (d.compareTo(numInst3)==1)
			d=numInst3;
		else if (d.compareTo(numInst2)==-1)
			d=numInst2;
		
		
		numInst=a.add(b);
		numInst=numInst.add(c);
		numInst=numInst.add(d);
		
		numInst2 = BigDecimal.valueOf(6);
		numInst3 = BigDecimal.valueOf(100);
		
		numInst=numInst.multiply(numInst3);
		
		BigDecimal rating = numInst.divide(numInst2, 1, RoundingMode.HALF_UP);
		JOptionPane.showMessageDialog(null,"Yo boy's score is " + rating);
	}
}
