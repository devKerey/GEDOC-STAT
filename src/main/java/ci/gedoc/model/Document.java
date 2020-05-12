package ci.gedoc.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Document implements Serializable {

	private static final long serialVersionUID = -4509625870937463201L;

	@Id
	private String num_doc;
	private String auteur_doc;
	private String status_doc;
	private Date date_injection_doc;
	private String tache_doc;
	private int nb_page_doc;
	@ManyToOne
	@JoinColumn(name = "NUM_LOT")
	private Batch lot;

	@OneToMany(mappedBy = "document", fetch = FetchType.LAZY)
	private Collection<Page> pages;

	public Document() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param num_doc
	 * @param auteur_doc
	 * @param status_doc
	 * @param date_injection_doc
	 * @param tache_doc
	 * @param nb_page_doc
	 * @param lot
	 */
	public Document(String num_doc, String auteur_doc, String status_doc,
			Date date_injection_doc, String tache_doc, int nb_page_doc) {
		super();
		this.num_doc = num_doc;
		this.auteur_doc = auteur_doc;
		this.status_doc = status_doc;
		this.date_injection_doc = date_injection_doc;
		this.tache_doc = tache_doc;
		this.nb_page_doc = nb_page_doc;
	}

	/**
	 * @return the num_doc
	 */
	public String getNum_doc() {
		return num_doc;
	}

	/**
	 * @param num_doc the num_doc to set
	 */
	public void setNum_doc(String num_doc) {
		this.num_doc = num_doc;
	}

	/**
	 * @return the auteur_doc
	 */
	public String getAuteur_doc() {
		return auteur_doc;
	}

	/**
	 * @param auteur_doc the auteur_doc to set
	 */
	public void setAuteur_doc(String auteur_doc) {
		this.auteur_doc = auteur_doc;
	}

	/**
	 * @return the status_doc
	 */
	public String getStatus_doc() {
		return status_doc;
	}

	/**
	 * @param status_doc the status_doc to set
	 */
	public void setStatus_doc(String status_doc) {
		this.status_doc = status_doc;
	}

	/**
	 * @return the date_injection_doc
	 */
	public Date getDate_injection_doc() {
		return date_injection_doc;
	}

	/**
	 * @param date_injection_doc the date_injection_doc to set
	 */
	public void setDate_injection_doc(Date date_injection_doc) {
		this.date_injection_doc = date_injection_doc;
	}

	/**
	 * @return the tache_doc
	 */
	public String getTache_doc() {
		return tache_doc;
	}

	/**
	 * @param tache_doc the tache_doc to set
	 */
	public void setTache_doc(String tache_doc) {
		this.tache_doc = tache_doc;
	}

	/**
	 * @return the nb_page_doc
	 */
	public int getNb_page_doc() {
		return nb_page_doc;
	}

	/**
	 * @param nb_page_doc the nb_page_doc to set
	 */
	public void setNb_page_doc(int nb_page_doc) {
		this.nb_page_doc = nb_page_doc;
	}

	/**
	 * @return the pages
	 */
	public Collection<Page> getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(Collection<Page> pages) {
		this.pages = pages;
	}
}