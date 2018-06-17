package Exercise2;

public class PartTimeStudent extends Student {
    private double tuition_fee;
    private double hours;
    public PartTimeStudent(String name,boolean fulltime_status,double tuition_fee,double hours)
    {
        super(name,fulltime_status);

        if(tuition_fee <= 0.0)
        {
            throw new IllegalArgumentException("Tuition fee must be greater than $0.0");
        }

        if(hours <= 0.0 || hours>=20.00)
        {
            throw  new IllegalArgumentException("Number of hours for part time students in a week must be greater than 0 and less than 20");
        }
        this.tuition_fee=tuition_fee;

        this.hours=hours;
    }

    public double getTuition_fee() {
        return tuition_fee;
    }

    public void setTuition_fee(double tuition_fee) {
        if(tuition_fee <= 0.0)
        {
            throw new IllegalArgumentException("Tuition fee must be greater than $0.0 ");
        }
        this.tuition_fee = tuition_fee;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours <= 0.0 || hours>=20.00)
        {
            throw  new IllegalArgumentException("Number of hours for part time students in a week must be greater than 0 and less than 20");
        }

        this.hours = hours;
    }

    @Override
    public double tuition() {
        return hours*tuition_fee*4;
    }

    @Override
    public String toString() {
        return String.format("%s%s",
                "Part Time Student Name: ", super.toString(),
                "Tuition Fees is : $",getTuition_fee());
    }
}
