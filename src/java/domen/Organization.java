/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import com.google.gson.JsonObject;
import thewebsemantic.Namespace;
import thewebsemantic.RdfProperty;
import thewebsemantic.RdfType;
import util.Constants;

/**
 *
 * @author ANA
 */
@Namespace(Constants.SCHEMA)
@RdfType("Organization")
public class Organization extends Thing {
 

  public JsonObject returnAsJson(){
		JsonObject jsonOrganization = new JsonObject();
		
		jsonOrganization.addProperty("name", getName());
		
		return jsonOrganization;
	}
}
