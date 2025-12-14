package com.example.deMau1.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkSoTest {
    private checkSo checkSo;
    @BeforeEach
    public void setUp(){
        checkSo = new checkSo();
    }
    @Test
    public void kiemTraBienMax(){
        String mongMuon = checkSo.checkDiem(9);
        String thucTe = ("Xuat sac");
        assertEquals(mongMuon, thucTe);
    }
}