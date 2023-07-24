/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unique;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 4cseb2
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNumber")
    public int getNumber(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int sum = num1 +num2;
        return sum;
    }

    /**
     * This is a sample web service operation
     */
    
}
