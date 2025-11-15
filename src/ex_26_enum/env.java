package ex_26_enum;

public enum env {
    Dev("www.dev.com"),
    QA("www.QA.com"),
    PROD("www.dev.com");

    private final String baseUrl;

    env(String baseUrl){
        this.baseUrl=baseUrl;

    }
    public String getBaseUrl(){
        return baseUrl;
    }
}