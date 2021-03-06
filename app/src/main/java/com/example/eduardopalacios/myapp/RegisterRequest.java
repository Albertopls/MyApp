package com.example.eduardopalacios.myapp;


import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL ="https://bitchiest-core.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String first_name, String last_name, String email, String password,Response.Listener<String>listener)
    {
        super(Method.POST,REGISTER_REQUEST_URL,listener,null);
        params=new HashMap<>();
        params.put("first_name", first_name);
        params.put("last_name", last_name);
        params.put("email", email);
        params.put("password", password);


    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
