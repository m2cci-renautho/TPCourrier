public enum ModeEnvoi {

    NORMAL(1.0),
    EXPRESS(2.0);

    private final double coefficient;

    ModeEnvoi(double coefficient) {

        this.coefficient = coefficient;
    }

    public double coefficient() {
        return this.coefficient;
    }

}
