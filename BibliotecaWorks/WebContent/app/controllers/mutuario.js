APP.controller('MutuarioController', function($scope, $state, $stateParams, MutuarioService) {
  $scope.mutuarios = MutuarioService.query();
  $scope.successMessage = $stateParams.successMessage;
});

APP.controller('MutuarioNovoController', function($scope, $state, $stateParams, MutuarioService) {
  $scope.mutuario = new MutuarioService();

  $scope.criarMutuario = function() {
    $scope.mutuario.$save(
      function() {
        $state.go('mutuarios', {'successMessage': "Mutuario criado com sucesso!"});
      },
      function() {
        $scope.errorMessage = "Ocorreu um erro no servidor. Verifique se todos os campos foram preenchidos corretamente.";
      }
    );
  };
});
 

APP.controller('MutuarioEditarController', function($scope, $state, $stateParams, MutuarioService) {
  $scope.mutuario = MutuarioService.get({ id: $stateParams.id });

  $scope.atualizarMutuario = function() {
    $scope.mutuario.$update(
      function() {
        $state.go('mutuarios', {'successMessage': "Mutuario atualizado com sucesso!"});
      }, function() {
        $scope.errorMessage = "Ocorreu um erro no servidor. Verifique se todos os campos foram preenchidos corretamente.";
      }
    );
  };
});