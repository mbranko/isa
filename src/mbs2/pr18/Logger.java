package mbs2.pr18;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class Logger {

  @AroundInvoke
  public Object logEvent(InvocationContext ctx) throws Exception {
    if (ctx.getMethod() == null)
      return ctx.proceed();
    
    String methodName = ctx.getMethod().getName();
    if (methodName.startsWith("process")) 
      System.out.println("Method called: " + methodName);

    return ctx.proceed();
  }
}
