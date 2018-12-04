import java.util.ArrayList; // import array list

public class phonebook {
    private String name;
    private String number;
      public phonebook() {
          name = null;
          name = null;
          }

public phonebook(String phonename, String phonenumber){
    name=phonename;
    number=phonenumber;
}
public void setname (String phonename){
    name=phonename;

}
public String getname(){
    return name;

}
public  void setnumber (String phonenumber){
    number=phonenumber;
}
public String getnumber(){
    return number;
}
public String toString(){
return "Name: " + name +" Number:" +number+".";
}

    public static void main(String[] args) {
        phonebook myPhoneBook = new phonebook(null, null);
        ArrayList <phonebook> contact = new ArrayList<phonebook>();
        contact.add( new phonebook("Sunny","111-111-1111"));
        contact.add( new phonebook("Sis","222-222-2222"));
        contact.add( new phonebook("Mom","333-333-3333"));
        contact.add( new phonebook("Dad","444-444-4444"));
        contact.add( new phonebook("Bro","555-555-5555"));


			System.out.print(contact);


}

}
