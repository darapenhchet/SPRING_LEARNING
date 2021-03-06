<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->

<!-- Mirrored from teamfox.co/themes/pleasure/app/admin1/ by HTTrack Website Copier/3.x [XR&CO'2013], Thu, 25 Jun 2015 06:27:49 GMT -->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>PENHCHET CHATTING</title>

<meta name="description"
	content="Pleasure is responsive, material admin dashboard panel">
<meta name="author" content="Teamfox">

<meta name="viewport"
	content="width=device-width, height=device-height, initial-scale=1">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style"
	content="black-translucent">
<meta name="apple-touch-fullscreen" content="yes">
<!-- BEGIN CORE CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assets/admin1/css/admin1.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assets/globals/css/elements.css">
<!-- END CORE CSS -->

<!-- BEGIN PLUGINS CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assets/globals/plugins/rickshaw/rickshaw.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assets/globals/plugins/bxslider/jquery.bxslider.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assets/globals/css/plugins.css">
<!-- END PLUGINS CSS -->

<!-- BEGIN SHORTCUT AND TOUCH ICONS -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/resources/assets/globals/img/icons/favicon.ico">
<link rel="apple-touch-icon"
	href="${pageContext.request.contextPath}/resources/assets/globals/img/icons/apple-touch-icon.png">
<!-- END SHORTCUT AND TOUCH ICONS -->

<script
	src="${pageContext.request.contextPath}/resources/assets/globals/plugins/modernizr/modernizr.min.js"></script>

<script>
	var contextPath = "${pageContext.request.contextPath}";
</script>
</head>
<body>

	<div class="nav-bar-container">

		<!-- BEGIN ICONS -->
		<div class="nav-menu">
			<div class="hamburger">
				<span class="patty"></span> <span class="patty"></span> <span
					class="patty"></span> <span class="patty"></span> <span
					class="patty"></span> <span class="patty"></span>
			</div>
			<!--.hamburger-->
		</div>
		<!--.nav-menu-->

		<div class="nav-search">
			<span class="search"></span>
		</div>
		<!--.nav-search-->

		<div class="nav-user">
			<div class="user">
				<img
					src="${pageContext.request.contextPath}/resources/assets/globals/img/faces/tolga-ergin.jpg"
					alt=""> <span class="badge">3</span>
			</div>
			<!--.user-->
			<div class="cross">
				<span class="line"></span> <span class="line"></span>
			</div>
			<!--.cross-->
		</div>
		<!--.nav-user-->
		<!-- END OF ICONS -->

		<div class="nav-bar-border"></div>
		<!--.nav-bar-border-->

		<!-- BEGIN OVERLAY HELPERS -->
		<div class="overlay">
			<div class="starting-point">
				<span></span>
			</div>
			<!--.starting-point-->
			<div class="logo">PENHCHET</div>
			<!--.logo-->
		</div>
		<!--.overlay-->

		<div class="overlay-secondary"></div>
		<!--.overlay-secondary-->
		<!-- END OF OVERLAY HELPERS -->

	</div>
	<!--.nav-bar-container-->


	<div class="layer-container">

		<!-- BEGIN MENU LAYER -->
		<div class="menu-layer">
			<ul>
				<li data-open-after="true"><a href="index-2.html">Dashboard</a>
				</li>
			</ul>
		</div>
		<!--.menu-layer-->
		<!-- END OF MENU LAYER -->

		<!-- BEGIN USER LAYER -->
		<div class="user-layer">
			<ul class="nav nav-tabs nav-justified" role="tablist">
				<li class="active"><a href="#messages" data-toggle="tab">Messages</a></li>
				<!-- 				<li><a href="#notifications" data-toggle="tab">Notifications <span class="badge">3</span></a></li>
				<li><a href="#settings" data-toggle="tab">Settings</a></li> -->
			</ul>

			<div class="row no-gutters tab-content">

				<div class="tab-pane fade in active" id="messages">
					<div class="col-md-4">
						<div class="message-list-overlay"></div>

						<ul class="list-material message-list">
							<%-- <li class="has-action-left has-action-right"><a href="#"
								class="visible" data-message-id="1">
									<div class="list-action-left">
										<img
											src="${pageContext.request.contextPath}/resources/assets/globals/img/faces/1.jpg"
											class="face-radius" alt="">
									</div>
									<div class="list-content">
										<span class="title">Pari Subramanium</span> <span
											class="caption">Collaboratively administrate empowered
											markets via plug-and-play networks. Dynamically procrastinate
											B2C users after installed base benefits.</span>
									</div>
									<div class="list-action-right">
										<span class="top">15 min</span> <i
											class="ion-android-done bottom"></i>
									</div>
							</a>
							</li> --%>
						</ul>
					</div>
					<!--.col-->
					<div class="col-md-8">
						<div class="message-send-container">

							<div class="messages">
								<%-- <div class="message left">
									<div class="message-text">Hello!</div>
									<img
										src="${pageContext.request.contextPath}/resources/assets/globals/img/faces/1.jpg"
										class="user-picture" alt="">
								</div>
								<div class="message right">
									<div class="message-text">Hi!</div>
									<div class="message-text">Credibly innovate granular
										internal or "organic" sources whereas high standards in
										web-readiness. Energistically scale future-proof core
										competencies vis-a-vis impactful experiences.</div>
									<img
										src="${pageContext.request.contextPath}/resources/assets/globals/img/faces/tolga-ergin.jpg"
										class="user-picture" alt="">
								</div> --%>
							</div>
							<!--.messages-->

							<div class="send-message">
								<div class="input-group">
									<div class="inputer inputer-blue">
										<div class="input-wrapper">
											<textarea rows="1" id="txtMessage"
												class="form-control js-auto-size" placeholder="Message"></textarea>
										</div>
									</div>
									<!--.inputer-->
									<span class="input-group-btn">
										<button id="btnSendMessage" class="btn btn-blue" type="button">Send</button>
									</span>
								</div>
							</div>
							<!--.send-message-->

						</div>
						<!--.message-send-container-->
					</div>
					<!--.col-->

					<div class="mobile-back">
						<div class="mobile-back-button">
							<i class="ion-android-arrow-back"></i>
						</div>
					</div>
					<!--.mobile-back-->
				</div>
				<!--.tab-pane #messages-->
			</div>
			<!--.row-->
		</div>
		<!--.user-layer-->
		<!-- END OF USER LAYER -->

	</div>
	<!--.layer-container-->

	<!-- BEGIN GLOBAL AND THEME VENDORS -->
	<script
		src="${pageContext.request.contextPath}/resources/assets/globals/js/global-vendors.js"></script>
	<!-- END GLOBAL AND THEME VENDORS -->

	<!-- PLEASURE -->
	<script
		src="${pageContext.request.contextPath}/resources/assets/globals/js/pleasure.js"></script>

	<script
		src="${pageContext.request.contextPath}/resources/assets/admin1/js/layout.js"></script>
	<script>
		$(document).ready(function() {
			Pleasure.init();
			Layout.init();
		});
	</script>
	<!-- END INITIALIZATION-->

	<script type="text/javascript">
		$(function() {
			$(".nav-user").trigger("click");
			var wsURI = "ws://" + document.location.host
					+ document.location.pathname + "chat";
			if (!("WebSocket" in window)) {
				console.log("WebSocket is not support on your browser...")
			} else {
				console.log("WebSocket is support on your browser...");
			}
			//var wsURI = "ws://localhost:8080/Ch10_WebSocket/whiteboardendpoint";
			var connection = new WebSocket(wsURI);
			var sendedMessage = "";
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
				console.log("CONNECTED...")
			}

			function onError(event) {
				console.log(event);
			}

			function onMessage(event) {
				console.log(event.data);
				if(sendedMessage==event.data){
					return;
				}
				var message = 
					'<div class="message left">' +
						'<div class="message-text">'+ event.data +'</div>' +
							'<img src="'+contextPath+'/resources/assets/globals/img/faces/1.jpg"' +
								'class="user-picture" alt="">' +
					'</div>';
				$(".messages").append(message);
				$('.messages').scrollTop($('.messages')[0].scrollHeight);
			}
			
			
			function sendMessage(){
				if($("#txtMessage").val()==""){
					return;
				}
				sendedMessage = $("#txtMessage").val();
 				var message = 
					'<div class="message right">' +
						'<div class="message-text">'+$("#txtMessage").val()+'</div>' +
							'<img src="'+contextPath+'/resources/assets/globals/img/faces/tolga-ergin.jpg"' +
								'class="user-picture" alt="">' +
					'</div>';
				$(".messages").append(message); 
				if (connection.readyState != WebSocket.OPEN) {
					return;
				}
				if (connection.bufferedAmount == 0) {
					connection.send($("#txtMessage").val());
				}
				$("#txtMessage").val('');
				$('.messages').scrollTop($('.messages')[0].scrollHeight);
			}
			
			$("#btnSendMessage").click(function(){
				sendMessage();
			});
			
			
			$("#txtMessage").keydown(function(e){
				if(e.keyCode==13){
					sendMessage();
					e.preventDefault();
				}
			});
		});
	</script>
</body>
</html>