public class Person {
    private String firstName = null;
    private String lastName = null;
    private int age = 0;
    private boolean teen = false;

    public String getFirstName()
    {
     return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isTeen()
    {
        if(age > 12 && age < 20)
        {
          return  true;
        }
        else
        {
          return false;
        }
    }

    public void setFirstName(String fname)
    {
         firstName = fname;
    }

    public void setLastName(String lname)
    {
        lastName = lname;
    }

    public void setAge( int a)
    {
        if(a>0 && a< 101)
        {
            age = a;

        }
        else
        {
            age = 0
        }
    }

    public String getFullName()
    {
        if(firstName.isEmpty())
        {
           return lastName;
        }
        else if(lastName.isEmpty())
        {
            return firstName;
        }
        else if(firstName.isEmpty() && lastName.isEmpty())
        {
            return"";
        }
        else
        {
            return firstName+" "+lastName;
        }
    }

}
