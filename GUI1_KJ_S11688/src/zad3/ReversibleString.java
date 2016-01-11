package zad3;

class ReversibleString extends Reversible
{
    String napis;
 
    public ReversibleString(String x)
    {
        napis = x;
    }
    public Reversible reverse() {
		String reversedString = "";
		 for(int i=napis.length(); i>0; i--) {
	            reversedString += napis.charAt(i-1);
	        }   

		
		napis = reversedString;
		return this;
	}

	
   
    
    
    
    @Override
    public String toString()
    {
    	return napis;
    }
}