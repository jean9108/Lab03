'use strict';
angular.module('myApp.services', ['ngRoute','ngResource'])

    .factory('fabrica', function($resource) {
            return $resource('./tareas',{
                prioridad:'@prioridad',descripcion:'@descripcion'
            },{
             get: {method: 'GET', isArray: true},
             update: {method: 'POST'}
        });})
