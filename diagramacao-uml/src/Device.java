public class Device implements MusicReducer, TelephoneDevice, InternetBrowser {
    @Override
    public void displayPage() {
        System.out.println("Displaying page");
    }

    @Override
    public void addNewTab() {
        System.out.println("Add new tab");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page");
    }

    @Override
    public void play() {
        System.out.println("Playing music");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting music");
    }

    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void answer() {
        System.out.println("Answering call");
    }

    @Override
    public void startMailVoice() {
        System.out.println("Starting voicemail");
    }
}