package entities.Impl;

import entities.Priority;
import entities.RequestType;
import entities.SupportTicket;

public class DefaultSupportTicket implements SupportTicket {

  private int counter;
  private RequestType requestType;
  private int sequencialNumber;

  {
    sequencialNumber = ++counter;
  }

  public DefaultSupportTicket() {
  }

  public DefaultSupportTicket(RequestType requestType) {
    this.requestType = requestType;
  }

  @Override
  public Priority getPriority() {
    return this.requestType == null ? null : this.requestType.getPriority();
  }

  @Override
  public int getSequentialNumber() {
    return this.sequencialNumber;
  }

  @Override
  public RequestType getRequestType() {
    return this.requestType;
  }



}
