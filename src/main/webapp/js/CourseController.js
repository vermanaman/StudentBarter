(function() {
angular.module('keertanSite')
.controller('CourseController', ['$rootScope', '$http', '$location', function($rootScope,  $http, $location) {
		this.instrument = {};
		this.listInstruments={};
		this.listInstructors={};
		this.listSubscriptions={};
		var courseCtrl = this;
		
		$http.get('/getInstruments').success(function(response){
			console.log(response);
			courseCtrl.listInstruments = response;
			courseCtrl.setInstrument(response[0]);
		});
        
		this.saveCourse = function() {
			console.log(courseCtrl.course);
			$http.post('/saveCourse', courseCtrl.course).success(function() {
				console.log("New Course added!");
				$location.path("/");
			});
		}
		
		this.saveStudent = function(){
			console.log($rootScope.user);
			$http.post('/saveStudent', $rootScope.user);
			console.log("New Student added!");
			$location.path("/");
		}
		
		this.addInstructor = function (instructor){
        	subscription={'instructor':instructor, 'instrument':this.instrument};
        	$rootScope.user.subscriptions.push(subscription);
        	console.log("New instructor added!");
			$location.path("/");
		
        };
        
        this.setInstrument = function(instrument){
        	this.instrument = instrument;
        	$http.get('/getInstructors?instrumentId=' + instrument.id).success(function(response){
        		console.log(response);
        		courseCtrl.listInstructors = response;
        	});
        };
        
		this.tab = 1;
        this.isSet = function (tabId) {
        return this.tab === tabId;
        };
	} ]);
})();