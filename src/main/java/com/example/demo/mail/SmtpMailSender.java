
package com.example.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SmtpMailSender implements MailSender {

    private static Log log = LogFactory.getLog(SmtpMailSender.class);

    @Override
    public void send(String to, String subject, String body) {

        log.info("sending SMTP message to " + to);
        log.info("with subject" + subject);
        log.info("and message body" + body);

    }

}
