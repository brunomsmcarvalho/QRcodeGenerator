package dao;

import db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProdutoDAO {

    public static String buscarDadosParaQRCode(int id) throws Exception {

        String sql = "SELECT id, nome, preco FROM produtos WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return "ID=" + rs.getInt("id") +
                       ";NOME=" + rs.getString("nome") +
                       ";PRECO=" + rs.getBigDecimal("preco");
            }
        }
        return null;
    }
}
