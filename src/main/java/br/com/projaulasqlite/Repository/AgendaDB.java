package br.com.projaulasqlite.Repository;

import br.com.projaulasqlite.Utils.Banco;
import br.com.projaulasqlite.Model.Agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgendaDB {
    public void inserir (Agenda agenda){
        String sql = "INSERT INTO tb_agenda (nome, telefone) values (?,?)";
        try {
            Connection connection = Banco.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, agenda.getNome());
            pstmt.setString(2, agenda.getTelefone());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
