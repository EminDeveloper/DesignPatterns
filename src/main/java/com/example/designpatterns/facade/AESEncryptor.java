package com.example.designpatterns.facade;


class AESEncryptor {

    public void encrypt(String text) {
        System.out.println("<AES>" + text + "</AES>");
    }

}