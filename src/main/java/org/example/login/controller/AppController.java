package org.example.login.controller;

import org.example.login.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {
    @Autowired
    OrderService orderService;

    @Autowired
    ClientService clientService;

    @Autowired
    StateService stateService;

    @Autowired
    PaymentService paymentService;

    @Autowired
    ShortShceduleService shortShceduleService;


}
