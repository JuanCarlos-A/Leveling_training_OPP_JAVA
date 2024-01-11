package session_4.task11;
//importaciones
import java.util.ArrayList;

public class CreditAccount extends  Account {
//    Atributos de la clase
    private String accountType;

    private float limitCredit;

    private float debt;
    private ArrayList<String> accountTypes;

    private ArrayList<Float> limitCredits;

    private ArrayList<Float> debts;
    private ArrayList<Long> accounts;

//    Metodo Constructor vacio
    public CreditAccount(){}

//    Metodos
    public void addCreditAccount() {
        this.accountTypes.add(this.accountType);
        this.limitCredits.add(this.limitCredit);
        this.debts.add(this.debt);
    }
    public void getLimitCredit(long accountNumber) {
        int index = verification(accountNumber);
        if (index == accounts.size()){
            System.out.println("El numero de cuenta proporcionado no figura como una cuenta de credito.");
        }else{
            System.out.println("=========================================");
            System.out.println("\t\tCuenta N"+accountNumber+"\nEl limite de credito es $"+limitCredits.get(index)+"\nEl tipo de cuenta de credito es "+accountTypes.get(index));
        }
    }

    public void getDebts(long accountNumber) {
        int index = verification(accountNumber);
        if (index == accounts.size()){
            System.out.println("El numero de cuenta proporcionado no figura como una cuenta de credito.");
        }else{
            System.out.println("=========================================");
            System.out.println("\t\tCuenta N"+accountNumber+"\nLa deuda a pagar es $"+debts.get(index)+"\nEl tipo de cuenta de credito es "+accountTypes.get(index));
        }

    }

    public void withdrawCredit(float withdraw, long accountNumber){
        int index = verification(accountNumber);
        if (index == accounts.size()){
            System.out.println("El numero de cuenta proporcionado no figura como una cuenta de credito.");
        }else{
            if (withdraw <= limitCredits.get(index)){
                float newDebt = debts.get(index) + withdraw;
                debts.set(index, newDebt);
                System.out.println("=========================================");
                System.out.println("\t\tCuenta N"+accountNumber+"\nCompra realizada con exito. Gracias por usar estos servicios.");
            }else{
                System.out.println("=========================================");
                System.out.println("\t\tCuenta N"+accountNumber+"\nEl valor de la compra excede el credito que tienes disponible.");
            }
        }
    }

    public void setAccounts(ArrayList<Long> accounts) {
        this.accounts = accounts;
    }

    public int verification(long accountNumber){
        int index = accounts.size();
        for (int i = 0; i<accounts.size();i++){
            if (accountNumber == accounts.get(i)){
                index = i;
                return index;
            }
        }
        return index;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setLimitCredit(float limitCredit) {
        this.limitCredit = limitCredit;
    }

    public void setDebt(float debt) {
        this.debt = debt;
    }
}
