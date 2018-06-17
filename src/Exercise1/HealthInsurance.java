package Exercise1;
import javax.swing.JOptionPane;

public class HealthInsurance extends  Insurance
{

    Double monthly_cost;

    public  HealthInsurance (String insurance_type,Double monthly_cost)
    {
        super(insurance_type,monthly_cost);
    }

    @Override
    public void SetInsuranceCost() {
        this.monthly_cost = getMonthly_cost();
    }

    @Override
    public void DisplayInfo() {

        String message = "<html> Hi " +  "<br>"
                +"Your Insurance Type is :" + getInsurance_type()
                + "<br>" +
                "Your Monthly Cost is : $" + monthly_cost;
        JOptionPane.showMessageDialog(null,message);

    }
}
