class PMF
{
    
    int r;
    double lambda ;
    
    double factorial(int r)
    {
        double rFact=1.0;
    
        for(int i=1;i<=r;i++)
        {
            rFact*=i;
        }
        
        return rFact;
    }
    
    
    double exponentialFunction(double lambda)
    {
        return Math.exp(-lambda);
    }
    
    double powerFunction(double lambda ,int r)
     {
         return Math.pow(lambda,r);
     }   
     
}