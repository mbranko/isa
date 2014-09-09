package isa.pr06;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateful;

@Stateful(name="CountBean6")
@Remote(Count.class)
@Local(CountLocal.class)
public class CountBean implements Count {
  
  public int count() {
    return ++value;
  }
  
  public void set(int value) {
    this.value = value;
  }
  
  private int value = 0;

}