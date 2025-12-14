package com.example.deMau1.controller;

public class checkSo {
    public String checkDiem(int a){
        if (a >= 9){
            return "Xuat sac";
        }else if(a >= 7 || a < 9){
            return "Gioi";
        }else if(a >=5 || a < 7){
            return "Trung binh";
        }else{
            return "Yeu";
        }
    }
}
