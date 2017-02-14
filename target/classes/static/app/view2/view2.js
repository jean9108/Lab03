'use strict';

angular.module('myApp.view2', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view2', {
    templateUrl: 'view2/view2.html',
    controller: 'View2Ctrl'
  });
}])

.controller('View2Ctrl', ['$scope', 'fabrica', function ($scope,fabrica) {
     $scope.lista={};
     $scope.value=false;
     $scope.add=function(){
        fabrica.update($scope.lista);
        $scope.value = true;
     }
}]);