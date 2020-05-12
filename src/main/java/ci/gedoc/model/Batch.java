package ci.gedoc.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "details")
public class Batch implements Serializable {

	private static final long serialVersionUID = 2618550560576235267L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true)
	private int id;
	private String nom_lot;
	private String auteur_numerisation;
	private String date_numerisation;
	private String file_name;
	private Integer nb_page_lot;
	private String base_doc_lot;
	private Integer nb_doc_lot;
	private String statut_lot;
	@ManyToOne
	@JoinColumn(name = "ID_TACHE")
	private Tache tache;
	@OneToMany(mappedBy = "lot", fetch = FetchType.LAZY)
	private Collection<Document> documents;

	public Batch() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * @param nom_lot
	 * 
	 * @param auteur_numerisation
	 * 
	 * @param date_numerisation
	 * 
	 * @param file_name
	 * 
	 * @param nb_page_lot
	 * 
	 * @param base_doc_lot
	 * 
	 * @param nb_doc_lot
	 */
	public Batch(String nom_lot, String auteur_numerisation, String date_numerisation, String file_name,
			Integer nb_page_lot, String base_doc_lot, Integer nb_doc_lot, String statut_lot) {
		super();
		this.nom_lot = nom_lot;
		this.auteur_numerisation = auteur_numerisation;
		this.date_numerisation = date_numerisation;
		this.file_name = file_name;
		this.nb_page_lot = nb_page_lot;
		this.base_doc_lot = base_doc_lot;
		this.nb_doc_lot = nb_doc_lot;
		this.statut_lot = statut_lot;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom_lot
	 */
	public String getNom_lot() {
		return nom_lot;
	}

	/**
	 * @param nom_lot the nom_lot to set
	 */
	public void setNom_lot(String nom_lot) {
		this.nom_lot = nom_lot;
	}

	/**
	 * @return the auteur_numerisation
	 */
	public String getAuteur_numerisation() {
		return auteur_numerisation;
	}

	/**
	 * @param auteur_numerisation the auteur_numerisation to set
	 */
	public void setAuteur_numerisation(String auteur_numerisation) {
		this.auteur_numerisation = auteur_numerisation;
	}

	/**
	 * @return the date_numerisation
	 */
	public String getDate_numerisation() {
		return date_numerisation;
	}

	/**
	 * @param date_numerisation the date_numerisation to set
	 */
	public void setDate_numerisation(String date_numerisation) {
		this.date_numerisation = date_numerisation;
	}

	/**
	 * @return the file_name
	 */
	public String getFile_name() {
		return file_name;
	}

	/**
	 * @param file_name the file_name to set
	 */
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	/**
	 * @return the nb_page_lot
	 */
	public Integer getNb_page_lot() {
		return nb_page_lot;
	}

	/**
	 * @param nb_page_lot the nb_page_lot to set
	 */
	public void setNb_page_lot(Integer nb_page_lot) {
		this.nb_page_lot = nb_page_lot;
	}

	/**
	 * @return the base_doc_lot
	 */
	public String getBase_doc_lot() {
		return base_doc_lot;
	}

	/**
	 * @param base_doc_lot the base_doc_lot to set
	 */
	public void setBase_doc_lot(String base_doc_lot) {
		this.base_doc_lot = base_doc_lot;
	}

	/**
	 * @return the nb_doc_lot
	 */
	public Integer getNb_doc_lot() {
		return nb_doc_lot;
	}

	/**
	 * @param nb_doc_lot the nb_doc_lot to set
	 */
	public void setNb_doc_lot(Integer nb_doc_lot) {
		this.nb_doc_lot = nb_doc_lot;
	}

	/**
	 * @return the statut_lot
	 */
	public String getStatut_lot() {
		return statut_lot;
	}

	/**
	 * @param statut_lot the statut_lot to set
	 */
	public void setStatut_lot(String statut_lot) {
		this.statut_lot = statut_lot;
	}

	/**
	 * @return the tache
	 */
	public Tache getTache() {
		return tache;
	}

	/**
	 * @param tache the tache to set
	 */
	public void setTache(Tache tache) {
		this.tache = tache;
	}

	/**
	 * @return the documents
	 */
	public Collection<Document> getDocuments() {
		return documents;
	}

	/**
	 * @param documents the documents to set
	 */
	public void setDocuments(Collection<Document> documents) {
		this.documents = documents;
	}

}
