import java.util.Scanner;

class BloodData {
  static String bloodType = "O";
  static String rhFactor = "+";

  public BloodData() {
  }

  public BloodData(String bt, String rh) {
    bloodType = bt;
    rhFactor = rh;
  }

  public void display() {
    System.out.println("Blood Type: " + bloodType + rhFactor);
  }
}

public class RunBloodData {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter blood type (O, A, B, AB): ");
    String bloodType = input.nextLine();
    System.out.println("Enter Rhesus factor (+ or -): ");
    String rhFactor = input.nextLine();
    BloodData bd;
    if (bloodType.isEmpty() || rhFactor.isEmpty()) {
      bd = new BloodData();
    } else {
      bd = new BloodData(bloodType, rhFactor);
    }
    bd.display();
  }
}