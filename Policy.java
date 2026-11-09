
public class Policy
{
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;

   /**
    * The default constructor sets all fields to default values.
    */
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      policyHolder = new PolicyHolder();
   }

   /**
    * The constructor sets all fields using the given values.
    */
   public Policy(int policyNumber, String providerName,
                 PolicyHolder policyHolder)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = new PolicyHolder(policyHolder);
   }

   /**
    * Sets the policy number.
    */
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   /**
    * Sets the provider name.
    */
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }

   /**
    * Sets the policyholder.
    */
   public void setPolicyHolder(PolicyHolder policyHolder)
   {
      this.policyHolder = new PolicyHolder(policyHolder);
   }

   /**
    * Returns the policy number.
    */
   public int getPolicyNumber()
   {
      return policyNumber;
   }

   /**
    * Returns the provider name.
    */
   public String getProviderName()
   {
      return providerName;
   }

   /**
    * Returns the policyholder.
    */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }

   /**
    * Calculates the price of the insurance policy.
    */
   public double calculatePolicyPrice()
   {
      double price = 600.0;

      if (policyHolder.getAge() > 50)
      {
         price += 75.0;
      }

      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
      {
         price += 100.0;
      }

      double bmi = policyHolder.calculateBMI();

      if (bmi > 35)
      {
         price += (bmi - 35) * 20;
      }

      return price;
   }
}
