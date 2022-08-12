
public class Account {
    public int ID;
    public String Password;
    public String Name;
    public String Email;
    public String Address;
    public String Phone;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public Account(String Password, String Name, String Email, String Address, String Phone) {
        this.Password = Password;
        this.Name = Name;
        this.Email = Email;
        this.Address = Address;
        this.Phone = Phone;
    }
    
    
}
