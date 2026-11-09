
public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   /**
    * The default constructor sets all fields to default values.
    */
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }

   /**
    * The constructor sets all fields using the given values.
    */
   public PolicyHolder(String firstName, String lastName, int age,
                       String smokingStatus, double height, double weight)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }

   /**
    * Copy constructor.
    */
   public PolicyHolder(PolicyHolder other)
   {
      this.firstName = other.firstName;
      this.lastName = other.lastName;
      this.age = other.age;
      this.smokingStatus = other.smokingStatus;
      this.height = other.height;
      this.weight = other.weight;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }

   public void setHeight(double height)
   {
      this.height = height;
   }

   public void setWeight(double weight)
   {
      this.weight = weight;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public int getAge()
   {
      return age;
   }

   public String getSmokingStatus()
   {
      return smokingStatus;
   }

   public double getHeight()
   {
      return height;
   }

   public double getWeight()
   {
      return weight;
   }

   /**
    * Calculates the policyholder's BMI.
    */
   public double calculateBMI()
   
   /**
    * Returns the policyholder's information as a String.
    */
   public String toString()
   {
      String str = String.format(
         "Policyholder's First Name: %s\n\n" +
         "Policyholder's Last Name: %s\n\n" +
         "Policyholder's Age: %d\n\n" +
         "Policyholder's Smoking Status (Y/N): %s\n\n" +
         "Policyholder's Height: %.1f inches\n\n" +
         "Policyholder's Weight: %.1f pounds\n\n" +
         "Policyholder's BMI: %.2f\n",
         firstName, lastName, age, smokingStatus,
         height, weight, calculateBMI());

      return str;
   }

   {
      return (weight * 703) / (height * height);
   }
}
