/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

/**
 *
 * @author luiz
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

@Path("/receitas")
public class ReceitaResource {

    @GET
    @Path("/{a}/json")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Receita> getListaReceitasAsJSON(@PathParam("a") String name) {
        return this.buscaListaReceitas(name);
    }

    @GET
    @Path("/{a}/xml")
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<Receita> getListaReceitasAsXML(@PathParam("a") String name) {
        return this.buscaListaReceitas(name);
    }

    private ArrayList<Receita> buscaListaReceitas(String name) {
        ArrayList<Receita> arrayReceitas = new ArrayList<Receita>();

        try {
            Connection connection = Connect.connect();
            String sql = "SELECT * FROM receitas WHERE name LIKE ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + name + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Receita receita = new Receita();

                receita.setId(rs.getInt("id"));
                receita.setName(rs.getString("name"));
                receita.setTipo(rs.getString("tipo"));
                receita.setIngrediente1(new Ingrediente(rs.getString("ingrediente1"), rs.getString("um1"), rs.getString("qtde1")));
                receita.setIngrediente2(new Ingrediente(rs.getString("ingrediente2"), rs.getString("um2"), rs.getString("qtde2")));
                receita.setIngrediente3(new Ingrediente(rs.getString("ingrediente3"), rs.getString("um3"), rs.getString("qtde3")));
                receita.setIngrediente4(new Ingrediente(rs.getString("ingrediente4"), rs.getString("um4"), rs.getString("qtde4")));
                receita.setIngrediente5(new Ingrediente(rs.getString("ingrediente5"), rs.getString("um5"), rs.getString("qtde5")));
                receita.setModoPreparo(rs.getString("modopreparo"));
                arrayReceitas.add(receita);
            }

            stmt.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return arrayReceitas;
    }
}
