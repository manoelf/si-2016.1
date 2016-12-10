function controller($scope) {
	

	$scope.atividades = [
		{nome: "Maria", tarefa: "Faxina", data: "10/05/2016"},
		{nome: "Jonas", tarefa: "Boxe", data: "25/11/2016"},
		{nome: "Abraao", tarefa: "Ingles", data: "01/12/2016"},
		{nome: "Clecia", tarefa: "Prova", data: "15/12/2016"}
	];

	$scope.adicionarAtividade = function () {
		$scope.atividades.push({nome: $scope.nome ,tarefa: $scope.tarefa , data: $scope.data })
		$scope.nome = "";
		$scope.tarefa = "";
		$scope.data = "";

	};

	$scope.classe = "selecionado";

	$scope.apagarTodasTarefas = function () {
		$scope.atividades = [];
		
	};


	$scope.apagarTarefas = function (atividade) {
		for (var i = 0; i < $scope.atividades.length; i++) {
			if ($scope.atividades[i] == atividade) $scope.atividades.splice(i, 1);
		}
			
	};

	$scope.progressoConcluido = function (atividades) {
		var concluidos = 0
		for (var i = 0; i < $scope.atividades.length; i++) {
			if ($scope.atividades[i].selecionado) concluidos = concluidos + 1;
		}
		return parseInt((concluidos/$scope.atividades.length)*100);
	}
}




