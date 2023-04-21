public class Main {
   public static void main(String[] argv) {
        Handler emailHandler = new SpamHandler (new FanHandler (new ComplaintHandler(new NewLocHandler(null))));
        Email eSpam = new Email(EmailType.Spam, "Dear Dir, I'm a Nigerian prince in need to transfer large sums of money of the country. All I need your bank account number ...");
        emailHandler.HandleRequest(eSpam);

        Email eFan = new Email(EmailType.Fan, "I love your gumball machiness! Please stock them with more bubble-gum flavors :-)");
        emailHandler.HandleRequest(eFan);
        
        Email eComplaint = new Email(EmailType.Complaint, "I swear, if I get one more black licorice flavored gumball, I'm going to bresk your machines!");
        emailHandler.HandleRequest(eComplaint);

        Email eOther = new Email(EmailType.Unclassified, "We world love to have one of your machines installed in our dentist waiting room ... ");
        emailHandler.HandleRequest(eOther);

    }
}