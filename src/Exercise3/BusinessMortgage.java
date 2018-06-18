package Exercise3;

public class BusinessMortgage extends  Mortgage {

    BusinessMortgage(String Mortgage_Number,String Customer_Name,double Mortage_Amount,double Interest_Rate,int term)
    {
        super(Mortgage_Number,Customer_Name,Mortage_Amount,(Interest_Rate+1),term);
    }

}
