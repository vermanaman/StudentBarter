angular.module('keertanSite').controller('UserController', ['$rootScope', '$http', '$filter', '$location', function($rootScope, $http, $filter, $location) {
		this.user = {};
		var userCtrl = this;

		$http.get('/getInstruments').success(function(response){
			console.log(response);
			userCtrl.listCourses = response;
		});
		
		this.saveUser = function() {
			console.log(this.user);
			if(userCtrl.user.userType=='Student'){
				$http.post('/saveStudent', userCtrl.user).success(function(response) {
					console.log("Student saved");
					$location.path("/");
				});
			}else if(userCtrl.user.userType=='Instructor'){
				$http.post('/saveInstructor', userCtrl.user).success(function(response) {
					console.log("Instructor saved");
					$location.path("/");
				});
			}else{
				console.log("Invalid UserType");
			}
		}
		
		this.addInstrument = function(course) {
			console.log(course);
			if(userCtrl.user.instruments==null){
				userCtrl.user.instruments=[];
			}
			userCtrl.user.instruments.push(course);
		}
		
		 this.selectedInstruments = function () {
		        userCtrl.user.instruments = $filter('filter')(userCtrl.listCourses, {checked: true});
		}
		
	} ]);