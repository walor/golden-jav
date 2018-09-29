package qc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;



public class QCReporter {
	
	
	QCQueryCaller qcQueryCaller;
	
	public void setQcQueryCaller(QCQueryCaller qcQueryCaller){
		this.qcQueryCaller= qcQueryCaller; 
	}

	QCQueryCaller qcQueryCaller2;
	
	public void setQcQueryCaller2(QCQueryCaller qcQueryCaller){
		this.qcQueryCaller2= qcQueryCaller; 
	}
	
	QCQueryCaller qcQueryCaller3;
	
	public void setQcQueryCaller3(QCQueryCaller qcQueryCaller){
		this.qcQueryCaller3= qcQueryCaller; 
	}
	
    public final static String TITLE = "All new qc tickets";
    public final static String QC_PROPERTIES = "C:\\workspaces\\C\\CIDashboard\\qc.properties";
    public final static int FIELDS_LENGHT = 47;
    public final static String[] QC_DEFECT_FIELDS = {
        "Being Worked By",
        "Defect ID",
        "Title",
        "Similar to Defect",
        "Developer of Record",
        "Detected on Date",
        "Modified",
        "Status",
        "Description",
        "Severity",
        "Assigned To"
    };
    
    public void QCAuthenticationOpen()
    {
    	qcQueryCaller.login("authenticate");
    }
    
    public void QCAuthenticationClose()
    {
    	qcQueryCaller.login("logout");
    }
    
    public String getLabel(Map<String, String> mpLabel) {
    	String f=null;
    	for (String key : mpLabel.keySet()) {
    		f=key;
    		//System.out.println(key);
    	}
    	return f;
    }
    
    public static void write(String str_properties) {
	    FileWriter fichero = null;
	    PrintWriter pw = null;
	    try
	    {
	        fichero = new FileWriter(QC_PROPERTIES);
	        pw = new PrintWriter(fichero);
	        pw.println(str_properties);
	    } 
	    catch (Exception e) 
	    {
	        e.printStackTrace();
	    } 
	    finally 
	    {
	       try 
	       {
	    	   if (null != fichero)
	    		   fichero.close();
	       } 
	       catch (Exception e2) 
	       {
	          e2.printStackTrace();
	       }
	    }
    }
    
   /* public String QCStructureFieldParameters()
    {
    	List<Map<String, String>> fields = getQueryResultsStructure();
        String parameters = QCSetQueryParameters(fields, QC_DEFECT_FIELDS);
        
        return parameters;
    }*/
    public String QCGetFields()
    {
    	/* Init test */
    	
    	//List<Map<String, String>> fields = getQueryResultsStructure();
    	//String micadena = QCSetQueryParameters(fields, QC_DEFECT_FIELDS);
    	//System.out.println(micadena);
    	/* */
    	
    	File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String value = null;
        
        //System.out.println(QC_PROPERTIES);
        
    	try {
             archivo = new File (QC_PROPERTIES);
             fr = new FileReader (archivo);
             br = new BufferedReader(fr);
     
             // Lectura del fichero
             String linea;
             while((linea=br.readLine())!=null)
                value = linea;
          }
          catch(Exception e){
             e.printStackTrace();
          }finally{

             try{                   
                if( null != fr ){  
                   fr.close();    
                }                 
             }catch (Exception e2){
                e2.printStackTrace();
             }
          }
    	
    	return "'" + value + "'";
    	//return "'user-17'";
    	//System.out.println(micadena);
    	//return "'" + micadena + "'";
    }
    
    public String QCSetQueryParameters(List<Map<String, String>> structure, String[] fields_selected)
    {
    	List<String> fieldsNamesList = new ArrayList<String>();
    	String fieldsLabel = null; String fieldsName = null;
    	Map<String, String> element = null;
    	
    	for (int i = 0; i < structure.size(); i++) {
    		element = structure.get(i);

    		fieldsLabel = getLabel(element);	// Aca trae cada uno de los pares
    		
    		//System.out.println(fieldsLabel);
    		if(Arrays.asList(fields_selected).contains(fieldsLabel))
    		{
    			fieldsName = element.get(fieldsLabel);
    			fieldsNamesList.add(fieldsName);
    		}
    	}

    	String str_fieldsNamesList = StringUtils.join(fieldsNamesList,",");
    	//System.out.println(str_fieldsNamesList);
        
    	write(str_fieldsNamesList);
    	return str_fieldsNamesList;
    }
    
    public List<Map<String, String>> getQueryResultsEntities() {
        Entities entities = qcQueryCaller2.query("");
        return parseEntities(entities);
    }

    public List<Map<String, String>> getQueryResultsStructure() {
        Fields fields = qcQueryCaller3.myquery("");
        List<Map<String, String>> x = parseFields(fields);
        //System.out.println(x);
        return x;
    }

    public List<Map<String, String>> parseEntities(Entities entities) {
        List<Map<String, String>> results = new ArrayList<Map<String, String>>(entities.getTotalResults());

        for (Entities.Entity entity : entities.getEntity()) {
            Map<String, String> result = new HashMap<String, String>();
            for (Entities.Entity.Fields.Field field : entity.getFields().getField()) {
                result.put(field.getName(), field.getValue());
            }
            results.add(result);
        }
        return results;
    }
    
    public List<Map<String, String>> parseFields(Fields fields) {
        List<Map<String, String>> results = new ArrayList<Map<String, String>>(FIELDS_LENGHT);

        for (Fields.Field fieldss : fields.getField()) {
            Map<String, String> result = new HashMap<String, String>();
            result.put(fieldss.getLabel(), fieldss.getName());
            results.add(result);
        }

        return results;
    }

}