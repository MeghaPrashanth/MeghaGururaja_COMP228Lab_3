package Exercise1;
import javax.swing.JOptionPane;

public class InsuranceDriver {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "********** Welcome to the Insurance Directory **********");

        Insurance[] insurance = new Insurance[1];
        String type = JOptionPane.showInputDialog("Enter the insurance type (Health or Life)");
        Double monthly_cost = Double.parseDouble(JOptionPane.showInputDialog("Enter the monthly cost"));

        if (type.equals("Health")) {
            HealthInsurance healthInsurance = new HealthInsurance(type, monthly_cost);
            insurance[0] = healthInsurance;

        } else if(type .equals("Life")) {
            LifeInsurance lifeInsurance = new LifeInsurance(type, monthly_cost);
            insurance[0] = lifeInsurance;
        }

        for (Insurance currentInsurance : insurance) {
            currentInsurance.SetInsuranceCost();
            currentInsurance.DisplayInfo();

        }

        for (int j = 0; j < insurance.length; j++) {
            System.out.printf("Insurance %d is a %s%n", j, insurance[j].getClass().getName());
        }
    }
}