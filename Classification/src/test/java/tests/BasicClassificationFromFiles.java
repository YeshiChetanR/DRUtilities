package tests;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jettison.json.JSONArray;
import org.testng.annotations.Test;

import utilities.Case;
import utilities.Env;
import utilities.General;

public class BasicClassificationFromFiles extends BaseTest {

	public String baseURL = Env.getEnv();
	Case caseNumber = new Case();
	public String ascensionPath = "/support/cases/internal/beta/case/";
	// public String ascensionPath = "/support/cases/internal/case/";
	
	
	/* as
	 * To Generate Multiple Cases in a go. Multiple cases with different set of
	 * values can be created to Verify the SBR Classification
	 */
	@Test
	public void multipleCasesForSBRClassification() throws Exception {
		JSONArray arr = General.parseJSONResponseIntoArray("TestDataForRule.json");
		for (int i = 0; i < arr.length(); i++) {
			String ncqCase = caseNumber.createNewForUser("devops-15", baseURL, arr.getJSONObject(i));
			System.out.println("Case for rule, " + arr.getJSONObject(i).getString("rule") + " is : " + ncqCase);
		}
	}
	
	@Test
	public void getAttachmentIdsForCaseNumber() throws Exception {
		Map<String ,String>  map= General.readJSONObjectforAttachmentIdsInProdigy(prop.getProperty("testCase"));		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("[Case] : " + entry.getKey() + " [AttachmentId] : " + entry.getValue());
		}
	}

	@Test
	public void getAttachmentIdsForSessionId() throws Exception {
		Map<String ,String>  map= General.readJSONFileforAttachmentIdsInPrecase(prop.getProperty("testSessionId"));		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("[Case] : " + entry.getKey() + " [AttachmentId] : " + entry.getValue());
		}
	}
	
	@Test
	public void getAttachmentIdsForMultipleSessionId() throws Exception {
		Map<String ,String>  map= General.readJSONFileForAttachmentIdsandSessionIds("PreCaseAttachments.json");		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("[Case] : " + entry.getKey() + " [AttachmentId] : " + entry.getValue());
		}
	}
	public static void main(String[] args) throws Exception {
		BasicClassificationFromFiles discussionTabTests = new BasicClassificationFromFiles();
		HashMap<String, String> map = new HashMap<String, String>();
		JSONArray attachments = General.parseJSONResponseIntoArray("caseAttachment.json");
		for (int j = 0; j < attachments.length(); j++) {
			String attachmentId = attachments.getJSONObject(j).getString("uuid");
			System.out.println(attachmentId);
			map.put("02438183", attachmentId);
		}
	}

	/*
	 * public void downloadFiles() throws IOException, JSONException,
	 * InterruptedException { String sessionIdJson = ""; sessionIdJson = new
	 * String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") +
	 * "/DownloadAttachments.json"))); JSONArray sessionIds= new
	 * JSONArray(sessionIdJson); System.out.println(sessionIds);
	 * 
	 * 
	 * 
	 * Case case1=new Case();
	 * System.out.println(case1.downloadAttachmentForCaseId("02412189",
	 * "7fe2442c-8dbd-4b01-9f55-7a180fd5492d")); for (int i = 0; i <
	 * sessionIds.length(); i++) {
	 * case1.downloadAttachmentForCaseId(sessionIds.getJSONObject(i).getString(
	 * "caseId"), sessionIds.getJSONObject(i).getString("attachmentId")); }
	 * 
	 * 
	 * }
	 */
	/*
	 * public void readIds() throws Exception{ JSONArray arr= readJSONFile(); for
	 * (int i = 0; i < arr.length(); i++) { //String ncqCase=
	 * caseNumber.createNewForUser("brian.macleod@oit.gatech.edu",baseURL,
	 * arr.getJSONObject(i));
	 * System.out.println(arr.getJSONObject(i).getString("id")); } }
	 */

}
