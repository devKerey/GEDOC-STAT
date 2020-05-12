package ci.gedoc.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Page implements Serializable {

	private static final long serialVersionUID = -2277673953928107405L;

	@Id
	private String num_page;
	@ManyToOne
	@JoinColumn(name = "NUM_DOC")
	private Document document;
	@OneToMany(mappedBy = "page", fetch = FetchType.LAZY)
	private Collection<Image> images;

	public Page() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param num_page
	 * @param document
	 */
	public Page(String num_page, Document document) {
		super();
		this.num_page = num_page;
		this.document = document;
	}

	/**
	 * @return the num_page
	 */
	public String getNum_page() {
		return num_page;
	}

	/**
	 * @param num_page the num_page to set
	 */
	public void setNum_page(String num_page) {
		this.num_page = num_page;
	}

	/**
	 * @return the document
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * @param document the document to set
	 */
	public void setDocument(Document document) {
		this.document = document;
	}

	/**
	 * @return the images
	 */
	public Collection<Image> getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(Collection<Image> images) {
		this.images = images;
	}

}
