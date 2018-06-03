/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pro.chamado.controller;

import com.pro.chamado.model.Login;
import com.pro.chamado.util.Util;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author paulo
 */
@ManagedBean
@SessionScoped
public class LoginController {

    Login login = new Login();
    Util util = new Util();

    public LoginController() {
    }

    public String logar() {
        System.out.println("dskdnsjnbdjosndjspd");
             
         return "/pages/noticia/noticia?faces-redirect=true";
 

    }

}
