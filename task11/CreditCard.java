package session_4.task11;

import java.util.Date;

public class CreditCard extends BankProduct{

    private String cardNumber;

    private int cvv;

    private Date expirationDate;

    private float debts;

    private float limitCredit;

    private Boolean state;

    public void turnOff(){
        state = false;
    }

    public void turnOn(){
        state = true;
    }

    public void withdrawMoney(Float amount) {
        setDebts(debts-=amount);
    }

    //Constructor (Empty and with parameters)

    public CreditCard() {}

    public CreditCard(String cardNumber, int cvv, Date expirationDate, float debts, float limitCredit, Boolean state) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.debts = debts;
        this.limitCredit = limitCredit;
        this.state = state;
    }

    //Getters and Setters

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public float getDebts() {
        return debts;
    }

    public void setDebts(float debts) {
        this.debts = debts;
    }

    public float getLimitCredit() {
        return limitCredit;
    }

    public void setLimitCredit(float limitCredit) {
        this.limitCredit = limitCredit;
    }
}
