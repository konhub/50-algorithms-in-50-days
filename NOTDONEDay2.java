import javax.swing.*;
import java.awt.event.*;
public class currencyConverter{
  public static void main(String[] args){
    String[] currencyList = {"GBP British Pound","USD United States Dollar","AUD Australian Dollar","BRL Brazillian Real","COP Colombian Peso","EUR European Euro","EGP Egyption Pound","HKD Hongkong Dollar","IDR Indonesian Rupiah","JPY Japanese Yen","MXN Mexican Peso","NGN Nigerian Naira","KRW South Korean Won","NZD New Zealand Dollar","CNY Chinese Yuan Renminbi"}
    Jframe frame = new Jframe("Currency Converter);
    frame.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
    Jbutton button1 = new Jbutton();
    JComboBox currencylist = new JComboBox(currencyList);
    currencyList.addActionListener(this);
    Jlabel title = new JLabel;
    Jlabel selectedCurrency = new Jlabel;
    frame.add(button1,BorderLayout.WEST);
    frame.add(label,BorderLayout.NORTH);
    frame.add
    frame.setSize(300,300);                          
    frame.setVisible(true);
    
  }
  public void actionPerformed(ActionEvent ae){
    selectedCurrency = (String)currencyList.getSelectedItem();
  }
                         
                            
}
