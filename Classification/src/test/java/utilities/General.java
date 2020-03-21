package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

public class General {
	public static HashMap<String, String> readJSONFileForAttachmentIdsandSessionIds(String fileName) throws Exception {

		String sessionIdJson = null;
		sessionIdJson = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/" + fileName)));
		JSONArray sessionIds = new JSONArray(sessionIdJson);

		Case case1 = new Case();
		System.out.println("Text" + sessionIds);
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < sessionIds.length(); i++) {
			String sessionId = sessionIds.getJSONObject(i).getString("id");
			System.out.println("SessionId" + sessionId);
			String attachmentsData = case1.getAttachmentForSessionId(sessionId);
			System.out.println("data : :   " + attachmentsData);
			JSONArray attachments = new JSONArray(attachmentsData);
			for (int j = 0; j < attachments.length(); j++) {
				String attachmentId = attachments.getJSONObject(j).getString("id");
				System.out.println(sessionId + "," + attachmentId);
				map.put(sessionId, attachmentId);
			}

			JSONObject jsonObject = new JSONObject(attachmentsData);
			System.out.println("sessionId" + sessionId + "::" + jsonObject.get("id"));

		}

		return map;
	}

	public static HashMap<String, String> readJSONFileforAttachmentIdsInPrecase(String sessionId) throws Exception {

		Case case1 = new Case();
		HashMap<String, String> map = new HashMap<String, String>();

		String attachmentsData = case1.getAttachmentForSessionId(sessionId);
		JSONArray attachments = new JSONArray(attachmentsData);
		for (int j = 0; j < attachments.length(); j++) {
			String attachmentId = attachments.getJSONObject(j).getString("id");
			System.out.println(sessionId + "," + attachmentId);
			map.put(sessionId, attachmentId);
		}

		return map;
	}

	public static HashMap<String, String> readJSONObjectforAttachmentIdsInProdigy(String caseId) throws Exception {

		Case case1 = new Case();
		HashMap<String, String> map = new HashMap<String, String>();

		String attachmentsData = case1.getAttachmentForCaseId(caseId);
		System.out.println("parsed" + attachmentsData);
		JSONArray attachments = new JSONArray(attachmentsData);
		for (int j = 0; j < attachments.length(); j++) {
			String attachmentId = attachments.getJSONObject(j).getString("uuid");
			System.out.println(caseId + "," + attachmentId);
			map.put(caseId, attachmentId);
		}

		return map;
	}

	                                                   
	public static JSONArray parseJSONResponseIntoArray(String fileName) throws Exception {

		String jsonContent = null;
		jsonContent = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/" + fileName)));
		JSONArray jsonArray = new JSONArray(jsonContent);
		return jsonArray;
	}

	public static JSONObject parseJSONResponseIntoObject(String fileName) throws Exception {

		String jsonContent = null;
		jsonContent = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/" + fileName)));
		JSONObject jsonObject = new JSONObject(jsonContent);
		return jsonObject;
	}

	public static void downloadFile(URL url, String outputFileName) throws IOException {
		try (InputStream in = url.openStream();
				ReadableByteChannel rbc = Channels.newChannel(in);
				FileOutputStream fos = new FileOutputStream(outputFileName)) {
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		}
	}

	
}
