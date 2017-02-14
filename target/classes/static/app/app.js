'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute',
  'ngMaterial',
  'myApp.view1',
  'myApp.view2',
  'myApp.view3',
  'myApp.login',
  'myApp.services',
  'myApp.version'
]).

config(['$routeProvider','$httpProvider', function($routeProvider, $httpProvider) {
    $routeProvider.otherwise({redirectTo: '/login'});
$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
}])

.controller('logout', ['$rootScope', '$scope', '$http', '$location', function($rootScope, $scope, $http, $location) {
          $scope.logout = function () {
                          $http.post('/logout', {}).then(successCallback, errorCallback);
                          function successCallback(){
                            $rootScope.authenticated = false;
                            $location.path("/login");
                          }
                          function errorCallback(data){
                            $rootScope.authenticated = false;
                          }

                };
}]);
