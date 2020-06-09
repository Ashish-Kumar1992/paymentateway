package com.cap.payment.service;

import com.cap.payment.model.PaymentCallback;
import com.cap.payment.model.PaymentDetail;

public interface PaymentService {

	String payuCallback(PaymentCallback paymentResponse);

	PaymentDetail proceedPayment(PaymentDetail paymentDetail);

}
