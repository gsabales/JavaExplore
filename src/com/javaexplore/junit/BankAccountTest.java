package com.javaexplore.junit;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BankAccountTest {

    private BankAccount account;
    private static int count;

    @BeforeAll
    static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @BeforeEach
    void setup() {
        account = new BankAccount(
                "Glenn",
                "Sabales",
                1000.00,
                BankAccount.AccountTypes.CHECKING
        );
        System.out.println("Running a test...");
    }

    @Test
    @Order(1)
    void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    @Order(2)
    void withdraw() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    // In the withdraw() method being tested, we are testing that
    // an exception must be thrown if the amount to be withdrawn is greater than 500
    //  AND not within a branch (false), probably via ATM.
    @Test
    void withdraw_notBranch() throws IllegalArgumentException{
        assertThrows(IllegalArgumentException.class, () -> {
            double balance = account.withdraw(600.00, false);
            assertEquals(400.00, balance, 0);
        });
    }

    @Test
    @Order(3)
    void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    @Order(4)
    void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @Test
    @Order(5)
    void isChecking_true() {
        assertTrue(account.isChecking(), "The account is NOT a checking account");
    }

    @AfterEach
    void afterTest() {
        System.out.println("Count = " + count++);
    }

    @AfterAll
    static void afterClass() {
        System.out.println("This executes after any test cases. Count = " + count++);
    }
}