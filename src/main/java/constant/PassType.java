package constant;

import java.util.Arrays;

public enum PassType {
    Days1("1 day", "Bos_Prod_Go_d1"), Days2("2 day", "Bos_Prod_Go_d2"), Days3("3 day", "Bos_Prod_Go_d3"),
    Days5("5 day", "Bos_Prod_Go_d5"), Days7("7 day", "Bos_Prod_Go_d7");

    private final String selectValue;
    private final String passName;

    PassType(String name, String selectValue) {
        this.passName = name;
        this.selectValue = selectValue;
    }

    public String getPassName() {
        return passName;
    }

    public String getSelectValue() {
        return selectValue;
    }

    public static PassType findByPass(String passType) {
        return Arrays.stream(PassType.values()).filter(v ->
                v.getPassName().equals(passType)).findFirst().orElseThrow();
    }
}
