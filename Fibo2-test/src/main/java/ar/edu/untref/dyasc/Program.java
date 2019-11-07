package ar.edu.untref.dyasc;

public class Program {
	
    public static String validateErrorsAndShowSucession(String[] args){
        String result = "";
        
    	if(args.length > 0 && args.length < 3){
    		//Convetimos el array en un String
            String specification = "";
    		for(int i = 0; i < args.length; i++){
    			specification += String.valueOf(args[i]); 
        	}
    		//Expresion regular con -o
    		if(specification.matches("-o=[v|h][d|i][0-9]+")){
    			int successionLength = Integer.parseInt(specification.substring(5,specification.length()));
    			specification = specification.substring(3,5);
                FormatSuccession succession = new FormatSuccession();
                String resultSuccession = succession.generateSuccessionWithSpecifications(specification, successionLength);
                result = resultSuccession;
    		}else
    			//Expresion regular sin -o
    			if(specification.matches("[0-9]+")){;
    				int successionLength = Integer.parseInt(specification);
    				FormatSuccession succession = new FormatSuccession();
                    String resultSuccession = succession.generateSuccessionWithSpecifications(specification, successionLength);
                    result = resultSuccession;
    		}
    	}
    	
    	if(result.equals("")){
    		result = "Opciones no validas.";
    	}
    	
		return result;
    }
    	
	public static void main(String[] args){
		System.out.println(validateErrorsAndShowSucession(args));
	}	
}
