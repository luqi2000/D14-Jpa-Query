package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "partite_di_calcio")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class PartitaDiCalcio extends Evento{
	private String squadraDiCasa;
	private String squadraOspite;
	private String squadraVincente;
	private String numGolSquadraCasa;
	private String numGolSquadraOspite;
	
	public PartitaDiCalcio(String title, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimoPartecipanti, String squadraOspite, String squadraVincente, String numGolSquadraCasa,
			String numGolSquadraOspite, String squadraDiCasa) {
		super(title, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
		this.squadraOspite = squadraOspite;
		this.squadraVincente = squadraVincente;
		this.numGolSquadraCasa = numGolSquadraCasa;
		this.numGolSquadraOspite = numGolSquadraOspite;
		this.squadraDiCasa = squadraDiCasa;
	}
	

}
