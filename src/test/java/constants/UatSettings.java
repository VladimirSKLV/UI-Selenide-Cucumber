package constants;


public class UatSettings implements Env{
    @Override
    public String meUrl() {
        return "https://me3.weawer.ru";
    }

    @Override
    public String mainPage() {
        return "https://me3.weawer.ru/initial/dashboard";
    }

    @Override
    public String meApiUrl() {
        return "https://me3.weawer.ru:8443/";
    }

    @Override
    public String keepLoggedIn() {
        return "";
    }

    @Override
    public String mePassword() {
        return "111";
    }

    @Override
    public String meUsername() {
        return "gachi@swip.one";
    }
}
