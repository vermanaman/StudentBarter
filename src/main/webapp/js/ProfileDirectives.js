(function(){
	
	angular.module('keertanSite').directive('personalInformation', function(){
		return {
			restrict: 'E',
			templateUrl: 'jsp/personalInformation.html'
		};
	});
	
	angular.module('keertanSite').directive('subscribedCourses', function(){
		return {
			restrict: 'E',
			templateUrl: 'jsp/subscribedCourses.html'
		};
	});
	
	angular.module('keertanSite').directive('instructorInstruments', function(){
		return {
			restrict: 'E',
			templateUrl: 'jsp/instructorInstruments.html'
		};
	});
})();