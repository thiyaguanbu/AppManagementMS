package com.ticket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ticket.model.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer>{

	
}
