public class SalaryCalculator {
    private int day;
    private int night;
    private int special;
    private int rate;

    SalaryCalculator(int day, int night, int special, int rate) { this.day = day; this.night = night; this.special = special; this.rate = rate; }
    public double calculateSalary() { return (this.day + 1.5 * this.night + 2 * this.special) * rate; }

}
