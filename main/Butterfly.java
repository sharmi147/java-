public class Butterfly {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n=8;
		   
		    
		    for(int i=n-1;i>=0;i--) 
		    {
		    	int x = (i==0)?1: i;
		    	for(int j=0;j<n-i;j++)
		    	{
		    		System.out.print("*");
		    	}
		    	for(int k=0;k<(2*i-1);k++)
		    	{
		    		System.out.print(" ");
		    	}
		    	
		    	for(int j=0;j<n-x;j++)
		    	{
		    		
		    		System.out.print("*");
		    	}
		    	
		    	System.out.println();
		    }
		    for(int i=1;i<n;i++) 
		    {
		    	
		    	for(int j=0;j<n-i;j++)
		    	{
		    		System.out.print("*");
		    	}
		    	for(int k=0;k<(2*i-1);k++)
		    	{
		    		System.out.print(" ");
		    	}
		    	for(int j=0;j<n-i;j++)
		    	{
		    		System.out.print("*");
		    	}
		    	
		    	System.out.println();
		    }
		    }
}
