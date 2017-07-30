public enum  DriversPath {

    MAC_CHROME("/Users/smiroshn/IdeaProjects/SeleniumAdvanced/src/main/resources/chromedriver"),
    MAC_FIREFOX("/Users/smiroshn/IdeaProjects/SeleniumAdvanced/src/main/resources/geckodriver"),
    WIN_CHROME("C:\\Webdrivers\\chromedriver.exe"),
    WIN_FIREFOX("C:\\Webdrivers\\geckodriver.exe");

    private final String driverPath;

    DriversPath(String driverPath) {
        this.driverPath = driverPath;
    }


    public String getDriverPath() {
        return driverPath;
    }


}
