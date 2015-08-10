import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value="/whiteboardendpoint")
public class MyWhiteboard {
	private static Set<Session> peers = Collections.synchronizedSet(new HashSet<Session>());
	
	@OnMessage
	public String onMessage(String message){
		String messages = "I AM WEB SOCKET";
		System.out.println(message);
		System.out.println(messages);
		return messages;
	}
	
	@OnOpen
	public void onOpen(Session peer){
		peers.add(peer);
	}
	
	@OnClose
	public void onClose(Session peer){
		peers.remove(peer);
	}
	
}
