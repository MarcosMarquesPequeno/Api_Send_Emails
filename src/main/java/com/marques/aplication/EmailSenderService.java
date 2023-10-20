package com.marques.aplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marques.adapters.EmailSenderGateway;
import com.marques.core.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase{

  private final EmailSenderGateway emailSenderGateway;

  @Autowired
  public EmailSenderService(EmailSenderGateway emailGateway){
    this.emailSenderGateway = emailGateway;
  }

  @Override
  public void sendEmail(String to, String subjet, String body) {
    this.emailSenderGateway.sendEmail(to, subjet, body);
    
  }
  
}
