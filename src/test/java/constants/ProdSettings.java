package constants;

public class ProdSettings implements Env {

    @Override
    public String meUrl() {
        return "https://lg1.smartwallet.ru";
    }

    @Override
    public String mainPage() {
        return "https://partner.swip.one/initial/dashboard";
    }

    @Override
    public String mePassword() {
        return "1";
    }

    @Override
    public String meUsername() {
        return "kp@swip.one";
    }
}
