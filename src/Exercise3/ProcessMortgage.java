package Exercise3;

import javax.swing.*;

public class ProcessMortgage {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "********** Welcome to City Toronto Bank Directory **********");
        Double Interest = Double.parseDouble(JOptionPane.showInputDialog("Enter the current interest rate"));
        String Mortgage_Number;
        String Customer_Name;
        Double Mortgage_Amount;
        String mortgage_type;
        int term;
             Mortgage[] mortgages = new Mortgage[3];

             for(int i=0;i<mortgages.length;i++)
             {
                  mortgage_type = JOptionPane.showInputDialog("Enter the Mortgage Type (Business or Personal)");
                 Mortgage_Number = JOptionPane.showInputDialog("Enter the Mortgage Number");
                 Customer_Name = JOptionPane.showInputDialog("Enter the Customer Name");
                 Mortgage_Amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the mortgage Amount"));
                 term = Integer.parseInt(JOptionPane.showInputDialog("Enter the term of years"));
                 if(mortgage_type.equals("Business"))
                 {
                     BusinessMortgage businessMortgage = new BusinessMortgage(Mortgage_Number, Customer_Name, Mortgage_Amount, Interest, term);
                     mortgages[i] = businessMortgage;
                 }
                else if(mortgage_type.equals("Personal"))
                 {
                     PersonalMortgage personalMortgage = new PersonalMortgage(Mortgage_Number, Customer_Name, Mortgage_Amount, Interest, term);
                     mortgages[i] = personalMortgage;
                 }

             }

        for (Mortgage currentMortgage : mortgages) {
            currentMortgage.getMortgageInfo();
        }


    }

}
