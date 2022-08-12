
public class Member  {
private String dateOfMembership;
private int totalBooksCheckedOut;
private float balance;

    public Member(String dateOfMembership, int totalBooksCheckedOut, float balance) {
        this.dateOfMembership = dateOfMembership;
        this.totalBooksCheckedOut = totalBooksCheckedOut;
        this.balance = balance;
    }

    public String getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(String dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public int getTotalBooksCheckedOut() {
        return totalBooksCheckedOut;
    }

    public void setTotalBooksCheckedOut(int totalBooksCheckedOut) {
        this.totalBooksCheckedOut = totalBooksCheckedOut;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
public Boolean Blockmember(){
   return true;
}
public Boolean unblockmember(){
     return true;
}
}