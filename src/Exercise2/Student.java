package Exercise2;

public abstract class Student {

    private final String name;

    private final boolean fulltime_status;

    public Student(String name,boolean fulltime_status)
    {
        this.name=name;
        this.fulltime_status=fulltime_status;
    }

    public abstract  void tuition();
}
