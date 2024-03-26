package utils;

import entities.SupportTicket;

import java.util.Comparator;


public class CustomSupportTicketsComparator implements Comparator<SupportTicket> {

  @Override
  public int compare(SupportTicket t1, SupportTicket t2) {
    if (t1 == null || t2 == null || t1.getPriority() == null || t2.getPriority() == null ) return 0;
    int result = t1.getPriority().compareTo(t2.getPriority());
    if (result == 0) return t1.getSequentialNumber() - t2.getSequentialNumber();
    return result;
  }

}
