package ci.gedoc.batch.config;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import ci.gedoc.model.Batch;

public class BatchPreparedStatementSetter implements ItemPreparedStatementSetter<Batch> {

	@Override
	public void setValues(Batch batch, PreparedStatement ps) throws SQLException {
		ps.setInt(1, batch.getId());
		ps.setString(2, batch.getNom_lot());
		ps.setString(3, batch.getAuteur_numerisation());
		ps.setString(4, batch.getBase_doc_lot());
		ps.setString(5, batch.getDate_numerisation());
		ps.setString(6, batch.getFile_name());
		ps.setInt(7, batch.getNb_page_lot());
		ps.setInt(8, batch.getNb_doc_lot());
		ps.setString(9, batch.getStatut_lot());

	}

}
