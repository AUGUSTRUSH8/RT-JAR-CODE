package com.sun.xml.internal.ws.api.model.wsdl;

import com.sun.istack.internal.NotNull;
import javax.xml.namespace.QName;

public abstract interface WSDLFault extends WSDLObject, WSDLExtensible
{
  public abstract String getName();

  public abstract WSDLMessage getMessage();

  @NotNull
  public abstract WSDLOperation getOperation();

  @NotNull
  public abstract QName getQName();

  public abstract String getAction();
}

/* Location:           C:\Program Files\Java\jdk1.7.0_79\jre\lib\rt.jar
 * Qualified Name:     com.sun.xml.internal.ws.api.model.wsdl.WSDLFault
 * JD-Core Version:    0.6.2
 */