/**
 * 
 */
package com.FCI.SWE.RestRes;


import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.*;
/*
 * This class will be called when url like http://localhost:8080/WebService/rest/calculator/5/5 is requested
 */
@Path("/calculator/{number1}/{number2}")
public class Calculator {

  // This method is called if TEXT_PLAIN is request and will use two GET parameters
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getResults(@PathParam("number1") String number1, @PathParam("number2") String number2) {
    JSONObject object = new JSONObject();
    object.put("add", Integer.parseInt(number2)+Integer.parseInt(number1));
    object.put("subtract", Integer.parseInt(number2)-Integer.parseInt(number1));
    object.put("divide", Integer.parseInt(number2)/Integer.parseInt(number1));
    object.put("multiply", Integer.parseInt(number2)*Integer.parseInt(number1));
    return object.toJSONString();
  }

  
}
