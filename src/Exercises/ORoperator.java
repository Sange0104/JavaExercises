package Exercises;

public class ORoperator {

		  public static void main(String[] args) {
		    double balance = 600;
		    System.out.println("Amount to withdraw");
		    double amount = 1500;
		    if(amount < 0 || amount > balance) {
		      System.out.println("Withdrawal has failed");
		    }
		    else {
		      balance -= amount;
		      System.out.println("Withdrawal has succeeded");
		    }
		  }
		}

//Just to check whether the code committed to Github repository