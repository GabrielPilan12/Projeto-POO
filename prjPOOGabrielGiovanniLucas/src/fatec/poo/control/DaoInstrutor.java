package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Pessoa;
import java.util.ArrayList;
/**
 *
 * @author Gabriel Pillan, Giovanni Garcia, Lucas Matheus
 */
public class DaoInstrutor {
    private Connection connection;
    private DaoPessoa dp;
    
    public DaoInstrutor (Connection connection){
        this.connection = connection;
        dp = new DaoPessoa(connection);
    }
    
    public void inserir (Instrutor Instrutor){
        PreparedStatement ps = null;
        try {
            dp.inserir((Pessoa)Instrutor);
            ps = connection.prepareStatement("INSERT INTO poo_Instrutor (cpf, formacao, areaAtuacao) " +
                    "VALUES(?, ?, ?)");
            ps.setString(1, Instrutor.getCpf());
            ps.setString(2, Instrutor.getFormacao());
            ps.setString(3, Instrutor.getAreaAtuacao());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Instrutor Instrutor){
        PreparedStatement ps = null;
        try {
            dp.alterar(Instrutor);
            ps = connection.prepareStatement("UPDATE poo_Instrutor SET formacao = ?, areaAtuacao = ? WHERE cpf = ?"); 
            ps.setString(1, Instrutor.getFormacao());
            ps.setString(2, Instrutor.getAreaAtuacao());
            ps.setString(3, Instrutor.getCpf());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Instrutor consultar (String cpf){
        Instrutor Instrutor = null;
        PreparedStatement ps = null;
        try {
            Instrutor = (Instrutor)dp.consultar(cpf, "Instrutor");
            ps = connection.prepareStatement("SELECT * FROM poo_Instrutor WHERE cpf = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                Instrutor.setFormacao(rs.getString("formacao"));
                Instrutor.setAreaAtuacao(rs.getString("areaAtuacao"));
            }
        } catch (SQLException ex) { 
             System.out.println(ex.toString());
        }
        return Instrutor;
    }
    
    public void excluir(Instrutor Instrutor) {
        PreparedStatement ps = null;
        try {
            //Desnecessário caso o a chave primária da tabela Pessoa esteja configurada como cascade em caso de exclusão.
            //Inicio
            ps = connection.prepareStatement("DELETE FROM poo_Instrutor WHERE cpf = ?");
            ps.setString(1, Instrutor.getCpf());
            ps.execute();
            //Fim
            dp.excluir(Instrutor);
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        }
    }
    //PARTE NOVA TRAB 4
    
    public ArrayList<Instrutor> listar () {
        ArrayList<Instrutor> instrutores = new ArrayList<>();
        PreparedStatement ps = null;
        try {//Verificar se funciona essa Query para listar o nome do Instrutor)
            ps = connection.prepareStatement("SELECT nome, poo_Instrutor.CPF FROM poo_Pessoa,poo_Instrutor where poo_Pessoa.CPF = poo_Instrutor.CPF");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                instrutores.add(new Instrutor (rs.getString("nome"),rs.getString("CPF")));
               
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return instrutores;
    }
    
    
    
}
