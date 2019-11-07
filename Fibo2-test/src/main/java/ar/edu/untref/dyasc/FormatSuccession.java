package ar.edu.untref.dyasc;

public class FormatSuccession {
	
	public String generateSuccessionWithSpecifications(String specification, int successionLength) {
		FibonacciSuccession fibonacci = new FibonacciSuccession();
		String resultSuccession = "";
		int fibonacciSuccession[];
		resultSuccession = "fibo<"+successionLength+">: ";
		fibonacciSuccession = fibonacci.calculateFibonacciSuccession(successionLength);
		    
		if(specification.equals("hd")){
            for (int i = 0; i < successionLength; i++){
			    resultSuccession += fibonacciSuccession[i]+" ";
            }
            return resultSuccession;
        }else
		    	
	        if(specification.equals("hi")){
	            for (int i = successionLength-1; i >= 0; i--){
	                resultSuccession += fibonacciSuccession[i]+" ";
	            }
	        return resultSuccession;
        }else
        	
	        if(specification.equals("vd")){
		       	resultSuccession += "\n";
			    for (int i = 0; i < successionLength; i++){
			    	resultSuccession += fibonacciSuccession[i]+"\n";
			    }
			    return resultSuccession;
		}else
			
			if(specification.equals("vi")){			
			    resultSuccession += "\n";
			    for (int i = successionLength-1; i >= 0; i--){
			        resultSuccession += fibonacciSuccession[i]+"\n";
			    }  
			    return resultSuccession;
		}else
			
		    for(int i = 0; i < successionLength; i++){
	            resultSuccession += fibonacciSuccession[i]+" ";
	        }
	        return resultSuccession;
	}
}
