package Exercise3;

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
       if(Mortage_Amount<=0.0 && Mortage_Amount>300000.00)
       {
           throw new IllegalArgumentException("Mortgage Amount must be greater than $0.0 and less than $300,000.00");
       }
       this.Mortgage_Amount = Mortage_Amount;
       this.Interest_Rate = Interest_Rate;
       if(term <=0 || term>5)
       {
           throw new IllegalArgumentException("The term must be greater than 0 and less than or equal to 5 years");
       }

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


    public  String getMortgageInfo()
    {
        return String.format("%s%s%n%s%s%n%s%s%n%s%s%n%s%s",
        "Mortgage Number: ",getMortgage_Number(),
        "Customer Name: ",getCustomer_Name(),
        "Mortgage Amount: ",getMortgage_Amount(),
        "Interest Rate",getInterest_Rate(),
        "Term: ",getTerm());

    }
}
