package com.exercise;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserInfo {
    
    @ManagedProperty(value="#{facePainter}")
    public FacePainter facePainter;
    
    public FacePainter getFacePainter() {
        return facePainter;
    }

    public void setFacePainter(FacePainter facePainter) {
        this.facePainter = facePainter;
    }

    public void backToLandingPage() {
        facePainter.setMainContent("content/01name.xhtml");
    }
    
    public void captureUsername() {
        facePainter.setMainContent("content/02birthday.xhtml");
    }

    public void captureBirthday() {
        facePainter.setMainContent("content/03summary.xhtml");
    }
}
