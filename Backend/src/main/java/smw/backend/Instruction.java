/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smw.backend;

import java.io.File;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * REST Web Service to communicate with the frontend
 * @author giesler
 */
@Path("instructions")
public class Instruction {
    
    @Context
    private UriInfo context;

    
    public Instruction() {
    }

    /**
     * PUT Method to handle incoming Messages from the Frontend
     * @param Step
     * @throws org.eclipse.paho.client.mqttv3.MqttException
     */
    @PUT
    public void putHtml(String Step) throws MqttException{
        Publisher.publish("Aloha", "/smw/backend/40:A3:CC:98:91:17/pir/" );
    }
    

            
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public String getJSON(){
       BuildJSON json_file = new BuildJSON();
       String json_string = json_file.initJSON();
       
       return json_string;
   }
}
