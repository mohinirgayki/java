package com.codeo.sbi.encapsulation;

public class BankDetails {
 private long Accountno;
 private String Personname;
 private double AccountBalance;
 private static String IFSCCode="SBIN000323";
 
   public long getaccountno()
   {
	 return Accountno;
   }
     public void setaccountno(long Accountno) 
     {
		this.Accountno = Accountno; 
     }
       public String getpersonname()
      {
	    return Personname;
      }
       public void setpersonname(String Personname)
       {
	    this.Personname = Personname;
       }
         public double getaccountBalance()
        {
	     return AccountBalance;
        }
         public void setaccountbalance(double AccountBalance)
        {
	     this.AccountBalance = AccountBalance;
        }
         public static String getifsccode() {
	     return IFSCCode;
        }
          public static void setifsccode(String IFSCCode)
         {
          BankDetails.IFSCCode = IFSCCode;
}
}