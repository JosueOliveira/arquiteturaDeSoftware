APP.factory("LivroService", function($resource) {
  return $resource('http://localhost:8080/BibliotecaWorks/api/livros/:id', {id:'@_id'},{
    update: {
      method  : 'PUT',
      url     : 'http://localhost:8080/BibliotecaWorks/api/livros/:id',
      params  : { id: '@id' },
      isArray : false
    }
  });
});
