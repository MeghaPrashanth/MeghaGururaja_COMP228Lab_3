package Exercise1;

public abstract class Insurance {

    private final String insurance_type;

    private final Double monthly_cost;

    public Insurance(String insurance_type,Double monthly_cost)
    {
        this.insurance_type=insurance_type;
        this.monthly_cost=monthly_cost;
    }

    public String getInsurance_type() {
        return insurance_type;
    }

    public Double getMonthly_cost() {
        return monthly_cost;
    }

    @Override
    public String toString() {
        return String.format("Type of Insurance: %s%n Monthly Cost: %s%n",
               getInsurance_type(),getMonthly_cost());
    }
}
