angular.module('keertanSite')
.controller('ProfileController', function($rootScope, $http, $location, $route) {
	var self = this;
	self.user = {};
	this.listSubscriptions={};
	self.controller = function(route) {
		return $route.current && route === $route.current.controller;
	};
	
	self.getUser = function() {
		$http.get('/getUser').success(function(response) {
			console.log(response);
			self.user = response;
		});
	};
	
	self.getUser();
	
    this.controller = 1;

    this.setcontroller = function (controllerId) {
        this.controller = controllerId;
    };

    this.isSet = function (controllerId) {
        return this.controller=== controllerId;
    };
    
    $http.get('/getSubscriptions').success(function(response){
    	console.log(response);
    	self.listSubscriptions = response;
    });
    
});