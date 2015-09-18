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
.md-sidenav-left{
	weight: 100%;
}
</style>
</head>
<body layout="column" ng-controller="AppCtrl" style="overflow-y:hidden;">
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
					<md-button ng-click="showSimpleToast()">
					    Open a Toast!
					</md-button>
					<input ng-model="search">
			    	<md-subheader class="md-no-sticky"><h1>Articles</h1></md-subheader>
			      	<md-list-item class="md-3-line" ng-repeat="article in articles | filter:search | orderBy:'title'">
				        <div class="md-list-item-text">
				          <h2>{{ article.id }}</h3>
				          <h3>{{ article.title }}</h4>
				          <p ng-bind-html="article.introtext"></p>
				          <p>{{ article.created }}</p>
				        </div>
			      	</md-list-item>
			      </md-list>
			      <ul>
					<li ng-repeat="user in users">
						<p>{{ user.id + '. ' + user.name }}</p>
					</li>
				</ul>
				

				
			</md-content>
								  <md-button class="md-primary md-fab md-fab-bottom-right">
		        FAB
		      </md-button>
		      <md-button class="md-accent md-fab md-fab-top-right">
		        FAB
		      </md-button>
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
		var app = angular.module('StarterApp', [ 'ngMaterial', 'ngSanitize', 'ngAnimate']);
		
/* 		app.config(function($mdIconProvider) {
			$mdIconProvider
				.iconSet('communication', 'img/icons/sets/communication-icons.svg', 24);
		}) 
*/

		app.controller('AppCtrl', [ '$scope', '$http', '$mdSidenav',
			function($scope, $http, $mdSidenav, $mdToast) {
				$scope.toggleSidenav = function(menuId) {
					$mdSidenav(menuId).toggle();
				};
				  var config = {
						headers: {
			            'X-API-KEY': '2a1814171e4c995cbc1a7950a67d3db45b4fd139'
			       		}
			    };
				//$http.defaults.headers.post["X-API-KEY"]="2a1814171e4c995cbc1a7950a67d3db45b4fd139" ;
				$http.post("https://schedule-darapenhchet-1.c9.io/index.php/article", {
					  headers: {
						    'X-API-KEY': '2a1814171e4c995cbc1a7950a67d3db45b4fd139' //you've got access to a request config object to specify header value dynamically
						    }
					  }
				)
					.success(function(response){
						$scope.articles = response.RESP_DATA.ARTICLES;
					});
				
				/* $http.post("https://schedule-darapenhchet-1.c9.io/index.php/api/users")
				.success(function(response){
					$scope.users = response.RESP_DATA.USERS;
				}); */
				
					  $scope.showSimpleToast = function() {
					    $mdToast.show(
					      $mdToast.simple()
					        .content('Simple Toast!')
					        .position($scope.getToastPosition())
					        .hideDelay(3000)
					    );
					  };
			},
		]);
		
		
		
	</script>
</body>
</html>