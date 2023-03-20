public class FullTimeExaminer extends Examiner{
    private double monthlyPay;

    public FullTimeExaminer(String name, String id) {
        super(name, id);    //invoke constructor for the superclass
    }

    public double calcPay(){
        return getMonthlyPay();
    }

    public double getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }
}
