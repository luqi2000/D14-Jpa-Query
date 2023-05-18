package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "gara_di_atletica")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class GaraDiAtletica extends Evento{
	private String SetAtleti;
	private String Vincitore;
	
	public GaraDiAtletica(String title, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimoPartecipanti,String setAtleti, String vincitore) {
		super(title, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
		SetAtleti = setAtleti;
		Vincitore = vincitore;
	}


}
