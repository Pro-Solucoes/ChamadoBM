/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pro.chamado.util;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author ricardo
 */
@ManagedBean
public class Util {

    public void redirecionarIntranet(String pasta, String pagina) {
        FacesContext context = FacesContext.getCurrentInstance();
        String url = context.getExternalContext().getRequestContextPath();
        try {
            context.getExternalContext().redirect(url + "/pages/" + pasta + "/" + pagina + ".xhtml");
        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void redirecionarAdmin(String pagina) {
        FacesContext context = FacesContext.getCurrentInstance();
        String url = context.getExternalContext().getRequestContextPath();
        try {
            context.getExternalContext().redirect(url + "/paginas/admin/" + pagina + ".xhtml");
        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void redirecionarRequerimento(String pagina) {
        FacesContext context = FacesContext.getCurrentInstance();
        String url = context.getExternalContext().getRequestContextPath();
        try {
            context.getExternalContext().redirect(url + "/paginas/requerimento/" + pagina + ".xhtml");
        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void redirecionarLogin() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        String url = context.getExternalContext().getRequestContextPath();
        context.getExternalContext().redirect(url + "/tela.xhtml");
        System.out.println("passou aqui");
    }

    public void redirecionarHome() {
        FacesContext context = FacesContext.getCurrentInstance();
        String url = context.getExternalContext().getRequestContextPath();
        try {
            context.getExternalContext().redirect(url + "/home.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void redirecionarHome2() {
        FacesContext context = FacesContext.getCurrentInstance();
        String url = context.getExternalContext().getRequestContextPath();
        try {
            context.getExternalContext().redirect(url + "/pages/layout/main.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
