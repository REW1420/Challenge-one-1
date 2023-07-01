package Model;

public class Conversor implements ConversonInterface {


    double ChineCurrency = 7.26;
    double EuroCurrency = 0.92;
    double libras = 0.78;
    double yen = 144.54;
    double won = 1318.05;
    double answer;


    @Override
    public double principalToYuang(double principal) {
        return principal * this.ChineCurrency;
    }

    @Override
    public double principalToEuro(double principal) {
        return principal * this.EuroCurrency;
    }

    @Override
    public double principalToLibra(double principal) {
        return principal * this.libras;
    }

    @Override
    public double principalToYen(double principal) {
        return principal * this.yen;
    }

    @Override
    public double principalToWon(double principal) {
        return principal * this.won;
    }

    @Override
    public double anyToUSD(int key, double principal) {
        switch (key) {
            case 5 -> {
                this.answer = principal * 0.13756;
            }
            case 6 -> {
                this.answer = principal * 1.08844;
            }
            case 7 -> {
                this.answer = principal * 1.26615;
            }
            case 8 -> {
                this.answer = principal * 0.00692;
            }
            case 9 -> {
                this.answer = principal * 0.00076;
            }
        }
        return this.answer;
    }

}
