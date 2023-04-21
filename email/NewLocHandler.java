public class NewLocHandler extends Handler {
    public NewLocHandler (Handler successor) {
        super(successor);
    }
    
    public void HandleRequest(Email email) {
        if (email.Type == EmailType.Unclassified) {
            System.out.println("New Location Handler is handling the following message ...");
            System.out.println("Sending to business development ...");
            System.out.println(email.Message);
            System.out.println();
        } else if(_successor !=null) {
            _successor.HandleRequest(email);
        }
    }
}