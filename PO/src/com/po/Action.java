package com.po;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ARUN MANI on 4/29/2017.
 */
public class Action extends org.apache.struts.action.Action {

    private final static String SUCCESS="success";
    private final static String FAILURE="failure";

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        LoginForm loginForm = (LoginForm) form;
        loginForm.setUserId(request.getParameter("id"));
        loginForm.setPassword(request.getParameter("pass"));
        System.out.print(loginForm.getUserId());
        System.out.print(loginForm.getPassword());
        System.out.print(loginForm.getOriginalUserId());
        System.out.print(loginForm.getOriginalPassword());
        if (loginForm.getUserId().equals(loginForm.getOriginalUserId()) && loginForm.getPassword().equals(loginForm.getOriginalPassword())) {
            return mapping.findForward(SUCCESS);

        } else
            return mapping.findForward(FAILURE);

    }
    }
