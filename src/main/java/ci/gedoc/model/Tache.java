package ci.gedoc.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tache implements Serializable {

	private static final long serialVersionUID = 4142952233478808298L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom_tache;
	private int nb_lot_tache;

	@OneToMany(mappedBy = "tache", fetch = FetchType.LAZY)
	private Collection<Batch> lots;

	public Tache() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom_tache
	 * @param nb_lot_tache
	 */
	public Tache(Long id, String nom_tache, int nb_lot_tache) {
		super();
		this.id = id;
		this.nom_tache = nom_tache;
		this.nb_lot_tache = nb_lot_tache;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nom_tache
	 */
	public String getNom_tache() {
		return nom_tache;
	}

	/**
	 * @param nom_tache the nom_tache to set
	 */
	public void setNom_tache(String nom_tache) {
		this.nom_tache = nom_tache;
	}

	/**
	 * @return the nb_lot_tache
	 */
	public int getNb_lot_tache() {
		return nb_lot_tache;
	}

	/**
	 * @param nb_lot_tache the nb_lot_tache to set
	 */
	public void setNb_lot_tache(int nb_lot_tache) {
		this.nb_lot_tache = nb_lot_tache;
	}

	/**
	 * @return the lots
	 */
	/*
	 * public Collection<Batch> getLots() { return lots; }
	 * 
	 *//**
		 * @param lots the lots to set
		 *//*
			 * public void setLots(Collection<Batch> lots) { this.lots = lots; }
			 */
}
