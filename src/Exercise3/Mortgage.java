package Exercise3;

import javax.swing.*;

public abstract  class Mortgage implements MortgageConstants {

   private final String Mortgage_Number;
   private  final  String Customer_Name;
   private  final double Mortgage_Amount;
   private  final double Interest_Rate;
   private final int term;

   public  Mortgage (String Mortgage_Number,String Customer_Name,double Mortage_Amount,double Interest_Rate,int term)
   {
       this.Mortgage_Number = Mortgage_Number;
       this.Customer_Name = Customer_Name;
       if(Mortage_Amount<=0.0 && Mortage_Amount>maximum_mortgage_amount)
       {
           throw new IllegalArgumentException("Mortgage Amount must be greater than $0.0 and less than $300,000.00");
       }
       this.Mortgage_Amount = Mortage_Amount;
       this.Interest_Rate = Interest_Rate;
       this.term =term;

   }
    public String getMortgage_Number() {
        return Mortgage_Number;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public double getMortgage_Amount() {
        return Mortgage_Amount;
    }

    public double getInterest_Rate() {
        return Interest_Rate;
    }

    public int getTerm() {
        return term;
    }

    Double Interest_Rate_Cal;

    public double CalculateInterestRate()
    {
        if(term == short_term)
            Interest_Rate_Cal = Mortgage_Amount * (Interest_Rate/100) * short_term;
        else if(term == medium_term)
            Interest_Rate_Cal = Mortgage_Amount * (Interest_Rate/100) * medium_term;
        else if(term == long_term)
            Interest_Rate_Cal = Mortgage_Amount * (Interest_Rate/100) * long_term;
        else
            Interest_Rate_Cal = Mortgage_Amount * (Interest_Rate/100) * short_term ;

        return  Interest_Rate_Cal;

    }


    public double Total_Amount_Owed()
    {
       return  Mortgage_Amount + Interest_Rate_Cal;
    }

    public  void getMortgageInfo() {
        String message = "<html> Hi Welcome  " + "<br>"
                + "Bank Name is :" + bank_name + "<br>"
                + "Mortgage Number :" + getMortgage_Number()
                + "<br>" +
                "Customer Name :" + getCustomer_Name()
                + "<br>" +
                "Mortgage Amount: $" + getMortgage_Amount()
                + "<br>" +
                "Interest Rate : " + CalculateInterestRate()
                + "<br>" +
                "Term :" + getTerm() + "years"
                + "<br>" +
                "Total Amount Owed : $" + Total_Amount_Owed();
        JOptionPane.showMessageDialog(null, message);
    }

}
