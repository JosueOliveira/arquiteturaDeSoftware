var APP = angular.module('livroApp', ['ui.router', 'ngResource'])
  .config(function ($stateProvider) {

    $stateProvider.state('principal', {
      url: '/principal',
      templateUrl: 'app/view/home.html',
      controller: 'PrincipalController'
    }).state('livros', {
      url: '/livros',
      templateUrl: 'app/view/livro/index.html',
      controller: 'LivroController',
      params: {
        'successMessage': null
      }
    }).state('novoLivro', {
      url: '/livros/novo',
      templateUrl: 'app/view/livro/novo.html',
      controller: 'LivroNovoController'
    }).state('editarLivro', {
      url: '/livros/:id/editar',
      templateUrl: 'app/view/livro/editar.html',
      controller: 'LivroEditarController'
    }).state('autores', {
      url: '/autores',
      templateUrl: 'app/view/autor/index.html',
      controller: 'AutorController',
      params: {
        'successMessage': null
      }
    }).state('novoAutor', {
      url: '/autores/novo',
      templateUrl: 'app/view/autor/novo.html',
      controller: 'AutorNovoController'
    }).state('editarAutor', {
      url: '/autores/:id/editar',
      templateUrl: 'app/view/autor/editar.html',
      controller: 'AutorEditarController'
    }).state('mutuarios',{
    	url: '/mutuarios',
    	templateUrl: 'app/view/mutuario/index.html',
    	controller: 'MutuarioController',
    	params: {
    		'successMessage': null
    	}
    }).state('novoMutuario',{
    	url: '/mutuarios/novo',
    	templateUrl: 'app/view/mutuario/novo.html',
    	controller: 'MutuarioNovoController'
    }).state('editarMutuario',{
    	url: '/mutuarios/:id/mutuarios',
    	templateUrl: 'app/view/mutuario/editar.html',
    	controller: 'MutuarioEditarController'
    }).state('emprestimos',{
    	url: '/emprestimos',
    	templateUrl: 'app/view/emprestimo/index.html',
    	controller: 'EmprestimoController',
    	params: {
    		'successMessage': null 
    	}
    }).state('novoEmprestimo',{
    	url: '/emprestimos/novo',
    	templateUrl: 'app/view/emprestimo/novo.html',
    	controller: 'EmprestimoNovoController'
    }).state('editarEmprestimo',{
    	url: '/emprestimos/:id/emprestimos',
    	templateUrl: 'app/view/emprestimo/editar.html',
    	controller: 'EmprestimoEditarController'    	
    }).state('finalizarEmprestimo',{
    	url: '/devolver/:id/devolver',
    	templateUrl: 'app/view/emprestimo/devolver.html',
    	controller: 'EmprestimoFinalizarController'
    });
  })
  .run(function($state) {
    $state.go('autores');
  });

