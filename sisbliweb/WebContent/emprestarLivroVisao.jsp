<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>

	<f:loadBundle var="msg" basename="SystemMessages" />


	<title><h:outputText value=" Emprestar Livro" /></title>
	<h:form id="meuForm">
	
	<h:outputLabel value="#{emprestarLivroControle.mensagem}"/>
	<br />
	
	
	<h:outputLabel  value="Autor:" />
		<h:inputText value="#{emprestarLivroControle.emprestimo.livro.autor}"  />
		<br />
    <h:outputLabel  value="Categoria:" />
		<h:inputText value="#{emprestarLivroControle.emprestimo.livro.categoria}"  />
		<br />
<h:outputLabel value="Nome do Livro:" />
		<h:inputText value="#{emprestarLivroControle.emprestimo.livro.nome}" />
		<br />
		
 <h:outputLabel  value="id do Livro:" />
		<h:inputText value="#{emprestarLivroControle.emprestimo.livro.idLivro}" />
		<br />

 <h:outputLabel  value="isbn do Livro:" />
		<h:inputText value="#{emprestarLivroControle.emprestimo.livro.isbn}"  />
		<br />
		
 <h:outputLabel value="Id Mutuario" />
		<h:inputText value="#{emprestarLivroControle.emprestimo.mutuario.id}"  />
		<br />

 <h:outputLabel  value="Nome Mutuario" />
		<h:inputText value="#{emprestarLivroControle.emprestimo.mutuario.nome}" />
		<br />

 <h:outputLabel value="Endereco Mutuario" />
		<h:inputText value="#{emprestarLivroControle.emprestimo.mutuario.endereco}"  />
		<br />
 <h:outputLabel value="Telefone Mutuario" />
		<h:inputText value="#{emprestarLivroControle.emprestimo.mutuario.telefone}" />
		<br />	


		<h:commandButton value= "Emprestar" action="#{emprestarLivroControle.emprestarLivroControle}" />

	</h:form>
</f:view>