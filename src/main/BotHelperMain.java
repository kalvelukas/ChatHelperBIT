package main;

// BOT ID Y2lzY29zcGFyazovL3VzL0FQUExJQ0FUSU9OLzFjNjUxYWI5LTk1NWMtNDQ4Yi1hYjdkLTlkM2U3NDZjNzQzMg
public class BotHelperMain {
    BotHelperSetup botSetup;
    private static final String TOKEN =
            "ZTlhNjk0OGYtNTBiNC00YmYwLTg3MTctZTI0MzVkOTE4ODFmMD" +
                    "cxMDJlM2QtMmU1_PE93_6595ae1f-5870-4ebd-9da2-63c3bcba3aa6";

    public BotHelperMain(String token) {
        botSetup = new BotHelperSetup(token);
    }

    private void run() {
        botSetup.run();
    }

    public static void main(String[] args) {
        BotHelperMain botMain = new BotHelperMain(TOKEN);

        botMain.run();
    }

}
