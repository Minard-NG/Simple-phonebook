package phonebook;

public class Contact 
{

    String Name, Ct_No,email;

    public void setName(String name) 
    {
        this.Name = name;
    }

    public void setNo(String cno) 
    {
        this.Ct_No = cno;
    }
    public void setEmail(String mail){
    
        this.email = mail;
    }

    public String getName() 
    {
        return Name;
    }
    
    public String getEmail(){
    
    return email;
    }
    
    public String getNo() 
    {
        return Ct_No;
    }

    public String toString() 
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append(Name);
        return buffer.toString();
    }
}
