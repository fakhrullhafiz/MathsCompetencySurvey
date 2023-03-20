public class PartTimeExaminer extends Examiner{
    private double dailyRate;
    private int numDays;

    public PartTimeExaminer(String name, String id) {
        super(name, id);
    }

    public double calcPay(){
        return this.getNumDays() * this.getDailyRate();
    }

    public int getNumDays() {
        return numDays;
    }

    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getDailyRate(){
        return dailyRate;
    }
}
