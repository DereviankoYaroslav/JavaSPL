package LW4;

public class Task1 {
    private String prf;
    public String pf;
    private static String prsf;
    public static String psf;

    public static void main(String[] args) {
        System.out.println(new Task1());
    }

    @Override
    public String toString() {
        return "Override method toString()";
    }

    public void setPf(String pf) {
        this.pf = pf;
    }

    public String getPf() {
        return pf;
    }

    public void setPrf(String prf) {
        this.prf = prf;
    }

    public String getPrf() {
        return prf;
    }

    public static void setPrsf(String prsf) {
        Task1.prsf = prsf;
    }

    public static String getPrsf() {
        return prsf;
    }

    public static void setPsf(String psf) {
        Task1.psf = psf;
    }

    public static String getPsf() {
        return psf;
    }
}


