function controller($scope) {

	$scope.atividades = [
		{nome: "Manel", tarefa: "aprender javascript", data: "ontem"}
	];

	$scope.adicionarAtividade = function () {
		$scope.atividades.push({nome: $scope.nome ,tarefa: $scope.tarefa , data: $scope.data })
		$scope.nome = "";
		$scope.tarefa = "";
		$scope.data = "";

	};

	

}