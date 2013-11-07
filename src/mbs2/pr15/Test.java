package mbs2.pr15;

public class Test {
  public static void main(String[] args) throws Exception {
    User zika = new User(1, "Zika", "Zikic");
    User pera = new User(2, "Pera", "Peric");
    User laza = new User(3, "Laza", "Lazic");
    
    // upisi ziku, peru i lazu
    zika.insert();
    pera.insert();
    laza.insert();
    
    // pronadji korisnika sa userID=2
    User user = new User();
    user.load(2);
    
    // azuriraj podatke tom korisniku
    user.setPassword("***");
    user.update();
  }
}
