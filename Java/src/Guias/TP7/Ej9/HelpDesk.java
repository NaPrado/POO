package Guias.TP7.Ej9;

import java.util.*;

public class HelpDesk {
    Map<ClientType, Queue<HelpTicket>> queuesByClientType = new EnumMap<ClientType, Queue<HelpTicket>>(ClientType.class);
    HelpDesk openTicket(ClientType tipo ,String name,String question){
        queuesByClientType.putIfAbsent(tipo, new LinkedList<>());
        queuesByClientType.get(tipo).offer(new HelpTicket(name,question));
        return this;
    }

    public HelpTicket getNextTicket(ClientType clientType) {
        return queuesByClientType.getOrDefault(clientType,new LinkedList<>()).remove();
    }
    public HelpTicket getNextTicket(){
        for (Queue<HelpTicket> tickets : queuesByClientType.values()) {
            if (!tickets.isEmpty()){
                return tickets.poll();
            }
        }
        throw new NoSuchElementException();
    }
    public boolean hasTickets() {
        for (Queue<HelpTicket> tickets : queuesByClientType.values()) {
            if (!tickets.isEmpty()){
                return true;
            }
        }
        return false;
    }

    public static class HelpTicket{
        String name, question;
        HelpTicket(String name,String question){
            this.name=name;
            this.question=question;
        }

        @Override
        public String toString() {
            return "HelpTicket for " + name + " asking " + question;
        }
    }
}
