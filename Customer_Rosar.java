//John Rosar
//COSC1437
//Lab3 part 2


import java.text.DecimalFormat;

class Customer_Rosar
{
  
  private String name, acctNumber;
  private float inMoney, intRate;
  
  public Customer_Rosar()
  {
    this.name = null;
    this.acctNumber = null;
    this.inMoney = 0;
    this.intRate = 0;

  }
  
  public Customer_Rosar(String Name,String acct,float in,float rate)
  {
    this.name = Name;
    this.acctNumber = acct;
    this.inMoney = in;
    this.intRate = rate;

  }
  
  //get() methods
  public String getName()
  {
    return this.name;
  }

  public String getacctNumber()
  {
    return this.acctNumber;
  }
  
  public float getinMoney()
  {
    return this.inMoney;
  }
  
  public float getintRate()
  {
    return this.intRate;
  }
  
  // calculating method
  public float calTotal()
  {
    float outMoney;
    outMoney = inMoney +(inMoney * intRate)/100; //formula
    return outMoney;
  }
    
  // toString method
  public String toString()
  {
	  DecimalFormat format = new DecimalFormat("0.00");
	  System.out.println("-------------------------------------------");
	  System.out.println("File: SavingMoney_Rosar.java"); 
	  System.out.println("Saving Money Application – John Rosar");
	  System.out.println("-------------------------------------------");
    return "Name of Bank Customer:\t\t"+getName()+"\n"+"Amount of Money:\t\t"+format.format(getinMoney())+"\n"+"Interest Rate:\t\t\t"+format.format(getintRate())+"%";


  }
}