package Exercise3;

public class PersonalMortgage extends  Mortgage {

   public PersonalMortgage(String Mortgage_Number,String Customer_Name,double Mortage_Amount,double Interest_Rate,int term)
    {
        super(Mortgage_Number,Customer_Name,Mortage_Amount,(Interest_Rate+2),term);
    }
}
