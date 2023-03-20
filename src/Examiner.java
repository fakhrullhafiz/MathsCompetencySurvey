public abstract class Examiner {
    private String name;
    private String id;

    public Examiner(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public abstract float calcpay();

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}