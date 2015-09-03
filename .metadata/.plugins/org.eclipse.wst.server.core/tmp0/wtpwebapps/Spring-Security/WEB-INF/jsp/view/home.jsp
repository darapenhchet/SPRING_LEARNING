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
		<h1>Spring Security-- HOME PAGE</h1>
	</div>
	</md-toolbar>
	<div layout="row" flex>
		<md-sidenav layout="column" class="md-sidenav-left md-whiteframe-z5"
			md-component-id="left" md-is-locked-open="$mdMedia('gt-sm')">
		</md-sidenav>
		<div layout="column" flex id="content">
			<md-content layout="column" flex class="md-padding">
				<md-list>
			    	<md-subheader class="md-no-sticky"><h1>Articles</h1></md-subheader>
			      	<md-list-item class="md-3-line" ng-repeat="article in articles">
				        <div class="md-list-item-text">
				          <h2>{{ article.id }}</h3>
				          <h3>{{ article.title }}</h4>
				          <p ng-bind-html="article.introtext"></p>
				          <p>{{ article.created }}</p>
				        </div>
			      	</md-list-item>
			      </md-list>
			</md-content>
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
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular-sanitize.min.js"></script>
		
	<script
		src="https://ajax.googleapis.com/ajax/libs/angular_material/0.9.4/angular-material.min.js"></script>
	<script type="text/javascript">
		var app = angular.module('StarterApp', [ 'ngMaterial', 'ngSanitize']);
		
/* 		app.config(function($mdIconProvider) {
			$mdIconProvider
				.iconSet('communication', 'img/icons/sets/communication-icons.svg', 24);
		}) 
*/

		app.controller('AppCtrl', [ '$scope', '$http', '$mdSidenav',
			function($scope, $http, $mdSidenav) {
				$scope.toggleSidenav = function(menuId) {
					$mdSidenav(menuId).toggle();
				};
				$http.get("https://schedule-darapenhchet-1.c9.io/index.php/article")
					.success(function(response){
						$scope.articles = response.RESP_DATA.ARTICLES;
					});
			},
			
		]);
		
	</script>
</body>
</html>