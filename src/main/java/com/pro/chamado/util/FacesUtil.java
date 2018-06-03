package com.pro.chamado.util;

import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesUtil {

    public static void addMsgInfo(String mensagem, String cabecalho) {

        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, cabecalho);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, facesMessage);
    }

    public static void addMsgError(String mensagem, String cabecalho) {

        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, cabecalho);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, facesMessage);
    }

    public static void addMsgWarn(String mensagem, String cabecalho) {

        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_WARN, mensagem, cabecalho);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, facesMessage);
    }

    public static void addMsgFatal(String cabecalho, String mensagem) {

        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_FATAL, mensagem, cabecalho);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, facesMessage);
    }

    public static void addMsgFatalSQL(Exception mensagem, String cabecalho) {

        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_FATAL, cabecalho, mensagem.toString());
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, facesMessage);
    }

}
