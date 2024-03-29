import java.util.Hashtable;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.websocket.CloseReason;
import javax.websocket.HandshakeResponse;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.server.ServerEndpointConfig;

/*@ServerEndpoint(
		value = "chat/{sessionId}",
		encoders = ChatMessageCodec.class,
		decoders = ChatMessageCodec.class,
		configurator = ChatEndPoint.EndpointConfigurator.class
		)*/
public class ChatEndPoint {
	
	private static final Map<Long, ChatSession> chatSessions = new Hashtable<Long, ChatSession>();
	private static final Map<Session, ChatSession> sessions = new Hashtable<Session, ChatSession>();
	private static final Map<Session, HttpSession> httpSessions = new Hashtable<Session, HttpSession>();
	private static final Object HTTP_SESSION_PROPERTY = null;
	
	@OnOpen
	public void onOpen(Session session, @PathParam("sessionId") long sessionId){
		HttpSession httpSession = (HttpSession)session.getUserProperties()
				.get(ChatEndPoint.HTTP_SESSION_PROPERTY);
		try{
			if(httpSession==null || httpSession.getAttribute("username")==null){
				session.close(new CloseReason(
						CloseReason.CloseCodes.VIOLATED_POLICY,
						"You are not logged in!"
				));
				return;
			}
			String username = (String)httpSession.getAttribute("username");
		}catch(Exception ex){
			
		}
	}

	public static class EndpointConfigurator
			extends ServerEndpointConfig.Configurator{
		@Override
		public void modifyHandshake(ServerEndpointConfig sec,
				HandshakeRequest request, HandshakeResponse response) {
			
			super.modifyHandshake(sec, request, response);
		}
	}
}
