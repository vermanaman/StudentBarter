angular.module('keertanSite')
	.config(function($routeProvider, $httpProvider) {
				$routeProvider.when('/', {
					templateUrl : 'jsp/main.html',
					controller : 'navigation',
					controllerAs : 'controller'
				}).when('/login', {
					templateUrl : 'jsp/login.html',
					controller : 'navigation',
					controllerAs : 'controller'
				}).when('/profile', {
					templateUrl : 'jsp/profile.html',
					controller : 'ProfileController',
					controllerAs : 'controller'
				}).when('/logout', {
					templateUrl : 'jsp/logout.html',
					controller : 'navigation',
					controllerAs : 'controller'
				}).when('/about', {
					templateUrl : 'jsp/about.html',
					controller : 'navigation',
					controllerAs : 'controller'
				}).when('/videos', {
					templateUrl : 'jsp/videos.html',
					controller : 'navigation',
					controllerAs : 'controller'
				}).when('/courses', {
					templateUrl : 'jsp/courses.html',
					controller : 'CourseController',
					controllerAs : 'controller'
				}).when('/contact', {
					templateUrl : 'jsp/contact.html',
					controller : 'navigation',
					controllerAs : 'controller'
				}).when('/register', {
					templateUrl : 'jsp/register.html',
					controller : 'UserController',
					controllerAs : 'controller'
				}).when('/addcourse', {
					templateUrl : 'jsp/addcourse.html',
					controller : 'CourseController',
					controllerAs : 'controller'
				}).otherwise('/');
				$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
			});
		