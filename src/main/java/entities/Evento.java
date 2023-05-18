package entities;
import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table(name = "Evento")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@ToString
public abstract class Evento {
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private LocalDate dataEvento;
	private String descrizione;
	private TipoEvento tipoEvento;
	private int numeroMassimoPartecipanti;
	
	public Evento() {
	}
	
	public Evento(String title, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimoPartecipanti) {
		super();
		this.title = title;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

}
