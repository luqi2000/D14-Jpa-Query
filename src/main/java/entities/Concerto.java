package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "concerto")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Concerto extends Evento{
	private GenereConcerto genere;
	private boolean inStreaming;
	
	public enum GenereConcerto {
		CLASSICO, ROCK, POP
	}

	public Concerto(String title, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimoPartecipanti, GenereConcerto genere, boolean inStreaming) {
		
		super(title, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
		this.genere = genere;
		this.inStreaming = inStreaming;
	}	
	
}
