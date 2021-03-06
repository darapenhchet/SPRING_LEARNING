<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en" ng-app="StarterApp">
<head>
<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/angular_material/0.9.4/angular-material.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=RobotoDraft:300,400,500,700,400italic">
<meta name="viewport" content="initial-scale=1" />
<style>
.md-toolbar-tools h1 {
	font-size: inherit;
	font-weight: inherit;
	margin: inherit;
}
</style>
</head>
<body layout="column" ng-controller="AppCtrl">
	<md-toolbar layout="row">
	<div class="md-toolbar-tools">
		<md-button ng-click="toggleSidenav('left')" hide-gt-sm
			class="md-icon-button"> <md-icon aria-label="Menu"
			md-svg-icon="https://s3-us-west-2.amazonaws.com/s.cdpn.io/68133/menu.svg"></md-icon>
		</md-button>
		<h1>Spring Security</h1>
	</div>
	</md-toolbar>
	<div layout="row" flex>
		<md-sidenav layout="column" class="md-sidenav-left md-whiteframe-z5"
			md-component-id="left" md-is-locked-open="$mdMedia('gt-sm')">

		</md-sidenav>
		<div layout="column" flex id="content">
			<md-content layout="column" flex class="md-padding">
			<form action="login" method="POST">
			<h2>${error}</h2>
			
			<h1>Sign In</h1>
				<md-input-container> 
					<label>Username</label> 
					<input type="text" name="username"> 
				</md-input-container> 
				<md-input-container>
					<label>Password</label> 
					<input type="password" name="password"> 
				</md-input-container>
				<section layout="row" layout-sm="column" layout-align="center center" layout-wrap>
					<!-- <md-button class="md-raised">Button</md-button> -->
					<md-button class="md-raised md-primary" type="submit">Sign In</md-button>
					<md-button class="md-raised md-primary">Cancel</md-button>
					<!-- 
					<md-button ng-disabled="true" class="md-raised md-primary">Disabled</md-button>
					<md-button class="md-raised md-warn">Warn</md-button>
					<div class="label">Raised</div> -->
				</section>
				</md-content>
			</form>
		</div>
	</div>
	<!-- Angular Material Dependencies -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-animate.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-aria.min.js"></script>

	<script
		src="https://ajax.googleapis.com/ajax/libs/angular_material/0.9.4/angular-material.min.js"></script>
	<script type="text/javascript">
		var app = angular.module('StarterApp', [ 'ngMaterial' ]);

		app.controller('AppCtrl', [ '$scope', '$mdSidenav',
				function($scope, $mdSidenav) {
					$scope.toggleSidenav = function(menuId) {
						$mdSidenav(menuId).toggle();
					};
				} ])
	</script>
</body>
</html>