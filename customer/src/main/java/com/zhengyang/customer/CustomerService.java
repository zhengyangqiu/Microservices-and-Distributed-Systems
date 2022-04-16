package com.zhengyang.customer;

public record CustomerService() {

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //check if email valid
        //check if email not taken
        //store customer in db
    }
}
