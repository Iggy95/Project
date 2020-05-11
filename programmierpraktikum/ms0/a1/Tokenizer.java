package ms0.a1;

public class Tokenizer {
    private String base;
    private String rule;
    private String[] tokens = new String[0];
    private int index = -1;

    private int ruleLength = 0;
    private int baseLength = 0;

    public Tokenizer(String stringToSplit) {
        this.base = stringToSplit;
        this.rule = " ";
        this.ruleLength = 1;
        this.baseLength = this.base.length();
        this.split();
    }

    private void split() {
        char ruleStart = this.rule.toCharArray()[0];
        String[] tokens = new String[100];
        char charOfBase;
        int indexOfActualToken = -1;
        int startOfToken = -1;
        int endOfToken = -1;

        for(int i = 0; i < this.base.length(); i++) {
            charOfBase = this.base.charAt(i);

            if (charOfBase != ruleStart) {
                if (startOfToken == -1) {
                    startOfToken = i;
                }
            } else {
                if (startOfToken != -1) {
                    if (this.base.substring(i, i + ruleLength).equals(this.rule)) {
                        endOfToken = i;
                        i = i + ruleLength - 1;
                    } else {
                        i = i + ruleLength - 1;
                        continue;
                    }
                }
            }


            if (startOfToken != -1 && endOfToken != -1) {
                tokens[++indexOfActualToken] = this.base.substring(startOfToken, endOfToken);
                startOfToken = -1;
                endOfToken = -1;
            } else if (startOfToken != -1 && (endOfToken == -1 && i == baseLength - 1)) {
                tokens[++indexOfActualToken] = this.base.substring(startOfToken);
            }

        }
        this.tokens = new String[indexOfActualToken + 1];
        for (int i = 0; i < indexOfActualToken + 1; i++) {
            this.tokens[i] = tokens[i];
        }
        System.out.println(this.tokens.length);
    }

    public String next() {
        if (this.index == this.tokens.length - 1) {
            return null;
        }
        this.index++;
        return this.tokens[this.index];
    }

    public boolean done() {
        if (this.index == this.tokens.length - 1) {
            return true;
        }
        return false;
    }
}
