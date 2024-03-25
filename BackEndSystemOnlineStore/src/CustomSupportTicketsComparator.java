import entities.SupportTicket;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CustomSupportTicketsComparator implements Comparator<SupportTicket> {

  @Override
  public int compare(SupportTicket o1, SupportTicket o2) {
    o1.getPriority()
    return ;
  }

  @Override
  public Comparator<SupportTicket> reversed() {
    return Comparator.super.reversed();
  }

  @Override
  public Comparator<SupportTicket> thenComparing(Comparator<? super SupportTicket> other) {
    return Comparator.super.thenComparing(other);
  }

  @Override
  public <U> Comparator<SupportTicket> thenComparing(Function<? super SupportTicket, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
    return Comparator.super.thenComparing(keyExtractor, keyComparator);
  }

  @Override
  public <U extends Comparable<? super U>> Comparator<SupportTicket> thenComparing(Function<? super SupportTicket, ? extends U> keyExtractor) {
    return Comparator.super.thenComparing(keyExtractor);
  }

  @Override
  public Comparator<SupportTicket> thenComparingInt(ToIntFunction<? super SupportTicket> keyExtractor) {
    return Comparator.super.thenComparingInt(keyExtractor);
  }

  @Override
  public Comparator<SupportTicket> thenComparingLong(ToLongFunction<? super SupportTicket> keyExtractor) {
    return Comparator.super.thenComparingLong(keyExtractor);
  }

  @Override
  public Comparator<SupportTicket> thenComparingDouble(ToDoubleFunction<? super SupportTicket> keyExtractor) {
    return Comparator.super.thenComparingDouble(keyExtractor);
  }
}
