(function() {
	var app = angular
			.module('keertanSite', [ 'ngRoute']);
	

	angular.module('keertanSite').controller('navigation',function($rootScope, $http, $location, $route, $scope) {
				var self = this;
				self.user = {};
				self.tab = function(route) {
					return $route.current
							&& route === $route.current.controller;
				};
				self.getUser = function() {
					$http.get('/getUser').success(function(response){
						console.log(response);
						$rootScope.user=response;
					});
				};
				
				self.login = function() {
					console.log(self.user);
					$http({
								method : 'POST',
								url : '/login',
								data : $.param({
									username : self.user.username,
									password : self.user.password
								}),
								headers : {
									'Content-Type' : 'application/x-www-form-urlencoded'
								}
							}).success(function() {
								console.log("Login success!");
								$location.path("/");
								$rootScope.authenticated = true;
								self.getUser();
					});
				};
			
				self.logout = function() {
					$http.get('/logout').success(function(response){
						console.log("Logout successful");
						$rootScope.authenticated = false;
						$location.path("/");
					});
				};
				
			
			});
})();