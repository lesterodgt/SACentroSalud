/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.ws_centro_salud_2;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.*;
import java.sql.*;  
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author scxal
 */
@WebService(serviceName = "WS")
public class WS {

    /**
     * This is a sample web service operation
     */
    
    final String bd = "jdbc:mysql://35.196.79.167:3306/centro_salud";
    //final String bd = "jdbc:mysql://35.185.46.128:3306/centro_salud";
    
    @WebMethod(operationName = "IngresoPacienteCS2")
    public int pacientes(@WebParam(name = "Pacientes") String json) {
        JSONObject obj = new JSONObject(json);
        JSONArray pacientes = obj.getJSONArray("paciente");
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            bd,"root","grupo2sa");  
            Statement stmt=con.createStatement();
            for(int a = 0; a < pacientes.length();a++){
                JSONObject paciente = (JSONObject)pacientes.get(a);
                System.out.println(pacientes.get(a));
                String query = " insert into PACIENTE (DPI, Nombre, Apellido, Telefono, Celular, Direccion, Estado, Fecha_Nac)"
                    + " values ("
                        +"\""+paciente.getString("dpi")+"\","
                        +"\""+paciente.getString("nombre")+"\","
                        +"\""+paciente.getString("apellido")+"\","
                        +""+paciente.getString("telefono")+","
                        +""+paciente.getString("celular")+","
                        +"\""+paciente.getString("direccion")+"\","
                        +""+paciente.getString("estado")+","
                        +"STR_TO_DATE('"+paciente.getString("fecha_nac")+"', '%d/%m/%Y')"
                        + ")";
                PreparedStatement ps = con.prepareStatement(query);
                ps.execute();
                
            }
            con.close(); 
            }catch(Exception e){ 
                System.out.println(e);
                return 0;
            }  
        
        return 1;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresoMedicoCS2")
    public int IngresoMedicoCS2(@WebParam(name = "Medicos") String json) {
        JSONObject obj = new JSONObject(json);
        JSONArray medicos = obj.getJSONArray("medico");
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            bd,"root","grupo2sa");  
            Statement stmt=con.createStatement();
            for(int a = 0; a < medicos.length();a++){
                JSONObject medico = (JSONObject)medicos.get(a);
                System.out.println(medicos.get(a));
                String query = " insert into MEDICO (DPI, Nombre, Apellido, Telefono, Celular, Direccion)"
                    + " values ("
                        +"\""+medico.getString("dpi")+"\","
                        +"\""+medico.getString("nombre")+"\","
                        +"\""+medico.getString("apellido")+"\","
                        +""+medico.getString("telefono")+","
                        +""+medico.getString("celular")+","
                        +"\""+medico.getString("direccion")+"\""
                        + ")";
                PreparedStatement ps = con.prepareStatement(query);
                ps.execute();
                
            }
            con.close(); 
            }catch(Exception e){ 
                System.out.println(e);
                return 0;
            }
        return 1;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresoDiagnosticoCS2")
    public int IngresoDiagnosticoCS2(@WebParam(name = "Diagnosticos") String json) {
        JSONObject obj = new JSONObject(json);
        JSONArray diagnosticos = obj.getJSONArray("diagnostico");
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            bd,"root","grupo2sa");  
            Statement stmt=con.createStatement();
            for(int a = 0; a < diagnosticos.length();a++){
                JSONObject diagnostico = (JSONObject)diagnosticos.get(a);
                System.out.println(diagnosticos.get(a));
                String query = " insert into DIAGNOSTICO (Codigo, ENFERMEDAD, Descripcion)"
                    + " values ("
                        +""+diagnostico.getString("codigo")+","
                        +"\""+diagnostico.getString("enfermedad")+"\","
                        +"\""+diagnostico.getString("descripcion")+"\""
                        + ")";
                PreparedStatement ps = con.prepareStatement(query);
                ps.execute();
                
            }
            con.close(); 
            }catch(Exception e){ 
                System.out.println(e);
                return 0;
            }
        return 1;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresoCitaCS2")
    public int IngresoCitaCS2(@WebParam(name = "Citas") String json) {
        JSONObject obj = new JSONObject(json);
        JSONArray citas = obj.getJSONArray("cita");
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            bd,"root","grupo2sa");  
            Statement stmt=con.createStatement();
            for(int a = 0; a < citas.length();a++){
                JSONObject cita = (JSONObject)citas.get(a);
                System.out.println(citas.get(a));
                String query = " insert into CITA (Fecha,PACIENTE)"
                    + " values ("
                        +"STR_TO_DATE('"+cita.getString("fecha")+"', '%d/%m/%Y'),"
                        +""+cita.getString("paciente")+""
                        + ")";
                PreparedStatement ps = con.prepareStatement(query);
                ps.execute();
                
            }
            con.close(); 
            }catch(Exception e){ 
                System.out.println(e);
                return 0;
            }
        return 1;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresoAtencionMedicaCS2")
    public int IngresoAtencionMedicaCS2(@WebParam(name = "Atenciones") String json) {
        JSONObject obj = new JSONObject(json);
        JSONArray atenciones = obj.getJSONArray("atencion");
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            bd,"root","grupo2sa");  
            Statement stmt=con.createStatement();
            for(int a = 0; a < atenciones.length();a++){
                JSONObject atencion = (JSONObject)atenciones.get(a);
                System.out.println(atenciones.get(a));
                String query = " insert into ATENCION_MEDICA (Fecha,Motivo,CITA,MEDICO,DIAGNOSTICO)"
                    + " values ("
                        +"STR_TO_DATE('"+atencion.getString("fecha")+"', '%d/%m/%Y'),"
                        +"\""+atencion.getString("motivo")+"\","
                        +""+atencion.getString("cita")+","
                        +""+atencion.getString("medico")+","
                        +""+atencion.getString("diagnostico")+""
                        + ")";
                PreparedStatement ps = con.prepareStatement(query);
                ps.execute();
                
            }
            con.close(); 
            }catch(Exception e){ 
                System.out.println(e);
                return 0;
            }
        return 1;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConsultarRecetaCS2")
    public int ConsultarRecetaCS2(@WebParam(name = "Receta") int Receta) {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            bd,"root","grupo2sa");  
            Statement stmt=con.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from RECETA where idRECETA="+Receta+";");
            if(!resultSet.next()){
                con.close();
                return 0;
            }else{
                con.close();
                return 1;
            }
            }catch(Exception e){ 
                System.out.println(e);
                return 0;
            }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresoRecetaCS2")
    public int IngresoRecetaCS2(@WebParam(name = "Recetas") String json) {
        JSONObject obj = new JSONObject(json);
        JSONArray recetas = obj.getJSONArray("receta");
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            bd,"root","grupo2sa");  
            Statement stmt=con.createStatement();
            for(int a = 0; a < recetas.length();a++){
                JSONObject receta = (JSONObject)recetas.get(a);
                System.out.println(recetas.get(a));
                String query = " insert into RECETA (Indicaciones,ATENCION_MEDICA)"
                    + " values ("
                        +"\""+receta.getString("indicaciones")+"\","
                        +""+receta.getString("atencion")+""
                        + ")";
                PreparedStatement ps = con.prepareStatement(query);
                ps.execute();
                
            }
            con.close(); 
            }catch(Exception e){ 
                System.out.println(e);
                return 0;
            }
        return 1;
    }
    
    
}
