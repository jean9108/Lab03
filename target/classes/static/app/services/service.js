'use strict';
angular.module('services.listFactory', ['ngRoute'])

    .factory('NOMBREFABRICA', function () {
        var data = {
            listado: []
        };
        return {
            getListado: function () {
                return data.listado;
            },
            addTodo: function (todo) {
                data.listado.push(todo);
            }};
    });