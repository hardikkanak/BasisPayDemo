package com.basispaydemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;
import com.test.pg.secure.pgsdkv4.PGConstants;
import com.test.pg.secure.pgsdkv4.PaymentGatewayPaymentActivity;
import com.test.pg.secure.pgsdkv4.PaymentGatewayPaymentInitializer;
import com.test.pg.secure.pgsdkv4.PaymentParams;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private String TAG = MainActivity.class.getCanonicalName();
    private Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_pay = findViewById(R.id.btn_pay);
        btn_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makePayment();
            }
        });
    }

    private void makePayment() {
        try {
            //Test
            int order_id = r.nextInt(10000 - 1000); //Random number generate for order id

            //Live
            //int order_id = getOrderIdAPI(); //Get order id from your server api

            PaymentParams paymentParams = new PaymentParams();
            paymentParams.setAPiKey("3ENTER YOUR API KEY HERE");
            paymentParams.setOrderId(""+order_id); //Get Order_id from server by API for unique order.
            paymentParams.setMode("TEST"); //TEST or LIVE
            paymentParams.setAmount("2.00");
            paymentParams.setCurrency("INR");
            paymentParams.setDescription("Hello");
            paymentParams.setName("Hardik Sagar");
            paymentParams.setEmail("hardik.sagar@gmail.com");
            paymentParams.setPhone("9876543210");
            paymentParams.setCity("Ahmadabad");
            paymentParams.setState("Gujarat");
            paymentParams.setCountry("India");
            paymentParams.setZipCode("380001");
            paymentParams.setReturnUrl("www.google.com");
            paymentParams.setReturnUrlCancel("www.google.com");
            paymentParams.setReturnUrlFailure("www.google.com");
            paymentParams.setHash("ENTER YOUR HASH KEY HERE");
            PaymentGatewayPaymentInitializer initializer = new PaymentGatewayPaymentInitializer(paymentParams,MainActivity.this);
            initializer.initiatePaymentProcess();
        } catch (Exception e){
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PGConstants.REQUEST_CODE){
            if (data != null && data.getStringExtra(PGConstants.PAYMENT_RESPONSE) != null){
                //Log.e(TAG, "onActivityResult: "+data.getStringExtra(PGConstants.PAYMENT_RESPONSE));
                PaymentResModel paymentResModel = new Gson().fromJson(data.getStringExtra(PGConstants.PAYMENT_RESPONSE),PaymentResModel.class);
                if (paymentResModel.getResponseCode() == 0){
                    handleSuccess(paymentResModel);
                }
                Toast.makeText(this, paymentResModel.getResponseMessage(), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Something went wrong happened. Please try again.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void handleSuccess(PaymentResModel paymentResModel) {

    }
}
