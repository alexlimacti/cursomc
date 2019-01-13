package com.indeas.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.indeas.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

}
