package br.com.coren_ba.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.coren_ba.jdbc.ConnectionFactory;
import br.com.coren_ba.modelo.Funcionario;

public class FuncionarioDao {
	
	// Conexão com o banco de dados
	private Connection connection;
	
	// Construtor da classe
	public FuncionarioDao() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void adiciona (Funcionario funcionario) {
		String sql = "USE db_EDoc;" +
				"INSERT INTO tbl_Funcionarios" + 
				"(Matricula,Nome,Sobrenome,Funcao,Localizacao,Usuario,Email)" +
				" values (?,?,?,?,?,?,?)";
		
		try {
			
			// Prepared Statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			// Setando os valores
			stmt.setInt(1, funcionario.getMatricula());
			stmt.setString(2, funcionario.getNome());
			stmt.setString(3, funcionario.getSobrenome());
			stmt.setString(4, funcionario.getFuncao());
			stmt.setString(5, funcionario.getLocalizacao());
			stmt.setString(6, funcionario.getUsuario());
			stmt.setString(7, funcionario.getEmail());
			
			// Executa
			stmt.execute();
			stmt.close();
			
			System.out.println("Inclusão feita com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List <Funcionario> getLista() {
		try {
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			PreparedStatement stmt = this.connection.prepareStatement("USE db_EDoc; SELECT * FROM tbl_Funcionarios");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setMatricula(rs.getInt("Matricula"));
				funcionario.setNome(rs.getString("Nome"));
				funcionario.setSobrenome(rs.getString("Sobrenome"));
				funcionario.setFuncao(rs.getString("Funcao"));
				funcionario.setLocalizacao(rs.getString("Localizacao"));
				funcionario.setUsuario(rs.getString("Usuario"));
				funcionario.setEmail(rs.getString("Email"));
				
				funcionarios.add(funcionario);
			}
			rs.close();
			stmt.close();
			
			return funcionarios;
		} catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}

	public void exclui (Funcionario funcionario) {
		String sql = "USE db_EDoc; DELETE FROM tbl_Funcionarios WHERE Matricula=?";
		
		try {
			
			// Prepared Statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			// Setando os valores
			stmt.setInt(1, funcionario.getMatricula());
			
			// Executa
			stmt.execute();
			stmt.close();
			
			System.out.println("Exclusão feita com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void altera(Funcionario funcionario) {
		String sql = "USE db_EDoc; UPDATE tbl_Funcionarios set Matricula = ?, Nome = ?, Sobrenome = ?,"
				+ " Funcao = ?, Localizacao = ?, Usuario = ?, Email = ? where Matricula = ?";
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, funcionario.getMatricula());
			stmt.setString(2, funcionario.getNome());
			stmt.setString(3, funcionario.getSobrenome());
			stmt.setString(4, funcionario.getFuncao());
			stmt.setString(5, funcionario.getLocalizacao());
			stmt.setString(6, funcionario.getUsuario());
			stmt.setString(7, funcionario.getEmail());

			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}