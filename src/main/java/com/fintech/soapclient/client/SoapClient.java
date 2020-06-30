package com.fintech.soapclient.client;

import com.fintech.soapclient.bindings.GetAllEmployeesRequest;
import com.fintech.soapclient.bindings.GetAllEmployeesResponse;
import com.fintech.soapclient.config.SOAPConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoapClient {
    private final static String BASE_URL = "http://localhost:8888/SpringSoapWS";

    @Autowired
    SOAPConnector soapConnector;

    public GetAllEmployeesResponse getAllEmployees() {

        return (GetAllEmployeesResponse) soapConnector.callWebService(BASE_URL, new GetAllEmployeesRequest());
    }
}
