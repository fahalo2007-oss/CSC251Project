import java.util.Scanner;

public class Project_Fahad_Hassan
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Please enter the Policy Number: ");
      int policyNumber = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("\nPlease enter the Provider Name: ");
      String providerName = keyboard.nextLine();

      System.out.print("\nPlease enter the Policyholder’s First Name: ");
      String firstName = keyboard.nextLine();

      System.out.print("\nPlease enter the Policyholder’s Last Name: ");
      String lastName = keyboard.nextLine();

      System.out.print("\nPlease enter the Policyholder’s Age: ");
      int age = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("\nPlease enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String smokingStatus = keyboard.nextLine();

      System.out.print("\nPlease enter the Policyholder’s Height (in inches): ");
      double height = keyboard.nextDouble();

      System.out.print("\nPlease enter the Policyholder’s Weight (in pounds): ");
      double weight = keyboard.nextDouble();

      Policy policy = new Policy(policyNumber, providerName, firstName,
                                 lastName, age, smokingStatus,
                                 height, weight);

      System.out.printf("\nPolicy Number: %d\n", policy.getPolicyNumber());
      System.out.printf("\nProvider Name: %s\n", policy.getProviderName());
      System.out.printf("\nPolicyholder’s First Name: %s\n", policy.getFirstName());
      System.out.printf("\nPolicyholder’s Last Name: %s\n", policy.getLastName());
      System.out.printf("\nPolicyholder’s Age: %d\n", policy.getAge());
      System.out.printf("\nPolicyholder’s Smoking Status: %s\n", policy.getSmokingStatus());
      System.out.printf("\nPolicyholder’s Height: %.1f inches\n", policy.getHeight());
      System.out.printf("\nPolicyholder’s Weight: %.1f pounds\n", policy.getWeight());
      System.out.printf("\nPolicyholder’s BMI: %.2f\n", policy.calculateBMI());
      System.out.printf("\nPolicy Price: $%.2f\n", policy.calculatePolicyPrice());

      keyboard.close();
   }
}