package ci.gedoc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Image implements Serializable {

	private static final long serialVersionUID = 4834854715242647128L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String num_image;
	@ManyToOne
	@JoinColumn(name = "NUM_PAGE")
	private Page page;

	public Image() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param id
	 * @param num_image
	 * @param page
	 */
	public Image(Long id, String num_image, Page page) {
		super();
		this.id = id;
		this.num_image = num_image;
		this.page = page;
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
	 * @return the num_image
	 */
	public String getNum_image() {
		return num_image;
	}

	/**
	 * @param num_image the num_image to set
	 */
	public void setNum_image(String num_image) {
		this.num_image = num_image;
	}



	/**
	 * @return the page
	 */
	public Page getPage() {
		return page;
	}



	/**
	 * @param page the page to set
	 */
	public void setPage(Page page) {
		this.page = page;
	}
	
	

}

