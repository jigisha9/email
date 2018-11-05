## email
Email common methods for follwing use cases:

** Email folder
** Get number of messages for folder
** Get number of unread messages for folder
** Get message by index
** Get latest message
** Get all message
** Read message
** Extract content of email message
** Read message by Subject
** Get URLs from message
** Get authorization code


### Pre-requisite to run tests:

-- Clone git project
-- Open EmailTests.java class file and change below:

EmailTests-> testVerificationCode -> change emailID and password before kick off test.

emailUtils = new EmailUtils("<emailID>, "<password>", "smtp.gmail.com", EmailUtils.EmailFolder.INBOX);

