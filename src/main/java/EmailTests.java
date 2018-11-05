//import EmailUtils;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.mail.Message;

import static org.testng.AssertJUnit.assertTrue;

public class EmailTests {


    private static EmailUtils emailUtils;


    @Test
    public void testVerificationCode() {
        try {


                emailUtils = new EmailUtils("cms.chit.test@gmail.com", "Temp4now", "smtp.gmail.com", EmailUtils.EmailFolder.INBOX);

            //TODO: Execute actions to send verification code to email
        //    Message mesg = emailUtils.getMessageByIndex(1);
        //    System.out.println("message subject for index 1 is:" +mesg.getSubject());

        //    Message mesg1 = emailUtils.getLatestMessage();
        //    System.out.println("message1 subject for index 1 is:" +mesg1.getSubject());

           String verificationCode = emailUtils.getAuthorizationCode();
            System.out.println("Verification code:" + verificationCode );
            //TODO: Enter verification code on screen and submit

            //TODO: add assertions

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

//    @Test
    public void testTextContained() {
        try{
            Message email = emailUtils.getMessagesBySubject("Loan Approval", true, 5)[0];
            assertTrue("Approval message is not in email", emailUtils.isTextInMessage(email, "You have been approved"));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

 //   @Test
    public void testLink() {

        //TODO: apply for a loan using criteria that will result in the application being rejected

        try{
            Message email = emailUtils.getMessagesBySubject("Decision on Your Loan Application", true, 5)[0];
            String link = emailUtils.getUrlsFromMessage(email, "Click here to view the reason").get(0);

        //    driver.get(link);

            //TODO: continue testing
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

}
