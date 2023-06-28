package Money;

public enum Coin {
        FIVE_P(5),
        TEN_P(10),
        TWENTY_P(20),
        FIFTY_P(50),
        POUND(100),
        TWO_POUND(200);

        private final int value;

        Coin(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;

    }
}
