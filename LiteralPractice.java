class LiteralPractice {
    public static void main(String[] args) {
        // Long literal with 'L' suffix
        long worldPopulation = 8000000000L;

        // Float literal with 'f' suffix
        float gravity = 9.81f;

        // Char literal using Unicode escape sequence for © (U+00A9)
        char copyrightSymbol = '\u00A9';

        // Output
        System.out.println("Literal Practice Output:");
        System.out.println("Long value (World Population):\t" + worldPopulation);
        System.out.println("Float value (Gravity):\t\t" + gravity);
        System.out.println("Char value (Unicode ©):\t\t" + copyrightSymbol);
    }
}
