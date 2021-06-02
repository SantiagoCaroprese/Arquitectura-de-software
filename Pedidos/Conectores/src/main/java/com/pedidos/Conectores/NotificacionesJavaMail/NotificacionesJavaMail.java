package com.pedidos.Conectores.NotificacionesJavaMail;

import com.pedidos.Conectores.Notificaciones.IServicioNotificaciones;

import javax.ejb.Stateless;


import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

@Stateless
public class NotificacionesJavaMail implements IServicioNotificaciones {
    @Override
    public void enviarCorreo(String email, String asunto, String mensaje) {

            Properties prop = new Properties();
            prop.put("mail.smtp.auth", true);
            prop.put("mail.smtp.starttls.enable", "true");
            prop.put("mail.smtp.host", "smtp.mailtrap.io");
            prop.put("mail.smtp.port", "2525");
            prop.put("mail.smtp.ssl.trust", "smtp.mailtrap.io");

            String username = "2d8c7309613d79";
            String password = "73508b4a642e36";
            Session session = Session.getInstance(prop, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            javax.mail.Message message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress("noreply@example.com"));
            message.setRecipients(
                    javax.mail.Message.RecipientType.TO, InternetAddress.parse(email));
            message.setSubject(asunto);

            //String msg = "Este mensaje se envia para notificar que se inicio sesion en el sistema.";

            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(mensaje, "text/html");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);

            message.setContent(multipart);

            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }
}
