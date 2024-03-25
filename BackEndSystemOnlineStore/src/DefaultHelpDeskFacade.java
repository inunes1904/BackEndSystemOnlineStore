import entities.SupportTicket;

public class DefaultHelpDeskFacade  implements HelpDeskFacade{

  @Override
  public void addNewSupportTicket(SupportTicket supportTicket) {

  }

  @Override
  public SupportTicket getNextSupportTicket() {
    return null;
  }

  @Override
  public int getNumberOfTickets() {
    return 0;
  }

}
