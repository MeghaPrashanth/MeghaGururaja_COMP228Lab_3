package Exercise2;

public abstract class Student {

    private final String name;

    private final boolean fulltime_status;

    public Student(String name,boolean fulltime_status)
    {
        this.name=name;
        this.fulltime_status=fulltime_status;
    }

    public String getName() {
        return name;
    }

    public boolean isFulltime_status() {
        return fulltime_status;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %s",
                getName(),"Full Time Student",isFulltime_status());
    }

    public abstract  double tuition();
}
