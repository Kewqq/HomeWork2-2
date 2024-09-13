public class SiverCard {
    public SilverCard() {
        super(0.02); // 2% discount
    }

    @Override
    public double calculateFinalAmount(double amount) {
        double effectiveDiscount = (amount >= 1000) ? getDiscount() : 0.0;
        return amount * (1 - effectiveDiscount);
    }
}

