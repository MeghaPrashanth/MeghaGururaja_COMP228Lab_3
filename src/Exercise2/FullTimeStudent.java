package Exercise2;

public class FullTimeStudent extends  Student {

    private double tuition_fee;
    public FullTimeStudent(String name,boolean fulltime_status,double tuition_fee)
    {
        super(name,fulltime_status);
        if(tuition_fee <= 0.0 || tuition_fee>2000.00)
        {
            throw new IllegalArgumentException("Tuition fee for full time students must be greater than $0.0 and less than $2000.00 ");
        }
        this.tuition_fee=tuition_fee;
    }

    public double getTuition_fee() {
        return tuition_fee;
    }

    public void setTuition_fee(double tuition_fee) {
        if(tuition_fee <= 0.0 || tuition_fee>2000.00)
        {
            throw new IllegalArgumentException("Tuition fee for full time students must be greater than $0.0 and less than $2000.00 ");
        }
        this.tuition_fee = tuition_fee;
    }

    @Override
    public double tuition() {
        return tuition_fee;
    }

    @Override
    public String toString() {
        return String.format("%s%s",
                "Full Time Student Name: ", super.toString(),
                "Tuition Fees is : $",getTuition_fee());
         }
    }


