package br.com.coren_ba.jdbc;

import java.sql.SQLException;

import br.com.coren_ba.dao.FuncionarioDao;
import br.com.coren_ba.modelo.Funcionario;

public class Connect {
	public static void main(String[] args) throws SQLException {
			// Testantando chamar lista de funcionarios
			
			/*
			// Testando alterar Funcionario
			Funcionario funcionario = new Funcionario();
			FuncionarioDao dao = new FuncionarioDao();
			funcionario.setMatricula(12347);
			altera.exclui(funcionario);
			*/
		
			/*
			
			// Testando excluir Funcionario
			Funcionario funcionario = new Funcionario();
			FuncionarioDao dao = new FuncionarioDao();
			funcionario.setMatricula(12357);
			dao.exclui(funcionario);
			
			*/
			
			/*
			// Criando a instância de Funcionário
			
			Funcionario funcionario = new Funcionario(); 
			funcionario.setMatricula(12357);
			funcionario.setNome("Teste 2");
			funcionario.setSobrenome("Teste 2");
			funcionario.setFuncao("Teste 2");
			funcionario.setLocalizacao("Teste 2");
			funcionario.setUsuario("Teste 4");
			funcionario.setEmail("Teste 2");
			
			// Criando a instância de FuncionarioDao
			
			FuncionarioDao funcionariodao = new FuncionarioDao();
			funcionariodao.adiciona(funcionario);
			
			*/
			
			
			/*
			ConnectionFactory conexao = new ConnectionFactory();
			
			try{
				conexao.getConnection();
				System.out.println("Aceita!");
			}catch(Exception e){
				System.out.println("Recusada!");
			}
			*/
			
	
	}
}