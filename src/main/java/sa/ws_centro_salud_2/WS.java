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
import java.util.Date;

/**
 *
 * @author scxal
 */
@WebService(serviceName = "WS")
public class WS {

    /**
     * This is a sample web service operation
     */
    
    final String bd = "jdbc:mysql://sql2.freemysqlhosting.net:3306/sql2232532";
    //final String bd = "jdbc:mysql://35.185.46.128:3306/centro_salud";
    
    @WebMethod(operationName = "IngresoPacienteCS2")
    public int pacientes(@WebParam(name = "Pacientes") String json) {
        JSONObject obj = new JSONObject(json);
        JSONArray pacientes = obj.getJSONArray("paciente");
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            bd,"sql2232532","cR8%xR7!");  
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
            bd,"sql2232532","cR8%xR7!");  
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
            bd,"sql2232532","cR8%xR7!");  
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
            bd,"sql2232532","cR8%xR7!");  
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
            bd,"sql2232532","cR8%xR7!");  
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
            bd,"sql2232532","cR8%xR7!");  
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
            bd,"sql2232532","cR8%xR7!");  
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
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "TrasladoPaciente")
    public String TrasladoPaciente(@WebParam(name = "informacion_traslado") String informacion_traslado) {
        JSONObject obj = new JSONObject(informacion_traslado);
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            bd,"sql2232532","cR8%xR7!");  
            Statement stmt=con.createStatement();
                String query = "";
                String query1 = "";
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date date = new Date();
                System.out.println(dateFormat.format(date));
                query += "insert into TRASLADO_PACIENTE (FECHA,DPI,Origen,Destino)values("
                        +"STR_TO_DATE('"+dateFormat.format(date)+"', '%d/%m/%Y'),"
                        +obj.getString("Paciente")+","
                        +obj.getString("Origen")+","
                        +obj.getString("Destino")+");";
                if(obj.getString("Destino").equals("2")){
                    query1 += "update PACIENTE set Estado=1 where DPI="+obj.getString("Paciente")+";";
                }else{
                    query1 += "update PACIENTE set Estado=0 where DPI="+obj.getString("Paciente")+";";
                }
                PreparedStatement ps = con.prepareStatement(query);
                ps.execute();
                PreparedStatement ps1 = con.prepareStatement(query1);
                ps1.execute();
            con.close(); 
            }catch(Exception e){ 
                System.out.println(e);
                return "{ \"Exito\":\"0\",\"Error\":\""+e.toString()+"\"}";
            }  
        
        return "{ \"Exito\":\"1\",\"Error\":\"\"}";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "HistorialPaciente")
    public String HistorialPaciente(@WebParam(name = "DPI") String DPI) {
        try{  
            System.out.println(DPI);
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            Date date = new Date();
            JSONObject ent = new JSONObject(DPI);
            //return "alguna estupidez";
            System.out.println(dateFormat.format(date));
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            bd,"sql2232532","cR8%xR7!");  
            Statement stmt=con.createStatement();
            Statement stmt1=con.createStatement();
            ResultSet resultSet1 = stmt.executeQuery("select * from PACIENTE where DPI=\""+ent.getString("DPI")+"\";");
            Date date1 = new Date();
            System.out.println(dateFormat.format(date1));
            org.json.simple.JSONArray historial = new org.json.simple.JSONArray();
            JSONObject obj = new JSONObject();
            while(resultSet1.next()){
                obj.put("Exito","1");
                obj.put("DPI", resultSet1.getString("DPI"));
                obj.put("Nombre", resultSet1.getString("Nombre"));
                obj.put("Apellido", resultSet1.getString("Apellido"));
                obj.put("Celular", resultSet1.getString("Celular"));
                obj.put("Telefono", resultSet1.getString("Télefono"));
                obj.put("Fecha_Nacimiento",resultSet1.getString("Fecha_Nac"));
            }
            JSONObject obj1 = new JSONObject();
            ResultSet resultSet3 = stmt1.executeQuery("select * from PACIENTE,CITA,ATENCION_MEDICA where DPI=\""+ent.getString("DPI")+"\" and PACIENTE.idPACIENTE=CITA.PACIENTE and CITA.idCITA=ATENCION_MEDICA.CITA");
            while(resultSet3.next()){
                obj1.put("Fecha", resultSet3.getString("ATENCION_MEDICA.Fecha"));
                obj1.put("Motivo", resultSet3.getString("ATENCION_MEDICA.Motivo"));
                ResultSet resultSet = stmt.executeQuery("select * from ATENCION_MEDICA,DIAGNOSTICO where ATENCION_MEDICA.idATENCION_MEDICA="+resultSet3.getString("ATENCION_MEDICA.idATENCION_MEDICA")+" and ATENCION_MEDICA.DIAGNOSTICO=DIAGNOSTICO.idDIAGNOSTICO;");
                org.json.simple.JSONArray diagnosticos = new org.json.simple.JSONArray();
                while(resultSet.next()){
                    JSONObject obj3 = new JSONObject();
                    obj3.put("Diagnostico", resultSet.getString("DIAGNOSTICO.Enfermedad"));
                    diagnosticos.add(obj3);
                }
                obj1.put("Diagnosticos",diagnosticos);
                historial.add(obj1);
            }
            ResultSet resultSet2 = stmt.executeQuery("select * from TRASLADO_PACIENTE where DPI=\""+ent.getString("DPI")+"\";");
            org.json.simple.JSONArray traslados = new org.json.simple.JSONArray();
            while(resultSet2.next()){
                JSONObject obj3 = new JSONObject();
                obj3.put("Fecha", resultSet2.getString("Fecha"));
                obj3.put("Origen", resultSet2.getString("Origen"));
                obj3.put("Destino", resultSet2.getString("Destino"));
                traslados.add(obj3);
            }
            obj.put("Historial",historial);
            obj.put("Traslados", traslados);
            System.out.println(obj.toString());
            return obj.toString();
            }catch(Exception e){ 
                System.out.println(e);
                return "{"+e.toString()+"}";
            }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ReporteMorbilidad")
    public String ReporteMorbilidad() {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            bd,"sql2232532","cR8%xR7!");  
            Statement stmt=con.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT QRY.* FROM (\n" +
"	(select D.idDIAGNOSTICO as 'ID', D.ENFERMEDAD as 'Nombre', \n" +
"	sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) <= 5 then 1 else 0 END) as '0-5 años',\n" +
"	sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) >= 6 and \n" +
"		timestampdiff(year, P.Fecha_Nac, curdate()) <= 15 then 1 else 0 END) as '6-15 años',\n" +
"	sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) >= 16 and \n" +
"		timestampdiff(year, P.Fecha_Nac, curdate()) <= 21 then 1 else 0 END) as '16-21 años',\n" +
"	sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) >= 22 and \n" +
"		timestampdiff(year, P.Fecha_Nac, curdate()) <= 45 then 1 else 0 END) as '22-45 años',\n" +
"	sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) >= 46 and \n" +
"		timestampdiff(year, P.Fecha_Nac, curdate()) <= 60 then 1 else 0 END) as '46-60 años',\n" +
"	sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) >= 61 then 1 else 0 END) as '>= 61 años',\n" +
"	sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) then 1 else 0 END) as 'Total'\n" +
"	from ATENCION_MEDICA AM, DIAGNOSTICO D, CITA C, PACIENTE P\n" +
"	where AM.DIAGNOSTICO = D.idDIAGNOSTICO and AM.CITA = C.idCITA and C.PACIENTE = P.idPACIENTE\n" +
"	group by D.ENFERMEDAD)\n" +
"    \n" +
"	UNION\n" +
"    \n" +
"    (select 999 as 'ID', 'Total', SUM(SUB.e5), SUM(SUB.e15), SUM(SUB.e21), SUM(SUB.e45), SUM(SUB.e60), SUM(SUB.e61), SUM(SUB.etotal) \n" +
"    from (\n" +
"		select D.Codigo, D.ENFERMEDAD, \n" +
"		sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) <= 5 then 1 else 0 END) as 'e5',\n" +
"		sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) >= 6 and \n" +
"			timestampdiff(year, P.Fecha_Nac, curdate()) <= 15 then 1 else 0 END) as 'e15',\n" +
"		sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) >= 16 and \n" +
"			timestampdiff(year, P.Fecha_Nac, curdate()) <= 21 then 1 else 0 END) as 'e21',\n" +
"		sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) >= 22 and \n" +
"			timestampdiff(year, P.Fecha_Nac, curdate()) <= 45 then 1 else 0 END) as 'e45',\n" +
"		sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) >= 46 and \n" +
"			timestampdiff(year, P.Fecha_Nac, curdate()) <= 60 then 1 else 0 END) as 'e60',\n" +
"		sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) >= 61 then 1 else 0 END) as 'e61',\n" +
"		sum( case when timestampdiff(year, P.Fecha_Nac, curdate()) then 1 else 0 END) as 'etotal'\n" +
"		from ATENCION_MEDICA AM, DIAGNOSTICO D, CITA C, PACIENTE P\n" +
"		where AM.DIAGNOSTICO = D.idDIAGNOSTICO and AM.CITA = C.idCITA and C.PACIENTE = P.idPACIENTE\n" +
"		group by D.ENFERMEDAD\n" +
"	) as SUB)\n" +
") AS QRY \n" +
"ORDER BY QRY.ID;");
            JSONObject obj = new JSONObject();
            obj.put("Exito", "1");
            org.json.simple.JSONArray diagnosticos = new org.json.simple.JSONArray();
            while(resultSet.next()){
                JSONObject diagnostico = new JSONObject();
                diagnostico.put("Id",resultSet.getString("ID"));
                diagnostico.put("Nombre",resultSet.getString("Nombre"));
                diagnostico.put("0-5",resultSet.getString("0-5 años"));
                diagnostico.put("6-15",resultSet.getString("6-15 años"));
                diagnostico.put("22-45",resultSet.getString("22-45 años"));
                diagnostico.put("46-60",resultSet.getString("46-60 años"));
                diagnostico.put(">60",resultSet.getString(">= 61 años"));
                diagnostico.put("Total",resultSet.getString("total"));
                diagnosticos.add(diagnostico);
            } 
            obj.put("diagnostico",diagnosticos);
            return obj.toString();
            }catch(Exception e){ 
                System.out.println(e);
                return "{}";
            }
    }
    
}
