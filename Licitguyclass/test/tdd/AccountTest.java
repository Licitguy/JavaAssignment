package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositMoneyTest() {
        //given that bolaji has an account
        Account bolajiAccount = new Account();
        //when bolaji deposits 89
        bolajiAccount.deposit(89);
        //check that the balance is 89
        int balance = bolajiAccount.getBalance();
        assertEquals(89, balance);
    }


        @Test
        public void depositTwiceTest() {
            //given bolaji has an account;
            Account bolajiAccount = new Account();
            //given there is 300 in the account;
            bolajiAccount.deposit(300);
            int balance = bolajiAccount.getBalance();
            assertEquals(300, balance);

            //when i try to deposit 200;
            bolajiAccount.deposit(200);

            //check the balance is 500;
            balance = bolajiAccount.getBalance();
            assertEquals(500, balance);

        }


  @Test
   public void depositNegativeAmountTest() {
      //giving i have an account with zero balance;
      Account bolajiAccount = new Account();
      //when i try to deposit negative amount (-2300);
      bolajiAccount.deposit(-2300);
      //check that balance is zero
      int balance = bolajiAccount.getBalance();
      assertEquals(0, balance);

   }

          @Test
           public void withdrawMoneyTest() {
        //given i have an account with 5000 balance;
         Account bolajiAccount = new Account();
         bolajiAccount.deposit(5000);
        //when i try to withdraw positive amount (4600);
         bolajiAccount.withdraw(4600);
        //check that balance is 400
          int balance = bolajiAccount.getBalance();
          assertEquals(400, balance);


          }



          }