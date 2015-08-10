<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="author" content="PENHCHET" />
<meta name="copyright" content="&copy;2015" />
<title>WEBSOCKET HOME</title>
</head>
<body>
	<h1>WEBSOCKET HOME</h1>
	<h1>Collaborative Whiteboard App</h1>

	<div id="output"></div>

	<script type="text/javascript">
		var wsURI = "ws://" + document.location.host
				+ document.location.pathname + "whiteboardendpoint";
		if (!("WebSocket" in window)) {
			alert("WEB SOCKET ARE NOT IN WINDOWS...")
		} else {
			alert("WEB SOCKET ARE IN WINDOWS...")
		}
		//var wsURI = "ws://localhost:8080/Ch10_WebSocket/whiteboardendpoint";
		var connection = new WebSocket(wsURI);
		connection.binaryType = 'arraybuffer';

		connection.onopen = function(event) {
			onOpen(event);
		}

		connection.onerror = function(event) {
			onError(event);

		}

		connection.onmessage = function(event) {
			onMessage(event);
		}

		function onOpen(event) {
			console.log(event);
			document.getElementById("output").innerHTML += "Connected to "
					+ wsURI + "<br>";
			if (connection.readyState != WebSocket.OPEN) {
				return;
			}
			if (connection.bufferedAmount == 0){
				connection.send("HELLO WORLD");
			}
		}

		function onError(event) {
			console.log(event);
			var message = '<span style="color: red;">ERROR:</span> '
					+ event.data;
			document.getElementById("output").innerHTML += message + "<br>";
		}

		function onMessage(event) {
			console.log(event.data);
		}
	</script>
</body>
</html>