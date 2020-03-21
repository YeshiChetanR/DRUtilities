package utilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;
import java.util.jar.JarException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.json.JSONString;



public class Case {
	
	//public String baseURL = Env.getEnv()+"/rs/cases/";
	   
	   public String createNewForUser(String username,  String baseURL) throws JarException,InterruptedException {
		   String caseNumber="";
		   RestAssured.useRelaxedHTTPSValidation();
		   String myJson = "{\"product\":\"Red Hat Enterprise Linux\","
		   		+ "\"version\":\"7.1\",\"summary\":\"test\",\"description\":\"test\","
		   		+ "\"severity\":\"4 (Low)\",\"type\":\"Account / Customer Service Request\","
		   		+ "\"contactSsoUsername\":\""+username+"\",\"entitlement\":{\"sla\":\"PREMIUM\"}}";
		   Response res  =given ().
				     contentType("application/json").
				     auth().basic(username,"redhat").
				     body(myJson)
				    .when()
				    .post (baseURL+"/rs/cases/")
				    .then()
				    //.contentType(ContentType.JSON)
				    .extract().response();

		   String mydata = res.asString ();
		   Pattern pattern = Pattern.compile("cases/(.*?)</location");
		   Matcher matcher = pattern.matcher(mydata);
		   if (matcher.find())
		   {
			   caseNumber = matcher.group(1);
			   return caseNumber;
		   }
		   else{	    
			   return res.asString ();
				    
		   }
	   }
	   
	   public String createNewForUser(String username,  String baseURL, JSONObject testJsonObject) throws JarException,InterruptedException, JSONException {
		   String caseNumber="";
		   RestAssured.useRelaxedHTTPSValidation();
		   
		   System.out.println("Json Object String" + testJsonObject.getString("summary"));
		   
		   String myJson = "{\"product\":\""+testJsonObject.getString("product")+"\","
			   		+ "\"version\":\""+testJsonObject.getString("version")+"\",\"summary\":\""+testJsonObject.getString("summary")+"\",\"description\":\""+testJsonObject.getString("description")+"\","
			   		+ "\"severity\":\"4 (Low)\",\"type\":\"Account / Customer Service Request\","
			   		+ "\"contactSsoUsername\":\""+username+"\",\"entitlement\":{\"sla\":\"PREMIUM\"}}";
			 
		   Response res  =given ().
				     contentType("application/json").
				     auth().basic(username,"redhat").
				     body(myJson)
				    .when()
				    .post (baseURL+"/rs/cases/")
				    .then()
				    //.contentType(ContentType.JSON)
				    .extract().response();

		   String mydata = res.asString ();
		   Pattern pattern = Pattern.compile("cases/(.*?)</location");
		   Matcher matcher = pattern.matcher(mydata);
		   if (matcher.find())
		   {
			   caseNumber = matcher.group(1);
			   return caseNumber;
		   }
		   else{	    
			   return res.asString ();
				    
		   }
	   }
	   
	   
	   public String createNewFTSForUser(String username, String baseURL) throws JarException,InterruptedException {
		   String caseNumber="";
		   RestAssured.useRelaxedHTTPSValidation();
		   String myJson = "{\"product\":\"Red Hat Satellite or Proxy\",\"version\":\"6.2\",\"summary\":\"test\",\"description\":\"test\","
		   		+ "\"fts\":\"true\",\"severity\":\"4 (Low)\",\"type\":\"Account / Customer Service Request\",\"contactSsoUsername\":\""+username+"\",\"entitlement\":{\"sla\":\"PREMIUM\"}}";
		   Response res  =given ().
				     contentType("application/json").
				     auth().basic(username,"redhat").
				     body(myJson)
				    .when()
				    .post (baseURL+"/rs/cases/")
				    .then()
				    //.contentType(ContentType.JSON)
				    .extract().response();

		   String mydata = res.asString ();
		   Pattern pattern = Pattern.compile("cases/(.*?)</location");
		   Matcher matcher = pattern.matcher(mydata);
		   if (matcher.find())
		   {
			   caseNumber = matcher.group(1);
			   return caseNumber;
		   }
		   else{	    
			   return res.asString ();
				    
		   }
	   }
	   
	   public String addCommentToCase(String caseNumber, String username, String baseURL) throws JarException, InterruptedException {
		   String commentId="";
		   RestAssured.useRelaxedHTTPSValidation();
		   String myJson = "{\"text\":\"This is Public Comment by external user\",\"public\":\"true\"}";
		   Response res = given().
				   contentType("application/json").
				   auth().basic(username, "redhat").
				   body(myJson)
				   .when()
				   .post(baseURL+"/rs/cases/"+caseNumber+"/comments")
				   .then()
				   .extract().response();
		   String mydata = res.asString();
		   Pattern pattern = Pattern.compile("comments/(.*?)</location");
		   Matcher matcher = pattern.matcher(mydata);
		   if (matcher.find())
		   {
			   commentId = matcher.group(1);
			   return commentId;
		   }
		   else
			   return res.asString();
	   }
	   
	   public String healthCheck() throws JarException,InterruptedException {
		   String username = "rhn-support-dkoul";
		   RestAssured.useRelaxedHTTPSValidation();
		   String myJson = "{\"product\":\"Red Hat Satellite or Proxy\",\"version\":\"6.2\",\"summary\":\"test\",\"description\":\"test\",\"severity\":\"4 (Low)\",\"type\":\"Account / Customer Service Request\",\"contactSsoUsername\":\""+username+"\",\"entitlement\":{\"sla\":\"PREMIUM\"}}";
		   Response res  =given ().
				     contentType("application/json").
				     auth().basic(username,"redhat").
				     body(myJson)
				    .when()
				    .post ("https://api.access.qa.redhat.com/rs/cases/")
				    .then()
				    .extract().response();
		   int statusCode = res.getStatusCode();
		   String responseCode = Integer.toString(statusCode);
		   return responseCode;
	   } 
		 
	   public String getAttachmentForSessionId(String sessionId) throws JarException,InterruptedException {
		   String username = "brian.macleod@oit.gatech.edu";
		   RestAssured.useRelaxedHTTPSValidation();
		   Response res  =given ().
				     contentType("application/json").
				     auth().basic(username,"redhat")
				    .when()
				    .get ("https://hydra-se-qa.ext.us-east.aws.preprod.paas.redhat.com/hydra/rest/se/sessions/"
				    		+sessionId+ "/attachments/metadata")
				    .then()
				    .extract().response();
		   ResponseBody responseBody = res.getBody();
		   String body = responseBody.asString();
		   return body;
	   } 
	   
		 
	   public String getAttachmentForCaseId(String caseId) throws JarException,InterruptedException {
		   String username = "brian.macleod@oit.gatech.edu";
		   RestAssured.useRelaxedHTTPSValidation();
		   Response res  =given ().
				     contentType("application/json").
				     auth().basic("najain@redhat.com","redhat")
				    .when()
				    .get ("https://access.qa.redhat.com/hydra/rest/cases/"+caseId+"/attachments/")
				    .then()
				    .extract().response();
		   ResponseBody responseBody = res.getBody();
		   String body = responseBody.asString();
		   return body;
	   }
	   
	   public String deleteAttachmentForSessionId(String sessionId) throws JarException,InterruptedException {
		   String username = "rhn-support-dkoul";
		   RestAssured.useRelaxedHTTPSValidation();
		   Response res  =given ().
				     contentType("application/json").
				     auth().basic(username,"redhat")
				    .when()
				    .get ("https://hydra-se-qa.ext.us-east.aws.preprod.paas.redhat.com/hydra/rest/se/sessions/"
				    		+sessionId+ "/attachments/metadata")
				    .then()
				    .extract().response();
		   ResponseBody responseBody = res.getBody();
		   String body = responseBody.asString();
		   return body;
	   } 
	   
	  /* public String downloadAttachmentForCaseId(String caseId, String attachmentId) throws JarException,InterruptedException {
		   String username = "rhn-support-cyeshi";
		   RestAssured.useRelaxedHTTPSValidation();
		   Response res  =given ().
				     contentType("application/json").
				     auth().basic(username,"Bahar@123")
				    .when()
				    .get ("https://access.redhat.com/hydra/rest/cases/"
				    		+caseId+ "/attachments/"+attachmentId)
				    .then()
				    .extract().response();
		   ResponseBody responseBody = res.getBody();
		   String body = responseBody.asString();
		   return body;
	   } */
	   
   }
